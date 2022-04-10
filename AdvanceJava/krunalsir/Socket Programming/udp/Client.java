import java.io.*;
import java.net.*;

class Client
{
	public static void main(String args[])throws Exception
	{
		
		DatagramSocket client_socket=new DatagramSocket();
		
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);

				
		byte out_data[]=new byte[1024];

		String str=br.readLine();
		out_data=str.getBytes();

		DatagramPacket packet1=new DatagramPacket(out_data,out_data.length,InetAddress.getLocalHost(),3333);

		client_socket.send(packet1);

		client_socket.close();		
	}
}