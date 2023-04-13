package seleniumpractice1;

public class Array_demo {

	public static void main(String[] args) {
		int i[]=new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		int len=i.length;
		System.out.println("Length of the Array is "+len);
		System.out.println(i[2]); 
		System.out.println(i[0]);
		//System.out.println(i[11]); //ArrayIndexOutOfBoundsException
		
		//For Loop
		for(int v=0;v<len;v++) {
			System.out.println("======Index value ="+v+"================"); //0 1 3 4
			System.out.println(i[v]);    //10,20,30,40
		}
		
		System.out.println("------Using For Each loop-----");
		for(int e:i) {
			System.out.println(e);
		}
		
		 
		

	}

}
