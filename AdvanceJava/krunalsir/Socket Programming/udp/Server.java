import java.io.*;
import java.net.*;

class Server
{
	public static void main(String args[])throws Exception
	{
		
		DatagramSocket Server_socket=new DatagramSocket(3333);
		
		byte in_data[]=new byte[1024];

		DatagramPacket packet2=new DatagramPacket(in_data,in_data.length);

		Server_socket.receive(packet2);
		
		String str=new String(packet2.getData());

		System.out.println(str);
				
	}
}