import java.util.ArrayList;

import com.biz.EmpBiz;
import com.entity.EmpDTO;
import com.exception.DataNotFoundException;

public class EmpTest3 {

	public static void main(String[] args) {
		
		EmpBiz empBiz = new EmpBiz(); // 생성자 작성
		ArrayList<EmpDTO> list = empBiz.selectAllEmp();
		// insert 가 안될시 DataNotFoundEx 발생 , insert 갯수 dao에서 출력
		try {
			empBiz.empInsert(new EmpDTO(30, "kim", "sales", 7902, null, 0.0, 0.1, 10));
		} catch (DataNotFoundException e) {
			e.printStackTrace();
		}
		
		// 전체출력
		for (EmpDTO dto : list) {
			System.out.println(dto);
		}

	}

}
