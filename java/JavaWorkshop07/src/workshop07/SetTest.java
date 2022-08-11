package workshop07;

import java.util.HashSet;

public class SetTest {

	public static void main(String[] args) {
		String str = "Javaprogramming";
		char charArr[] = str.toCharArray();
		
		HashSet<Character> set = new HashSet<>(); 
		for (int i = 0; i < charArr.length; i++) {
			set.add(charArr[i]);
		}
		System.out.println(set);
		
	}

}
