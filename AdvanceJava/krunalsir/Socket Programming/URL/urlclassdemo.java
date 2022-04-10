import java.net.*;

class Urlclassdemo
{
	public static void main(String args[])throws Exception
	{
		URL url=new URL("https://www.w3schools.com/html/default.asp");

		System.out.println("url is:"+url.toString());
		System.out.println("protocol is:"+url.getProtocol());
		System.out.println("class is:"+url.getClass());
		System.out.println("port is:"+url.getPort());
		System.out.println("Default port is:"+url.getDefaultPort());
		System.out.println("protocol is:"+url.getProtocol());
		System.out.println("host is:"+url.getHost());
		System.out.println("file is:"+url.getFile());

	}

}