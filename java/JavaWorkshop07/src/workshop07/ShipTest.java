package workshop07;

import java.util.ArrayList;

public class ShipTest {

	public static void main(String[] args) {

		// ArrayList를 만들어 각각의 Boat 객체와 Cruise객체를 생성하여 넣는다.
		ArrayList<Ship> list = new ArrayList<Ship>();
		list.add(new Boat("Boat01", 500));
		list.add(new Cruise("Cruise01",1000));
		
		// 생성된 객체의 정보 출력 - for문 사용
		System.out.println("shipName \tfuelTank");
		System.out.println("-------------------------");
		for (Ship ship : list) {
			System.out.println(ship.getShipName()+" \t"+ship.getFuelTank());
		}
//		for (int i = 0; i < list.size(); i++) {
//			Ship ship = list.get(i);
//			System.out.println(ship.getShipName()+" \t"+ship.getFuelTank());
//		}
	System.out.println();
		
		// Boat인 경우에는 10 운항하고 Cruise인 경우에는 15 운항후 객체 정보 출력 -for 문 사용
		System.out.println("10 운항");
		System.out.println("shipName \tfuelTank");
		System.out.println("-------------------------");
		for (int i = 0; i < list.size(); i++) {
			Ship ship = list.get(i);
					
			// Boat인지 Cruise인지 판별
			if (ship instanceof Boat) {
				ship.sail(10);
			}else {
				ship.sail(15);
			}
			System.out.println(ship.getShipName()+" \t"+ship.getFuelTank());
		}
	
	System.out.println();
		// Boat인 경우에는 20 주유하고 Cruise인 경우에는 30 주유 후 객체 정보 출력 – for문 사용
		System.out.println("50 주유");
		System.out.println("shipName \tfuelTank");
		System.out.println("-------------------------");
		for (int i = 0; i < list.size(); i++) {
			Ship ship = list.get(i);
					
			// Boat인지 Cruise인지 판별
			if (ship instanceof Boat) {
				ship.refuel(20);
			}else {
				ship.refuel(30);
			}
			System.out.println(ship.getShipName()+" \t"+ship.getFuelTank());
		}
		
	}

}
