

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.java.Item;

public class TestPredict {

	public static void main(String[] args) {
		
		ArrayList<Item> itemsList = new ArrayList<>();
		
		itemsList.add(new Item(102, "iPhone",300));
		itemsList.add(new Item(101, "Blackberry",200));
		itemsList.add(new Item(104, "Samsung",100));
		itemsList.add(new Item(103, "Motorola",150));
		itemsList.add(new Item(105, "Motorola",250));
		itemsList.add(new Item(106, "Motorola",450));


//If we want only names with item price > 400, we can use "map"
		List<String> newItemsList = itemsList.stream()
				.filter(i -> i.getPrice()>200)
				.map(Item::getName)
				.collect(Collectors.<String>toList());
	
		newItemsList.stream().forEach(System.out::println);
				

		
		
////	iterating using streams 
//		
//		List<Item> newItemsList = itemsList.stream().filter(i -> i.getPrice()>200).collect(Collectors.<Item>toList());
//
//		newItemsList.stream().forEach(System.out::println);
		

//till now we have bottom method to iterate through lists 		
//		ArrayList<Item> items = new ArrayList<>();
//		
//		for (Item item : itemsList) {
//			
//			if(item.getPrice()>200) {
//				items.add(item);
//			}	
//		}
//		
//		for (Item item : items) {
//			System.out.println("ID    : "+item.getId());
//			System.out.println("Price : "+item.getPrice());
//			System.out.println("Name  : "+item.getName());
//			System.out.println();
//		}
		
		
		
	}

}
