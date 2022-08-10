import com.biz.EmpBiz;
import com.entity.EmpDTO;
import com.exception.DataNotFoundException;

public class EmpTest5 {

	public static void main(String[] args) {
		
		EmpBiz empBiz = new EmpBiz(); // 생성자 작성
		
		// 직업, 월급 update
		try {
			empBiz.empUpdate(new EmpDTO(30, "kim", "AAAAAA", 7902, null, 0.0, 0.1, 10));
		} catch (DataNotFoundException e) {
			e.printStackTrace();
		}

	}

}
