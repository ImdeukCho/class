
public class TestFlyer {

	public static void main(String[] args) {
		// 다형성이용 객체생성
		Flyer b = new Bird();
		Flyer m = new SuperMan();
		Flyer a = new Airplane();
		
		Flyer [] arr = {b, m, a}; // 배열에 저장, for문 이용 fly 모두 호출
		for (int i = 0; i < arr.length; i++) {
			arr[i].fly();
		}
		
		for (Flyer f : arr) { // for each문 사용
			f.fly();
		}
		
	}

}
