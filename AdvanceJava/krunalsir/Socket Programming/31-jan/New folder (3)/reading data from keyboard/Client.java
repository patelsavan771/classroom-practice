import java.io.*;
import java.net.*;

class Client
{
	public static void main(String args[])throws Exception
	{
		Socket s=new Socket("localhost",6666);

		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);
		
		String str;
		str=br.readLine();

		OutputStreamWriter os=new OutputStreamWriter(s.getOutputStream());
		PrintWriter pw = new PrintWriter(os);
		pw.println(str+"\n");
		pw.flush();

		s.close();
			
	}
}