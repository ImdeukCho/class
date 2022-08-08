import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		// LinkedHashSet : 순서가 있음
		Set linkeedSet = new LinkedHashSet();
		linkeedSet.add("1");
		linkeedSet.add(10);
		linkeedSet.add("100");
		linkeedSet.add("Hello");
		
		for (Object x : linkeedSet) {
			System.out.print(x);
			System.out.print(":");
		}
		System.out.println("=========================");
		
		// TreeSet : 자동 오름차순 정렬됨
		TreeSet<String> s = new TreeSet<String>();
		s.add("hello");
		s.add("aello");
		s.add("bello");
		s.add("xello");
		s.add("pello");
		
		System.out.println(s);
		
		System.out.println("첫번째 요소 : " + s.first());
		System.out.println("마지막 요소 : " + s.last());
		System.out.println("지정된값 앞요소(exclusive) : " + s.headSet("hello"));
		System.out.println("지정된값 뒷요소(inclusive) : " + s.tailSet("hello"));
		System.out.println("범위요소 : " + s.subSet("bello","xello"));
	}

}
