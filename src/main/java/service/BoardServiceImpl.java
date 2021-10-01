package service;

import java.util.List;

import dao.BoardDAO;

public class BoardServiceImpl implements BoardService {

	private BoardDAO dao;
	
	
	public BoardServiceImpl(BoardDAO dao) {
		//외부에서 들어온 dao를 생성자인젝션을 통하여 받아줄 예정...
		this.dao = dao;
	}
	
	@Override
	public List<String> selectList() {
		return dao.selectList();
	}

}
