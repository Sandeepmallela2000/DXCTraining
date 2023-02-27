package collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashmapOne {
	public static List<String> sortSales(Map<String, Integer> sales) {
		//Implement your logic here and change the return statement accordingly
		List<Map.Entry<String, Integer>> entries = new ArrayList<>(sales.entrySet());
	    
	    Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
	        public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
	            return e2.getValue().compareTo(e1.getValue());
	        }
	    });
	    
	    List<String> names = new ArrayList<>();
	    for (Map.Entry<String, Integer> entry : entries) {
	        names.add(entry.getKey());
	    }
	    
	    return names;
	}

	public static void main(String args[]) {
	    Map<String, Integer> sales = new HashMap<String, Integer>();
		sales.put("Mathew", 50);
		sales.put("Lisa", 76);
		sales.put("Courtney", 45);
		sales.put("David", 49);
		sales.put("Paul", 49);
		
		List<String> employees = sortSales(sales);
		
		System.out.println("Employees in the decreasing order of their sales\n=====================================");
		for (String employeeName : employees) {
			System.out.println(employeeName);
		}
	}

}

