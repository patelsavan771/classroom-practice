import java.sql.*;

class JDBCmetadata
{
	public static void main(String args[])throws Exception
	{
		
		Class.forName("oracle.jdbc.OracleDriver");

		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
		
		System.out.println("Connection Created");

		Statement st=con.createStatement();

		ResultSet rs=st.executeQuery("select * from emp");

		ResultSetMetaData rsmd=rs.getMetaData();	
		
		System.out.println("Total no. of columns:"+rsmd.getColumnCount());
		System.out.println("Name of first column:"+rsmd.getColumnName(1));
		System.out.println("Name of second column:"+rsmd.getColumnName(2));
		System.out.println("Name of third column:"+rsmd.getColumnName(3));
		System.out.println("Datatype of first column:"+rsmd.getColumnTypeName(1));
		System.out.println("Datatype of second column:"+rsmd.getColumnTypeName(2));		
		System.out.println("Datatype of third column:"+rsmd.getColumnTypeName(3));

		con.close();

	
	}
}