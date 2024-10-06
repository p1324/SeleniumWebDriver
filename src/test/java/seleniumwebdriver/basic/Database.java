package seleniumwebdriver.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {

	public static void main(String[] args) throws SQLException {
//
		try {
			// create connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pradip", "root", "@**adwtgj12Z");
			
			// create statement to write query
			Statement stmt = con.createStatement();
			
			// create result set to store the o/p of query
			ResultSet rs = stmt.executeQuery("select * from student");
			
			while (rs.next()) 
			{
				System.out.println(rs.getInt(1) + "  " + rs.getString(2));
				/*
				 * int id=rs.getInt(1); if(id==3) { System.out.println(id); }
				 */
			}
			con.close();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}
