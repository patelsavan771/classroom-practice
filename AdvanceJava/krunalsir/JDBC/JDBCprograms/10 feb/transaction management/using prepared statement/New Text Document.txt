import java.sql.*;

class JDBCtransaction
{
	public static void main(String args[])throws Exception
	{
		
		Class.forName("oracle.jdbc.OracleDriver");

		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
		
		System.out.println("Connection Created");

		con.setAutoCommit(false);

		Statement st=con.createStatement();
		
		st.executeUpdate("insert into emp values(7,'ashka',40000)");
		st.executeUpdate("insert into emp values(8,'amita',50000)");

			
		
		con.commit();	
		System.out.println("record successfully saved");

		

		con.close();

	
	}
}