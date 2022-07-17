
public class EX03_9 {

	public static void main(String[] args) {
		
		int a = 12;
		int b = 4;
		int c = 19;
		
		int max = ( a > b ) ? a : b;    // max = 12
		max = ( max > c ) ? max : c;    // max = 19
		System.out.println( "최대값은" + max );

	}

}
