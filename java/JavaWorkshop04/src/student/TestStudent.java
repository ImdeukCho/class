package student;

public class TestStudent {

	public static void main(String[] args) {
		Student stu01 = new Student("kim", 100, 90, 95, 89);
		Student stu02 = new Student("Lee", 60, 70, 99, 98);
		Student stu03 = new Student("Park", 68 ,86, 60, 40);
		
		System.out.println(stu01.getName()+" 평균:"+stu01.getAvg()+" 학점: "+stu01.getGrade());
		System.out.printf("%s 평균: %.2f 학점: %s", stu02.getName(), stu02.getAvg(), stu02.getGrade()+"\n");
		System.out.printf("%s 평균: %.2f 학점: %s", stu03.getName(), stu03.getAvg(), stu03.getGrade());
		System.out.println("=======================");
		
		Student[] stu = new Student[3];
		stu[0] = stu01;
		stu[1] = stu02;
		stu[2] = stu03;
		for (Student s : stu) {
			System.out.println(s.getName()+"\t"+s.getAvg()+"\t"+s.getGrade());
		}


	}

}
