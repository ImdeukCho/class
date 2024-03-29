package com.config;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

// XXDAO 클래스 역할
// SqlSessionFactory 얻기

public class MySqlSessionFactory {
	private static SqlSessionFactory sqlSessionFactory = null;
	static{
		String resource = "com/config/Configuration.xml"; /////////////////////////////
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sqlSessionFactory = 
				new SqlSessionFactoryBuilder().build(inputStream);
	}//end static
	
	// SqlSessionFactory의 openSession() 메서드로
	// SqlSession 객체를 얻므
	public static SqlSession getSession(){
		return sqlSessionFactory.openSession();
	}
	
	
}//end class






