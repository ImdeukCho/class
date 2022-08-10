package com.notice.biz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import com.common.util.CommonUtil;
import com.employee.entity.Employee;
import com.employee.exception.DataNotFoundException;
import com.notice.dao.NoticeDAO;
import com.notice.entity.Notice;

public class NoticeBiz implements INoticeBiz {//공지사항 notice테이블 사용 biz파일 

	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "tester";
	private String pass = "tester";

	private NoticeDAO dao;

	public NoticeBiz() {
		dao = new NoticeDAO();
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}// end 생성자

	// 공지사항 목록보기
	public ArrayList<Notice> selectAllNotice() {

		ArrayList<Notice> list = null;
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, user, pass);
			list = dao.selectAllNotice(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}

		return list;
	}

	// 공지사항 자세히 보기
	public Notice selectDetailNotice(String noticeNum) throws DataNotFoundException {
		Notice result = null;
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, user, pass);
			result = dao.selectDetailNotice(con, noticeNum);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}

		return result;
	}

	// 공지사항 수정하기
	public void noticeUpdate(Notice notice) {
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, user, pass);
			dao.noticeUpdate(con, notice);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
	}// noticeUpdate

	// 공지사항 삭제
	public void noticeDelete(String inputNum) throws DataNotFoundException {
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, user, pass);
			dao.noticeDelete(con, inputNum);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
	}

}// end class
