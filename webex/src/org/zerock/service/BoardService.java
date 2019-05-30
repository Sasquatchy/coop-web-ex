package org.zerock.service;

import java.util.List;

import org.zerock.dao.BoardDAO;
import org.zerock.domain.BoardVO;

import lombok.extern.log4j.Log4j;

@Log4j
public class BoardService {

	BoardDAO dao = new BoardDAO();
	
	
	public List<BoardVO> getL(int page){
		
		return dao.getList(page);
	}
	
	public int TotalCount() {
		
		return dao.TotalCount();
		
	}
	
	
}
