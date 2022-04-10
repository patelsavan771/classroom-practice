import java.net.*;
import java.io.*;

class Udpserver
{
	public static void main(String args[])throws Exception
	{
		DatagramSocket ds=new DatagramSocket(4444);
		System.out.println("Server is started..");

		byte b[]=new byte[1024];
		DatagramPacket dp=new DatagramPacket(b,b.length);
		ds.receive(dp);

		String str=new String(dp.getData());
		System.out.println("Received: "+str);
	

		

		
	}
}