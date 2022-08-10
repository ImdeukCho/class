package mobile;

public class Otab extends Mobile {

	@Override
	public int operate(int time) { // 사용
		if(getBatterySize()-(time*10) > 0) {
		setBatterySize(getBatterySize() - (time * 12)); 
		}
		return getBatterySize();
	}

	@Override
	public int charge(int time) { // 충전
		setBatterySize(getBatterySize() + (time * 8));
		return getBatterySize();
	}
	
	public Otab() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Otab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
		// TODO Auto-generated constructor stub
	}

	

}
