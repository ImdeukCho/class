import com.biz.EmpBiz;
import com.entity.EmpDTO;
import com.exception.DataNotFoundException;

public class EmpTest2 {

	public static void main(String[] args) {
		
		EmpBiz empBiz = new EmpBiz(); // 생성자 작성
		
		// throws 처리
//		EmpDTO dto = empBiz.selectDetailEmp("7369"); // 사원번호 7369번 부서
		
		// try~catch 처리
		EmpDTO dto=null;                
		try {
			dto = empBiz.selectDetailEmp("7369"); 
		} catch (DataNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(dto);

	}

}
