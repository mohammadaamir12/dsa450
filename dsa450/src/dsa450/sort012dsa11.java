package dsa450;
import java.util.*;
public class sort012dsa11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int c0=0;
		int c1=0;
		int c2=0;
		
		for(int i=0;i<n;i++) {
			if(a[i]==0) c0++;
			else if (a[i]==1) c1++;
			else  c2++;
		}
		int k=0;
		for(int i=0;i<c0;i++) a[k++]=0;
		for(int i=0;i<c1;i++) a[k++]=1;
		for(int i=0;i<c2;i++) a[k++]=2;
		
		for(int i=0;i<n;i++) {
		 System.out.println(a[i]+" ");
		}
		
	}

}
