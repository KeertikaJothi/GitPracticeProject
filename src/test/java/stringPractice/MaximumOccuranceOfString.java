package stringPractice;

import org.testng.annotations.Test;

public class MaximumOccuranceOfString {

	@Test
	public void maximumOccuranceOFString() {
		
		String s = new String("Java Programming");
		char s1;
		char occ[] = new char[s.length()];
		
		System.out.println("Program Started");
		
		for(int i=0; i<s.length(); i++) {
			s1 = s.charAt(i);
			int find = 0;
			boolean occurance = false;
			
			for(char display: occ) {
				if(display==s1) {
					occurance = true;
					break;
				}
			}
			if(occurance == false) {
				for(int j=0; j<s.length(); j++) {
					
					if(s1==s.charAt(j)) {
						find++;
					}
				} System.out.println("Occurance of "+s1+" : "+find);
				occ[i]= s1;
			}
		}
		
	}
}
