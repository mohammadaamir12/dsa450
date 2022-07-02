package dsa450;
import java.util.Scanner;

public class Kadanealgodsa15 {
	
public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the size of Array");
			int n=sc.nextInt();
			int a[]=new int[n];
			System.out.println("Enter the element of Array");
			for(int i=0;i<n;i++){
			    a[i]=sc.nextInt();
			}
			int max=Integer.MIN_VALUE;
			int maxhere=0;
			for(int i=0;i<n;i++){
			    maxhere=maxhere+a[i];
			    if(maxhere>max) {
			    	max=maxhere;
			    }
			    if(maxhere<0) {
			    	maxhere=0;
			    }
			}
			
				System.out.println(max);
			

		}

	}


