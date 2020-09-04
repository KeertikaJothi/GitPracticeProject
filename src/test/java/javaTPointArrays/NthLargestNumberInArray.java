package javaTPointArrays;

import org.testng.annotations.Test;

public class NthLargestNumberInArray {
	
	@Test
	public void nthLargestNumberInArray() {
		
		int arr[] = {2, 90, 687, 3292, 80, 13};
		int temp = 0;
		
		for(int i =0; i<arr.length; i++) {
			for(int j =i+1; j<arr.length; j++) {
				
				if(arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		} 
		
		for(int display: arr) {
			System.out.println(display);
		} System.out.println("2nd Largest Number: "+arr[1]);
	} 

}
