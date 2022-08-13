
import java.util.List;

import com.dto.Dept;
import com.service.OracleMyBatisService;

public class OralceMyBatisMain {

	public static void main(String[] args) {
		OracleMyBatisService service = new OracleMyBatisService();
		
//		service.insert(new Dept(99, "개발", "강남"));
//		service.update(new Dept(99, "영업", "서울"));
		service.delete(99);
		List<Dept> list = service.selectAll();
		for (Dept dept : list) {
			System.out.println(dept);
		}
		
		
	} // end main

} // end class
