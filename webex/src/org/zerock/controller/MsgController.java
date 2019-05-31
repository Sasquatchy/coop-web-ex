package org.zerock.controller;

import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.zerock.domain.MsgVO;
import org.zerock.domain.PageDTO;
import org.zerock.service.MsgService;

import lombok.extern.log4j.Log4j;

@Log4j
@WebServlet("/msg/*")
public class MsgController extends AbstractController {
	private static final long serialVersionUID = 1L;

	MsgService msgService = new MsgService();
	
	public String listGET (HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		//paging
		int current = getInt("page", request, 1);
		log.info("current: "+ current);
		int total = msgService.getTotalMsg();
		log.info("total: "+ total);

		PageDTO dto = new PageDTO(current, total);
		log.info(dto);
		request.setAttribute("pageManager", dto);
		
		List<MsgVO> list = msgService.listPage(current);
		request.setAttribute("list", list);
		
		log.info("list of messages--------------");
		return "views/msg/list";
	}
	
	
	public String sendGET(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		log.info("sending message--------------");
		return "views/msg/send";
	}
	
	public String sendPOST(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		//TODO:activate send service here
		log.info("sending message post---------");
		MsgVO vo = new MsgVO();
		vo.setGubun("N");
		vo.setMsg(request.getParameter("msg"));
		vo.setSender(request.getParameter("sender"));
		vo.setWhom(request.getParameter("whom"));
		int resultSent = msgService.sendMessage(vo);
		request.setAttribute("sent", resultSent);
		//TODO: show result page or redirect to the msg list
		return "views/msg/resultSend";
	}
	

}
