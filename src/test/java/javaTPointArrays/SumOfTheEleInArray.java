package javaTPointArrays;

import org.testng.annotations.Test;

public class SumOfTheEleInArray {
	
	@Test
	public void sumOftheEleInArray() {
		
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum = sum+arr[i];
		}
		
		System.out.println(sum);
		
	}

}
