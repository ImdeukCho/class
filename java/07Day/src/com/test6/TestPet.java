package com.test6;

public class TestPet {

	public static void main(String[] args) {
		// 다형성 적용 배열 생성
		Pet[] pets = { new Cat("나비", 2, "암컷", "흰색"),
				new Cat("하늘", 4, "수컷", "회색"),		
				new Dog("멍멍", 3, "수컷", "리트리버"),		
				new Cat("야옹이", 20, "수컷", "블랙"),		
				new Dog("망치", 1, "수컷", "불독")	
		};
		
		for (int i = 0; i < pets.length; i++) {       // for 문 사용
			System.out.println("유일값 변경전 : "+pets[i].getPet());
			if (pets[i] instanceof Cat) {
				Cat c = (Cat)pets[i];
				c.color="red";                        // 유일 값 사용
			}else if(pets[i] instanceof Dog) {
				Dog c = (Dog)pets[i];
				c.species="비글";                       // 유일 값 사용
			}else {
				// pet인 경우
			}
			System.out.println("유일값 변경후 : "+pets[i].getPet());
		}
		System.out.println("==============================================");
		for (Pet p : pets) {                           // for~each 문 사용
			System.out.println("유일값 변경전 : "+p.getPet());
			if (p instanceof Cat) {
				Cat c = (Cat)p;
				c.color="red";                         // 유일 값 사용
			}else if(p instanceof Dog) {
				Dog c = (Dog)p;
				c.species="비글";                        // 유일 값 사용
			}else {
				// pet인 경우
			}
			System.out.println("유일값 변경후 : "+p.getPet());	
		}
		
		//for문 작성 전체 테이터 출력     // instanceof 함수는 사용 할 필요없다 - 유일변수,함수를 사용할때만 필요!!
		System.out.println("1번 for문 ===========================");
		for (int i = 0; i < pets.length; i++) {
			System.out.println(pets[i].getPet()); // 오버라이딩된 함수라서 한번에 모두 출력됨.
		}
		System.out.println("2번 for문 ===========================");
		for (Pet p : pets) {
			System.out.println(p.getPet());
		}
		
		
		
		// Object로 상속받는 경우
		System.out.println("Object 배열 ==========================================");
		Object[] pets2 = { new Cat("나비", 2, "암컷", "흰색"),
				new Cat("하늘", 4, "수컷", "회색"),		
				new Dog("멍멍", 3, "수컷", "리트리버"),		
				new Cat("야옹이", 20, "수컷", "블랙"),		
				new Dog("망치", 1, "수컷", "불독")	
		};
		// Object로 상속받을 때 오류들 수정.
		for (Object p : pets2) {
//			System.out.println(p.getPet());    // 오류 : Object클래스에서는 getPet() 함수가 없기때문에
			if (p instanceof Cat) {
				Cat c = (Cat)p;
				System.out.println(c.getPet());
			}else if(p instanceof Dog) {
				Dog d = (Dog)p;
				System.out.println(d.getPet());
			}else {
				Pet pet = (Pet)p;
				System.out.println(pet.getPet());
			}
		}
		
	} // end main

} // end class
