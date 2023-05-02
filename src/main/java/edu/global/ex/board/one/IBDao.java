//Mybatis를 사용하는 첫 번째 방법
package edu.global.ex.board.one;

import java.util.List;
import edu.global.ex.vo.BoardVO;

public interface IBDao {
	public List<BoardVO> listDao();
}
