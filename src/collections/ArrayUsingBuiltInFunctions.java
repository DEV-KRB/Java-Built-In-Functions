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
		char p = 'v';
		
		//printing characters in array
		for(int i = 0; i<arrStr.length; i++) {
			
			System.out.print(arrStr[i] + " ");
		}
		
		System.out.println();
		
		//sorting the characters in array
		Arrays.sort(arrStr);
		
		for(int i=0;i<arrStr.length; i++) {
			
			System.out.print(arrStr[i] + " ");
		}
		
		//binary search for a character in array
		int term = Arrays.binarySearch(arrStr, p);
		
		if(term>=0) {
			System.out.println("Character found at index: " + term);
		}
		else {
			System.out.println("Not found");
		}
		
		//coping array to new length
		int newL = 9;
		int copyA[] = Arrays.copyOf(arr, newL);
		
		System.out.println("Copied array is: " + Arrays.toString(copyA));
		
		int valueToFill = 10;
		
		//If want to fill same values in array
		//toString() used to represent array as a string
		Arrays.fill(copyA, valueToFill);
		
		System.out.println("filled values are: " + Arrays.toString(copyA));
	}
	
}
