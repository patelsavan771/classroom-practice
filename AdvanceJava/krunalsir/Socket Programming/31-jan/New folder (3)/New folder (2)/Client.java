import java.net.*;
import java.io.*;

class Client
{
	public static void main(String args[])throws Exception
	{
		Socket s=new Socket("localhost",3333);

		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);

		String str;
		str=br.readLine();
		
		DataOutputStream os=new DataOutputStream(s.getOutputStream());
		
		os.writeBytes(str+"\n"); 
		
	}
}