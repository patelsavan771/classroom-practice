import java.io.*;
import java.net.*;

class Server
{
	public static void main(String args[])throws Exception
	{
		ServerSocket ss=new ServerSocket(6666);

		while(true)
		{
		Socket s=ss.accept();		

		InputStreamReader is=new InputStreamReader(s.getInputStream());
		BufferedReader br=new BufferedReader(is);
		
		String str;
		str=br.readLine();


		System.out.println(str);
		}		
	}
}