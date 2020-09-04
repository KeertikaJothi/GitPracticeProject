package javaTPointArrays;

import org.testng.annotations.Test;

public class SeparateZeroAndNonZero {
	
	@Test
	public void separateZerosAndNonZeros() {
		
		int[] arr = {12, 0, 80, 33, 900, 0, 12, 90, 0};
		int temp = 0; 
		
		for(int i =0; i<arr.length; i++) {
				
			if(arr[i]!=0) {
			arr[temp]	= arr[i];
			temp++;
			}
		
		} while(temp < arr.length) {
			arr[temp] = 0;
			temp++;
		}
		
		
		
		
		for(int display: arr) {
			System.out.println(display);
		}
		
	}

}
