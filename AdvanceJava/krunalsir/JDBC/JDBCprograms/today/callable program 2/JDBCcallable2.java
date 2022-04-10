import java.sql.*;

class JDBCcallable2
{
	public static void main(String args[])throws Exception
	{
		
		Class.forName("oracle.jdbc.OracleDriver");

		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
		
		System.out.println("Connection Created");

		CallableStatement cst=con.prepareCall("{call getempinfo(?,?,?)}");
		
		

		cst.setInt(1,1);
		
		
		cst.registerOutParameter(2,Types.VARCHAR);		
		cst.registerOutParameter(3,Types.FLOAT);		

		cst.execute();

		System.out.println("emp name is:"+cst.getString(2));
		System.out.println("emp salary is:"+cst.getFloat(3));
		cst.close();		
		
		con.close();

	
	}
}