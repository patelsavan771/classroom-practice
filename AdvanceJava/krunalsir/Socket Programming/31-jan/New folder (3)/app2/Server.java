import java.net.*;
import java.io.*;

class Server
{
	public static void main(String args[])throws Exception
	{
		System.out.println("s: Server is Started");
		ServerSocket ss=new ServerSocket(4444);
		
		System.out.println("s: Server is waiting for client request");
		Socket s=ss.accept();

		System.out.println("s: Client is connected");

		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		String str=br.readLine();

		System.out.println("s: Client data:" +str);

		String nickname=str.substring(0,3);
		
		OutputStreamWriter os= new OutputStreamWriter(s.getOutputStream());
		PrintWriter pw=new PrintWriter(os);
		pw.println(nickname);
		pw.flush();

		System.out.println("s: data sent from server to client:");

		
	}
}