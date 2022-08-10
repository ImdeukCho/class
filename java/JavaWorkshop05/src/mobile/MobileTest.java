package mobile;

public class MobileTest {
	
	public static void printData(Mobile l, Mobile o) { // 매개변수 선언해야됨, 부모타입으로 해도 가능
		System.out.println("Mobile\tBattery\t OS");
		System.out.println("-------------------------");
		System.out.println(l.getMobileName()+"\t"+l.getBatterySize()+"\t"+l.getOsType());
		System.out.println(o.getMobileName()+"\t"+o.getBatterySize()+"\t"+o.getOsType());
	}

	public static void main(String[] args) {
		Ltab l = new Ltab("Ltab", 500, "AP-01");
		Otab o = new Otab("Otab", 1000, "AND-20");
//		System.out.println("Mobile\tBattery\t OS");
//		System.out.println("-------------------------");
//		System.out.println(l.getMobileName()+"\t"+l.getBatterySize()+"\t"+l.getOsType());
//		System.out.println(o.getMobileName()+"\t"+o.getBatterySize()+"\t"+o.getOsType());
//		MobileTest m = new MobileTest();
		printData(l, o);
		// 10분 충전
		l.charge(10);
		o.charge(10);
		System.out.println();
		System.out.println("10분 충전");
//		System.out.println("Mobile\tBattery\t OS");
//		System.out.println("-------------------------");
//		System.out.println(l.getMobileName()+"\t"+l.getBatterySize()+"\t"+l.getOsType());
//		System.out.println(o.getMobileName()+"\t"+o.getBatterySize()+"\t"+o.getOsType());
		printData(l, o);
		// 5분 통화
		l.operate(5);
		o.operate(5);
		System.out.println();
		System.out.println("5분 통화");
//		System.out.println("Mobile\tBattery\t OS");
//		System.out.println("-------------------------");
//		System.out.println(l.getMobileName()+"\t"+l.getBatterySize()+"\t"+l.getOsType());
//		System.out.println(o.getMobileName()+"\t"+o.getBatterySize()+"\t"+o.getOsType());
		printData(l, o);
	} // end main
}
