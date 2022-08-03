
public class Tset {

	public static void main(String[] args) {
		Car c = new Car(new Engine("A010","2001"),"gv80");
		
		Engine e = c.getEngine();
		System.out.println(c.getModelName()+"\t"+e);
	}

}
