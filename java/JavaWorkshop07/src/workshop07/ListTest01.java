package workshop07;

import java.util.ArrayList;

public class ListTest01 {

	public static void main(String[] args) {
		int size = 10;
		
		MakeList m = new MakeList();
		m.makeArrayList(size);
		
		
		ArrayList<Integer> list = null;
		list = m.getList();
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+ " ");
		}
		System.out.println();
		System.out.println("평균 : " + m.getAverage());
	}

}
