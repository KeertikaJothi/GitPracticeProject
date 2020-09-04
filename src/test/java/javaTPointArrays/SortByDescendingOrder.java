package javaTPointArrays;

import org.testng.annotations.Test;

public class SortByDescendingOrder {
	
	@Test
	public void sortByDescendingOrder() {
		
		int arr[] = {03, 897, 57, 97, 2335, 001};
		int temp = 0;
		
		
		for(int i=0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				
				if(arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		} 
		
		for(int display: arr) {
			System.out.println(display);
		}
	}

}
