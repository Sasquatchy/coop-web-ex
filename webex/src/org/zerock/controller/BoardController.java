package org.zerock.controller;

import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.zerock.domain.BoardVO;
import org.zerock.domain.PageDTO;
import org.zerock.service.BoardService;

@WebServlet("/board/*")
public class BoardController extends AbstractConroller {

	
	BoardService service = new BoardService();
	
	public String listGET(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		
		List<BoardVO> list=null;
		
		list= service.getL(1);
		
		int current = getInt("pm", request, 1);
				
		int total = service.TotalCount();
		
		
		request.setAttribute("page", new PageDTO(current,total));
	
		request.setAttribute("list", list);
		
		
		
		
		return "views/board/list";
		
	}
	
	
	
	
	
	
}
