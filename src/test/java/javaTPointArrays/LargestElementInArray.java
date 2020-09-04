package javaTPointArrays;

import org.testng.annotations.Test;

public class LargestElementInArray {

	@Test
	public void largestElementInArray() {
		
		int[] arr = {2, 7, 88, 474, 836, 957798, 34, 56};
		int ele = arr[0];
		int greatestEle = 0;
		
		for(int i =1; i<arr.length; i++) {
			
			if(ele >= arr[i]) {
				greatestEle = ele;
			} else {
				greatestEle = arr[i];
			}
			ele = greatestEle ;
		} System.out.println(greatestEle);
	}
}
