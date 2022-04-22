package dsa450;

import java.util.Scanner;

public class insertionsortdsa9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		for(int i=1;i<a.length;i++) {
			int j=i-1;
			int temp=a[i];
			while(j>=0 && a[j]>=temp) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
		}
		for(int i=0;i<a.length;i++){
		    System.out.print(a[i] + " ");
		}


	}

}
