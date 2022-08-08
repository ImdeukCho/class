import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTest4_1 {

	public static void main(String[] args) {
	
		List<Person> list = new ArrayList<>();
		list.add(new Person("홍길동", 10, "서울"));
		list.add(new Person("이순신", 20, "경기"));
		list.add(new Person("유관순", 30, "성남"));
		
		// 1. 일반 for문 이용 - 이름만 출력
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getName());
		}
		
		// 2. for 문 이용 - 나이가 제일 많은 사람
		Person old_p = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			if (old_p.getAge() < list.get(i).getAge()) {
				old_p=list.get(i);
			}
		}
		System.out.println(old_p);
		
		// 3. for ~ each 문 이용 - 나이가 제일 많은 사람
		Person old_p2 = list.get(0);
		for (Person p : list) {
			if (old_p2.getAge() < p.getAge() ) {
				old_p2=p;
			}
		}
		System.out.println(old_p2);
		
		// 4. interator 이용 - 나이가 제일 많은 사람
		Person old_p3 = list.get(0);
		Iterator<Person> i = list.iterator();
		while (i.hasNext()) {
			Person p = i.next();
			if (old_p3.getAge() < p.getAge() ) {
				old_p3=p;
			}
		}
		System.out.println(old_p3);
	}

}
