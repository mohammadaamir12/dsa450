package dsa450;

import java.util.Scanner;

public class cyclicrotateofarraybyonedsa14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the size of Array");
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		int size=a.length;
		int x=a[size-1];
		for(int j=a.length-1;j>0;j--) {
			a[j]=a[j-1];
		}
		a[0]=x;
       
		for(int i=0;i<n;i++){
		   System.out.print(a[i]);
		}
	}

}
