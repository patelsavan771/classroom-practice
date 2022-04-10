import java.net.*;
import java.io.*;

class Client
{
	public static void main(String args[])throws Exception
	{
		Socket s=new Socket("localhost",4444);

		System.out.println("Enter Date/Time");
		
		InputStreamReader is=new InputStreamReader(s.getInputStream());
		BufferedReader br=new BufferedReader(is);

		System.out.println(br.readLine());
		br.close();
		
	}
}