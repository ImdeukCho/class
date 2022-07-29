import java.util.Calendar;
import java.util.Random;

import com.xxx.Student;
// import 자동완성 단축키 : ctrl + shift + o

public class TestStudent {
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s.name);
		Random r = new Random();
		
		Calendar c = Calendar.getInstance();
		System.out.println(c);
	}
}
