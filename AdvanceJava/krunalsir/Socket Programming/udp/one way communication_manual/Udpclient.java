import java.net.*;
import java.io.*;

class Udpclient
{
	public static void main(String args[])throws Exception
	{
		DatagramSocket ds=new DatagramSocket();
		System.out.println("Client is started..");

		String str="krunal panchal";
	
		byte b[]=str.getBytes();

		InetAddress ia=InetAddress.getLocalHost();

		DatagramPacket dp=new DatagramPacket(b,b.length,ia,4444);

		ds.send(dp);

		System.out.println("Packet send..");

		
	}
}