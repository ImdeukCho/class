package workshop07;

import java.util.ArrayList;

public class ListTest02 {

	public static void main(String[] args) {
		
		ConvertList c = new ConvertList();
		
		int array[] = {3,4,2,5,2,3,6,7,5,7,9};

		ArrayList<Integer> list = c.convertList(array);
		
		for (Integer ints : list) {
			System.out.print(ints + " ");
		}
		
	System.out.println();
	
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+ " ");
		}
		
	
		
	}
}
