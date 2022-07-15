package com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.Person;

@WebServlet("/TestServlet5")
public class TestServlet5_list에저장하고for문돌려값들뽑기 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Person> list = new ArrayList<Person>();
		list.add(new Person("이순신",10));
		list.add(new Person("유관순",20));
		list.add(new Person("강감찬",30));
		request.setAttribute("xxx", list); // request
		
		// forward
		RequestDispatcher dis = request.getRequestDispatcher("02_bind5.jsp");
		dis.forward(request, response);
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
