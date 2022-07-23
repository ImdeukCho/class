
public class ArrayTest11 {

	public static void main(String[] args) {
		
		//3. new + 리터럴값 혼함 , 두줄 완성 가능
		int[][] num;
		num = new int [][]{{10,20,30},{40},{50,60}};
		
		for (int[] is : num) {
			for (int data : is) {
				System.out.println(data);
			}
		}
		
	} // end main

}
