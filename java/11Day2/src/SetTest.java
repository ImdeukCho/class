import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		// Set 계열의 특징 : 순서가 없고, 중복 허용 안됨
		HashSet s = new HashSet();
		Set set = new HashSet(); // 다형성 이용
		set.add("1");  // String
		set.add("2");
		set.add(3);    // Integer
		set.add("4");
		set.add(3.15); // Double
		set.add(new Date()); // Date
		
		// 값 출력
		System.out.println("길이 : " + set.size()); // 이 객체의 갯수?
		System.out.println("포함여부 : " + set.contains(20)); // 20이 포함되있냐? false
		System.out.println("empty냐 : " + set.isEmpty());  // 비어있냐? false
		System.out.println(set.remove("홍길동"));  // 홍길동이 없어서 false
		Object [] xxx = set.toArray(); // toArray() : 배열로 바꿔줌
		for (Object o : xxx) {
			System.out.println(o);
		}
		System.out.println("=======================");
		Iterator i = set.iterator();  // set객체를 interator 타입으로 변환
		while (i.hasNext()) {
			Object object = (Object) i.next();
			System.out.println(object);
		}
		set.clear();
		System.out.println(set);
	}

}
