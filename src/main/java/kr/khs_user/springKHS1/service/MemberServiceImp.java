package kr.khs_user.springKHS1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.khs_user.springKHS1.dao.MemberDAO;
@Service
public class MemberServiceImp implements MemberService {
	@Autowired
	MemberDAO memberDao;
	
	@Override
	public String getEmail(String id) {
		return memberDao.getEmail(id);
	}

}
