package javaTPointArrays;
import org.testng.annotations.Test;

public class FrequencyOfEachElement {

	@Test
	public void frequencyOfArray() {
		int arr[] = {1, 2, 4, 2, 2, 1};
		int a[] = new int[arr.length];
		
		for(int i =0; i<arr.length; i++) {
			a[i] = arr[i];
			int find = 0;
			
			for(int j =0; j<arr.length; j++) {
				if(a[i]==arr[j]) {
					find = find+1;
				} 
			} if(find>0) {
				System.out.println("Duplicate Ele: "+a[i]);
			}
		}
	}
	
	
}