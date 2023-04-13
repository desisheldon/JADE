package javaBasics;

public class DuplicateNumber {

	public static void main(String[] args) {
		int i,j;
		int[] arr= {12,33,11,12,44,33};
		for(i=0;i<arr.length-1;i++) {
			for(j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j] && i!=j) {
					System.out.println("Number "+arr[i]+" is duplicated");
				}
				else {
					
				}
			}
		}
		

	}

}
