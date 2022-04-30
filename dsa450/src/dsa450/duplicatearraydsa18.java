package dsa450;

import java.util.Scanner;

public class duplicatearraydsa18 {
	
	 public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the size of Array");
			int n=sc.nextInt();
			int a[]=new int[n];
			System.out.println("Enter the size of Array");
			for(int i=0;i<n;i++){
			    a[i]=sc.nextInt();
			}
			int p=findDuplicate(a);
			System.out.println(p);
	 }
	 public static int findDuplicate(int[] nums) {
	        int n=nums.length;
	        int t=0;
	        for(int i=0;i<n;i++){
	            nums[nums[i]%n]=nums[nums[i]%n]+n;
	        }
	        for(int i=0;i<n;i++){
	            if(nums[i]/n>1){
	                t=i;
	            }
	        }
	        return t; 
	        
	
	    }
	 
	
}
