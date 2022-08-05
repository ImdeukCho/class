
public class Cat extends Pet {
	
	private String gender;

	

	@Override
	public void cry() {
		System.out.println("cat cry() ===============");
		
	}

	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Cat(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}


	public Cat(String name, int age, String gender) {
		super(name, age);
		this.gender = gender;
		// TODO Auto-generated constructor stub
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}



	@Override
	public String getPet() {
		return super.getPet() + "\t" + gender;
	}



	
}
