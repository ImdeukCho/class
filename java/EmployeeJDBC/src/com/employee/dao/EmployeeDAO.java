package com.employee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.employee.entity.Employee;
import com.employee.entity.Engineer;
import com.employee.entity.Sales;
import com.employee.exception.DataNotFoundException;

public class EmployeeDAO {
	
	
	
	//전체 사원정보 select 
	public ArrayList<Employee> selectAllEmployee(Connection con){
		
		ArrayList<Employee> list = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try{
		  String sql = "select empno,ename,dname,loc,sal,"
		  		+ "  to_char(hiredate,'YYYY-MM-DD') hiredate,state from employee order by empno";	
		  pstmt = con.prepareStatement(sql);
		  rs = pstmt.executeQuery();
		  while(rs.next()){
			  int empno = rs.getInt("empno");
			  String ename = rs.getString("ename");
			  String dname = rs.getString("dname");
			  String loc = rs.getString("loc");
			  int sal = rs.getInt("sal");
			  String hiredate = rs.getString("hiredate");
//			  System.out.println("hiredate > " + hiredate );
			  String state = rs.getString("state");
			  Employee emp = null;
			  if("영업".equals(dname)){
				  emp = new Sales(empno, ename, hiredate, loc, sal, state, sal*Sales.COMMISSION_RATE); // dname 없음
			  }else{
				  emp = new Engineer(empno, ename, hiredate, loc, sal, state); // dname 없음
			  }
			  list.add(emp);
		  }
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			try {
			  if( rs != null) rs.close();
			  if(pstmt != null) pstmt.close();
			}catch(SQLException e2) {
				e2.printStackTrace();
			}
		}
		return list;
		
	}//end 
	
	//2. 사원 검색 
	public ArrayList<Employee> searchList(Connection con, String inputSubMenu, String searchWord)throws DataNotFoundException{
/*		1.사번 검색
		2.이름 검색
		3.부서 검색
		4.근무지 검색
		5.연봉 검색*/

		ArrayList<Employee> list = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try{
		  String sql = "select empno,ename,dname,loc,sal,"
		  		+ "  to_char(hiredate,'YYYY-MM-DD') hiredate,state from employee ";
		  
		  if("1".equals(inputSubMenu)){
			  sql += " where empno = "+searchWord;
		  }
		  if("2".equals(inputSubMenu)){
			  sql += " where ename = '"+searchWord+"'";
		  }
		  if("3".equals(inputSubMenu)){
			  sql += " where dname = '"+searchWord+"'";
		  }
		  if("4".equals(inputSubMenu)){
			  sql += " where loc = '"+searchWord+"'";
		  }
		  if("5".equals(inputSubMenu)){
			  sql += " where sal = "+searchWord;
		  }
		  pstmt = con.prepareStatement(sql);

		  rs = pstmt.executeQuery();
		  while(rs.next()){
			  int empno = rs.getInt("empno");
			  String ename = rs.getString("ename");
			  String dname = rs.getString("dname");
			  String loc = rs.getString("loc");
			  int sal = rs.getInt("sal");
			  String hiredate = rs.getString("hiredate");
			  System.out.println("hiredate > " + hiredate );
			  String state = rs.getString("state");
			  Employee emp = null;
			  if("영업".equals(dname)){
				  emp = new Sales(empno, ename, hiredate, loc, sal, state, sal*Sales.COMMISSION_RATE);
			  }else{
				  emp = new Engineer(empno, ename, hiredate, loc, sal, state);
			  }
			  list.add(emp);
		  }//end if
		  if(list.size()==0){
				throw new DataNotFoundException("에러발생:일치하는 사원이 없습니다.");
		  }
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			try {
				  if( rs != null) rs.close();
				  if(pstmt != null) pstmt.close();
				}catch(SQLException e2) {
					e2.printStackTrace();
				}
			}
		return list;
		
	}//둥 
	
	public int createEmployeeNum(Connection con){//사원번호 생성 
		 int n = 0;
		 PreparedStatement pstmt = null;
			ResultSet rs = null;
			try{
			  String sql = "select NVL(max(empno),0) + 1 as num from employee ";
			  pstmt = con.prepareStatement(sql);

			  rs = pstmt.executeQuery();
			  while(rs.next()){
				  n = rs.getInt("num");
			  }
			}catch(SQLException e){
				e.printStackTrace();
			}finally {
				try {
					  if( rs != null) rs.close();
					  if(pstmt != null) pstmt.close();
					}catch(SQLException e2) {
						e2.printStackTrace();
					}
				}
			return n;
	}

	public void employeeInsert(Connection con, Employee emp){//사원추가 
		PreparedStatement pstmt = null;
		try{
		  String sql = "insert into employee ( empno,ename,dname,loc,sal,hiredate,state) "
		  		+ " values(  ? , ? ,  ? , ? , ?, ? , ? )";	
		  pstmt = con.prepareStatement(sql);
		  pstmt.setInt(1, emp.getEmpno());
		  pstmt.setString(2, emp.getEname());
		  if(emp instanceof Sales){//dname :부서명에 대한 설정부분 
			  pstmt.setString(3, "영업");
		  }else{
			  pstmt.setString(3, "개발");
		  }
		  pstmt.setString(4, emp.getLoc());
		  pstmt.setInt(5, emp.getSal());
		  pstmt.setString(6, emp.getHiredate());
		  pstmt.setString(7, emp.getState());
		  int n = pstmt.executeUpdate();		  
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			try {
				  if(pstmt != null) pstmt.close();
				}catch(SQLException e2) {
					e2.printStackTrace();
				}
			}
	}//
	
	private Employee searchEmployee(Connection con, int empno){//empno로 검색 
		Employee emp = new Employee();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try{
		  String sql = "select empno,ename,dname,loc,sal,"
		  		+ "  to_char(hiredate,'YYYY-MM-DD') hiredate,state from employee where empno=? ";
		  //sql수정
		 
		  pstmt = con.prepareStatement(sql);
		  pstmt.setInt(1, empno); //추가 
		  rs = pstmt.executeQuery();
		  while(rs.next()){			
			  String ename = rs.getString("ename");
			  String dname = rs.getString("dname");
			  String loc = rs.getString("loc");
			  int sal = rs.getInt("sal");
			  String hiredate = rs.getString("hiredate");
			  System.out.println("hiredate > " + hiredate );
			  String state = rs.getString("state");
			  if("영업".equals(dname)){
				  emp = new Sales(empno, ename, hiredate, loc, sal, state, sal*Sales.COMMISSION_RATE);
			  }else{
				  emp = new Engineer(empno, ename, hiredate, loc, sal, state);
			  }
			 
		  }//end if
	
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			try {
				  if( rs != null) rs.close();
				  if(pstmt != null) pstmt.close();
				}catch(SQLException e2) {
					e2.printStackTrace();
				}
			}
		return emp;
	}
	
	
	
	
	
	public void employeeUpdate(Connection con,Employee emp) throws DataNotFoundException{//사원정보수정
		System.out.println(">>>"+emp);
		Employee oldEmp = searchEmployee(con , emp.getEmpno());
		
		PreparedStatement pstmt = null;
		try{
		  String sql = "update employee set ename=?,dname=?,loc=?,sal =? where empno = ?";	
		  pstmt = con.prepareStatement(sql);
		  if(emp.getEname().equals("1")){ // 기존 정보 유지 할 컬럼은 1을 입력 받아옴. 
				pstmt.setString(1, oldEmp.getEname());//예전정보
			}else{
				pstmt.setString(1, emp.getEname());//새로운 정보 
			}
		  if(emp instanceof Sales){
			  pstmt.setString(2, "영업");
		  }else{
			  pstmt.setString(2, "개발");
		  }
		    //근무지
			if(emp.getLoc().equals("1")){
				pstmt.setString(3, oldEmp.getLoc());//예전정보
			}else{
				pstmt.setString(3, emp.getLoc()); //새로운 정보 
			}
			//월급
			if(emp.getSal()==0){
				pstmt.setInt(4, oldEmp.getSal());
			}else{
				pstmt.setInt(4, emp.getSal());
			}
		    //커미션
			 pstmt.setInt(5, emp.getEmpno());

		  int n = pstmt.executeUpdate();	
		  if(n==0){
			  throw new DataNotFoundException("에러발생:"+emp.getEmpno()+ "과 일치하는 사원이 없습니다.");	
		  }
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			try {
				  if(pstmt != null) pstmt.close();
				}catch(SQLException e2) {
					e2.printStackTrace();
				}
			}
	}
	public void employeeDelete(Connection con,int empno)throws DataNotFoundException{
		PreparedStatement pstmt = null;
		try{
		  String sql = "delete from employee where empno = ?";	
		  pstmt = con.prepareStatement(sql);

		  pstmt.setInt(1, empno);
		  
		  int n = pstmt.executeUpdate();	
		  if(n==0){
			  throw new DataNotFoundException("에러발생:"+empno+ "과 일치하는 사원이 없습니다.");	
		  }
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			try {
				  if(pstmt != null) pstmt.close();
				}catch(SQLException e2) {
					e2.printStackTrace();
				}
			}
		
	}
	//근태관리( 외출/출장/휴가/근무)
	public void employeeService(Connection con, int empno, String inputColumn)throws DataNotFoundException{
		
	/*	1.외출
		2.출장
		3.휴가
		4.근무*/
		PreparedStatement pstmt = null;
		try{
		  String sql = "update employee set state = ? where empno = ?";	
		  pstmt = con.prepareStatement(sql);
		  if(inputColumn.equals("1")){
			  inputColumn = "외출";
		  }
		  if(inputColumn.equals("2")){
			  inputColumn = "출장";
		  }
		  if(inputColumn.equals("3")){
			  inputColumn = "휴가";
		  }
		  if(inputColumn.equals("4")){
			  inputColumn = "근무";
		  }
		  
		  pstmt.setString(1, inputColumn);
		  pstmt.setInt(2, empno);
		  
		  int n = pstmt.executeUpdate();	
		  if(n==0){
			  throw new DataNotFoundException("에러발생:"+empno+ "과 일치하는 사원이 없습니다.");	
		  }
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			try {
				  if(pstmt != null) pstmt.close();
				}catch(SQLException e2) {
					e2.printStackTrace();
				}
			}
	}
}
