
public class Sample02_variable2 {

	public static void main(String[] args) { // main
		String name="홍길동"; // 변수, name변수, 문자열변수, String타입의 변수, 참조형 변수
		int age=20; // 변수, age변수, 정수형변수, int 타입의 변수, 기본형변수
		String address="서울"; // 참조형변수
		char gender='남'; //변수, gender변수, 문자형변수, char타입변수, 기본형변수
		boolean isMarried=false; // 기본형변수
		float height=185.63f;  // 기본형변수
		double weight=78.25d;  // 기본형변수

		System.out.printf("printf: 이름은 %s, 나이는 %d, 주소는 %s입니다, 성별은 %c \n" , name, age, address, gender);
		
		// println과 + 연산자를 이용한 문자열의 연결
		System.out.println("이름은 "+name + ", 나이는 "+age +", 주소는 "+address + ", 성별은 " +gender);
		
		System.out.println(name+"\t"+age+"\t"+address+"\t성별("+gender+") "
				+ "결혼여부 ("+isMarried+") 키("+height+") 체중("+weight+")");
		
		// 컴파일 오류 : 문법 오류
		// 패키지 : 폴더
		
	} // end main

}
