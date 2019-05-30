package org.zerock.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.zerock.dao.MsgDAO;
import org.zerock.domain.MsgVO;

import lombok.extern.log4j.Log4j;

@Log4j
public class MsgDAOTests {

	
	@Test
	public void testGetList() {
		MsgDAO dao = new MsgDAO();
		
		dao.getList().forEach(vo -> {
		log.info(vo);
		});
		
	}
	
	@Test
	public void testReadMsg() {
		MsgDAO dao = new MsgDAO();

		log.info(dao.readMsg(1));
	}
	
	@Test
	public void testSendMsg() {
		MsgDAO dao = new MsgDAO();
		
		MsgVO vo = new MsgVO();
		
		vo.setMsg("이것은 테스트 메시지");
		vo.setSender("태스트dyd from");
		vo.setWhom("테스트용  to");
		vo.setGubun("N");
		
		assertEquals(1, dao.sendMsg(vo));
	}
}
