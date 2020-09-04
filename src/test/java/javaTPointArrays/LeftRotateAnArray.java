package javaTPointArrays;

import org.testng.annotations.Test;

public class LeftRotateAnArray {

	@Test
	public void leftRotateAnArray() {
		int[] arr = {1, 2, 3, 4, 5};
		
		int first = arr[0];
		
		for(int i =0; i<arr.length-1; i++) {
			
				arr[i]= arr[i+1];
				
			}
			
			arr[arr.length-1] = first;
			
		for(int display: arr) {
			System.out.print(display);
		}
		
	}
}
