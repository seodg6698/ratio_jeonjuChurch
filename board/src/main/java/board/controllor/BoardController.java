package board.controllor;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import board.dto.BoardDto;
import board.service.BoardService;
import board.service.BoardServiceImpl;
import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/board")
public class BoardController {
	
	@Autowired
	private BoardService service;
	
	
	/*
	 * //게시글 리스트 불러오기
	 * 
	 * @GetMapping(value = "/openBoardList.do") public ModelAndView openBoardList()
	 * throws Exception { ModelAndView mv = new ModelAndView("/BoardList");
	 * 
	 * 
	 * List<Map<String,Object>> list = service.openBoardList();
	 * 
	 * mv.addObject("list", list);
	 * 
	 * return mv;
	 * 
	 * }
	 */
	
	//게시글 작성화면 로드
	
	@GetMapping(value = "/openBoardWrite.do")
	public String openBoardWrite() throws Exception {
		
		return "/BoardWrite";
	}
	
	
	//test redirect road
	@GetMapping(value = "/openRedirectTest.do")
	public ModelAndView openRedirectTest() throws Exception {
		ModelAndView mv = new ModelAndView("/index");
		
		List<Map<String,Object>> list = service.openRedirectTest();
		
		System.out.println("list : " + list.toString());
		
		mv.addObject("list", list);
		
		return mv;
	}
	

	
	//게시글 작성처리
	
	@PostMapping(value = "/insertBoard.do")
	public String boardInsert(BoardDto board) throws Exception{
		System.out.println("dataInsert :" + board.toString());
		
		 service.insertBoard(board);
		
		return "redirect:/board/openRedirectTest.do";
	}
	
	//게시글 상세화면
	
	@GetMapping(value = "/openBoardDetail.do")
	public ModelAndView boardDetail(@RequestParam int assemblyIdx) throws Exception{
		ModelAndView mv = new ModelAndView("/BoardDetail");
		
		System.out.println("assemblyIdx :" + assemblyIdx);
		/* BoardDto board = service.boardDetail(assemblyIdx); */
		
		System.out.println("DetailData : " + service.boardDetail(assemblyIdx).toString());
		
		mv.addObject("boardDetail", service.boardDetail(assemblyIdx));
		
		return mv;
		

	}
	
	//게시글 수정처리
	
	
	//게시글 삭제처리

}
