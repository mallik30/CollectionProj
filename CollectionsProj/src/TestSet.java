import java.util.ArrayList;
import java.util.HashSet;

import com.java.Item;

public class TestSet {

	public static void main(String[] args) {
		
		HashSet<Item> items = new HashSet<>();
		
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
