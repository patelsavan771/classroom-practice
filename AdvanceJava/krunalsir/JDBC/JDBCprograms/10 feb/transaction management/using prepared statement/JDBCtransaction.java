import java.sql.*;
import java.io.*;

class JDBCtransaction
{
	public static void main(String args[])throws Exception
	{
		
		Class.forName("oracle.jdbc.OracleDriver");

		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
		
		System.out.println("Connection Created");

		con.setAutoCommit(false);

		PreparedStatement pst=con.prepareStatement("insert into emp values(?,?,?)");  

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  

		while(true)
		{  
  			System.out.println("enter emp_no");  
			String s1=br.readLine();  
			int emp_no=Integer.parseInt(s1);
		
			System.out.println("enter ep_name");  
			String emp_name=br.readLine();  

			System.out.println("enter emp_salary");  
			String s3=br.readLine();  
			int emp_salary=Integer.parseInt(s3); 

			pst.setInt(1,emp_no);  
			pst.setString(2,emp_name);  
			pst.setInt(3,emp_salary);  
			pst.executeUpdate(); 


			System.out.println("commit/rollback");  
			String answer=br.readLine();  
			if(answer.equals("commit"))
			{  
			con.commit();  
			}    
			
			if(answer.equals("rollback"))
			{  
			con.rollback();  
			}  


			System.out.println("Want to add more records y/n");  
			String ans=br.readLine();  
			if(ans.equals("n"))
			{  
			break;  
			}
		
		}  
			con.commit();  
			System.out.println("record successfully saved");  
  
			con.close();
		
		
		
	
	}
}