import java.io.*;

class FileReader
{
 public static void main(String args[])throws Exception
 {
	FileInputStream fis=new FileInputStream("abc.txt");

	int data=fis.read();

	System.out.println("data:" + (char)data);
	
	fis.close();	
  }
}