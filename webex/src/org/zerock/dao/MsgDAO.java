package org.zerock.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.zerock.domain.MsgVO;

public class MsgDAO {

	private static final String PRE = "org.zerock.dao.";
	protected String mapperName = "MsgMapper";
	
	public MsgVO readMsg(Integer mno)  {
		
		MsgVO resultObj = null;
		
		try (SqlSession session = MyBatisLoader.sqlSessionFactory.openSession(true)){
			
			resultObj = (MsgVO)session.selectOne( PRE + mapperName + ".readMsg",mno);
			
		} catch (Exception e) {
			throw e;
		}
		return resultObj;

	}
	
	public int sendMsg(MsgVO vo){
		
		int result = 0;
		
		try (SqlSession session = MyBatisLoader.sqlSessionFactory.openSession(true)){
			
			result = session.insert( PRE + mapperName + ".sendMsg",vo);
			
		} catch (Exception e) {
			throw e;
		}
		return result;
		
	}
	
	public List<MsgVO> getList()  {
		
		List<MsgVO> result = null;
		
		try (SqlSession session = MyBatisLoader.sqlSessionFactory.openSession(true)){
			
			result = session.selectList( PRE + mapperName + ".getList");
			
		} catch (Exception e) {
			throw e;
		}
		return result;
	}
}
