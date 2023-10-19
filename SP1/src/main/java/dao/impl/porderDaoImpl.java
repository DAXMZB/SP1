package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.DbConnection;
import dao.porderDao;
import vo.porder;

public class porderDaoImpl implements porderDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void add(porder p) {
		// TODO Auto-generated method stub
		Connection conn = DbConnection.getdb();
		String SQL = "insert into porder(memberNo,a,b,c,sum) values(?,?,?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, p.getMemberNo());
			ps.setInt(2, p.getA());
			ps.setInt(3, p.getB());
			ps.setInt(4, p.getC());
			ps.setInt(5, p.getSum());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<porder> queryAll() {
		// TODO Auto-generated method stub
		Connection conn = DbConnection.getdb();
		List<porder> l = new ArrayList();
		String SQL = "select * from porder";
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				porder p = new porder();
				p.setId(rs.getInt("id"));
				p.setMemberNo(rs.getString("memberNo"));
				p.setA(rs.getInt("A"));
				p.setB(rs.getInt("B"));
				p.setC(rs.getInt("C"));
				p.setSum(rs.getInt("SUM"));
				l.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
	}

	@Override
	public List<porder> querySum(int start, int end) {
		// TODO Auto-generated method stub
		Connection conn = DbConnection.getdb();
		String SQL = "select * from porder where sum between ? and ?";
		List<porder> l = new ArrayList();
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setInt(1, start);
			ps.setInt(2, end);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				porder p = new porder();
				p.setId(rs.getInt("id"));
				p.setMemberNo(rs.getString("memberNo"));
				p.setA(rs.getInt("A"));
				p.setB(rs.getInt("B"));
				p.setC(rs.getInt("C"));
				p.setSum(rs.getInt("SUM"));

				l.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
	}

	@Override
	public porder queryId(int id) {
		Connection conn = DbConnection.getdb();
		String SQL = "select * from porder where id=?";
		porder p = new porder();
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {

				p.setId(rs.getInt("id"));
				p.setMemberNo(rs.getString("memberNo"));
				p.setA(rs.getInt("A"));
				p.setB(rs.getInt("B"));
				p.setC(rs.getInt("C"));
				p.setSum(rs.getInt("sum"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}

	@Override
	public void update(porder p) {
		// TODO Auto-generated method stub
		Connection conn = DbConnection.getdb();
		String SQL = "update porder set A=?,B=?,C=?,sum=? where id=?";
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setInt(1, p.getA());
			ps.setInt(2, p.getB());
			ps.setInt(3, p.getC());
			ps.setInt(4, p.getSum());
			ps.setInt(5, p.getId());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		Connection conn = DbConnection.getdb();
		String SQL = "delete from porder where id=?";
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
