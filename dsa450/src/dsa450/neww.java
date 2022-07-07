package dsa450;
import java.util.*;

public class neww {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        int a[]=new int[n];
	        for(int i=0;i<n;i++){
	            a[i]=sc.nextInt();
	        }

	         int sum=0;
	         int j=0;
	        for( j=0;j<n;j++){
	           sum+=a[j];
	        }
	        
	        System.out.print(sum);
	}
}
