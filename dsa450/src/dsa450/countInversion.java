package dsa450;

import java.util.*;

public class countInversion {

	public static void main(String[] args) {
		
         int[]arr= {8,4,2,1};
		int n=arr.length;
		int temp[]=new int[n];
		int ans=mergeSort(arr,temp,0,n-1);
		System.out.println(ans);

	}

	static int mergeSort(int[] arr,int[]temp,int l,int r) {
		 int inv=0;
		
		 if (r <= l) {        
	            return 0;
	        }
		
			int mid = (l + ((r - l) >> 1));
	        inv+= mergeSort(arr,temp,l, mid);
	        inv+= mergeSort(arr,temp,mid+1,r);
	        inv+= merge(arr,temp,l,mid,r);
	        return inv;
		}
	      
	

	private static int merge(int []arr,int []temp,int l,int mid,int r) {
		
	       
		int i=0;
		int j=mid+1;
		int k=0;
		int swap=0;
		while(i<=mid && j<=r) {
			if(arr[i]<=arr[j]) {
				temp[k++]=arr[i++];
				
			}
			else {
				temp[k++]=arr[j++];
				swap+=(mid-i+1);
			}
		}
		while(i<=mid) {
			temp[k++]=arr[i++];
			
		}
		
		
		for(i=l;i<=r;i++) {
			arr[i]=temp[i];
		}
		
		return swap;
	}

}
