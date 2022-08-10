import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapTest3 {

	public static void main(String[] args) {
		// Hashtable : null 키를 가질 수 없다.
		Hashtable<String, String> map = new Hashtable<>();
		map.put("one", "홍길동");
		map.put("two", "이순신");
		map.put("three", "유관순");
		map.put("one", "강감찬");
//		map.put("one", null); // error : NullPointerException
//		map.put(null, "one"); // error : NullPointerException
		
		
		System.out.println(map.get("one")); 
		System.out.println(map.get("two"));
		System.out.println(map.get("three"));
		System.out.println(map.get("four")); // null


	}

}
