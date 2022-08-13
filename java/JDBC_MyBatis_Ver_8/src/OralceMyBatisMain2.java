
import java.util.List;

import com.dto.Dept;
import com.service.OracleMyBatisService;

public class OralceMyBatisMain2 {

	public static void main(String[] args) {
		OracleMyBatisService service = new OracleMyBatisService();
		
		Dept dept = service.selectByDeptno(10);  // ﻿﻿MYBatis에서는 ArrayList를 list로 사용한다
		System.out.println(dept);
		
		
	} // end main

} // end class
