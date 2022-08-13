
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import com.dto.Dept;
import com.service.OracleMyBatisService;

public class OralceMyBatisMain4 {

	public static void main(String[] args) {
		OracleMyBatisService service = new OracleMyBatisService();
		
		int deptno=10;
		HashMap<String, Integer> map = new HashMap<>();
		map.put("deptno", deptno); // 동적실행 되어 deptno=10만 출력된다.
//		map.put("deptno", null); // null값일 경우 전체 출려된다.
		List<Dept> list = service.selectDynamicDeptno(map);
		
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
