//Mybatis를 사용하는 첫 번째 방법
package edu.global.ex.board.one;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import edu.global.ex.vo.BoardVO;

@Service
public class BService1 {
	@Inject
	private SqlSession sqlSession; // root-context.xml에서 끌고온다

	public List<BoardVO> selectBoardList() throws Exception {
		IBDao dao = sqlSession.getMapper(IBDao.class); // dao에 넣을 원형을 알려주고(.class), 객체로 만들어서 넣어준다.
		return dao.listDao();
	}
}
