
public class HelloTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// c언어에서 사용하는 printf 지원
		// 자바에서 사용하는 데이터 타입에 따른 printf의 사용 기호
		//     1. 문자열(s) - ""(큰따옴표) 사용 / 여러 문자 / string
		//     2. 문자(c) - ''(작은땅모표) 사용 / 하나 문자 / char
		//     3. 정수형(d) - 12345
		//     4. 실수형(f) - 123.45
		//     5. 불린형(b) - 참거짓 : true, false(소문자)
		
		System.out.printf("이름은 %s", "홍길동");
		System.out.println();
		System.out.printf("이름은 %s, 나이는 %d", "홍길동", 28);
		System.out.println();
		System.out.printf("이름은 %s, 나이는 %d, 키는 %3.3f", "홍길동", 28, 185.5498745);
		System.out.println();
		System.out.printf("이름은 %s, 나이는 %d, 키는 %3.3f, 성별은 %c", "홍길동", 28, 185.5498745, '남');
		System.out.println();
		System.out.printf("이름은 %s, 나이는 %d, 키는 %3.3f, 성별은 %c, 결혼%b\n", "홍길동", 28, 185.5498745, '남', true);
		
		System.out.printf("이름은 %s, 나이는 %d 키는 %3.3f, 성별 %c, 결혼 %b＼n",   //   \ : 백슬래쉬 기호는 백스페이스 아래 원표시 누르면 된다
				          "홍길동", 987456, 185.5498745, '남', true);  // printf - 개행안됨
		
	    System.out.println("===============================");
	}

}

