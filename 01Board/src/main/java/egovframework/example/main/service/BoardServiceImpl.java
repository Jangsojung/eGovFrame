package egovframework.example.main.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import egovframework.example.main.dao.BoardDao;
import egovframework.example.main.vo.BoardVo;


@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardDao boardDAO;
	
	@Override
	public List<BoardVo> selectAll(BoardVo boardVo) throws Exception {
		return boardDAO.selectAll(boardVo);
	}

	@Override
	public BoardVo selectDetail(int board_no) throws Exception {
		return boardDAO.selectDetail(board_no);
	}

	@Override
	public void insertBoard(BoardVo boardVo) throws Exception {
		boardDAO.insertBoard(boardVo);
	}

	@Override
	public void updateBoard(BoardVo boardVo) throws Exception {
		boardDAO.updateBoard(boardVo);
	}

	@Override
	public void deleteBoard(int board_no) throws Exception {
		boardDAO.deleteBoard(board_no);
	}

}
