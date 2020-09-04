package javaTPointArrays;

import org.testng.annotations.Test;

public class CopyArray {
	
	//Java Program to copy all elements of one array into another array
	@Test
	public void copyArray() {
		
		String arr[] = new String[3];
		String copyArr[] = new String[arr.length];
		
		arr[0] = "java";
		arr[1] = "program";
		arr[2] = "coding";

		copyArr = arr.clone();
		
		for(String dispArr:copyArr) {
			System.out.println(dispArr);
		}
	}
	
	@Test
	public void copyArray1() {
		
		String arr[] = new String[3];
		String copyArr[] = new String[arr.length];
		
		arr[0] = "java";
		arr[1] = "program";
		arr[2] = "coding";
		
		for(int i =0; i<arr.length; i++) {
			copyArr[i]= arr[i];
			System.out.println(copyArr[i]);
		}
	}
}
