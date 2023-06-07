package board.service;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import board.dto.BoardDto;
import board.mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardMapper mapper;
	
	
	@Override
	public List<Map<String, Object>> openBoardList() throws Exception {
		
		return mapper.selectBoardList();
	}

	@Override
	public void insertBoard(BoardDto board) throws Exception {
		
		mapper.insertBoard(board);
		
	}

	@Override
	public BoardDto boardDetail(int assemblyIdx) throws Exception {

		
		return mapper.boardDetail(assemblyIdx);
	}

	@Override
	public List<Map<String, Object>> openRedirectTest() throws Exception {
		
		return mapper.openRedirectTest();
	}

	
	
	
	



}
