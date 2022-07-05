package dsa450;

import java.util.*;

public class buyAndSellStock {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the size of Array");
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		int buy=0;
		int sell=0;
		int max=0;
		int profit;
        for(int i=0;i<n;i++) {
        	buy=a[i];
        	for(int j=i+1;j<n;j++) {
        		sell=a[j];
        		if(sell>buy) {
        			profit=sell-buy;
        			if(profit>max) {
        				max=profit;
        			}
        		}
        	}
        }
        System.out.println(max);

	}

}
