import java.sql.*;

class JDBCinsert
{
	public static void main(String args[])throws Exception
	{
		//Connection con=null;
	
		Class.forName("oracle.jdbc.OracleDriver");
	
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");

		System.out.println("Connection suceessful");

		Statement stat=con.createStatement();
		
		System.out.println("Inserting records into the table...");          

 	        String sql = "INSERT INTO STUDENT VALUES (105, 'Zara', 'ahmedabad')";
	         stat.executeUpdate(sql);
        
		 sql = "INSERT INTO STUDENT VALUES (102, 'Ziba', 'surat')";
	         stat.executeUpdate(sql);

		 sql = "INSERT INTO STUDENT VALUES (104, 'krunal', 'rajkot')";
	         stat.executeUpdate(sql);


	
        	 System.out.println("Inserted records into the table..."); 		


		
		stat.close();

		con.close();
	}
}