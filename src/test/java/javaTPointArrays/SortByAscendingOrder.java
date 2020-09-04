package javaTPointArrays;



import org.testng.annotations.Test;

public class SortByAscendingOrder {
	
	@Test
	public void sortByAscendingOrder() {
		
		int[] arr = {31, 1, 76, 06, 23, 2990, 67};
		int temp = 0;
		
		for(int i =0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				
				if(arr[i]> arr[j]) {
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
