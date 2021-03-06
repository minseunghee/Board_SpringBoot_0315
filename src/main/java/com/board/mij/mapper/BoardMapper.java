package com.board.mij.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.board.mij.domain.BoardVO;


@Repository("com.board.mij.mapper.BoardMapper")
public interface BoardMapper {

	// Board List 가져오기
	List<BoardVO> boardList(int startBoardNum, int boardCountInPage) throws Exception;
	
	// Board Total Count - Board에 작성된 글 총 갯수 구하기
	int boardTotalCount() throws Exception;
	
	// Board Register 글 등록하기
	int boardRegister(BoardVO board) throws Exception;
	
	//Board Detail 글 읽기
	BoardVO boardDetail(int boardId) throws Exception;

	// Board Delete 글 삭제
	void boardDelete(int boardId) throws Exception;
	
}
