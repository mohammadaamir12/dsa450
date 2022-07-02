package dsa450;

import java.util.Scanner;

public class linearsearcharr3 {

	public static void main(String[] args) {
		int s=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Element you want to search");
		int p=sc.nextInt();
		System.out.println("Enter the size of Array");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		
		
		
		if(a[i]==p) {
			s=i+1;
			
		}
		
		
		
	    
		}
		if(s!=0) {
		System.out.println("Element found at Position "+s);
		}
		else {
			System.out.println("Element not found");
		}
	}

}
