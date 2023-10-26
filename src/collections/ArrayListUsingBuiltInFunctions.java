package collections; 

import java.util.ArrayList;
import java.util.List;

public class ArrayListUsingBuiltInFunctions {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(55);
		list.add(25);
		list.add(23);
		list.add(88);
		list.add(21);
		
		list.sort(null);
		
		System.out.println(list);
	}

}
