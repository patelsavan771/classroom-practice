import java.io.*;
import java.net.*;

class Client
{
	public static void main(String args[])throws Exception
	{
		DatagramSocket ds=new DatagramSocket();

		//send

		int i=7;
		byte[] b=String.valueOf(i).getBytes();

		InetAddress ia=InetAddress.getByName("localhost");
		DatagramPacket dp=new DatagramPacket(b,b.length,ia,4444);
		ds.send(dp);

		//receive

		byte[] b1=new byte[120];
		DatagramPacket dp1=new DatagramPacket(b1,b1.length);
		ds.receive(dp1);
		
		String str=new String(dp1.getData());
		System.out.println("result is:"+str);
}
}