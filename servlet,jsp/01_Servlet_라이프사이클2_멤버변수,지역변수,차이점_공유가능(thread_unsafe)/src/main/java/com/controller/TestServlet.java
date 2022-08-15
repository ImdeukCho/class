package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	
	// 인스턴스 변수, static변수 ==> 공유가능(thread-unsafe)
    int num;
    ArrayList<String> list = new ArrayList<String>();
  
    public TestServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 로컬변수 ==> 공유불가 ==> thread-safe
		int size = 10;
		num++;
		list.add("홍길동");
		System.out.println("doGet    NUM ===" + num);	// num : 멤버변수 , 사용자간 공유됨
		System.out.println("doGet    LIST ===" + list);	// list 멤버변수 , 사용자간 공유됨
		System.out.println("doGet    SIZE ===" + size);	// size 로컬변수 , 사용자간 초기화됨
		size++;
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
