
public class Dog extends Pet {
	
	private String color;

	@Override
	public void cry() {
		System.out.println("Dog cry() =======================");
		
	}

	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Dog(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	public Dog(String name, int age, String color) {
		super(name, age);
		this.color = color;
		// TODO Auto-generated constructor stub
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String getPet() {
		return super.getPet() + "\t" + color;
	}
	
	
}
