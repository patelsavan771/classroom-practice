import java.net.*;
import java.io.*;
import java.util.*;

class Server
{
	public static void main(String args[])throws Exception
	{

		System.out.println("s: Server is started");
		ServerSocket ss=new ServerSocket(4444);

		System.out.println("s: Server is waiting for client request");
		Socket s=ss.accept();	
	
		System.out.println("client is connected");

		Date d=new Date();
		String str="current date&time from server is:"+d;

		OutputStreamWriter os=new OutputStreamWriter(s.getOutputStream());
		PrintWriter pw=new PrintWriter(os);
		pw.println(str);
		pw.flush();
		




	}
}