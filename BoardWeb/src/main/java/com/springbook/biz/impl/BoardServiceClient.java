package com.springbook.biz.impl;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.springbook.biz.BoardVO;

public class BoardServiceClient {

	public static void main(String[] args) {
		// 1. Spring 컨테이너를 작동 시킨다. 
		AbstractApplicationContext container = 
				new GenericXmlApplicationContext("applicationContext.xml");
		
		// 2. Spring 컨테이너로 부터 BoardServiceImpl 객체를 받아온다. (Lookup 한다)
				//비즈니스 로직을 처리하는 객체 (BoardServiceImpl.java)
		
		BoardService boardService = (BoardService) container.getBean("boardService");
		
		
		// 3. 글 등록 기능 테스트 
		BoardVO vo = new BoardVO();
		vo.setTitle("임시 테스트 제목10");
		vo.setWriter("홍길동10");
		vo.setContent("임시 글 내용10");
		
		boardService.insertBoard(vo);
		
		
		// 4. 글 등록 검색 기능 테스트 
		List<BoardVO> boardList = boardService.getBoardList(vo);
		
		for (BoardVO board : boardList) {
			System.out.println("--레코드 출력-->" + board.toString());
		}
		
		// 5. Spring 컨테이너 종료 
		container.close();  	
		
		
	}

}
