package workshop07;

public class Boat extends Ship{

	@Override
	public void sail(int dist) {
		if (getFuelTank()<0) {
			System.out.println("연료가 부족합니다");
		}
		setFuelTank(getFuelTank() - (dist * 10));
	}

	@Override
	public void refuel(int fuel) {
		setFuelTank(getFuelTank() + (fuel * 10));
	}
	
	public Boat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Boat(String shipName, int fuelTank) {
		super(shipName, fuelTank);
		// TODO Auto-generated constructor stub
	}



	

	
}
