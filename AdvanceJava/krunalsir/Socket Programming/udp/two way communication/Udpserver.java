import java.net.*;
import java.io.*;

class Udpserver
{
	public static void main(String args[])throws Exception
	{
		while(true)
		{
		
		DatagramSocket ds=new DatagramSocket(4444);
		System.out.println("Server is started..");
		
		

		//Receiving
		byte b[]=new byte[100];

		
		DatagramPacket dp=new DatagramPacket(b,b.length);
		ds.receive(dp);

		String str=new String(dp.getData());
		System.out.println("Received: "+str);
	
		//Sending

		String nickname=str.substring(0,3);

		byte b1[]=nickname.getBytes();
		InetAddress ia=InetAddress.getLocalHost();
		
		DatagramPacket dp1=new DatagramPacket(b1,b1.length,ia,dp.getPort());
		ds.send(dp1);
	
		
		}	

		
	}
}