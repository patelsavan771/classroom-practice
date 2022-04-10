import java.sql.*;

class JDBCcallable
{
	public static void main(String args[])throws Exception
	{
		
		Class.forName("oracle.jdbc.OracleDriver");

		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
		
		System.out.println("Connection Created");

		CallableStatement cst=con.prepareCall("{call getempinfo(?,?)}");

		cst.setInt(1,3);
		

		cst.registerOutParameter(2,Types.INTEGER);

		cst.execute();

		System.out.println("result is:"+cst.getInt(2));
		

		cst.close();		
		
		con.close();

	
	}
}

/* Process to call stored procedure from java application by using callable statement
1) Make sure stored procedure is already there in the database
2) Create callable statement object
3) Provide values for every IN parameter by using corresponding setter method
4)