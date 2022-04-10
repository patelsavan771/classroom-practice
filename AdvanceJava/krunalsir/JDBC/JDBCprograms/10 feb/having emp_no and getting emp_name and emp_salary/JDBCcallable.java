import java.sql.*;

class JDBCcallable
{
	public static void main(String args[])throws Exception
	{
		
		Class.forName("oracle.jdbc.OracleDriver");

		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
		
		System.out.println("Connection Created");

		CallableStatement cst=con.prepareCall("{call getempinfo(?,?,?)}");

		cst.setInt(1,3);
		

		cst.registerOutParameter(2,Types.VARCHAR);
		cst.registerOutParameter(3,Types.INTEGER);

		cst.execute();

		System.out.println("name of employee is:"+cst.getString(2));
		System.out.println("salary of employee is:"+cst.getInt(3));

		cst.close();		
		
		con.close();

	
	}
}