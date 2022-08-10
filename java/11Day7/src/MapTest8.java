import java.util.Enumeration;
import java.util.Properties;

public class MapTest8 {
	public static void main(String[] args) {

		Properties prop = new Properties();
		prop.setProperty("one", "홍길동");
		prop.setProperty("two", "홍길동");
		prop.setProperty("three", "홍길동");
//		prop.setProperty("four", null);  -- Properties 클래스는 Hashtable의 하위 클래스이므로 똑같이 null값 저장안됨.
		prop.setProperty("four", "100");
		
		String one = prop.getProperty("one");
		System.out.println(one);
		System.out.println(prop.getProperty("two"));
		System.out.println(prop.getProperty("three"));
	System.out.println("===================");
	
		// 순회 -- 매우 중요!!
		Enumeration<?> enu = prop.propertyNames(); // key 값만 Enumeration 객체로 반환 받기
		while (enu.hasMoreElements()) {  // key 값 존재여부
			String s = (String) enu.nextElement(); // key값 꺼내오기, 형변환
			System.out.println(s);
			System.out.println(prop.getProperty(s)); // key에 해당 value값 꺼내오기
		}
		
		
		
		
		
	}

}
