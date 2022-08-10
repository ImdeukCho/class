package com.common.util;

import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class CommonUtil {
	
	// getCurrencyInstance() : 지역화폐표시
	public static String getCurrency(int data) {
		NumberFormat format = NumberFormat.getCurrencyInstance(Locale.KOREA);
		return format.format(data);
	}
	
	// nextLine() : 스캔 한줄 저장
	public static String getUserInput() {
		Scanner s = new Scanner(System.in);
		return s.nextLine();   
	}
	
	// 데이트를 문자열로  저장
	public static String getDate(Date d) {
		String formatData = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		formatData = sdf.format(d.getTime());
		return formatData;
	}
	
	// 문자열을 이 형식의 데이트 객체로 저장
	public static Date getDate(String cal) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d = null;
		try {
			d = sdf.parse(cal);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return d;
	}
	
	
} // end class
