import java.util.ArrayList;
import java.util.Date;

public class ListTest {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add("홍길동");
		list.add("이순신");
		list.add(20);
		list.add("홍길동");
		list.add(3.15);
		list.add(new Date());
		
		String s = (String)list.get(0);          // generic 사용안할 경우 현변환 필요함
		System.out.println(s.length());
		
		// 데이터 출력
		System.out.println(list);
	}

}
