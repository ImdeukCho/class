
public class StudentUtil {
	
	// 이름 얻기, 첫글자 추출, 추출한 글자 리턴
	public char firstName(Student stu) {
		String name = stu.getName();
		char first=name.charAt(0);
		return first;  
//		return stu.getName().charAt(0); -- 위에거 한줄로 작성
	}
	
	
	
	public int nameLength(Student stu) {
		String name = stu.getName(); // 이름 얻기
		int length = name.length(); // 길이 얻기
		return name.length();
//		return stu.getName().length(); -- 위에거 한줄로 작성
	}
	public int nameLength2(Student stu) {
		return stu.getName().length();
	}
	
} // end class
