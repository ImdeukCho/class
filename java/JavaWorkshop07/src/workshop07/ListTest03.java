package workshop07;

import java.util.ArrayList;
import java.util.Random;

public class ListTest03 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			Random r = new Random();
			int r1 = r.nextInt(10);
			int r2 = r.nextInt(10);
			list1.add(r1);
			list2.add(r2);		
		}

		for (int i = 0; i < 10; i++) {
			int n1 = list1.get(i);
			int n2 = list2.get(i);	
				try {
					System.out.println(n1+"/"+n2+"\t"+n1/n2);
				} catch (Exception e) {
					System.out.println("분모가 0입니다");
				}	
		}
		
	}
	
}
