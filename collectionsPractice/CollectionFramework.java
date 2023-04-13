package collectionsPractice;

import java.util.ArrayList;

public class CollectionFramework {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		for(int e:al) {
			System.out.println(e);
		}
		al.remove(1);
		System.out.println("After removing 1 element");
		for(int e:al) {
			System.out.println(e);
		}
	}

}
