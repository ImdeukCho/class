package workshop07;

public class Cruise extends Ship{

	@Override
	public void sail(int dist) {
		if (getFuelTank()<0) {
			System.out.println("연료가 부족합니다");
		}
		setFuelTank(getFuelTank() - (dist * 13));
	}

	@Override
	public void refuel(int fuel) {
		setFuelTank(getFuelTank() + (fuel * 8));
	}
	

	public Cruise() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cruise(String shipName, int fuelTank) {
		super(shipName, fuelTank);
		// TODO Auto-generated constructor stub
	}


}
