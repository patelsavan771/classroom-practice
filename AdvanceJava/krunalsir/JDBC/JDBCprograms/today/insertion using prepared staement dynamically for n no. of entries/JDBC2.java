import java.sql.*;
import java.util.*;

class JDBCinsert
{
	public static void main(String args[])throws Exception
	{
		Class.forName("oracle.jdbc.OracleDriver");

		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
		
		System.out.println("connection created...");

		PreparedStatement pst=con.prepareStatement("insert into st2 values(?,?,?)");   //compilation of query	

		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			 System.out.println("Enter name:");
			 String name=sc.next();
			 System.out.println("Enter rno:");
			 int rno=sc.nextInt();
			 

			pst.setString(1,name);
			pst.setInt(2,rno);
				

			pst.executeUpdate();

			System.out.println("record inserted suceessfully...");
			
			System.out.println("do u want to insert one more record?[yes/no]..");

			String option=sc.next();

			if(option.equalsIgnoreCase("no"))
			{
				break;
			}
		}
		pst.close();

		con.close();
		
		
	}
}