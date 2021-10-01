package controller;

import org.springframework.stereotype.Controller;

import service.BoardService;

@Controller //해당클래스가 Controller라는것을 인식 시킨다.
public class BoardController {

	// root-context.xml 은 Controller를 제외한 모든 객체를 만든다.
	// Controler는 servelt-context.xml에서 객채화를 한다. 
	
	private BoardService service;
	
	public BoardController() {
		System.out.println("---BoardController()의 생성자---");
	}
	
	public void setService(BoardService service) {
		this.service = service;
	}
}
