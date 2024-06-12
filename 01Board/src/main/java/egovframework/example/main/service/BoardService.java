package egovframework.example.main.service;

import java.util.List;

import egovframework.example.main.vo.BoardVo;


public interface BoardService {
	public List<BoardVo> selectAll(BoardVo boardVo) throws Exception;

	public BoardVo selectDetail(int board_no) throws Exception;

	public void insertBoard(BoardVo boardVo) throws Exception;

	public void updateBoard(BoardVo boardVo) throws Exception;

	public void deleteBoard(int board_no) throws Exception;
}