import java.net.*;
import java.io.*;

public class Client
{
       public static void main(String args[])
       {
	  try
	  {
		Socket s = new Socket(InetAddress.getLocalHost(),7);
		System.out.println("Socket Created");

		System.out.println("Local Address: "+s.getLocalAddress());
		System.out.println("Local Host: "+InetAddress.getLocalHost());
		System.out.println("Local Port: "+s.getLocalPort());
		System.out.println("Inet Address: "+s.getInetAddress());
		
		InputStream in = s.getInputStream();
		System.out.println("Streams created");

		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		String x = null;
		while((x=br.readLine())!=null)
			System.out.println(x);

		in.close();
		s.close();
	  }
	  catch(Exception e)
              {
		System.out.println(e);
              }
       }
}
