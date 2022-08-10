
public class ArrayTest02 {

	public static void main(String[] args) {
		
		// 문2.다음 배열의 짝수 번째 정수의 합을 구하는 프로그램을 작성 하시오.
		int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			if (i%2 != 0) {  // i는 0부터 시작하므로 배열의 짝수번째는 홀수를 뽑는다.
				sum+=arr[i];
			}
		}
		System.out.println(sum);
	
	
	
	} // end main

} // end class
