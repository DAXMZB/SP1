package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.DbConnection;
import dao.chatDao;
import vo.chat;

public class chatDaoImpl implements chatDao{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void add(chat c) {
		// TODO Auto-generated method stub
		Connection conn=DbConnection.getdb();
		String SQL="insert into chat(name,subject,content) values(?,?,?)";
		
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setString(1, c.getName());
			ps.setString(2, c.getSubject());
			ps.setString(3, c.getContent());
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<chat> queryAll() {
		// TODO Auto-generated method stub
		Connection conn=DbConnection.getdb();
		String SQL="select * from chat order by id desc";
		List<chat>l=new ArrayList();
		
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				chat c=new chat();
				c.setId(rs.getInt("id"));
				c.setName(rs.getString("name"));
				c.setSubject(rs.getString("subject"));
				c.setContent(rs.getString("content"));
				l.add(c);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
	}

}
