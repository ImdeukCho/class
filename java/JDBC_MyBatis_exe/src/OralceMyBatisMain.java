
import java.util.HashMap;
import java.util.List;

import com.dto.Dept;
import com.service.OracleMyBatisService;

public class OralceMyBatisMain {

	public static void main(String[] args) {
		OracleMyBatisService service = new OracleMyBatisService();
		
		
		
		// 2) insert() : 99, "개발", "강남" 레코드 추가후 전체 select
//		service.insert(new Dept(99,"개발","강남"));
		// 3) update() : 99, "영업", "서울"로 레코드 업데이트후 select
//		service.update(new Dept(99,"영업","서울"));
		// 4) delete() : 99번 삭제 후 select
//		service.delete(99);
		// 5) selectByDeptno(12) : deptno 12번 단일 select 결과 출력
//		Dept dept = service.selectByDeptno(12);
//		System.out.println(dept);
		// 6) selectByDeptnoHashMap(12) : deptno 12번 select 결과를 hashmap에 저장
		HashMap map = service.selectByDeptnoHashMap(12);
		System.out.println(map);
		// 1) selectAll() : 전체 데이터 출력
//				List<Dept> list = service.selectAll();
//				for (Dept dept : list) {
//					System.out.println(dept);
//				}
		
	} // end main

} // end class
