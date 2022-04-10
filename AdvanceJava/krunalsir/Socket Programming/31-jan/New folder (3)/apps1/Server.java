import java.net.*;
import java.io.*;

class Server
{
	public static void main(String args[])throws Exception
	{
		System.out.println("Server is Started");
		ServerSocket ss=new ServerSocket(4444);
		
		System.out.println("Server is waiting for client request");
		Socket s=ss.accept();

		System.out.println("Client is connected");

		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		String str=br.readLine();

		System.out.println("Client data:" +str);
	}
}