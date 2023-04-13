package exceptionHandling;

public class TryCatchBlock {
	String name;
	
	


	public static void main(String[] args) {
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		TryCatchBlock t=new TryCatchBlock();
		t.name="Tom";
		t=null;
		
		try {
			System.out.println(t.name);
			int i=9/0;
			System.out.println("B");
			System.out.println("B");
			System.out.println("B");
			}
		catch(NullPointerException npe){
			System.out.println("NPE found");
			npe.printStackTrace();
			
		}
		catch(ArithmeticException e){
			System.out.println("Exception found");
			e.printStackTrace();
			}
		System.out.println("C");
		System.out.println("C");
		System.out.println("C");
			
				
		

	}

}
