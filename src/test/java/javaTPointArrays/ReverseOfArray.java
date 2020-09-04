package javaTPointArrays;

import org.testng.annotations.Test;

public class ReverseOfArray {

	@Test
	public void reverseOfArray() {
		
		int arr[] = {1, 2, 7, 9, 8};
		
		for(int i=arr.length; i>0; i--) {
			System.out.print(arr[i-1]);
		}
		System.out.println();
	}
}
			