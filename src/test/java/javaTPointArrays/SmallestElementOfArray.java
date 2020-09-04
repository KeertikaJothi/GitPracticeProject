package javaTPointArrays;

import org.testng.annotations.Test;

public class SmallestElementOfArray {

	@Test
	public void smallestOfArray() {
		
		int arr[] = {4, 55, 1, 0, -1, -77, 9, 3, 0};
		
		int ele = arr[0];
		for(int i =1; i<arr.length; i++) {
			
			if(ele>arr[i]) {
				ele = arr[i];
			} System.out.println(ele);
			
		}
			System.out.println(ele);
	}
	
}
