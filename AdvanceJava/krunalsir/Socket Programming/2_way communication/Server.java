import java.io.*;
import java.net.*;

class Server
{
	public static void main(String args[])throws Exception
	{
		String str2;
		String str3;
		ServerSocket s2=new ServerSocket(1234);
		while(true)
		{
			Socket s3=s2.accept();
			BufferedReader in_client=new BufferedReader(new InputStreamReader(s3.getInputStream()));
			DataOutputStream out_client=new DataOutputStream(s3.getOutputStream());
			str2=in_client.readLine();
			str3=str2+"-->Received" +'\n';
			out_client.writeBytes(str3);
			
		}
	}

}