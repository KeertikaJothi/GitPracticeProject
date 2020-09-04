package javaTPointArrays;

import org.testng.annotations.Test;

public class DuplicateElement {
	
	@Test	
	public void duplicateElement() {
		int arr[] = {1, 2, 3, 1, 2, 3};
		
		for(int i =0; i<arr.length; i++) {
			
			for(int j =i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}
	}

}
