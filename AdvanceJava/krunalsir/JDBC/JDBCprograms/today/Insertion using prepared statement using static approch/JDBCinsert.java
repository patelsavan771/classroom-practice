import java.sql.*;

class JDBCinsert
{
	public static void main(String args[])throws Exception
	{
		
		int id=1;
		String name="krunal";
		String city="patan";

		Class.forName("oracle.jdbc.OracleDriver");

		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
		
		System.out.println("Connection Created");

		PreparedStatement pst=con.prepareStatement("insert into emp values(?,?,?)");

		pst.setInt(1,id);
		pst.setString(2,name);
		pst.setString(3,city);

		int result= pst.executeUpdate();		

		if(result!=0)
			System.out.println("values inserted in the table");
		else
			System.out.println("values are not inserted in the table");


		ResultSet rs=pst.executeQuery("select * from emp");

		while(rs.next())
		{
			System.out.println("id:"+rs.getInt("id"));
			System.out.println("name:"+rs.getString("name"));
			System.out.println("city:"+rs.getString("city"));
		}

		rs.close();

		pst.close();		
		
		con.close();

	
	}
}