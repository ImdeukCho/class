import java.util.ArrayList;

import com.biz.EmpBiz;
import com.entity.EmpDTO;
import com.exception.DataNotFoundException;

public class EmpTest {

	public static void main(String[] args) throws DataNotFoundException {
		
		// 전체출력
		EmpBiz empBiz = new EmpBiz(); // 생성자 작성	
		ArrayList<EmpDTO> list = empBiz.selectAllEmp();
		for (EmpDTO dto : list) {
			System.out.println(dto);
		}

		System.out.println("===================");
		// 일반 for문 사용
		for (int i = 0; i < list.size(); i++) {          
			System.out.println(list.get(i));
		}
	}

}
