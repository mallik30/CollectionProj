
import java.util.TreeSet;

import com.java.Item;
import com.java.ItemPriceComparator;

public class TestTreeSet {

	public static void main(String[] args) {
		
//		TreeSet<Item> items = new TreeSet<>(new ItemPriceComparator());
		
		TreeSet<Item> items = new TreeSet<>(Item::compareByPrice);
		
		items.add(new Item(102, "iPhone",350));
		items.add(new Item(101, "Blackberry",200));
		items.add(new Item(104, "Samsung",100));
		items.add(new Item(103, "Motorola",150));

		for (Item item : items) {
			System.out.println("Id   : "+item.getId());
			System.out.println("Name : "+item.getName());
			System.out.println("Price: "+item.getPrice());
			System.out.println();
		}


	}

}
