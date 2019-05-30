package org.zerock.service;

import java.util.List;

import org.zerock.dao.BoardDAO;
import org.zerock.domain.BoardVO;

import lombok.extern.log4j.Log4j;

@Log4j
public class BoardService {

	BoardDAO dao = new BoardDAO();
	
	
	public List<BoardVO> getL(){
		
		System.out.println(dao.getList());
		return dao.getList();
	}
	
	public int TotalCount() {
		
		return dao.TotalCount();
		
	}
	
	
}
