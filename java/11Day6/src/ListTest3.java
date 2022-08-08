import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest3 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("이순신");
		list.add("유관순");
		list.add("강감찬");
		list.add("세종");
				
		System.out.println("길이(크기) : "+list.size());  // 5
		System.out.println("값 포함여부 : "+list.contains("세종")); // true
		System.out.println("특적값 위치 : "+list.indexOf("세종")); // 4
		System.out.println("값이 없냐 : "+list.isEmpty()); // false
		System.out.println(list);
		
		for (String s : list) {
			System.out.println(s);
		}
		
		
		List<String> sub = list.subList(0, 3); // 0번방부터 2번방까지 3개
		System.out.println("sub : " + sub);
	
		Object[] obj = list.toArray(); // list --> Object[] 로 변환
		for (Object o : obj) {
			System.out.println("***"+o);
		}
		
		// 중간삽입(insert)
		list.add(0,"정조");
		System.out.println(list); //정조 추가됨
		// 수정
		list.set(0, "영조");
		System.out.println(list); // 영조로 수정됨
		// 삭제(delete)
		list.remove(0);
		list.remove("세종");
		System.out.println(list); // 0번째방, 세종 삭제됨
	}

}
