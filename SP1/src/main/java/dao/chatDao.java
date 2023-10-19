package dao;

import java.util.List;

import vo.chat;

public interface chatDao {
	//create
	void add(chat c);
	
	//read
	List<chat>queryAll();
}
