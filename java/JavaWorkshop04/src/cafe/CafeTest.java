package cafe;

public class CafeTest {

	public static void main(String[] args) {
		
		Cafe cafe = new Cafe();
		cafe.setCoffeList(new Coffee("아메리카노", 1000));
		cafe.setCoffeList(new Coffee("라떼", 1000));
		cafe.setCoffeList(new Coffee("블루베리", 1000));
		cafe.setCoffeList(new Coffee("아메리카노", 1000));
		
		int total=cafe.totalPrice();
		System.out.println(total);
		System.out.println();
		
		Coffee[] arr = cafe.getCoffeList();
		int index=cafe.getIndex();
		for (int i = 0; i < index; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("=================");
	} // end main

}
