import java.net.*;
import java.io.*;
import java.util.*;

class Server
{
    public static void main(String args[])
    {
       try
       {
	ServerSocket ss = new ServerSocket(7);
	while(true)
	{
		Socket client = ss.accept();
		System.out.println("Socket created.");
		System.out.println("Client inet address: " +client.getInetAddress());
		System.out.println("Client port: "+client.getPort());
		
		OutputStream out = client.getOutputStream();
		PrintWriter pw = new PrintWriter(out,true);                                                   
		
		Calendar c = Calendar.getInstance();			
		pw.println("The server date and time is: "+c.getTime());
		System.out.println("Contents writtern to"
+client.getInetAddress().getHostName());
		pw.close();
	}
      }
      catch(Exception e)
      {
	System.out.println(e);
      }
    }
}
