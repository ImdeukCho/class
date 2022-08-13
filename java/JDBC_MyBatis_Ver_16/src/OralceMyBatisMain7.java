
import java.util.List;

import com.dto.Dept;
import com.service.OracleMyBatisService;

public class OralceMyBatisMain7 {

	public static void main(String[] args) {
		OracleMyBatisService service = new OracleMyBatisService();

		// 검색어, idx, 갯수
		List<Dept> deptList3 = service.selectTopN("제주",0,2); 
		for (Dept dept : deptList3) {
			System.out.println(dept);
		}
		
		
		
	} // end main

} // end class
