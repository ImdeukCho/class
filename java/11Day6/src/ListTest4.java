import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTest4 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();  // 다형성
		list.add("홍길동");
		list.add("이순신");
		list.add("세종");				
		System.out.println(list);
		
		// 매우 중요
		List<String> list2 = Arrays.asList("홍길동","이순신","세종","세종"); // 문자열을 자동으로 List로 생성
		System.out.println("list2 : " + list2);  // 중복 입력 가능한걸 확인.
		System.out.println(list2.size());
		for (String s : list2) {
			System.out.println(s);
		}
	
		
	}

}
