import java.net.*;
import java.io.*;

class Server
{
	public static void main(String args[])throws Exception
	{
		DatagramSocket ds=new DatagramSocket(4444);
		System.out.println("Server is Started");
		
		//receive

		byte[] b=new byte[100];

		DatagramPacket dp=new DatagramPacket(b,100);
		
		ds.receive(dp);

		String str=new String(dp.getData());

		System.out.println("Client data is:"+str.toUpperCase());

		
		
	}
}