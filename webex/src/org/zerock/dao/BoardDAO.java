package org.zerock.dao;

import org.apache.ibatis.session.SqlSession;

public class BoardDAO {
	
	private static final String PRE = "org.zerock.dao.";
	protected String mapperName = "BoardMapper";
	
	
	public String getList() throws Exception{
		
		
		String result = "";
		
		try (SqlSession session = MyBatisLoader.sqlSessionFactory.openSession()){
		
			result = session.selectOne( PRE + mapperName + ".List");
			
		} catch (Exception e) {
			throw e;
		}

		
		return result;
	}
	
	
	
}
