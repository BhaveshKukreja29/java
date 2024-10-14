import java.lang.*;
import java.net.*;
import java.io.*;
import java.util.*;

class Server
{
    private static Map<Socket, String> clients = new HashMap<>();
    private static boolean isRunning = true;

    public static void main(String args[]) throws Exception
    {
        ServerSocket ss = new ServerSocket(9806);
        System.out.println("Waiting for clients...");

        while (isRunning)
        {
            try 
            {
                Socket soc = ss.accept();
                System.out.println("Connection Established. Current clients: " + (clients.size() + 1));
                new ClientHandler(soc).start();
            } 
            catch (SocketException e) 
            {
                System.out.println("Server socket closed.");
            }
        }

        ss.close();
        System.out.println("Server successfully turned off.");
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
                broadcast(" joined the chat!!\n", username, true);
                System.out.println(username + " joined the chat.");

                String msg;
                while ((msg = sbr.readLine()) != null)
                {
                    if (msg.equalsIgnoreCase("/quit")) 
                    {
                        System.out.println(username + " left the server.");
                        broadcast(" left the chat.\n", username, true);
                        clients.remove(clientSocket);
                        break;
                    }

                    else if (msg.equalsIgnoreCase("/list"))
                    {
                        System.out.println(username + " requested for usernames.");
                        for (Map.Entry<Socket, String> entry : clients.entrySet())
                        {
                            pw.println(entry.getValue());
                        }
                    }

                    else if (msg.startsWith("/pm"))
                    {
                        String[] pmsg = msg.split(" ", 3);

                        if (pmsg.length < 3)
                        {
                            pw.println("Incorrect format. Use /pm <their username> <message>");
                        }

                        String friend = pmsg[1];
                        String msgp = pmsg[2];

                        pmessage(msgp, friend, username);
                    }

                    else if (msg.equalsIgnoreCase("/help")) 
                    {
                        pw.println("Available commands:");
                        pw.println("/list - Lists all connected users");
                        pw.println("/pm <username> <message> - Sends a private message to a specific user");
                        pw.println("/quit - Leave the chat");
                        pw.println("To send a public message, just type and press enter.\n");
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
            finally
            {
                try
                {
                    if (clientSocket != null) 
                    {
                        clientSocket.close();  // Close the socket after the user leaves
                    }
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }

        private void broadcast (String msg, String sender, boolean sys)
        {
            for (Map.Entry<Socket, String> entry : clients.entrySet())
            {
                try
                {
                    PrintWriter pw = new PrintWriter(entry.getKey().getOutputStream(), true);

                    if (entry.getValue().equalsIgnoreCase(sender))
                    {
                        continue;   
                    }

                    if (sys)
                    {
                        pw.println(sender + msg);
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
            boolean found = false;
            for (Map.Entry<Socket, String> entry : clients.entrySet())
            {
                try
                {
                    PrintWriter pw = new PrintWriter(entry.getKey().getOutputStream(), true);

                    if (entry.getValue().equalsIgnoreCase(friend))
                    {
                        pw.println("Private " + sender + ": " + pmsg);
                        found = true;
                        break;
                    }
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }

            if (!found)
            {
                try
                {   
                    PrintWriter pw = new PrintWriter(clientSocket.getOutputStream(), true);
                    pw.println("User '" + friend + "' not found.");
                } 
                catch (IOException e) 
                {
                    e.printStackTrace();
                }
            }
        }
    }
}
