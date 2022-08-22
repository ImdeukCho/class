package com.service;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.LoginDAO;
import com.dto.MemberDTO;

public class LoginService {
	
	static LoginDAO dao = new LoginDAO();

	public MemberDTO loginCheck(MemberDTO dto) {		// 변수가 id,pw를 담고있음 , 파싱한 데이터
		MemberDTO dto1 = null;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			dto1 = dao.loginCheck(session, dto);
		} finally {
			session.close();
		}	
		return dto1;
	}

}
