package service;

import java.util.List;

import dao.BoardDAO;

public class BoardServiceImpl implements BoardService {

	private BoardDAO dao;
	
	
	public BoardServiceImpl(BoardDAO dao) {
		//�ܺο��� ���� dao�� �������������� ���Ͽ� �޾��� ����...
		this.dao = dao;
	}
	
	@Override
	public List<String> selectList() {
		return dao.selectList();
	}

}
