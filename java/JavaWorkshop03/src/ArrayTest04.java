
public class ArrayTest04 {

	public static void main(String[] args) {
		
		// 4. 다음 배열의 내용을 실행 결과와 같이 출력 되도록 프로그램을 작성 하시오.
		int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		for (int i = 0; i < arr.length; i++) {
			int j= (arr.length-1)-i;
			System.out.print(arr[j]+" ");
			// System.out.print(arr[(arr.length-1)-i]+" "); // 위와 동일
		}

	}

}
