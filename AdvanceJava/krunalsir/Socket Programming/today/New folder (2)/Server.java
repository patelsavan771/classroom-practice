import java.net.*;
import java.io.*;

class Server
{
	public static void main(String args[])throws Exception
	{

		ServerSocket ss=new ServerSocket(4444);
		

		while(true)
		{		

		Socket s=ss.accept();

		
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		String client_str;
		client_str=br.readLine();

		System.out.println(client_str);




	}	
	}
}