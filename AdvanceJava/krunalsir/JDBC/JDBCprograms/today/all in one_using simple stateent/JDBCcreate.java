import java.sql.*;

class JDBCcreate
{
	public static void main(String args[])throws Exception
	{
		Class.forName("oracle.jdbc.OracleDriver");

		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
		
		System.out.println("Connection Created");

		Statement st=con.createStatement();

		int result1=st.executeUpdate("create table studentinfo(rno number,name varchar(10),city varchar(10))");

		System.out.println("table created..");


		int result2=st.executeUpdate("insert into studentinfo values(1,'krunal','ahmedabad')");

		System.out.println("record inserted ..");

		int result3=st.executeUpdate("insert into studentinfo values(2,'panchal','rajkot')");

		System.out.println("record inserted ..");

		int result4=st.executeUpdate("insert into studentinfo values(3,'rima','patan')");

		System.out.println("record inserted ..");


		int result5=st.executeUpdate("update studentinfo set rno=4 where name='rima'");

		System.out.println("record updated ..");

		int result6=st.executeUpdate("delete from studentinfo where rno=4");

		System.out.println("record deleted ..");

		ResultSet rs=st.executeQuery("select * from studentinfo");

		System.out.println("Display the contents of table ..");

		while(rs.next())
		{
			System.out.println("rno:" +rs.getInt("rno"));
			System.out.println("name:" +rs.getString("name"));
			System.out.println("city:" +rs.getString("city"));
		}

		rs.close();
	
		st.close();
		
		con.close();

	
	}
}