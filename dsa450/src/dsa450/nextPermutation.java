package dsa450;
import java.util.*;
public class nextPermutation {

	public static void main(String[] args) {
		int idx=-1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int n=sc.nextInt();
		int nums[]=new int[n];
		System.out.println("Enter element of Array");
		for(int i=0;i<n;i++){
		    nums[i]=sc.nextInt();
		}
			    int i=nums.length-2;
			        while(i>=0 && nums[i]>=nums[i+1])i--;
			        if(i>=0){
			            int j=nums.length-1;
			            while(nums[j]<=nums[i]) j--;
			            swap(nums,i,j);
			        }
			        reverse(nums,i+1,nums.length-1);
			       
			        System.out.print(Arrays.toString(nums));
			        
	}
			    public static void swap(int []nums,int i,int j) {
					int temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			    public static void reverse(int []nums,int i,int j) {
					 
					while(i<j) swap(nums,i++,j--);
						
			}
	

}
