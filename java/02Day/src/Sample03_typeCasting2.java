
public class Sample03_typeCasting2 {

	public static void main(String[] args) {
		
	// 데이터 타입 변경(명시적으로 형변환 시킨다.)  : 큰타입 데이터 => 작은타입에 저장시킬 때 필요함
		
	int n = 10;
	short n2 = (short)n;
	
	short x = 10;
	short x2 = 20;
	short x3 = (short)(x + x2); // 주의
	int x4 = x + x2;
	
	int i = 123;
	float y = i + 12.3F;    // 정수 + 실수 = 실수형
	System.out.println(y); // 실수형
	
	int c = 123;
	// short d = c; // 에러 발생 : int형이라 short에 저장안된다.
	short e = (short)c; // 형변환 연산자를 이용해서 int형인 c을 short형으로 강제 형변환 한다.
	
	
	}

}
