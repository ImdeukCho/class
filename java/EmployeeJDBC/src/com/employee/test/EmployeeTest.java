package com.employee.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.Scanner;

import com.common.util.CommonUtil;
import com.employee.biz.EmployeeBiz;
import com.employee.entity.Employee;
import com.employee.entity.Engineer;
import com.employee.entity.Sales;
import com.employee.exception.DataNotFoundException;
import com.notice.biz.NoticeBiz;
import com.notice.entity.Notice;

public class EmployeeTest {

	public static void main(String[] args) {
		
		EmployeeBiz empBiz = new EmployeeBiz();
		NoticeBiz noticeBiz = new NoticeBiz();
		Scanner scan = new Scanner(System.in);
		
		while (true) {

			printMainMenu();
			String inputMenu = scan.next();
	if (inputMenu.equals("1")) {
	
		   printEmployeeList(empBiz);
		   System.out.println("====================================================================================\n");
		}else if (inputMenu.equals("2")) {
				System.out.println("*****************************************");
				System.out.println("\t[2.임직원 정보 검색]");
				System.out.println("*****************************************");
				System.out.println("1.사번 검색");
				System.out.println("2.이름 검색");
				System.out.println("3.부서 검색");
				System.out.println("4.근무지 검색");
				System.out.println("5.연봉 검색");
				System.out.println("*****************************************");
				System.out.print("메뉴 입력(1~5 사이 정수로 입력) => ");
				String inputSubMenu = scan.next();
				int menu = Integer.parseInt(inputSubMenu);
				
				switch(menu){
				case 1:
					System.out.print("검색할 사번를 입력하세요 => ");
					  break;
				case 2:
					System.out.print("검색할 이름를 입력하세요 => ");
				  break;
				case 3:
					System.out.print("검색할 부서를 입력하세요(1.영업 2.개발) => ");
				  break;
				case 4:
					System.out.print("검색할 근무지를 입력하세요 => ");
				  break;
				case 5:
					System.out.println("입력한 연봉보다 많은 임직원을 모두 출력합니다.");
					System.out.print("검색할 연봉를 입력하세요 => ");
				  break;
				}//end switch
		
					String searchWord = scan.next();
					try {   // 1, 1000    - 2, "홍길동"
						ArrayList<Employee> list = empBiz.searchList(inputSubMenu,searchWord);
						System.out.println("====================================================================================");
						System.out.println("사번\t이름\t부서\t근무지\t연봉\t커미션\t입사일\t\t근태");
						System.out.println("------------------------------------------------------------------------------------");
						for (Employee e : list) {
							System.out.print(e.getEmpno() + "\t");
							System.out.print(e.getEname() + "\t");
							String dname = "개발";
							if(e instanceof Sales){
								dname = "영업";
							}
							System.out.print(dname + "\t");
							System.out.print(e.getLoc() + "\t");
							System.out.print(CommonUtil.getCurrency(e.getSal()) + "\t");
							double commission = 0;
							if(e instanceof Sales){
								Sales s = (Sales)e;
								commission = s.getCommission();
								System.out.print(CommonUtil.getCurrency(((int)commission))+"\t");
							}else{
								System.out.print("\t");
							}
							
							System.out.print(e.getHiredate() + "\t");
							String state = e.getState();
							System.out.print(state);
							System.out.println();
						}//end for

					} catch (DataNotFoundException e) {
						System.out.println(e.getMessage());
					}
				
			} else if (inputMenu.equals("3")) {
				System.out.println("*****************************************");
				System.out.println("\t[3.임직원 정보 추가 ]");
				System.out.println("*****************************************");
				int empno = empBiz.createEmployeeNum();
				System.out.println("사원번호[" + empno + "]를 생성하였습니다");
				System.out.print("추가할 이름을 입력하세요 => ");
				String ename = scan.next();
				System.out.print("추가할 부서를 입력하세요(1.영업 2.개발) => ");
				String dname = scan.next();			
				System.out.print("추가할 근무지를 입력하세요(서울,부산,인천 ) => ");
				String loc = scan.next();
				System.out.print("추가할 연봉을 입력하세요 => ");
				String sal = scan.next();
				System.out.print("추가할 입사일(예:2014-06-01)을 입력하세요 \n 1를 입력하면 현재날짜로 입력됩니다. => ");
				
				String hiredate = scan.next();

					if("1".equals(hiredate)){
						hiredate = CommonUtil.getDate(new Date());
					}
			
				
				System.out.println("*****************************");
				//사원 등록
				Employee emp = null;
				if("1".equals(dname)){
					emp = new Sales(empno, ename, hiredate,  loc, Integer.parseInt(sal), "근무", Integer.parseInt(sal)*Sales.COMMISSION_RATE);
				}else{
					emp = new Engineer(empno, ename, hiredate,  loc, Integer.parseInt(sal), "근무");
				}
				empBiz.employeeInsert(emp);
               
				//사원 목록 출력
				printEmployeeList(empBiz);
			}else if (inputMenu.equals("4")) {
				
				System.out.println("*****************************************");
				System.out.println("\t[4.임직원 정보 수정 ]");
				System.out.println("*****************************************");
				System.out.print("수정할 사원번호를 입력하세요 => ");
				String empno = scan.next();
				System.out.print("수정할 이름을 입력하세요.\n 1를 치면 이름은 수정하지 않습니다. => ");
				String ename = scan.next();
				System.out.print("수정할 부서를 입력하세요.(1.영업 2.개발) => ");
				String dname = scan.next();
				System.out.print("수정할 근무지를 입력하세요.(서울,부산,인천 )\n 1를 치면 근무지는 수정하지 않습니다.=> ");
				String loc = scan.next();
				System.out.print("수정할 연봉을 입력하세요.\n 1를 치면 연봉은 수정하지 않습니다. => ");
				String sal = scan.next();
				if(sal.equals("1")){
					sal = "0";  //기본값
				}
				System.out.println();
				System.out.println("*****************************");
				//사원 수정
				Employee emp = null;
				if("1".equals(dname)){
					//public Sales(int empno, String ename, String hiredate, String loc, int sal, String state, double commission) {
					emp = new Sales(Integer.parseInt(empno), ename, null,  loc, Integer.parseInt(sal), "근무", Integer.parseInt(sal)*Sales.COMMISSION_RATE);
				}else{
					//public Engineer(int empno, String ename, String hiredate, String loc, int sal, String state) {
					emp = new Engineer(Integer.parseInt(empno), ename, null,  loc, Integer.parseInt(sal), "근무");
				}
				try {
					empBiz.employeeUpdate(emp);
				} catch (DataNotFoundException e) {
					System.out.println(e.getMessage());
				}

				//사원 목록 출력
				printEmployeeList(empBiz);
				
			} else if (inputMenu.equals("5")) {
				
				System.out.println("*****************************************");
				System.out.println("\t[5.임직원 정보 삭제 ]");
				System.out.println("*****************************************");
				System.out.print("삭제할 사원번호를 입력하세요 => ");
				String empno = scan.next();
				System.out.println("*****************************");
	            try {
					empBiz.employeeDelete(Integer.parseInt(empno));
				} catch (NumberFormatException e) {
					e.printStackTrace();
				} catch (DataNotFoundException e) {
					System.out.println(e.getMessage());
				}
	            printEmployeeList(empBiz);
			}else if (inputMenu.equals("6")) {
				
				
				System.out.println("*****************************************");
				System.out.print("변경할 사원번호를 입력하세요 => ");
				String empno = scan.next();
				System.out.println("1.외출");
				System.out.println("2.출장");
				System.out.println("3.휴가");
				System.out.println("4.근무");
				System.out.println("------------------------------------------------");
				System.out.print("메뉴를 입력하세요(정수) => ");
				String inputColumn = scan.next();
				System.out.println("------------------------------------------------");
				try {
					empBiz.employeeService(Integer.parseInt(empno), inputColumn);
				} catch (DataNotFoundException e) {
					System.out.println(e.getMessage());
				}
				 printEmployeeList(empBiz);
			}
			else if (inputMenu.equals("7")) {
				
				//공지사항 목록
				 ArrayList<Notice> list = noticeBiz.selectAllNotice();
					System.out.println("======================================================================");
			        System.out.println("NO\t\t제목\t\t작성자\t작성일자");
			        System.out.println("----------------------------------------------------------------------");
			for (Notice notice : list) {
				System.out.print(notice.getNo() + "\t");
				System.out.print(notice.getTitle() + "\t");
				System.out.print(notice.getName() + "\t");
				System.out.print(notice.getWriteday() + "\t");
				System.out.println();
			}
			if (list.size() == 0)System.out.println("공지사항이 없습니다.");
			
			  System.out.println("======================================================================\n");
				
		   }else if (inputMenu.equals("8")) {
			System.out.println("*****************************************");
			System.out.print("공지 글 번호를 입력하세요 => ");
			String inputNum = scan.next();
			
			Notice notice=null;
			try {
				notice = noticeBiz.selectDetailNotice(inputNum);
				System.out.println("======================================================================");
				System.out.println("NO\t\t제목\t\t작성자\t작성일자");
				System.out.println("----------------------------------------------------------------------");
				System.out.print(notice.getNo() + "\t");
				System.out.print(notice.getTitle() + "\t");
				System.out.print(notice.getName() + "\t");
				System.out.println(notice.getWriteday());
				System.out.println("----------------------------------------------------------------------");
				System.out.println("\t"+notice.getContent());
				System.out.println("----------------------------------------------------------------------");
			} catch (DataNotFoundException e) {
				System.out.println(e.getMessage());
			}

		} else if (inputMenu.equals("9")) {
			System.out.println("*****************************************");
			System.out.print("수정 할 공지 글번호를 입력하세요 => ");
			String no = scan.next();
			System.out.println("1.제목수정");
			System.out.println("2.내용수정");
			System.out.println("3.모두수정");
			System.out.println("------------------------------------------------");
			System.out.print("메뉴를 입력하세요(정수) => ");
			String inputColumn = scan.next();
			System.out.println("------------------------------------------------");
			 Notice notice = null;
			try {
				notice = noticeBiz.selectDetailNotice(no);
			} catch (DataNotFoundException e) {
				System.out.println(e.getMessage());
			}  
			if(inputColumn.equals("1")){
				System.out.print("수정 할 제목 입력 => ");
				String inputTitle = scan.next();
				notice.setTitle(inputTitle);
				System.out.println("------------------------------------------------");
			}else if(inputColumn.equals("2")){
				System.out.print("수정 할 내용 입력 => ");
				String inputContent = scan.next();
				notice.setContent(inputContent);
				System.out.println("------------------------------------------------");
			}else{
				System.out.print("수정 할 제목 입력 => ");
				String inputTitle = scan.next();
				System.out.println("------------------------------------------------");
				System.out.print("수정 할 내용 입력 => ");
				String inputContent = scan.next();
				System.out.println("------------------------------------------------");
				notice.setTitle(inputTitle);
				notice.setContent(inputContent);
			}
			
			    noticeBiz.noticeUpdate(notice);
			    //공지사항 목록
					try {
						notice = noticeBiz.selectDetailNotice(no);
						System.out.println("======================================================================");
						System.out.println("NO\t\t제목\t\t작성자\t작성일자");
						System.out.println("----------------------------------------------------------------------");
						System.out.print(notice.getNo() + "\t");
						System.out.print(notice.getTitle() + "\t");
						System.out.print(notice.getName() + "\t");
						System.out.println(notice.getWriteday());
						System.out.println("----------------------------------------------------------------------");
						System.out.println("\t"+notice.getContent());
						System.out.println("----------------------------------------------------------------------");
					} catch (DataNotFoundException e) {
						System.out.println(e.getMessage());
					}
			   
			   
		  System.out.println("======================================================================\n");
			    
			}else if (inputMenu.equals("10")) {
				System.out.println("*****************************************");
				System.out.print("삭제 할 공지 글번호를 입력하세요 => ");
				String inputNum = scan.next();
				try {
					noticeBiz.noticeDelete(inputNum);
					System.out.println(inputNum+"번 글이 삭제되었습니다.");
				} catch (DataNotFoundException e) {
					System.out.println(e.getMessage());
				}
				System.out.println("------------------------------------------------");
			} else {
				break;
			}
		}System.out.println("프로그램이 종료되었습니다.");

	}

	private static void printMainMenu() {

		System.out.println("*****************************************");
		System.out.println("\t[임직원 관리 시스템 메뉴]");
		System.out.println("*****************************************");
		System.out.println("1.전체 임직원 목록");
		System.out.println("2.임직원 정보 검색");
		System.out.println("3.임직원 정보 추가");
		System.out.println("4.임직원 정보 수정");
		System.out.println("5.임직원 정보 삭제");
		System.out.println("6.근태관리");
		System.out.println("7.공지사항 목록");
		System.out.println("8.공지사항 상세보기");
		System.out.println("9.공지사항 수정");
		System.out.println("10.공지사항 삭제");
		System.out.println("0.종료");
		System.out.println("*****************************************");
		System.out.print("메뉴 입력 => ");
	}//

	// 사원 목록 출력
	public static void printEmployeeList(EmployeeBiz empBiz) {
		// 사원 목록 리스트
		ArrayList<Employee> list = empBiz.selectAllEmployee();
		System.out.println("====================================================================================");
		System.out.println("사번\t이름\t부서\t근무지\t연봉\t커미션\t입사일\t\t근태");
		System.out.println("------------------------------------------------------------------------------------");
		for (Employee e : list) {
			System.out.print(e.getEmpno() + "\t");
			System.out.print(e.getEname() + "\t");
			String dname = "개발";
			if (e instanceof Sales) {
				dname = "영업";
			}
			System.out.print(dname + "\t");
			System.out.print(e.getLoc() + "\t");
			System.out.print(CommonUtil.getCurrency(e.getSal()) + "\t"); // 지역화폐변환
			double commission = 0;
			if (e instanceof Sales) {
				Sales s = (Sales) e; // getCommission() 유일함수 사용을 위해 형변환
				commission = s.getCommission();
				System.out.print(CommonUtil.getCurrency(((int) commission)) + "\t");
			} else {
				System.out.print("\t");
			}

			System.out.print(e.getHiredate() + "\t");
			String state = e.getState();
			System.out.print(state);
			System.out.println();
		} // end for
	}// end printEmployeeList

}
