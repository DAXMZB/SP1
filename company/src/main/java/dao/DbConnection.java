package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DbConnection {

	public void show1() {
		System.out.println("show1");
	}

	public static void show2() {
		System.out.println("show2");
	}

	public static void main(String[] args) {
		
		System.out.println(DbConnection.getDb());
		/*String url = "jdbc:mysql://localhost:3306/company";
		String user = "root";
		String password = "POPPOPfull1";
		String sql = "insert into member(name,username,password) values(?,?,?)";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection conn=DriverManager.getConnection(url, user, password);
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, "MapleStory");
			ps.setString(2, "哈密嘎");
			ps.setString(3, "1234");
			
			ps.executeUpdate();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
//		new DbConnection().show1(); 
//		DbConnection.show2();
	}
	public static Connection getDb()
	{
		String url="jdbc:mysql://localhost:3306/company";
		String user="root";
		String password="POPPOPfull1";
		
		Connection conn=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 conn=DriverManager.getConnection(url, user, password);		
			
		} catch (ClassNotFoundException e) {
			System.out.println("No Driver");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("No connection");
			e.printStackTrace();
		}
		
		return conn;
	}

}
