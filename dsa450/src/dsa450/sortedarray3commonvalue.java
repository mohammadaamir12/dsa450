package dsa450;

import java.util.*;

public class sortedarray3commonvalue {

	public static void main(String[] args) {
		 
        int ar1[] = { 3,3,3 };
        int ar2[] = { 3,3,3 };
        int ar3[] = {3,3,3 };
 
        System.out.print("Common elements are ");
        findCommon(ar1, ar2, ar3);
	}
	
	 static void findCommon(int ar1[], int ar2[], int ar3[]){
		int i=0;
		int j=0;
		int k=0;
		int l=0;
		int n1=ar1.length;
		int n2=ar2.length;
		int n3=ar3.length;
		while(i<n1 && j<n2 && k<n3) {
			if(ar1[i]==ar2[j]  &&  ar2[j]==ar3[k] && ar1[i]!=l) {
				System.out.print(ar1[i]);
				l=ar1[i];
			i++;j++;k++;
			
			
			}
			else if(ar2[j]<ar3[k]) {
				j++;
			}
			else if(ar1[i]<ar3[k]) {
				i++;
			}
			else {
				k++;
			}
		}
	}

}
