import java.util.HashMap;
import java.util.List;
import java.util.Set;

import com.service.OracleMyBatisService;

public class OralceMyBatisMain2 {

	public static void main(String[] args) {
		OracleMyBatisService service= new OracleMyBatisService();
		List<HashMap> list= service.selectAll2();
//		List<Dept> list= service.selectAll2();
		System.out.println(list);
		for (HashMap map : list) {
			Set<String> keys= map.keySet();
			for (String key : keys) {
				System.out.println(key+ "\t"+map.get(key));
			}
		
			
		}

	}

}
