import java.sql.*;

class JDBCcallable
{
	public static void main(String args[])throws Exception
	{
		
		Class.forName("oracle.jdbc.OracleDriver");

		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
		
		System.out.println("Connection Created");

		CallableStatement cst=con.prepareCall("{call addproc(?,?,?)}");
		
		

		cst.setInt(1,100);
		cst.setInt(2,200);


		cst.registerOutParameter(3,Types.INTEGER);		

		cst.execute();

		System.out.println("Result:"+cst.getInt(3));

		cst.close();		
		
		con.close();

	
	}
}