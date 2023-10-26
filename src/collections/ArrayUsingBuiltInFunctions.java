package collections; 

import java.util.Arrays;

public class ArrayUsingBuiltInFunctions {

	public static void main(String[] args) {
		
		int arr[] = {34,56,21,12,8,32};
		int x= 34;
		
		//sorting array
		Arrays.sort(arr);
		
		//printing the sorted array
		for(int i = 0; i<arr.length; i++) {

			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		//Binary Search
		int index = Arrays.binarySearch(arr, x);
		
		if(index>=0) {
			System.out.println("Element found at index: " + index);
		}
		else {
			System.out.println("Element not found");
		}
		
		//using character array
		char arrStr[] = {'k', 'a', 'v', 'y', 'a'};
		
		//printing characters in array
		for(int i = 0; i<arrStr.length; i++) {
			
			System.out.print(arrStr[i] + " ");
		}
		
		System.out.println();
		
		//sorting the characters in array
		Arrays.sort(arrStr, 2, 3);
		
		for(int i=0;i<arrStr.length; i++) {
			
			System.out.print(arrStr[i] + " ");
		}
	}

}
