package dsa450;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class unionoftwoarraydsa13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the size of Array");

		int m=sc.nextInt();
		int b[]=new int[m];
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		for(int i=0;i<m;i++){
		    b[i]=sc.nextInt();
		}
		Set<Integer> set=new HashSet<>();
	       for(int x:a){
	           set.add(x);
	       }
	       for(int x:b){
	           set.add(x);
	       }
	       System.out.println(set.size());
	}

}
