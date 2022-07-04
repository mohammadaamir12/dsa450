package dsa450;

import java.util.*;

public class countInversion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the size of Array");
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}

		int p=arr.length;
		int temp[]=new int[n];
		int ans=mergeSort(arr,temp,0,n-1);
		System.out.println(ans);

	}

	static int mergeSort(int[] arr,int[]temp,int l,int r) {
		 int inv=0;
		 int mid;
		if (l<r) {
		
	        mid=(l+r)/2;
	        inv+= mergeSort(arr,temp,l, mid);
	        inv+= mergeSort(arr,temp,mid+1,r);
	        inv+= merge(arr,temp,l,mid+1,r);
		}
	       return inv;
	}

	private static int merge(int []arr,int []temp,int l,int mid,int r) {
		
	       
		int i=0;
		int j=0;
		int k=0;
		int swap=0;
		while(i<=mid-1 && j<=r) {
			if(arr[i]<=arr[j]) {
				temp[k++]=arr[i++];
				
			}
			else {
				temp[k++]=arr[j++];
				swap+=(mid-i);
			}
		}
		while(i<=mid-1) {
			temp[k++]=arr[i++];
			
		}
		
		while(j<=r) {
			temp[k++]=arr[j++];
			
		}
		
		for(i=l;i<=r;i++) {
			arr[i]=temp[i];
		}
		
		return swap;
	}

}
