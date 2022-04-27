package dsa450;
import java.util.*;
public class minimumheightarraydsa16 {
	
	public static int getMinDiff(int[] arr, int n, int k) {
	        Arrays.sort(arr);
	        int ans=arr[n-1]-arr[0];
	        int smallest=arr[0]+k;
	        int largest=arr[n-1]-k;
	        for(int i=0;i<n-1;i++){
	            int min=Math.min(smallest,arr[i+1]-k);
	            int max=Math.max(largest,arr[i]+k);
	            if(min<0) continue;
	            ans=Math.min(ans,max-min);
	        }
	        return ans;
	    }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		System.out.println("height of tower");
		int k=sc.nextInt();
		int b=getMinDiff(arr,n,k);
		System.out.println(b);
	}
	
		

	

}
