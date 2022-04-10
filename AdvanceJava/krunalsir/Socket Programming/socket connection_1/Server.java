
import java.net.*;
import java.io.*;

 class Server
{
	public static void main(String args[])throws Exception
	{
	ServerSocket ss = new ServerSocket(1235);

	Socket s= ss.accept();
	
	System.out.println("client is connected");
 }
}

