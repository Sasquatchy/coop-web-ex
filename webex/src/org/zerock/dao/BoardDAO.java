package org.zerock.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.zerock.domain.BoardVO;

public class BoardDAO {
	
	private static final String PRE = "org.zerock.dao.";
	protected String mapperName = "BoardMapper";
	
	BoardVO vo = new BoardVO();
	
	
	public List<BoardVO> getList(){
		
		
		List<BoardVO> result = null;
		
		try (SqlSession session = MyBatisLoader.sqlSessionFactory.openSession()){
		
			result = session.selectOne( PRE + mapperName + ".List");
			
		} catch (Exception e) {
			throw e;
		}

		
		return result;
	}
	
	
	
}
