package com.exeception;

public class RecordNotFoundException extends Exception{

	public RecordNotFoundException(String message) {
		super(message); // 사용자 정의 메세지
	}
}
