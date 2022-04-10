import java.io.*;
import java.net.*;

class Server
{
	public static void main(String args[])throws Exception
	{

		System.out.println("Server started..");
			
		ServerSocket ss=new ServerSocket(5555);
		while(true)
		{
	
		Socket s=ss.accept();	

		BufferedReader client_input=new BufferedReader(new InputStreamReader(s.getInputStream()));	

		BufferedReader server_input=new BufferedReader(new InputStreamReader(System.in));	

		DataOutputStream client_out=new DataOutputStream(s.getOutputStream());

		String client_str,server_str;	

		server_str=server_input.readLine();

		client_out.writeBytes(server_str+"n");

		client_str=client_input.readLine();
		
	
		System.out.println("client_str");

		
		}		
	}
	
  
}