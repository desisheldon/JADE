package seleniumpractice1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {
		ArrayList<Integer> numbers=new ArrayList<Integer>(Arrays.asList(10,20,30,40));	
		System.out.println(numbers);
		System.out.println("Static array using Array Literals");
		int i[]= {100,200,300,400};
		System.out.println(Arrays.toString(i));
		System.out.println("---------------");
		
		ArrayList<String> names=new ArrayList<String>(Arrays.asList("Java","Python","Ruby"));
		System.out.println(names);
		
		ArrayList<String> l1=new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		ArrayList<String> l2=new ArrayList<String>(Arrays.asList("B","A","D","C"));
		ArrayList<String> l3=new ArrayList<String>(Arrays.asList("B","A","D","C","F"));
		System.out.println(l1.equals(l3));
		System.out.println(l2);
		Collections.sort(l2);
		Collections.sort(l3);
		System.out.println(l2);
		System.out.println(l1.equals(l3));
		
		//find out common elements
			ArrayList<String> lang1=new ArrayList<String>(Arrays.asList("Bengali","Marathi","Hindi","Gujarati","Tamil"));
			ArrayList<String> lang2=new ArrayList<String>(Arrays.asList("Bengali","Marathi","Hindi","Kannada","Tamil"));
		lang1.retainAll(lang2);
		System.out.println(lang1);
		
		ArrayList<String> l5=new ArrayList<String>(Arrays.asList("B","A","D","C"));
		ArrayList<String> l6=new ArrayList<String>(Arrays.asList("B","A","D","C"));
	}

}
