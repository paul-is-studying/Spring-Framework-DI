package dao;

import java.util.List;

public interface BoardDAO {
	
	//CRUD�� ����� ���� �Ѵ�...
	int insert(Object ob);//create
	List<String> selectList(); //Read
	int update(Object ob);//Update
	int delete(int idx); //delete
	
}
