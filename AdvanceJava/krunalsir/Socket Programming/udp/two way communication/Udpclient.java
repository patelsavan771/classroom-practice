import java.net.*;
import java.io.*;

class Udpclient
{
	public static void main(String args[])throws Exception
	{
		DatagramSocket ds=new DatagramSocket();
		System.out.println("Client is started..");

		while(true)
		{
		
		//Sending
		String str="krunal panchal";
	
		byte b[]=str.getBytes();

		InetAddress ia=InetAddress.getLocalHost();

		DatagramPacket dp=new DatagramPacket(b,b.length,ia,4444);

		ds.send(dp);

		System.out.println("Packet send..");

		//Receiving

		byte b1[]=new byte[100];
		DatagramPacket dp1=new DatagramPacket(b1,b1.length);

		ds.receive(dp1);

		String nickname=new String(dp1.getData());
	
		System.out.println("received from server:"+nickname);
		}	
	}
}