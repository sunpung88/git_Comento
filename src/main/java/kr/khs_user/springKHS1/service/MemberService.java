package kr.khs_user.springKHS1.service;

import java.util.List;

import kr.khs_user.springKHS1.domain.BoardVO;

public interface MemberService {
	//public String getEmail(String id);
	
	//게시물 목록
	public List<BoardVO> list() throws Exception;
	
	// 게시물 작성
	public void write(BoardVO vo) throws Exception;

	// 게시물 조회
	public BoardVO view(int num) throws Exception;
	
	// 게시물 수정
	public void modify(BoardVO vo) throws Exception;


}
