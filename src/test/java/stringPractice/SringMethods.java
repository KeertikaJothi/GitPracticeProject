package stringPractice;

import org.testng.annotations.Test;

public class SringMethods {
	
	@Test
	public void a() {
		String s1 = String.join("/", "abc", "bcd");
		System.out.println(s1);
	}

}
