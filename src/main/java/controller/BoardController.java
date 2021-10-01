package controller;

import org.springframework.stereotype.Controller;

import service.BoardService;

@Controller //�ش�Ŭ������ Controller��°��� �ν� ��Ų��.
public class BoardController {

	// root-context.xml �� Controller�� ������ ��� ��ü�� �����.
	// Controler�� servelt-context.xml���� ��äȭ�� �Ѵ�. 
	
	private BoardService service;
	
	public BoardController() {
		System.out.println("---BoardController()�� ������---");
	}
	
	public void setService(BoardService service) {
		this.service = service;
	}
}
