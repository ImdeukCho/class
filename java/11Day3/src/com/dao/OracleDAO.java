package com.dao;
import java.util.HashSet;

public class OracleDAO {
	
	// Oracle하고 연동해서 데이터 저장
	public HashSet<String> select(){
		HashSet<String> set = new HashSet<>();
		set.add("홍길동");
		set.add("이순신");
		set.add("유관순");
		return set;
	}
}
