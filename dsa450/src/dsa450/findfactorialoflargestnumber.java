package dsa450;

import java.util.ArrayList;

public class findfactorialoflargestnumber {

	public static void main(String[] args) {
		 ArrayList <Integer> result=new ArrayList<>();
	        int c=0;
	        int size=1;
	        result.add(0,1);
	        int val=2;
	        while(val<=N){
	            for(int i=size-1;i>=0;i--){
	               int temp=result.get(i)*val+c;
	               result.set(i,temp%10);
	               c=temp/10;
	            }
	            while(c!=0){
	                result.add(0,c%10);
	                c=c/10;
	                size++;
	            }
	            
	            val++;
	        }
	        return result;

	}

}
