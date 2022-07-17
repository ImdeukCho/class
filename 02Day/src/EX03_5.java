

public class EX03_5 {

	public static void main(String[] args) {
//		int a = 3;
//		++a;  // a=a+1
//		System.out.println(a);    // a=4
//		a--;  // a=a-1
//		System.out.println(a);    // a=3
//
//		int x = 5;
//		int y = ++x;
//		System.out.println(x + " " + y);  // x=6, y=6
//		
//		int x2 = 5;
//		int y2 = x2++;
//		System.out.println(x2 + " " + y2);  // x2=6, y2=5
////		
//		// 3. 증감연산자 (증가/감소 연산자)
//		int y = 10;
//		int y2 = ++y; // 전치 : 먼저 증가하고 나중에 할당
//		System.out.println(y+"\t"+y2);
//		int y3 = y++; // 후치 : 먼저 할당하고 나중에 증가
//		System.out.println(y+"\t"+y3);
//		
//		int k = 10;
//		++k;
//		System.out.println(k);    // k=11
//		k++;
//		System.out.println(k);    // k=12
		
		// 5. 논리 연산자
		System.out.println( 3==4 && 4>3 );             // false
		
		System.out.println( ! true );            // false
		System.out.println( ! false );            // true
		
		System.out.println( true || true );            // true
		System.out.println( true || false );            // true
		System.out.println( false || true );            // true
		System.out.println( false || false );            // false
		
		System.out.println( true && true );            // true
		System.out.println( true && false );            // false
		System.out.println( false && true );            // false
		System.out.println( false && false );            // false
		
		
	}

}
