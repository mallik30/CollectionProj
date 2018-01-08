import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import com.java.Item;
import com.java.ItemPriceComparator;

public class TestSortedMap {

	public static void main(String[] args) {
			
		Item item = new Item(101,"i10",200);
		
		System.out.println(item instanceof Comparable<?>);
		
		TreeMap<Item,String> map = new TreeMap<>(new ItemPriceComparator());
		
		
//		TreeMap<String,String> callingCodes = new TreeMap<>(); 
//
//		callingCodes.put("IND","091");
//		callingCodes.put("US","001");
//		callingCodes.put("UK","044");
//		callingCodes.put("AUS","006");
//		callingCodes.put("CAN","001");
//
//		Set<Entry<String,String>> keys = callingCodes.entrySet();
//
//		for (Entry<String, String> entry : keys) {
//			System.out.println(entry.getKey()+":"+ entry.getValue());
//			
//		}
	}

}
