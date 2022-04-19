package dsa450;
import java.util.*;
public class binarysearcharr4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Element you want to search");
		int p=sc.nextInt();
		System.out.println("Enter the size of Array");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		int start=0;
		int end=a.length-1;
		while(start<=end) {
			int mid=(start+end)/2;
			 if(a[mid]==p)
	            {
				 int l=mid+1;
		       System.out.println("Found a Element at Position "+l);
	            }
	            else{
	                if(a[mid]<p){
	                    start =mid+1;
	                    }
	                else if(a[mid]>p){
	                    end=mid-1;
	                    
	                }       
		}
			 start++;
		}
	}

}
