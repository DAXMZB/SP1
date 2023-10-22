package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.DbConnection;
import dao.memberDao;
import model.member;

public class memberDaoImpl implements memberDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	1 add				member m =new member("aaa","ooo","444");
//						new memberDaoImpl().add(m);
//	2 print all			System.out.println(new memberDaoImpl().queryAll());
//	3 					List<member> l=new memberDaoImpl().queryA112();
//		
		// for(member m:l)
		// {
		// System.out.println("\tid:"+m.getId()+
		// "\tname:"+m.getName()+
		// "\tusername:"+m.getUsername()+
		// "\tpassword:"+m.getPassword()+"\n");
		// }
//	 4 select where id	member m=new memberDaoImpl().queryID(4);
//						System.out.println(m);
//	 5 update   		member m=new memberDaoImpl().queryID(53);
		// m.setName("巨匠電腦");
		// m.setPassword("123456");
		// new memberDaoImpl().update(m);
		new memberDaoImpl().delte(54);
	}

	@Override
	public void add(String name, String username, String password) {
		Connection conn = DbConnection.getDb();
		String SQL = "insert into member(name,username,password) values(?,?,?)";

		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, name);
			ps.setString(2, username);
			ps.setString(3, password);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void add(member m) {
		// TODO Auto-generated method stub
		Connection conn = DbConnection.getDb();
		String sQL = "insert into member(name,username,password) values(?,?,?)";

		try {
			PreparedStatement ps = conn.prepareStatement(sQL);
			ps.setString(1, m.getName());
			ps.setString(2, m.getUsername());
			ps.setString(3, m.getPassword());

			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String queryAll() {
		// TODO Auto-generated method stub
		Connection conn = DbConnection.getDb();
		String SQL = "select * from member";
		String show = "";

		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				show += "id:" + rs.getInt("id:") + "\tname:" + rs.getString("name") + "\tusername:"
						+ rs.getString("username") + "\tpassword:" + rs.getString("password") + "\n";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return show;
	}

	@Override
	public List<member> queryA112() {
		// TODO Auto-generated method stub
		Connection conn = DbConnection.getDb();
		String SQL = "select * from member";
		List<member> l = new ArrayList();

		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				member m = new member();
				m.setId(rs.getInt("id"));
				m.setName(rs.getString("name"));
				m.setUsername(rs.getString("username"));
				m.setPassword(rs.getString("password"));
				l.add(m);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
	}

	@Override
	public member queryID(int id) {
		// TODO Auto-generated method stub
		Connection conn = DbConnection.getDb();
		String sQL = "select * from member where id=?";
		member m = null;

		try {
			PreparedStatement ps = conn.prepareStatement(sQL);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				m = new member();
				m.setId(rs.getInt("id"));
				m.setName(rs.getString("name"));
				m.setUsername(rs.getString("username"));
				m.setPassword(rs.getString("password"));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return m;
	}
	
	@Override
	public member PrintUser(String username) {
		// TODO Auto-generated method stub
		Connection conn=DbConnection.getDb();
		String SQL="select * from member where username=?";
		member m=null;
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setString(1, username);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				m=new member();
				m.setId(rs.getInt("id"));
				m.setName(rs.getString("name"));
				m.setUsername(rs.getString("username"));
				m.setPassword(rs.getString("password"));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return m;
	}

	@Override
	public boolean queryUser(String username, String password) {
		// TODO Auto-generated method stub
		Connection conn = DbConnection.getDb();
		String SQL = "select * from member where username=? and password=?";
		boolean x = true;
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				x = true;
			} else {
				x = false;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return x;
	}

	@Override
	public boolean queryUser(String username) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void update(member m) {
		// TODO Auto-generated method stub
		Connection conn = DbConnection.getDb();
		String SQL = "update member set name=?,password=? where id=?";

		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, m.getName());
			ps.setString(2, m.getPassword());
			ps.setInt(3, m.getId());
			ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void delte(int id) {
		// TODO Auto-generated method stub
		Connection conn = DbConnection.getDb();
		String SQL = "delete from member where id=?";

		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setInt(1, id);
			ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	

}
