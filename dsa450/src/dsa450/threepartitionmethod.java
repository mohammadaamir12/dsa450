package dsa450;

public class threepartitionmethod {

	public static void main(String[] args) {
		   int[]arr= {1,2,3,3,4};
		   int a=1;
		   int b=2;
		  partition(arr,a,b); 
		  

	}

	private static void partition(int[] arr, int a, int b) {
	    int l=0;
	    int r=arr.length-1;
	    int i=0;
	    for(i=0;i<=r;i++) {
	    	if(arr[i]<a) {
	    		swap(arr,l,i);
	    		l++;
	    	}
	    	else if(arr[i]>b){
	    		swap(arr,r,i);
	    		r--;
	    		i--;
	    		
	    	}
	    }
	    
	    for(int j=0;j<arr.length;j++) {
	    	System.out.println(arr[j]);
	    }
	    
		
	}

	private static void swap(int[] arr, int l, int r) {
		int temp=arr[l];
		arr[l]=arr[r];
		arr[r]=temp;
		
	}

}
