package seleniumpractice1;

public class ReverseNormal {

	public static void main(String[] args) {
		String str="Jade Global";
		String reverse="";
		int len=str.length();
		char ch;
//		for(int i=0;i<len-1;i++) {
//			
//			ch=str.charAt(i);
//			reverse=ch+reverse;   
//		}
		for(int i=len-1;i>=0;i--) {
			ch=str.charAt(i);
			reverse=reverse+ch;
		}
		System.out.println(reverse);

	}

}
