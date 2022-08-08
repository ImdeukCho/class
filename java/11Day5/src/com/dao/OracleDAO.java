package com.dao;
import java.util.Set;
import java.util.TreeSet;

public class OracleDAO {
	
	// Oracle하고 연동해서 데이터 저장 (TreeSet으로 변형)
	public Set<String> select(){
		TreeSet<String> set = new TreeSet<String>();
		set.add("홍길동");
		set.add("이순신");
		set.add("유관순");
		return set;
	}
}
