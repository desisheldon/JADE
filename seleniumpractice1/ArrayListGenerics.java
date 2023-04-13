package seleniumpractice1;

import java.util.ArrayList;

public class ArrayListGenerics {

	public static void main(String[] args) {
		ArrayList<Integer> ar=new ArrayList<Integer>(); /*diamond bracket*/
		System.out.println("Integer Array List");
		ar.add(100);
		ar.add(200);
		ar.add(300);
		for(Integer e:ar) {
			System.out.println(e);
		}
		System.out.println("---------------");
		System.out.println("String Array List");
		ArrayList<String> Cars=new ArrayList<String>();
		Cars.add("Nexon");
		Cars.add("Sonet");
		Cars.add("Porche");
		for(String s:Cars) {
			System.out.println(s);
		}
		
		

	}

}
