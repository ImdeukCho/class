
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import com.dto.Dept;
import com.service.OracleMyBatisService;

public class OralceMyBatisMain8 {

	public static void main(String[] args) {
		OracleMyBatisService service = new OracleMyBatisService();

		// 10,20번 부서 map에저장 => multiSelectMap(map)
		HashMap<String, Integer> map = new HashMap<>();
		map.put("key1", 10);
		map.put("key2", 20);
		
		List<Dept> list = service.multiSelectMap(map);
		for (Dept dept : list) {
			System.out.println(dept);
		}
		
		
		
		
	} // end main

} // end class
