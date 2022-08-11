package workshop07;

import java.util.ArrayList;
import java.util.Random;

public class MakeList {
	ArrayList<Integer> list;
	
	public MakeList() {                       // 기본생성자
		list = new ArrayList<Integer>();
	}
	
	public void makeArrayList(int size) {      // size만큼의 정수형 데이터를 랜덤하게 만들어 ArrayList에 넣는다.
		Random r = new Random();
		for (int i = 0; i < size; i++) {
			list.add(r.nextInt(10)+10);              // Random 클래스 사용
//			list.add((int)((Math.random()*10)+10));  // Math.random() 함수 사용
		}
		System.out.println(list);
	}
	

	public double getAverage() {                // ArrayList에 셋팅 된 정수들의 평균을 리턴 한다.     
		double result = 0.0;
		double sum = 0;
		
		for (int i = 0; i < list.size(); i++) {
			sum+=list.get(i);
		}
		result = sum / list.size();
		return result;
	}
	
	public ArrayList<Integer> getList() {      // 만들어진 ArrayList 정보를 리턴한다
		return list;
	}
	

}
