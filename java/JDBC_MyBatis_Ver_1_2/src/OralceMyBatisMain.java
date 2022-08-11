
import java.util.List;

import com.dto.Dept;
import com.service.OracleMyBatisService;

public class OralceMyBatisMain {

	public static void main(String[] args) {
		OracleMyBatisService service = new OracleMyBatisService();

		List<Dept> list = service.selectAll();

		
	} // end main

} // end class
