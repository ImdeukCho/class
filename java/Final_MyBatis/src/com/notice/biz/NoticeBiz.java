package com.notice.biz;


import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.employee.exception.DataNotFoundException;
import com.notice.entity.Notice;




public class NoticeBiz implements INoticeBiz {

  
	//공지사항 목록보기
	public List<Notice> selectAllNotice() {
		List<Notice> list = null;
		SqlSession session = MySqlSessionFactory.getSession();
		try{
			list = session.selectList("notice.selectAllNotice");
		}finally {
			session.close();
		}
		return list;
	}
	
	//공지사항 자세히 보기
	public Notice selectDetailNotice(String noticeNum)throws DataNotFoundException{
		Notice notice = null;
		SqlSession session = MySqlSessionFactory.getSession();
		try{
			notice = session.selectOne("notice.selectDetailNotice" , Integer.parseInt(noticeNum) );
		}catch(Exception e){ 
			throw new DataNotFoundException("");
		}finally {
			session.close();
		}
		return notice;
	}
	
	
	 //공지사항 수정하기
	 public void noticeUpdate(Notice notice){

		 SqlSession session = MySqlSessionFactory.getSession();
			try{
				int n = session.update("notice.noticeUpdate", notice);
				session.commit();
			}finally {
				session.close();
			}
		
		}//noticeUpdate
	 
	 //공지사항 삭제
	 public void noticeDelete(String inputNum) throws DataNotFoundException{
		
		 SqlSession session = MySqlSessionFactory.getSession();
			try{
				int n = session.delete("notice.noticeDelete", Integer.parseInt(inputNum));
				session.commit();
			}catch(Exception e){ 
				throw new DataNotFoundException("");
			}finally {
				session.close();
			}
	 }
	 
}//end class
