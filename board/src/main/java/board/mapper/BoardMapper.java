package board.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import board.dto.BoardDto;

@Mapper
public interface BoardMapper {

	List<Map<String, Object>> selectBoardList() throws Exception;
	
	public void insertBoard(BoardDto board) throws Exception;

	public BoardDto boardDetail(int assemblyIdx) throws Exception;

	List<Map<String, Object>> openRedirectTest() throws Exception;

}
