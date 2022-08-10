package school;

public class StudentTest {

	public static void main(String[] args) {
		Student studentArray [] = new Student[3];
		studentArray[0] = new Student("홍길동",15,171,81);
		studentArray[1] = new Student("한사람",13,183,72);
		studentArray[2] = new Student("임걱정",16,175,65);
		
		double totalAge = 0.0;
		double totalHeight = 0.0;
		double totalWeight = 0.0;
		System.out.println("이름 \t나이 \t신장 \t몸무게");
		for (int i = 0; i < studentArray.length; i++) {
			totalAge += studentArray[i].getAge();
			totalHeight += studentArray[i].getHeight();
			totalWeight+= studentArray[i].getWeight();
			System.out.println(studentArray[i].getName()+"\t"+studentArray[i].getAge()+
					"\t"+studentArray[i].getHeight()+"\t"+studentArray[i].getWeight());
		}
		System.out.println();
		System.out.printf("나이의 평균 : %.2f \n",totalAge / studentArray.length);
		System.out.printf("신장의 평균 : %.2f \n",totalHeight / studentArray.length);
		System.out.printf("몸무게의 평균 : %.2f \n",totalWeight / studentArray.length);
		
	}

}
