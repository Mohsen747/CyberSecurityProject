package ArrayListProcess;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList1 {

	public static void main(String[] args) {
		
		List<String> nameList = new ArrayList<String> ();
		String [ ] names = {"Ann", "Bob", "Carol"};
		
		// Add to arrayList
		for (int x = 0; x < names.length; x++)
		nameList.add(names[x]);
		
		// Display name list
		for (int x = 0; x < nameList.size(); x++)
		System.out.println(nameList.get(x)); 
	}

}
