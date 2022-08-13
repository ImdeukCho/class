package com.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.dto.Dept;

public class OracleMyBatisDAO {

	public OracleMyBatisDAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Dept> selectAll(SqlSession session) {
		// Mapper에 매칭되는 id를 찾아서 sql 문 수행
		// <select id="selectAll" resultType="com.dto.Dept">
		// selectOne() : 결과가 한개인 경우 , selectList() : 결과 여러개 , insert(), update(), delete()
		List<Dept> list = session.selectList("com.dept.DeptMapper2.selectAll"); // Mapper의 sql문의 id가 들어감
		return list;
	}
	
	public Dept selectAll2(SqlSession session) {
		// Mapper에 매칭되는 id를 찾아서 sql 문 수행
		// <select id="selectAll" resultType="com.dto.Dept">
		// selectOne() : 결과가 한개인 경우 , selectList() : 결과 여러개 , insert(), update(), delete()
//		 List<Dept> list = session.selectList("selectAll2"); // Mapper의 sql문의 id가 들어감
		Dept d = session.selectOne("selectAll2"); 
		return d;
	}

	public void insert(SqlSession session, Dept dept) {
		int num = session.insert("deptInsert", dept);
		System.out.println("insert된 레코드 갯수 : "+num);
	}

	public void update(SqlSession session, Dept dept) {
		int num = session.update("deptUpdate", dept);
		System.out.println("update된 레코드 갯수 : "+num);
	}

	public void delete(SqlSession session, int i) {
		int num = session.delete("deptDelete", i);
		System.out.println("delete된 레코드 갯수 : "+num);
	}

	public Dept selectByDeptno(SqlSession session, int deptno) {
		Dept dept = session.selectOne("selectByDeptno", deptno); 
		return dept;
	}

	public int deptRecourdCount(SqlSession session) {
		int num = session.selectOne("com.dept.DeptMapper2.deptRecourdCount");
		return num;
	}

	public HashMap selectByDeptnoHashmap(SqlSession session, int deptno) {
		HashMap map = session.selectOne("selectByDeptnoHashmap", deptno); 
		return map;
	}

	public List<Dept> selectByHashmap(SqlSession session, HashMap<String, Integer> map) {
		List<Dept> list = session.selectList("com.dept.DeptMapper2.selectByHashmap", map); // Mapper의 sql문의 id가 들어감
		return list;
	}

	public List<Dept> selectDynamicDeptno(SqlSession session, HashMap<String, Integer> map) {
		// 동적실행이므로 전체문 출력도 할수있게 selectList 사용한다.
		List<Dept> list = session.selectList("com.dept.DeptMapper2.selectDynamicDeptno", map); 
		return list;
	}

	public List<Dept> selectDynamicChoose(SqlSession session, HashMap<String, String> map) {
		// 동적실행이므로 전체문 출력도 할수있게 selectList 사용한다.
		List<Dept> list = session.selectList("com.dept.DeptMapper3.selectDynamicChoose", map);
		return list;
	}

	public List<Dept> multiSelect(SqlSession session, List<Integer> deptnoes) {
		// 동적실행이므로 전체문 출력도 할수있게 selectList 사용한다.
		List<Dept> list = session.selectList("com.dept.DeptMapper4.multiSelect", deptnoes); 
		return list;
	}

	public void multiUpdate(SqlSession session, List<Integer> deptnoes2) {
		int num = session.update("com.dept.DeptMapper4.multiUpdate", deptnoes2);
		System.out.println("update된 레코드 갯수 : "+num);
	}

	public void multiDelete(SqlSession session, List<Dept> depts) {
		int num = session.delete("com.dept.DeptMapper4.multiDelete", depts);
		System.out.println("delete된 레코드 갯수 : "+num);
	}

	public void multiInsert(SqlSession session, List<Dept> depts) {
		int num = session.insert("com.dept.DeptMapper4.multiInsert", depts);
		System.out.println("insert된 레코드 갯수 : "+num);
	}

	public List<Dept> selectTopN(SqlSession session, int offset, int limit) { // 시작idx, select갯수
		// selectList("id", 검색어, RowBounds(시작idx, select갯수));
		List<Dept> list = session.selectList("com.dept.DeptMapper5.TopN",null,new RowBounds(offset,limit));  
		// 검색어 null 지정안하면 RowBounds적용안되어서 전체출력된다.
//		List<Dept> list = session.selectList("com.dept.DeptMapper5.TopN", new RowBounds(offset,limit));  
		return list;
	}
	
	// 오버로딩
	public List<Dept> selectTopN(SqlSession session, String loc, int offset, int limit) {
		List<Dept> list = session.selectList("com.dept.DeptMapper5.TopNLoc",loc,new RowBounds(offset,limit));  // loc 오버로딩
		return list;
	}

	public String getDate(SqlSession session) {
		String date = session.selectOne("com.dept.DeptMapper5.getDate"); 
		return date;
	}

	




	

	

} // end class
