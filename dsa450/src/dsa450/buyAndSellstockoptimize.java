package dsa450;

import java.util.Scanner;

public class buyAndSellstockoptimize {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the size of Array");
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		int maxprofit=0;
		int min=Integer.MAX_VALUE;
				
		for(int i=0;i<n;i++) {
			if(min>a[i]) {
				min=a[i];
			}
			else if(a[i]-min>maxprofit){
				maxprofit=a[i]-min;
				}
		}
		System.out.println(maxprofit);

	}

}
