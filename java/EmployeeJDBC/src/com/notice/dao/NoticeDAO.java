package com.notice.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.employee.exception.DataNotFoundException;
import com.notice.entity.Notice;

public class NoticeDAO {

	public ArrayList<Notice> selectAllNotice(Connection con) {
		ArrayList<Notice> list = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "select no, title, content, author, to_char(writeday,'YYYY-MM-DD')writeday from notice order by no desc";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int no = rs.getInt("no");
				String title = rs.getString("title");
				String content = rs.getString("content");
				String author = rs.getString("author");
				String writeday = rs.getString("writeday");
				Notice notice = new Notice(no, title, content, author, writeday);
				list.add(notice);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
		return list;
	}

	public Notice selectDetailNotice(Connection con, String noticeNum) throws DataNotFoundException {
		Notice result = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "select no, title,author,content,to_char(writeday,'YYYY-MM-DD')writeday from notice where no = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(noticeNum));
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int no = rs.getInt("no");
				String title = rs.getString("title");
				String content = rs.getString("content");
				String author = rs.getString("author");
				String writeday = rs.getString("writeday");
				result = new Notice(no, title, content, author, writeday);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
		return result;
	}

	public void noticeUpdate(Connection con, Notice notice) {
		PreparedStatement pstmt = null;
		try {
			String sql = "update notice set title = ?, content = ? where no = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(3, notice.getNo());
			pstmt.setString(1, notice.getTitle());
			pstmt.setString(2, notice.getContent());

			int n = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {

				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
	}

	public void noticeDelete(Connection con, String inputNum) throws DataNotFoundException {
		PreparedStatement pstmt = null;
		try {
			String sql = "delete from notice where no = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(inputNum));
			int n = pstmt.executeUpdate();
			if (n == 0) {
				throw new DataNotFoundException("에러발생: 일치하는 번호를 가진 공지사항이 없습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
	}

}
