import java.net.*;
import java.io.*;

class Server
{
	public static void main(String args[])throws Exception
	{
		ServerSocket ss=new ServerSocket(3333);
		
		
		
			Socket s=ss.accept();
			
			InputStreamReader ir=new InputStreamReader(s.getInputStream());
			BufferedReader br=new BufferedReader(ir);

			String str;
			str=br.readLine();
		
			System.out.println(str);
		
	}
}