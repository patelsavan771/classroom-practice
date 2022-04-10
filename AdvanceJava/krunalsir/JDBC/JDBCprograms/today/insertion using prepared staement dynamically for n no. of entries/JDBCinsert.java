import java.sql.*;
import java.util.*;

class JDBCinsert
{
	public static void main(String args[])throws Exception
	{
		Class.forName("oracle.jdbc.OracleDriver");

		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
		
		System.out.println("connection created...");

		PreparedStatement pst=con.prepareStatement("insert into emp values(?,?,?)");   //compilation of query	

		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			 System.out.println("Enter Emp_id:");
			 int id=sc.nextInt();
			 System.out.println("Enter Emp_name:");
			 String name=sc.next();
			 System.out.println("Enter Emp_city:");
			 String city=sc.next();

			pst.setInt(1,id);
			pst.setString(2,name);
			pst.setString(3,city);	

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