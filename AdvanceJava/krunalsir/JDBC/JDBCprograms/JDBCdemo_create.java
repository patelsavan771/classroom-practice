import java.sql.*;

class JDBCdemo
{
	public static void main(String args[])throws Exception
	{
		Class.forName("oracle.jdbc.OracleDriver");

		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");

		Statement st=con.createStatement();

		String sql= "create table krunal(rno number,name varchar(10))";
		st.executeUpdate(sql);

		/*while(rs.next())
		{
			System.out.println("id:"+rs.getInt("id"));
			System.out.println("name:"+rs.getString("name"));
			System.out.println("city:"+rs.getString("city"));

		}*/

		//rs.close();
		st.close();
		con.close();

	}
}
