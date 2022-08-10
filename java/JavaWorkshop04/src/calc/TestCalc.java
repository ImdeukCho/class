package calc;

public class TestCalc {

	public static void main(String[] args) { // 5입력
		System.out.println(args[0]);
		int num = Integer.parseInt(args[0]);
		
		if (num>=5 &&num<=10) {
			Calc calc = new Calc();
			System.out.println("결과 : " + calc.calcuate(num));
		} else {
			System.out.println("다시 입력하세요.");
		}
	} // end main
	
}
