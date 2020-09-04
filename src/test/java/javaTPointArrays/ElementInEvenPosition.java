package javaTPointArrays;

import org.testng.annotations.Test;

public class ElementInEvenPosition {
	
	@Test
	public void elementInEvenPosition() {
	
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
		
		for(int i =1; i<arr.length; i=i+2) {
			System.out.println(arr[i]);
		}
	}

}
