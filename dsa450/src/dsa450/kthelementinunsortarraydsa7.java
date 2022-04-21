package dsa450;

import java.util.Scanner;

public class kthelementinunsortarraydsa7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Which index value you want?");
		int k=sc.nextInt();
		System.out.println("Enter the size of Array");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			
		}
		
		    System.out.print(a[k-1]);
		

	}

	}


