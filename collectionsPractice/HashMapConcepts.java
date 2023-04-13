package collectionsPractice;

import java.util.HashMap;

import org.testng.Assert;

public class HashMapConcepts {

	public static void main(String[] args) {
		HashMap<String,Integer> marks=new HashMap<String,Integer>(); 
		marks.put("Maths", 70);
		marks.put("History", 89);
		marks.put("Geography", 79);
		
	System.out.println("Marks received in maths : "+marks.get("Maths"));
	boolean b=marks.containsKey("History");
	Assert.assertEquals(b, true);
	

	}

}
