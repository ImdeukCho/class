import java.util.Scanner;

public class ArrayTest06 {

	public static void main(String[] args) {
		
		// 6. Scanner 클래스를 사용하여 키보드로 키(height)값을 입력 받아서 최대값을 구하는 코드 작업. 
		// 입력 받은 사람 수만큼 배열을 생성하여 사용한다.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("키의 최대값을 구합니다.");
		System.out.println("사람 수 : ");
		int num = scan.nextInt();
		
		int [] height = new int [num];                  // 입력받은 사람 수로 배열생성
		
		for (int i = 0; i < num; i++) {                 // 사람들의 키 입력받은 값을 배열값에 저장 
			System.out.println("사람 "+ (i+1)+": ");
			height[i] = scan.nextInt();
		}
		
		int max=height[0];                              // 사람들의 최대키 출력문
		for (int i = 1; i < height.length; i++) {
			if (height[i] > max) {
				max = height[i];
			}
		}
		System.out.println("최대값은 "+max+"입니다.");
		
		
		
	}

}
