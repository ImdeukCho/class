import java.util.Enumeration;
import java.util.Properties;
import java.util.Set;

public class MapTest9 {

	public static void main(String[] args) {

		// Properties 이용해서 시스템 환경변수 얻기
		// 방법 1.
		Properties props = System.getProperties();// 환경 변수 전체 얻기
		Enumeration<?> enu = props.propertyNames();
		while (enu.hasMoreElements()) {
			String key = (String) enu.nextElement();
			System.out.println(key+" =========\t"+props.getProperty(key));
		}
	System.out.println("=================");
	
		// 방법 2.
		Set<String> keys = props.stringPropertyNames();
		for (String key : keys) {
			System.out.println(key +"="+ props.getProperty(key));
		}
		
		
		
	}

}
