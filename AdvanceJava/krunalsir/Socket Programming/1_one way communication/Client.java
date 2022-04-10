import java.io.*;
import java.net.*;

class Client
{
	public static void main(String args[])throws Exception
	{
	  Socket client_socket=new Socket("localhost",1234);
          InputStreamReader r=new InputStreamReader(System.in);	  

	  BufferedReader br=new BufferedReader(r);
	  DataOutputStream server_out=new DataOutputStream(client_socket.getOutputStream());
	   String Str;
	   Str=br.readLine();
	   server_out.writeBytes(Str+"\n");
	   client_socket.close();
          }
        
}