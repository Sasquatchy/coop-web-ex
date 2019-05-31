package org.zerock.service;

import java.util.List;

import org.zerock.dao.MsgDAO;
import org.zerock.domain.MsgVO;

public class MsgService {

	MsgDAO dao = new MsgDAO();
	
	public int sendMessage(MsgVO vo) {
		return dao.sendMsg(vo);
	}
	
	public List<MsgVO> listPage(Integer page) {
		return dao.getListPage(page);
	}
	
	public MsgVO readMessage(Integer mno) {
		return dao.readMsg(mno);
	}
	
	public int getTotalMsg() {
		return dao.totalMsg();
	}
}
