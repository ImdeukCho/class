package workshop06.calc;
public class Calculator {
	public static double plus(int a, int b) {
		double result = 0.0;
		result = a + b;
		return result;
	}	
	public static double minus(int a, int b) {
		double result = 0.0;
		result = a - b;
		return result;
	}
	public static double multiplication(int a, int b) {
		double result = 0.0;
		result = a * b;
		return result;
	}
	public static double divide(int a, int b) {
		double result = 0.0;
		try {
			result = a / b;
		} catch (ArithmeticException e) {
			System.out.println("Exception 이 발생 하엿습니다. 다시 입력해 주세요");
		}	
		return result;		
	}
	
}
