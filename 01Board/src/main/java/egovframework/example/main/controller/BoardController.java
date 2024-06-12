package egovframework.example.main.controller;

import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import egovframework.example.main.vo.BoardVo;
import egovframework.example.main.service.BoardService;

@Controller
public class BoardController {
	@Autowired
	private BoardService boardService;
	
	//게시글 목록
	@RequestMapping(value="/boardList.do")
	public String selectAll(BoardVo boardVo, Model model) throws Exception {
		model.addAttribute("list", boardService.selectAll(boardVo));
		
		return "egovframework/board/boardList";
	}

	//게시글 상세
	@RequestMapping(value="/boardDetail.do")
	public String selectDetail(Model model, HttpServletRequest request) throws Exception {
		int board_no = Integer.parseInt(request.getParameter("BOARD_NO"));
		
		BoardVo boardVo = boardService.selectDetail(board_no);
		model.addAttribute("boardVo", boardVo);
		
		return "egovframework/board/boardDetail";
	}
	
	//게시글 작성 페이지
	@RequestMapping(value="/boardWrite.do")
	public String writeBoard() throws Exception {
		
		return "egovframework/board/boardWrite";
	}
	
	//게시글 작성
	@RequestMapping(value="/boardInsert.do")
	public String insertBoard(@ModelAttribute("boardVo") BoardVo boardVo) throws Exception {
		System.out.println(boardVo);
		boardService.insertBoard(boardVo);
		
		return "redirect:boardList.do";
	}
	
	//게시글 수정 페이지 
	@RequestMapping(value="/boardModify.do")
	public String modifyBoard(Model model, HttpServletRequest request) throws Exception {
		int board_no = Integer.parseInt(request.getParameter("BOARD_NO"));
		
		BoardVo boardVo = boardService.selectDetail(board_no);
		model.addAttribute("boardVo", boardVo);
		
		return "egovframework/board/boardModify";
	}
	
	//게시글 수정
	@RequestMapping(value="/boardUpdate.do")
	public String UpdateBoard(@ModelAttribute("boardVo") BoardVo boardVo, HttpServletRequest request) throws Exception {
		int board_no = Integer.parseInt(request.getParameter("BOARD_NO"));
		boardVo.setBOARD_NO(board_no);
		
		boardService.updateBoard(boardVo);

		return "redirect:boardDetail.do?BOARD_NO=" + boardVo.getBOARD_NO();
	}
	
	//게시글 삭제
	@RequestMapping(value="/boardDelete.do")
	public String DeleteBoard(HttpServletRequest request) throws Exception {
		int board_no = Integer.parseInt(request.getParameter("BOARD_NO"));
		
		boardService.deleteBoard(board_no);
		
		return "redirect:boardList.do";
	}
}