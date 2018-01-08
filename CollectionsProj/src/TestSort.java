import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.java.Item;
import com.java.ItemNameComparator;
import com.java.ItemPriceComparator;

public class TestSort {

	public static void main(String[] args) {

		ArrayList<Item> itemsList = new ArrayList<>();
		
		itemsList.add(new Item(102, "iPhone",300));
		itemsList.add(new Item(101, "Blackberry",200));
		itemsList.add(new Item(104, "Samsung",100));
		itemsList.add(new Item(103, "Motorola",150));
		
//		Collections.sort(itemsList); //it will read compareTo method in Item class

//		Collections.sort(itemsList,new ItemPriceComparator());
		
//		Collections.sort(itemsList,new ItemNameComparator());
		
//		Comparator<Item> comparator = new Comparator<Item>() {
//			
//			@Override
//			public int compare(Item i1, Item i2) {
//
//				if(i1.getPrice() > i2.getPrice()) {
//					return 1;
//				}else if(i1.getPrice() < i2.getPrice()) {
//					return -1;
//				}
//				return 0;
//			
//			}
//		};

		//sort with name
//		Comparator<Item> comparator1 = (Item i1,Item i2)-> {
//			return i1.getName().compareTo(i2.getName());
//			};
		
		
//		Runnable r1 = () -> 
//		{
//			System.out.println("Hi");
//		};
		
		
//		//sort with price
//		Comparator<Item> comparator = (Item i1,Item i2)->{
//			if(i1.getPrice() > i2.getPrice()) {
//				return 1;
//			}else if(i1.getPrice() < i2.getPrice()) {
//				return -1;
//			}
//			return 0;
//		};
//		
		Collections.sort(itemsList,Item::compareByPrice);
		
		for (Item item : itemsList) {
			System.out.println("Id    : "+item.getId());
			System.out.println("Name  : "+item.getName());
			System.out.println("Price : "+item.getPrice());
			System.out.println();
		}
		
	}

}
