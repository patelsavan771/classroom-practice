import java.net.*;
import java.io.*;

 class Client
{
	public static void main(String args[])throws Exception
	{
	
	Socket s = new Socket("localhost",2234);

	String str="krunal panchal";

	OutputStreamWriter os=new OutputStreamWriter(s.getOutputStream());
	PrintWriter out=new PrintWriter(os);
	out.println(str);
	os.flush();
	s.close();
	
	
	
    }
}

