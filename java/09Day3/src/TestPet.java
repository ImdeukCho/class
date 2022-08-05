
public class TestPet {

	public static void main(String[] args) {
		Pet c = new Cat("나비", 3, "암컷");
		System.out.println(c.getPet());
		c.cry();
		
		Pet d = new Dog("하루", 2, "블랙");
		System.out.println(d.getPet());
		d.cry();
		
		Pet[] arr = {c, d};
		for (Pet p : arr) {
			p.cry();
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i].cry();		
		}
	}

}
