
import java.util.List;

import com.dto.Dept;
import com.service.OracleMyBatisService2;

public class OralceMyBatisMain {

	public static void main(String[] args) {
		OracleMyBatisService2 service2 = new OracleMyBatisService2();
		
		List<Dept> list2 = service2.selectAll2();
		for (Dept dept : list2) {
			System.out.println(dept);
		}
		
	} // end main

} // end class
