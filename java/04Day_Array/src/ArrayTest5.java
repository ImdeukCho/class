
public class ArrayTest5 {

	public static void main(String[] args) {

		// 1. new 이용, 두줄 작성 문제 없음
		int [] num;
		num = new int[3];
		num[0]=10;
		num[1]=20;
		num[2]=30;
		
		// 2. 리터럴값만 이용
		int [] num2 = {10,20,30};
		
		// 3. new+리터럴의 혼용 - 방갯수 지정 필요없음, 줄바꿈설정 가능
		int [] num3;
		int total = 0;
		num3 = new int[] {10,20,30};
		num3 = new int[] {10,20,30,40};
		for (int i : num3) {
			System.out.println(">>"+i);
			total+=i;
		}
		System.out.println(total);
		
		
	}

}
