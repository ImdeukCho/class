
import java.util.Arrays;
import java.util.List;

import com.dto.Dept;
import com.service.OracleMyBatisService;

public class OralceMyBatisMain5 {

	public static void main(String[] args) {
		OracleMyBatisService service = new OracleMyBatisService();

		// 3. multiDelete - 12, 13 delete - Deptno가 아니라 Dept객체로 조건지정 할 경우
		List<Dept> depts = Arrays.asList(new Dept(12,"",""),new Dept(13,"",""));
		service.multiDelete(depts);
		
		// 전체 select
		List<Dept> list = service.selectAll();
		for (Dept dept : list) {
			System.out.println(dept);
		}
		
		// 2. multiupdate - 12, 13, 50 update 
//		List<Integer> deptnoes2=Arrays.asList(12,13,50); //asList() : list의 배열로 만들어짐
////		System.out.println(deptnoes2);
////		System.out.println(deptnoes2.size());
//		service.multiUpdate(deptnoes2);
		
		// 1. multiSelect - 12, 13, 50 select
//		List<Integer> deptnoes=Arrays.asList(12,13,50);
//		System.out.println(deptnoes);
//		List<Dept> list = service.multiSelect(deptnoes);
//		for (Dept dept : list) {
//			System.out.println(dept);
//		}
		
//		List<Integer> deptnoes=Arrays.asList(10,20);
//		System.out.println(deptnoes);
//		List<Dept> list = service.multiSelect(deptnoes);
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
