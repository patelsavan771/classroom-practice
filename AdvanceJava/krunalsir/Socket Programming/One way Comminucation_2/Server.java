import java.net.*;
import java.io.*;

 class Server
{
	public static void main(String args[])throws Exception
	{
	
	
	System.out.println("Server is Started");
	ServerSocket ss = new ServerSocket(2234);

	System.out.println("Server is Waiting for Client Request");
	Socket s= ss.accept();

	System.out.println("client is connected");

	BufferedReader br= new BufferedReader(new InputStreamReader(s.getInputStream()));
	String str=br.readLine();

	System.out.println("Client Data:" + str);
 
	
   }
}

