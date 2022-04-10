import java.net.*;
import java.io.*;

class Client
{
	public static void main(String args[])throws Exception
	{
		Socket s=new Socket("localhost",4444);
		
					

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		DataOutputStream os=new DataOutputStream(s.getOutputStream());

		String str;
		str=br.readLine();
		os.writeBytes(str+"\n");

		
		s.close();

	
		
	}
}