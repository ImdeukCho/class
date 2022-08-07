package com.test;

import java.text.NumberFormat;
import java.text.ParseException;

public class NumberFormatTest {

	public static void main(String[] args) throws ParseException {
		// 숫자 -> 현재지역화폐
		NumberFormat nf = NumberFormat.getCurrencyInstance(); // 현재 지역화폐양식
		String mesg = nf.format(987654321);
		System.out.println(mesg);
		
		// 현재지역화폐 -> 숫자
		Number num = nf.parse("₩987,654,321");
		System.out.println(num);
	}

}
