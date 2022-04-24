package dsa450;

import java.util.Scanner;

public class selectionsortdsa5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length-1;i++) {
			int minIndex=0;
			int min=Integer.MAX_VALUE;
			for(int j=i;j<a.length;j++) {
				if(a[j]<min) {
					min=a[j];
					minIndex=j;
				}
				int temp=a[minIndex];
				a[minIndex]=a[i];
				a[i]=temp;
				
			}
			
		}
		for(int i=0;i<a.length;i++){
		    System.out.print(a[i] + " ");
		}

	}

}
