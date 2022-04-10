import java.io.*;
import java.net.*;

class Server
{
	public static void main(String args[])throws Exception
	{
	  ServerSocket server_socket=new ServerSocket(1234);
	  while(true)
	  {
	   Socket Listen_socket= server_socket.accept();
	   BufferedReader client_input=new BufferedReader(new InputStreamReader(Listen_socket.getInputStream()));
	   String client_str;
	   client_str=client_input.readLine();
	   System.out.println(client_str);
          }
        }
}