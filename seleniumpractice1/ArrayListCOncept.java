package seleniumpractice1;

import java.util.ArrayList;

public class ArrayListCOncept

{
	public static void main(String[] args) {
		ArrayList arr=new ArrayList();
		System.out.println(arr.size());
		arr.add(100);//0
		arr.add(200);//1
		System.out.println(arr.size());
		arr.add(300);//2
		arr.add(400);//3
		arr.add(500);//4
		System.out.println(arr.get(2));
		/*System.out.println(arr.get(4)); java.lang.IndexOutOfBoundsException
		System.out.println(arr.get(-1));java.lang.IndexOutOfBoundsException */
		//arr.remove(3);
		System.out.println(arr.get(3));
		System.out.println("--------------------");
		for(int i=0; i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
		

	}

}
