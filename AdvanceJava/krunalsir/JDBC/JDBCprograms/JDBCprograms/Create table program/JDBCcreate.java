import java.sql.*;

class JDBCcreate
{
	public static void main(String args[])throws Exception
	{
		//Connection con=null;
	
		Class.forName("oracle.jdbc.OracleDriver");
	
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");

		System.out.println("Connection suceessful");

		Statement stat=con.createStatement();
		
		int result=stat.executeUpdate("CREATE TABLE stud1234(RNO number,NAME varchar(10))");

		System.out.println("table created");
		
		stat.close();

		con.close();
	}
}