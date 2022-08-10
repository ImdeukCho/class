
public class ArrayTest08 {

	public static void main(String[] args) {
		
		// 문8. 다음과 같이 제공된 배열에서 최대값과 최소값을 구하는 코드 작성.
		int [] score= {99,34,67,22,11,9};
		int max = score[0];
		int min = score[0];
		
		for (int i = 1; i < score.length; i++) {	
			if (score[i]>max) {
				max = score[i];
			}else if (score[i]<min) {
				min = score[i];
			}
		}
			System.out.println("최대값:"+max);
			System.out.println("최소값:"+min);
			
		
		
		
	} // end main

}
