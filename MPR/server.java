import java.lang.*;
import java.net.*;
import java.io.*;
import java.util.*;

class Server
{
    private static Map<Socket, String> clients = new HashMap<>();

    public static void main(String args[]) throws Exception
    {
        ServerSocket ss = new ServerSocket(9806);
        System.out.println("Waiting for clients...");

        while (true)
        {
            Socket soc = ss.accept();
            System.out.println("Connection Established. Current clients: " + clients.size());
            new ClientHandler(soc).start();
        }
    }

    static class ClientHandler extends Thread
    {
        private Socket clientSocket;
        private BufferedReader sbr;
        private PrintWriter pw;
        private String username;

        public ClientHandler (Socket socket)
        {
            this.clientSocket = socket;
        }

        public void run()
        {
            try
            {
                sbr = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                pw = new PrintWriter(clientSocket.getOutputStream(), true);

                username = sbr.readLine();
                clients.put(clientSocket, username);
                broadcast(username, " joined the chat!!\n", true);

                String msg;
                while ((msg = sbr.readLine()) != null)
                {
                    if (msg.equalsIgnoreCase("/quit")) 
                    {
                        broadcast(" left the chat.\n", username, true);
                        clients.remove(clientSocket);
                        break;
                    }

                    else if (msg.equalsIgnoreCase("/list"))
                    {
                        for (Map.Entry<Socket, String> entry : clients.entrySet())
                        {
                            pw.println(entry.getValue());
                        }
                    }

                    else if (msg.equalsIgnoreCase("/pm"))
                    {
                        pw.println("Enter your friend's name: ");
                        String friend = sbr.readLine().trim();
                        pw.println("Enter a message for " + friend + ": ");
                        String pmsg = sbr.readLine().trim();

                        pmessage(pmsg, friend, username);
                    }
                    
                    else
                    {
                        broadcast(msg, username, false);
                    }
                } 
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }

        private void broadcast (String msg, String sender, boolean sys)
        {
            for (Map.Entry<Socket, String> entry : clients.entrySet())
            {
                try
                {
                    PrintWriter pw = new PrintWriter(entry.getKey().getOutputStream(), true);

                    if (entry.getValue().equalsIgnoreCase(sender) && !sys)
                    {
                        continue;   
                    }

                    if (sys)
                    {
                        pw.println(msg + sender);
                    }
                    else
                    {
                        pw.println(sender + ": " + msg);
                    }
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }

        private void pmessage(String pmsg, String friend, String sender)
        {
            for (Map.Entry<Socket, String> entry : clients.entrySet())
            {
                try
                {
                    PrintWriter pw = new PrintWriter(entry.getKey().getOutputStream(), true);

                    if (entry.getValue().equalsIgnoreCase(friend))
                    {
                        pw.println("Private " + sender + ": " + pmsg);
                    }

                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}
