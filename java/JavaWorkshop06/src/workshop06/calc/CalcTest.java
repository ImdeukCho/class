package workshop06.calc;

public class CalcTest {

	public static void main(String[] args) {
		
		System.out.println(args[0]+" "+args[1]+" "+args[2]);

		Calculator c = new Calculator();

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[2]);
		
		if (args[1].equals("+")) {
			System.out.println("결과 : " + c.plus(a, b));
		} else if(args[1].equals("-")) {
			System.out.println("결과 : " + c.minus(a, b));
		} else if(args[1].equals("x")) {
			System.out.println("결과 : " + c.multiplication(a, b));
		} else if(args[1].equals("/")) {
			System.out.println("결과 : " + c.divide(a, b));
		}
	} // end main
}
