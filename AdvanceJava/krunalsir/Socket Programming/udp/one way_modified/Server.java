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

		DatagramPacket dp=new DatagramPacket(b,b.length);
		
		ds.receive(dp);

		//String str=new String(dp.getData());
		
		int p=dp.getPort();

		//System.out.println("Client data is:"+str);

		System.out.println("port no is:"+p);
		
		
	}
}