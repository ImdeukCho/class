
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import com.dto.Dept;
import com.service.OracleMyBatisService;

public class OralceMyBatisMain5 {

	public static void main(String[] args) {
		OracleMyBatisService service = new OracleMyBatisService();

		// map의 데이터가 loc, dname에 따라 sql 문을 동적으로 변경
		// where loc ='' , where dname='', 아무것도 없을경우 전체 select
		HashMap<String, String> map = new HashMap<>();
		map.put("loc", "DALLAS");     // 조건에 loc가 존재하면 where loc = "DALLAS"
		map.put("dname", "SALES");    // 조건에 dname이 존재하면 where dname = "SALES"
		                              // 두개 동시에 조건 설정해서 실행하면 sql문에서 먼저 걸리는 dname만 출력된다.
		List<Dept> list = service.selectDynamicChoose(map);
		
		// 전체순회
		// 일반 for문
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
//		// for ~ each문
//		for (Dept dept : list) {
//			System.out.println(dept);
//		}
		
		
		
		
		
		
		
		
		
		
		
		
//		Dept dept = service.selectByDeptHashmap(10);
//		System.out.println(dept);
		
//		HashMap map = service.selectByDeptnoHashmap(10);
//		System.out.println(map);
//		Set keys = map.keySet();
//		System.out.println("키의 집합 : "+keys);
//		for (Object key : keys) {
//			System.out.println(key);
//			System.out.println(map.get(key));
//		}
//		System.out.println("===============================");
//		System.out.println(map.get("DEPTNO"));
////		int no = Integer.parseInt(map.get("DEPTNO"));
//		String loc = (String) map.get("LOC");
//		System.out.println(loc);
//		int no = ((BigDecimal) map.get("DEPTNO")).intValue(); // 숫자는 BigDecimal로 형변환후 intValue()로 형변환 해야한다.
//		System.out.println(no+10);
//		
		
		
		
		
		// 레코드의 갯수 출력
//		int num = service.deptRecourdCount();
//		System.out.println("레코드 갯수는 num ==== "+num);
		
//		service.insert(new Dept(98,"aa","bb"));
//		service.update(new Dept(98,"cc","dd"));
//		service.delete(98);
//		List<Dept> list = service.selectAll();
//		for (Dept dept : list) {
//			System.out.println(dept);
//		}
//		
		
		
		
	} // end main

} // end class
