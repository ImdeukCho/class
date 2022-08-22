package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyEncodingFiter implements Filter {	// Filter 생성법 : class파일 생성후 implements Filter 삽입
	
	// 소스 -> 오버라이딩 3개 하기
	
	@Override
	public void destroy() {
		System.out.println("MyEncodingFiter.destroy");
		
	}
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("MyEncodingFiter.doFilter init");	
	}
	
	@Override //이름 변경
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("MyEncodingFiter.doFilter요청");
		//request 인코딩설정
		request.setCharacterEncoding("utf-8");
		chain.doFilter(request, response); //request와 response를 연결시켜줌 
		
		System.out.println("MyEncodingFiter.doFilter응답");	
	}
}
