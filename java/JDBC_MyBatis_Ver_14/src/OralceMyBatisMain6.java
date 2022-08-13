
import java.util.List;

import com.dto.Dept;
import com.service.OracleMyBatisService;

public class OralceMyBatisMain6 {

	public static void main(String[] args) {
		OracleMyBatisService service = new OracleMyBatisService();

		// 5. Top-N 분석 ==> 페이징처리
		List<Dept> deptList3 = service.selectTopN(0,3); // idx 0부터 시작, 3개
		for (Dept dept : deptList3) {
			System.out.println(">>>"+dept);
		}
		
		// 6. 오늘 날짜 특정 형식으로 출력
//		String date = service.getDate();
//		System.out.println(date);
		
	} // end main

} // end class
