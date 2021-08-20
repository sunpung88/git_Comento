package kr.khs_user.springKHS1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.khs_user.springKHS1.dao.MemberDAO;
import kr.khs_user.springKHS1.domain.BoardVO;
@Service
public class MemberServiceImp implements MemberService {
	@Autowired
	MemberDAO dao;

	//게시물 목록
	@Override
	public List<BoardVO> list() throws Exception {
		// TODO Auto-generated method stub
		return dao.list();
	}

	//게시물 작성
	@Override
	public void write(BoardVO vo) throws Exception {
		
		dao.write(vo);
		
	}

	//게시물 조회
	@Override
	public BoardVO view(int num) throws Exception {
		
		return dao.view(num);
	}
	
	// 게시물 수정
	@Override
	public void modify(BoardVO vo) throws Exception {
	  
	 dao.modify(vo);
	}
	
	
	/*@Override
	public String getEmail(String id) {
		return memberDao.getEmail(id);
	}
*/
}
