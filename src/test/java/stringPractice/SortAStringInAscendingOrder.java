package stringPractice;

import org.testng.annotations.Test;

public class SortAStringInAscendingOrder {

	
	@Test
	public void sortAStringInAsc() {
		String s1 = "JavaProgram";
		String s= s1.toLowerCase();
		char  temp;
		
		char[] a = s.toCharArray();
		 a[0] = s.charAt(0);
		
		for(int i =0; i<a.length; i++) {
			
			for(int j =0; j<a.length; j++) {
				
				if(a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			} 
		} for(char display:a) {
			System.out.print(display);
		}
	}
		
}
