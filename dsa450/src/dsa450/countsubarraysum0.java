package dsa450;

import java.util.HashMap;

public class countsubarraysum0 {

	public static void main(String[] args) {
		 int[]arr= {4,2,0,1,6};
		  int n=arr.length;
		  
		  findsum(arr,n);
		  if(findsum(arr,n)==false) {
			  System.out.println("No");
		  }
		  else {
			  System.out.println("Yes");
		  }

	}
	
	 static boolean findsum(int arr[],int n)
	    {
	      HashMap<Integer, Integer> hM =  new HashMap<Integer, Integer>(); 
	              
	            int sum = 0;      
	              
	           
	            for (int i = 0; i < arr.length; i++) 
	            {  
	               
	                sum += arr[i]; 
	                  
	              
	                if (sum == 0 || hM.get(sum) != null)                          
	                    return true; 
	                  
	                hM.put(sum, i); 
	            }  
	            return false;
	    }

}
