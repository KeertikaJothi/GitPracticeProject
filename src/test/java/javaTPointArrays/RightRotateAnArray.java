package javaTPointArrays;

import org.testng.annotations.Test;

public class RightRotateAnArray {

	@Test
	public void rightRotateAnArray() {
		
		int arr[] = {1, 2, 3, 4, 5};
		int lastEle = arr[arr.length-1];
		System.out.println("Last Ele "+ lastEle);
		
		for(int i =arr.length-2; i>-1; i--) {
			arr[i+1] = arr[i];
			
		}
		arr[0] = lastEle;
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
}
