package org.zerock.service;

import java.util.List;

import org.zerock.dao.MsgDAO;
import org.zerock.domain.MsgVO;

public class MsgService {

	MsgDAO dao = new MsgDAO();
	
	public int sendMessage(MsgVO vo) {
		return dao.sendMsg(vo);
	}
	
	public List<MsgVO> list() {
		return dao.getList();
	}
	
	public MsgVO readMessage(Integer mno) {
		return dao.readMsg(mno);
	}
}
