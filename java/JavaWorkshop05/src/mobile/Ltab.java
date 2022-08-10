package mobile;

public class Ltab extends Mobile{

	@Override
	public int operate(int time) { // 사용
		if(getBatterySize()-(time*10) > 0) {
		setBatterySize(getBatterySize() - (time * 10)); 
		}
		return getBatterySize();
	}

	@Override
	public int charge(int time) { // 충전
		setBatterySize(getBatterySize() + (time * 10));
		return getBatterySize();
	}

	public Ltab() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ltab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
		// TODO Auto-generated constructor stub
	}
	
}
