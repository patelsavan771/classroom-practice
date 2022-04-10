import java.io.*;
import java.net.*;

class Client
{
	public static void main(String args[])throws Exception
	{

		

		System.out.println("Enter somthing to start communication..");
			
		while(true)
		{

		Socket s=new Socket("localhost",5555);
		
		BufferedReader user_input=new BufferedReader(new InputStreamReader(System.in));	

		BufferedReader server_input=new BufferedReader(new InputStreamReader(s.getInputStream()));	

		DataOutputStream server_out=new DataOutputStream(s.getOutputStream());

	
		
		
		String str,str1;		

		
		
		str=user_input.readLine();

		server_out.writeBytes(str+"\n");

		str1=server_input.readLine(); 
	
		System.out.println("str1");

		s.close();
		}		
	}
	
  
}