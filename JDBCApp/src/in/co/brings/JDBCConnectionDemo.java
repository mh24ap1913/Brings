package in.co.brings;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnectionDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from student order by id");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			
		
		/*
		PreparedStatement pstmt=con.prepareStatement("insert into student values(?,?,?)");
		pstmt.setInt(1, 10);
		pstmt.setString(2, "vishal");
		pstmt.setString(3, "pune");
		int res=pstmt.executeUpdate();
		if(res==0) {
			System.out.println("value not  store successfully");
		}
		else {
			System.out.println("value saved successfully");
		}*/
		
		}
		System.out.println("value retrive succesfully");
	}


}
