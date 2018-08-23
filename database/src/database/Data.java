package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Data {
	//@SuppressWarnings("deprecation")
	public static void main(String[] args) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/selenium?useSSL=false",username,password);
		Statement state = con.createStatement();
		ResultSet r = state.executeQuery(query);
		while(r.next())
		{
			String name = r.getString("name");
			int age = r.getInt("age");
			System.out.println("seleniumcontents"+name+age);
		}
		System.out.println("name"+r);
	}

}
