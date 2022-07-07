package dsa450;

import java.util.Arrays;

public class arraysubsetofanotherarray {

	public static void main(String[] args) {
		   int[]arr= {2,23,19,85,19};
			int n1=arr.length;
			int[]ar= {19,5,2,23,10};
		    int n2=ar.length;
		   count(arr,ar,n1,n2);
	   if(count(arr,ar,n1,n2)==true) {
		   System.out.println("a2 is subset ");
	   }
	   else {
		   System.out.println("a2 not is subset "); 
	   }
		}
	
	private static boolean count(int[] arr, int[] ar, int n1, int n2) {
		int temp=0;
		int j=0;
		int i=0;
		for(i=0;i<n2;i++) {
		for( j=0;j<n1;j++) {
			if(ar[i]==arr[j]) {
				break;
			}
			
		}
		if(j==n1) 
			return false;
		
} 
		return true;	
	}
	
		
	

	
	}


