import java.net.*;
import java.io.*;

class Client
{
	public static void main(String args[])throws Exception
	{
		Socket s=new Socket("localhost",4444);
		
		String str="krunal panchal";
		
		OutputStreamWriter os= new OutputStreamWriter(s.getOutputStream());
		PrintWriter pw=new PrintWriter(os);
		pw.println(str);
		
		pw.flush();

		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		String nickname=br.readLine();

		System.out.println("c: data from server:" +nickname);
	
		
	}
}