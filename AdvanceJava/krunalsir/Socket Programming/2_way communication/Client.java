import java.io.*;
import java.net.*;

class Client
{
 public static void main(String args[])throws Exception
	{
		String str;
		String str1;
		Socket s1=new Socket("localhost",1234);
		BufferedReader input_user=new BufferedReader(new InputStreamReader(System.in));
		DataOutputStream out_server=new DataOutputStream(s1.getOutputStream());
		BufferedReader in_server=new BufferedReader(new InputStreamReader(s1.getInputStream()));
		str=input_user.readLine();
		out_server.writeBytes(str+"\n");
		str1=in_server.readLine();
		System.out.println("from server:"+str1);
		s1.close();
	}
}