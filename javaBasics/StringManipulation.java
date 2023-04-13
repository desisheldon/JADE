package javaBasics;

public class StringManipulation {
	 public static void main(String[] args) {
	        String inputString = "qw12er34ty5&";
	        String outputString = "";
	        int sum = 0;
	        
	        for(int i = 0; i < inputString.length(); i++) {
	            char c = inputString.charAt(i);
	            
	            if(Character.isDigit(c)) {
	                sum =sum+ Character.getNumericValue(c);
	            } else {
	                outputString = outputString+c;
	            }
	        }
	        
	        outputString += sum;
	        System.out.println(outputString);
	    }
	


}
