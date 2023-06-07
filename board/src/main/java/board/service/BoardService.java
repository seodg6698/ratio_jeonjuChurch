package board.service;

import java.util.List;
import java.util.Map;

import board.dto.BoardDto;

public interface BoardService {
	
	List<Map<String, Object>> openBoardList() throws Exception;
	
	public void insertBoard(BoardDto board) throws Exception;

	List<Map<String, Object>> openRedirectTest() throws Exception;

	BoardDto boardDetail(int assemblyIdx) throws Exception;

}
