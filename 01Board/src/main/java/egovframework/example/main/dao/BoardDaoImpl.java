package egovframework.example.main.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import egovframework.example.main.mapper.BoardMapper;
import egovframework.example.main.vo.BoardVo;

@Repository
public class BoardDaoImpl implements BoardDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	//private static String namespace = "main.mapper.BoardMapper";

	@Override
	public List<BoardVo> selectAll(BoardVo boardVo) throws Exception {
		BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);
		
		return mapper.selectAll(boardVo);
	}

	@Override
	public BoardVo selectDetail(int board_no) throws Exception {
		BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);
		
		return mapper.selectDetail(board_no);
	}

	@Override
	public void insertBoard(BoardVo boardVo) throws Exception {
		BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);
		mapper.insertBoard(boardVo);
	}

	@Override
	public void updateBoard(BoardVo boardVo) throws Exception {
		BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);
		mapper.updateBoard(boardVo);
	}

	@Override
	public void deleteBoard(int board_no) throws Exception {
		BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);
		mapper.deleteBoard(board_no);
	}

}