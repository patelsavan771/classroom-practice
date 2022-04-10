import java.io.*;
import java.net.*;


class Server
{
	public static void main(String args[])throws Exception
	{
		DatagramSocket ds=new DatagramSocket(4444);
		
		//receive

		byte[] b=new byte[200];
		DatagramPacket dp=new DatagramPacket(b,b.length);
		ds.receive(dp);

		String str=new String(dp.getData());
		int num=Integer.parseInt(str.trim());
		int result=num*num;

		//send

		byte[] b1=String.valueOf(result).getBytes();
		InetAddress ia=InetAddress.getByName("localhost");
		DatagramPacket dp1=new DatagramPacket(b1,b1.length,ia,dp.getPort());
		ds.send(dp1);
}
}
