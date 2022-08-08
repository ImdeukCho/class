import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class ListTest2 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("이순신");
		list.add("유관순");
		list.add("강감찬");
		list.add("세종");
//		list.add(100);
		
		// 데이터 출력
		System.out.println(list);
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		String s = list.get(3);
		System.out.println(">>>>"+s);
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println("===="+list.get(i));
		}
		for (String s1 : list) {
			System.out.println(s1);
		}
		System.out.println("==================");
		Iterator<String> i= list.iterator();
		while (i.hasNext()) {
			String s2 =  i.next();
			System.out.println(s2);
			
		}
		
		for (int j = 0; j < args.length; j++) {
			
		}
	}

}
