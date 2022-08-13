
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import com.dto.Dept;
import com.service.OracleMyBatisService;

public class OralceMyBatisMain2 {

	public static void main(String[] args) {
		OracleMyBatisService service = new OracleMyBatisService();
		
		List<HashMap> list = service.selectAll2();
		
		// list 전체순회 : to_string 사용
		for (HashMap x : list) {
			System.out.println(x);
		}
		
		// list 전체순회 =>map에서 key를꺼내기 => 키를 이용하여 value을 찍기 
		for (HashMap map : list) {             // list에서 map을 꺼냄
			Set<String> keys = map.keySet();   // map에서 key값들을 꺼내 keys에 저장 ,set은 순서가 없어서 무작위로 출력
				System.out.println(keys);             // key값들이 대문자인걸 확인
			for (String key : keys) {	       // kye값들에서 key값을 꺼냄
				System.out.print(key+"\t"+map.get(key)+"\t"); // key값과 map의 key값 value를 출력
			}
			System.out.println(map.get("DEPTNO")+"\t"+map.get("DNAME")+"\t"+map.get("LOC")); // 순서대로 출력 : 직접 키값을 써서 꺼내오기
		}
		
	} // end main

} // end class
