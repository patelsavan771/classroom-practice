import java.net.*;
import java.io.*;

class Udpserver
{
	public static void main(String args[])throws Exception
	{
		DatagramSocket ds=new DatagramSocket(4444);
		System.out.println("Server is started..");

		//Receiving
		byte b[]=new byte[100];

		
		DatagramPacket dp=new DatagramPacket(b,b.length);
		ds.receive(dp);

		String str=new String(dp.getData());

		String reverse="";
		int length=str.length();

		
			for(int i=length-1; i>=0; i--)
			{			

			reverse=reverse+str.charAt(i);
			}	
			


		System.out.println("Reverse of entered string is: "+reverse);
	
		
		

		
	}
}							