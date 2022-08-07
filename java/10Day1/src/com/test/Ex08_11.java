package com.test;

import java.util.Calendar;
import java.util.Date;

import javax.print.attribute.standard.PagesPerMinute;

public class Ex08_11 {

	public static void main(String[] args) {
		
		// 현재 날짜
		Calendar cal = Calendar.getInstance();
		// 년, 월, 일 구하기
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) +1 ;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		System.out.println(year + "년 " + month +"월 "+ day + "일");
		// 시, 분, 초 구하기
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		System.out.println(hour + "시 " + minute + "분 " + second + "초");
		// 특정 날짜 설정하기
		Calendar cal2 = Calendar.getInstance();
		// month의 경우 0부터 시작하기 때문에 12월인 경우, 11로 지정해야한다.
		cal2.set(2014, 11, 24);
		Date now = cal2.getTime(); // Date 타입으로 변경
		System.out.println(now);
	// 날짜 변경
		System.out.println("= 1일 후 =");
		cal2.add(Calendar.DATE, 1);
		System.out.println(cal2.getTime());
		System.out.println("= 6달 전 =");
		cal2.add(Calendar.MONTH, -6);
		System.out.println(cal2.getTime());
		System.out.println("= 100일 전 =");
		cal2.add(Calendar.DAY_OF_MONTH, -100);
		System.out.println(cal2.getTime());
	}

}
