package mapPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.testng.annotations.Test;

public class MapAscending {
	
	@Test
	public void mapAscending() {
		
		Map<String, String> mapObj = new HashMap<String, String>();
		mapObj.put("4",  "Gangatharan");
		mapObj.put("1", "Keertika");
		mapObj.put("3", "Santhi");
		mapObj.put("8",  "Abc");
		
		Iterator it = mapObj.entrySet().iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		mapObj.clear();
	System.out.println(it.hasNext());
		while(it.hasNext()) {
			System.out.println("Clear"+it.next());
		}
	}

}
