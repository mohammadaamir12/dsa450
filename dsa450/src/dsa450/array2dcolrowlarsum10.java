package dsa450;

import java.util.Scanner;

public class array2dcolrowlarsum10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a[][]=new int[n][m];
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++) {
				System.out.println("enter element at"+i+"row"+j+"column");
		    a[i][j]=sc.nextInt();
			}
		}
		int rlarge=Integer.MIN_VALUE;
		 for(int k=0;k<a.length;k++){
	            int sum=0;
	            for(int p=0;p<a[0].length;p++){
	                sum=sum+a[k][p];
	            }
	            if(sum>rlarge) {
	            	rlarge=sum;
	            	
	            }
	          
	        }
		 System.out.print("Largest row sum "+rlarge);
		 
		 int clarge=Integer.MIN_VALUE;
		 for(int k=0;k<a[0].length;k++)
		{
	            int l=0;
	            for(int p=0;p<a.length;p++)
	           {
	                l=l+a[k][p];
	            }
	            if(l>clarge) {
	            	clarge=l;
	            	
	            }
	            
	        }
		 System.out.print("Largest column sum "+clarge);
	}
	}


