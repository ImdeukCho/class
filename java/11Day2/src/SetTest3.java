import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest3 {

	public static void main(String[] args) {
		// set 특징 : 순서 없고, 중복 불가
		// 홍길동 20 서울, 이순신 44 전라, 유관순 17 서울
		Set<Person> set = new HashSet<Person>();
		Person kkkk = new Person("유관순",17,"서울");
		set.add(new Person("홍길동",20,"서울"));
		set.add(new Person("이순신",44,"전라"));
		set.add(new Person("이순신",44,"전라")); // new 다른 객체이므로 저장 가능
//		set.add("aaa");  // Person만 입력가능.
		set.add(kkkk);
		set.add(kkkk);  // 중복 저장 불가, 오류가 나진 않음.
		System.out.println(set);
		
		// 1. for ~ each 이용 순회 출력 - 이름만
		for (Person p : set) {
			System.out.println(p.getName());
		}
		
		// 2. iterator 사용 순회 => 이름만 출력
		System.out.println("=======================");
		Iterator<Person> x = set.iterator();
		while (x.hasNext()) {
//			Person p = x.next();            // 방법1
//			System.out.println(p.getName());
			System.out.println(x.next().getName());  // 방법2
		}
	}	

}
