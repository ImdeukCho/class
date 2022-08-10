import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Test07java {

	public static void main(String[] args) {
		System.out.println("한 자리 정수값을 입력하시오");
		Scanner scan = new Scanner(System.in);
		int num = Integer.parseInt(scan.next());
		int sum = 0; 
		for (int i=num; i<=100; i++) {
			if((i%num)==0) {
				sum+=i;
				if(i!=num) System.out.print("+");
				System.out.print(i);
			}
		}
		System.out.println("="+sum);


	}

}
