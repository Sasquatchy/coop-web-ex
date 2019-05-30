package org.zerock.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.zerock.domain.BoardVO;

import lombok.Data;


@Data
public class BoardDAO {
	
	private static final String PRE = "org.zerock.dao.";
	protected String mapperName = "BoardMapper";
	
	BoardVO vo = new BoardVO();
	
	
	public List<BoardVO> getList(int page){
		
		
		List<BoardVO> result = null;
		
		try (SqlSession session = MyBatisLoader.sqlSessionFactory.openSession()){
		
			result = session.selectList( PRE + mapperName + ".getList",page);
			
		} catch (Exception e) {
			throw e;
		}
		
		
		return result;
	}
	
	public int TotalCount() {
		
		int result=0;
		try (SqlSession session = MyBatisLoader.sqlSessionFactory.openSession()){
			
			result = session.selectOne( PRE + mapperName + ".totalcount");
			
		} catch (Exception e) {
			throw e;
		}
		
		return result;
	}
	
	
}
