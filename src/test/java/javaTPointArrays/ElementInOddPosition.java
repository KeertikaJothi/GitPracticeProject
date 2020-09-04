package javaTPointArrays;

import org.testng.annotations.Test;

public class ElementInOddPosition {

	@Test
	public void elementInOddPosition() {
		
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		for(int i =0; i<arr.length; i=i+2) {
			System.out.println(arr[i]);
		}
	}
}
