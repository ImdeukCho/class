package workshop07;

import java.util.ArrayList;

public class ConvertList {

	ArrayList<Integer> list = new ArrayList<>();
	
	public ArrayList<Integer> convertList(int [] array) {
//		ArrayList<Integer> list = new ArrayList<>();
		for (int i = array.length-1; i >= 0; i--) {
			list.add(array[i]);
		}
		
//		for (int i = array.length; i > 0; i--) {
//			list.add(array[i-1]);
//		}
		return list;
	}
}
