import java.sql.*;

class JDBCmetadata
{
	public static void main(String args[])throws Exception
	{
		
		Class.forName("oracle.jdbc.OracleDriver");

		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
		
		System.out.println("Connection Created");
		
		DatabaseMetaData dbmd=con.getMetaData();

	
		System.out.println("Database Productname:"+dbmd.getDatabaseProductName());
		System.out.println("Database ProductVersion:"+dbmd.getDatabaseProductVersion());
		System.out.println("Database MajorVersion:"+dbmd.getDatabaseMajorVersion());
		System.out.println("Database MinorVersion:"+dbmd.getDatabaseMinorVersion());
		System.out.println("JDBCMajorVersion :"+dbmd.getJDBCMajorVersion());
		System.out.println("JDBC MinorVersion:"+dbmd.getJDBCMinorVersion());
		System.out.println("DriverName:"+dbmd.getDriverName());
		System.out.println("DriverVersion:"+dbmd.getDriverVersion());
		System.out.println("URL:"+dbmd.getURL());
		System.out.println("UserName:"+dbmd.getUserName());
		System.out.println("Max.columns in table:"+dbmd.getMaxColumnsInTable());
		System.out.println("SQLkeywords:"+dbmd.getSQLKeywords());
		System.out.println("Numeric Functions:"+dbmd.getNumericFunctions());
		System.out.println("StringFunctions:"+dbmd.getStringFunctions());
				

		con.close();

	
	}
}