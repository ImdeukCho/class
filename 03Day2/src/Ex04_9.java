
public class Ex04_9 {

	public static void main(String[] args) {
		
//		int total = 0;
//		for ( int n=1; n<=10; n++){
//			total += n;
//		}
//			System.out.println( " 총 합계는 " + total);
//			
//			
//			
//		int total1 = 0;
//		for ( int n=1; n<=100; n++){
//			total1 += n;
//		}
//			System.out.println( " 총 합계는 " + total1);
			
		
		// 문) 짝수 홀수 총합 ( for문에 if문 설정 )
		int total1 = 0;    // 주의 : for문 밖에 작성해야지 최종총합을 출력할수있음
		int total2 = 0;
		for (int i = 1; i <= 10; i=i+1) {
			if(i%2==0) { // 짝수인 경우
				total1 += i;
				System.out.println("total : "+total1+"\t" + "i : "+i);	
			} else { // 홀수인 경우
				total2 += i;
				System.out.println("tota2 : "+total2+"\t" + "i : "+i);	
			}
		}
		System.out.println("짝수 총합=" + total1 +"홀수 총합" + total2 );
	}

}
