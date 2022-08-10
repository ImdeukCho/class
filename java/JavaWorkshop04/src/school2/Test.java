package school2;

public class Test {

	public static void main(String[] args) {
		Student studentArray [] = new Student[4];
		studentArray[0] = new Student("홍길동",15,170,80);
		studentArray[1] = new Student("한사람",13,180,70);
		studentArray[2] = new Student("임걱정",16,175,65);
		studentArray[3] = new Student("aaa",20,175,65);
		
		Student maxage_stu = studentArray[0];
		for (int i = 0; i < studentArray.length; i++) {
			if(maxage_stu.getAge() < studentArray[i].getAge()) {
				maxage_stu = studentArray[i];
			}
			
		}
		System.out.println(maxage_stu.studentInfo());
	} // end main

}
