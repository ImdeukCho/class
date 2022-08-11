package com.config;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MySqlSessionFactory {
	//사용할 SqlSession객체 생성하는 클래스 
		static SqlSessionFactory sqlSessionFactory= null;
		static {//초기화
			String resource = "Configuration.xml";  // 설정파일의 이름과 경로 , 유일하게 수정할 부분
			InputStream inputStream= null;
			try {
				inputStream = Resources.getResourceAsStream(resource);
				System.out.println("Configuration.xml 로딩성공 ======");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		}//end static

		//실제 사용할 함수, SqlSession 반환== Connection + PreparedStatement 가 포함된 객체 
		public static SqlSession getSqlSession() {
			SqlSession session = sqlSessionFactory.openSession();
			return session;
		}

} // end class
