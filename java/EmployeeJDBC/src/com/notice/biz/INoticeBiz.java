
package com.notice.biz;

import java.util.ArrayList;

import com.employee.exception.DataNotFoundException;
import com.notice.entity.Notice;

public interface INoticeBiz {

	public ArrayList<Notice> selectAllNotice();
	public Notice selectDetailNotice(String noticeNum) throws DataNotFoundException;
	 public void noticeUpdate(Notice notice);
	public void noticeDelete(String inputNum) throws DataNotFoundException;
}
