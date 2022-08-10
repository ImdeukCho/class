import java.util.ArrayList;

import com.biz.EmpBiz;
import com.entity.EmpDTO;
import com.exception.DataNotFoundException;

public class EmpTest6 {

	public static void main(String[] args) {
		
		EmpBiz empBiz = new EmpBiz(); // 생성자 작성
		
		// 30번 사원 삭제후 전체 select
		try {
			empBiz.empDelete("30");
		} catch (DataNotFoundException e) {
			e.printStackTrace();
		}
		
		// 전체출력
		ArrayList<EmpDTO> list = empBiz.selectAllEmp();
		for (EmpDTO dto : list) {
			System.out.println(dto);
		}
		
	}

}
