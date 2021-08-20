package kr.khs_user.springKHS1.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.khs_user.springKHS1.domain.BoardVO;
@Repository
public class BoardDAOlmpl implements MemberDAO {

     @Inject
	 private SqlSession sql;
	 
	 private static String namespace = "kr.khs_user.springKHS1.mappers.board";

	 // 게시물 목록
	 @Override
	 public List<BoardVO> list() throws Exception { 
	  
	  return sql.selectList(namespace + ".list");
	 }

	 // 게시물 작성
	@Override
	public void write(BoardVO vo) throws Exception {
		sql.insert(namespace + ".write", vo);
		
	}
	
	// 게시물 조회
	public BoardVO view(int num) throws Exception {
	 
	 return sql.selectOne(namespace + ".view", num);
	}

	// 게시물 수정
	@Override
	public void modify(BoardVO vo) throws Exception {
	 sql.update(namespace + ".modify", vo);
	}

	}
