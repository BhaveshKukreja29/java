import java.net.*;
import java.io.*;

class Client {
    public static void main(String args[]) throws Exception {
        System.out.println("Client instantiated.");
        Socket soc;
        try
        {
            soc = new Socket("localhost", 9806);
            System.out.println("Welcome to the chat!");
        }
        catch(IOException e)
        {
            System.out.println("Error connecting to server. Please try later.");
            return;
        }
    
        System.out.println("Chats below, enter *quit* to exit the chat.\n");

        InputStreamReader cisr = new InputStreamReader(System.in);
        BufferedReader cbr = new BufferedReader(cisr);
        PrintWriter pw = new PrintWriter(soc.getOutputStream(), true);

        InputStreamReader sisr = new InputStreamReader(soc.getInputStream());
        BufferedReader sbr = new BufferedReader(sisr);

        String username = "";

        while (username.isEmpty())
        {
            System.out.print("Enter username: ");
            username = cbr.readLine().trim();
            System.out.println();

            if (username.isEmpty())
            {
                System.out.println("Please enter a valid username.");
            }
        }

        pw.println(username);

        new Thread(() -> {
            try {
                String msg;
                while ((msg = sbr.readLine()) != null) {
                    System.out.println(msg);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();

        while (true) {
            String message = cbr.readLine(); 

            if (message.equalsIgnoreCase("/quit")) {
                System.out.println("You left the chat server :(\nWe will miss you.");
                pw.println(message);
                break;
            }

            pw.println(message);
        }

        soc.close();
    }
}
