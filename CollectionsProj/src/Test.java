import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
//		ArrayList<String> names = new ArrayList<>();
		LinkedList<String> names = new LinkedList<>();

		names.add("Hary"); //0
		names.add("Raj");//1
		names.add("kumar");//2
		names.add("Jhon");//3
		names.add("Anil");//4
		names.add("Steve");//5
		
		Collections.sort(names); 
		
		for (String str : names) {
			System.out.println(str);
		}
		
		
		
//		List<String> sublist = names.subList(1, 4);
//		
//		for (String str : sublist) {
//			System.out.println(str);
//		}
		
//		names.remove(2);
//		//names.add(2, "Rachel");
		
//		for (String str : names) {
//			System.out.println(str);
//		}
//		
//		LinkedList<String> names2 = new LinkedList<>();
//
//		names2.add("Hary"); //0
//		names2.add("Raj");//1
//		names2.add("john");//2
//		names2.add("Anil");//3
//		names2.add("Steve");//4

		
//		System.out.println(names.get(2));
		
//		Iterator<String> iterator = names.iterator();
//		
//		while (iterator.hasNext()) {
//			String str = iterator.next();
//			System.out.println(str);
//		}
		
//		System.out.println(names.containsAll(names2));
//		
//		for (String str : names) {
//			
//			System.out.println(str);
//		}
		
		
		//toArray without using objects
//		String[] namesArr = new String[names.size()];
//		
//		names.toArray(namesArr);
//		
//		for (String str : namesArr) {
//			
//			System.out.println(str);
//			
//		}
		
		
		//toArray
//		Object[] objArr = names.toArray();
//		
//		for (Object object : objArr) {
//			
//			System.out.println(object.toString());
//			
//		}
		
//		System.out.println(names.size());
//		
//		System.out.println(names.contains("Raj"));
		
	}

}
