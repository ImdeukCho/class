package com.notice.entity;

import java.util.Date;

public class Notice {
	private int no;
	private String title;
	private String content;
	private String name;
	private String writeday;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWriteday() {
		return writeday;
	}
	public void setWriteday(String writeday) {
		this.writeday = writeday;
	}
	public Notice() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Notice(int no, String title, String content, String name, String writeday) {
		super();
		this.no = no;
		this.title = title;
		this.content = content;
		this.name = name;
		this.writeday = writeday;
	}
	
	
	
}
