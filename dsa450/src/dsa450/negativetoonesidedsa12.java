package dsa450;
import java.util.*;
public class negativetoonesidedsa12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		int i=-1;
		int pivot=0;
		for(int j=0;j<n;j++) {
			if(a[j]<pivot) {
				i++;
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		for( i=0;i<n;i++){
		    System.out.print(a[i] + " ");
		}
	}
}
