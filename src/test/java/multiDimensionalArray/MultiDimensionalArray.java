package multiDimensionalArray;

import org.testng.annotations.Test;

public class MultiDimensionalArray {

	@Test
	public void multiDimensionalArray() {
		int a[][] = {{1, 2, 3, 4}, {1, 2, 3, 4}};
		
		for(int i =0; i<2; i++) {
			for(int j =0; j<4; j++) {
				System.out.print(a[i][j]);
			} System.out.println();
		}
	}
	
	@Test
	public void addTwoMatrix() {
		int a[][] = {{1, 2, 3, 4}, {8, 2, 2, 4}};
		int b[][] = {{1, 2, 7, 4}, {1, 5, 3, 4}};
		
		for(int i =0; i<2; i++) {
			for(int j = 0; j<4; j++) {
				
				System.out.print(a[i][j]+b[i][j]+" ");
			} System.out.println();
		}
	}
}
