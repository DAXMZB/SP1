package dao;

import java.util.List;

import model.member;

public interface memberDao {
	//create
	void add(String name,String username,String password);
	void add(member m);//inject
	
	//read
	String queryAll();
	List<member> queryA112();
	member queryID(int id);
	member PrintUser(String username);
	boolean queryUser(String username,String password);//登入用
	boolean queryUser(String username);//檢查是否重複
	
	//update
	void update(member m);
	
	
	//delete
	void delte(int id);
}
