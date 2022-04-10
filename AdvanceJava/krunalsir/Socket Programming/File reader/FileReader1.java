import java.io.*;

class FileReader
{
 public static void main(String args[])throws Exception
 {
	FileInputStream fis=new FileInputStream("abc.txt");

	int data;
	while((data =fis.read())!= -1)
	{
	System.out.println("data:" + (char)data);
	}
	fis.close();	
  }
}