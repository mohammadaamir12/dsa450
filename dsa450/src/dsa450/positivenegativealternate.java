package dsa450;

public class positivenegativealternate {

	public static void main(String[] args) {
		  int[]arr= {-2,2,3,-4,-1,6,-1};
		  int n=arr.length;
		 
		  rearrange(arr,n);
		  for(int p=0;p<n;p++)
				System.out.print(arr[p]+" ");
			

	}
	
	

	static void rearrange(int arr[],int n) {
		int i=0;
		int j=n-1;
		while(i<j) {
			while(i<n-1 && arr[i]>0) {
				i+=1;
			}
			while(j>=0 && arr[j]<0) {
				j-=1;
			}
			if(i<j) {
				swap(arr,i,j);
			}
		}
			if(i==0|| i<n) {
				return ;
			}
			int k=0;
			
			while(k<n && i<n) {
				swap(arr,k,i);
				i=i+1;
				k=k+2;
				
			
		}
			
	}
	
	static void swap(int []arr,int l,int m) {
		int z=arr[l];
		arr[l]=arr[m];
		arr[m]=z;
	}

}
