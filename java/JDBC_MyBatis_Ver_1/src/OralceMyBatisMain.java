
import java.util.List;

import com.dto.Dept;
import com.service.OracleMyBatisService;

public class OralceMyBatisMain {

	public static void main(String[] args) {
		OracleMyBatisService service = new OracleMyBatisService();
		
		List<Dept> list = service.selectAll();  // ﻿﻿MYBatis에서는 ArrayList를 list로 사용한다
		System.out.println(list);
		for (Dept dept : list) {
			System.out.println(dept);
		}
		
	} // end main

} // end class
