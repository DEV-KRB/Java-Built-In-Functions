package collections; 

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListUsingBuiltInFunctions {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		int x = 23;
		
		list.add(55);
		list.add(25);
		list.add(23);
		list.add(88);
		list.add(21);
				
		System.out.println(list);
		
		//Collections.sort() used to sort any class of collection interface
		Collections.sort(list);
		System.out.println(list);
		
		//Collection.binarySearch used to search a element in sorted collection
		int index = Collections.binarySearch(list, x);
		
		if(index>=0) {
			System.out.println("Element found at: " + index);
		}
		else {
			System.out.println("Not found");
		}
	}

}
