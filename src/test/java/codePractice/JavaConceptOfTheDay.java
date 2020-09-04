package codePractice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

import org.testng.annotations.Test;

public class JavaConceptOfTheDay {
	
	//Write a program in java which prints the numbers from 1 to 100. 
	//But, multiples of 3 should be replaced with “Fizz”, multiples of 5 
	//should be replaced with “Buzz” and multiples of both 3 and 5 should be replaced with “FizzBuzz”?

	//Git changes - Checking
	@Test
	public void a () {
		LinkedList<String> abc = new LinkedList<String>();
		abc.add("dgh");
		abc.add("abv");
		abc.add("zjkgm");
		abc.add("bdf");
		
		Iterator it = abc.descendingIterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
	
	@Test
	public void b() {
		
		Set<String> hset = new HashSet<String> ();
		hset.add("Abc");
		hset.add("HH");
		
		hset.remove("Abc");
		
		System.out.println(hset);
				
	}
}
