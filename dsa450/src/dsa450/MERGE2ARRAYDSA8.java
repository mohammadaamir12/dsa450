package dsa450;

import java.util.Scanner;

public class MERGE2ARRAYDSA8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of First Array");
		int n=sc.nextInt();
		System.out.println("Enter the First Array");
		int a[]=new int[n];
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		System.out.println("Enter the size of Second Array");
		int m=sc.nextInt();
		System.out.println("Enter the Second Array");
		int b[]=new int[m];
		for(int i=0;i<m;i++){
		    b[i]=sc.nextInt();
		}
		
		int [] c=new int[a.length+b.length];
		int i=0;
		int j=0;
		int k=0;
		while( i<a.length &&  j<b.length) {
			if(a[i]<b[j]) {
				c[k]=a[i];
				i++;
				k++;
			}
			else {
				c[k]=b[j];
				j++;
				k++;
			}
		}
		
		while(i<a.length) {
			c[k]=a[i];
			i++;
			k++;
		}
		while(j<b.length) {
			c[k]=b[j];
			j++;
			k++;
		}
		
		for(int l=0;l<c.length;l++){
		    System.out.print(c[l]+" ");
		}

	}

}
