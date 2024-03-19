package collectionsDemo;

import java.util.ArrayList;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println("Hello World");
//		
//		String[] arrString = new String[10];
//		
//		arrString[0] = "name1";
//		arrString[2] = "name2";
//		
//		for (int i =0; i< arrString.length; i++) {
//			System.out.println(arrString[i]);
//		}
//		
		
		List<String> lstString = new ArrayList<>();
		
		lstString.add("name1");
		lstString.add("name2");
		lstString.add("name3");
		lstString.add("name4");
		lstString.add("name5");
		lstString.add("name6");
		lstString.add("name7");
		lstString.add("name8");
		
		System.out.println(lstString);
		System.out.println(lstString.get(2));
		
		lstString.remove(2);
		System.out.println(lstString);
		System.out.println(lstString.get(2));
		
		lstString.add(2, "name33");
		System.out.println(lstString);
		System.out.println(lstString.get(2));	
		
		lstString.set(2, "name33set");
		System.out.println(lstString);
		System.out.println(lstString.get(2));	
		
		
//		for (String ele : lstString) {
//			System.out.println(ele);
//		}

		
		List<String> lstString2 = new ArrayList<>();
		
		lstString2.add("name1");
		lstString2.add("name2");
		lstString2.add("name33");
		
		
		
		lstString.addAll(lstString2);
		System.out.println(lstString);
		
		lstString.removeAll(lstString2);
		System.out.println(lstString);
		
	}


	
	///
	// list - arraylist
	// maps
	// Array
	// Sets
	//
	
	// stack
	// queue
	// Linked list
}
