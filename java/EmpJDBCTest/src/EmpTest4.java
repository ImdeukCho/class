import java.util.ArrayList;
import java.util.HashMap;

import com.biz.EmpBiz;
import com.entity.EmpDTO;
import com.exception.DataNotFoundException;

public class EmpTest4 {

	public static void main(String[] args) {
		
		EmpBiz empBiz = new EmpBiz(); // 생성자 작성
		HashMap<String, String> map = new HashMap<>();
		map.put("job", "MANAGER");
		map.put("deptno", "30");
		ArrayList<EmpDTO> list = empBiz.selectDetailEmp2(map);
		
		
		// 전체출력
		for (EmpDTO dto : list) {
			System.out.println(dto);
		}

	}

}
