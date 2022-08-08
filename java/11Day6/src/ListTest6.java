import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListTest6 {

	public static void main(String[] args) {
		
		// ArrayList : 중복가능, 순서가 있음.
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(9);
		list.add(6);
		list.add(1);
		list.add(3);
		list.add(4);
		
		System.out.println("정렬전 : " + list);
		Collections.sort(list);                  // Collections.sort() : 오름차순 정렬
		System.out.println("정렬후 : " + list);
		System.out.println("정렬전 : " + list);
		Collections.reverse(list);               // Collections.reverse() : 오름차순 정렬
		System.out.println("정렬후 : " + list);
		
		
		
		
		
		ArrayList<Person> set2 = new ArrayList<Person>();
		set2.add(new Person("홍길동", 20, "서울"));
		set2.add(new Person("이순신", 44, "전라"));
		set2.add(new Person("강감찬", 33, "전라"));
		
		System.out.println("정렬전 : " + set2);
		Collections.sort(set2, new PersonAgeSortComparator());     // 나이 기준 정렬
		// PersonAgeSortComparator 확인
		System.out.println("정렬후 : " + set2);
	}

}
