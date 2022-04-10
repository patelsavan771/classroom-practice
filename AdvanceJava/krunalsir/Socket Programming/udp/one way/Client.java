import java.net.*;
import java.io.*;

class Client
{
	public static void main(String args[])throws Exception
	{
		
		DatagramSocket ds=new DatagramSocket();
		System.out.println("Client is Started");

		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);

		String str=br.readLine();

		//send
		

		byte[] b=str.getBytes();

		InetAddress ia=InetAddress.getByName("192.168.82.1");

		DatagramPacket dp=new DatagramPacket(b,b.length,ia,4444);

		ds.send(dp);

		System.out.println("Packet send...");

		
	}
}