import java.sql.*;

class JDBCselect
{
	public static void main(String args[])throws Exception
	{
		//Connection con=null;
	
		Class.forName("oracle.jdbc.OracleDriver");
	
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");

		System.out.println("Connection suceessful");

		Statement stat=con.createStatement();
		
		System.out.println("Selecting records from the table...");          

 	        String sql = "select * from student where id=103";
	        stat.executeUpdate(sql);
        
		sql="select * from student";
		ResultSet rs=stat.executeQuery(sql);
		

	       	 System.out.println("Displaying the content if the table..."); 	

		while(rs.next())
		{
			//int id1=rs.getInt("id");
			//String name1=rs.getString("name");
			//String city1=rs.getString("city");
			
			System.out.println("id:"+rs.getInt("id"));
			System.out.println("name:"+rs.getString("name"));
			System.out.println("city:"+rs.getString("city"));
		}

		rs.close();
		
		stat.close();

		con.close();
	}
}