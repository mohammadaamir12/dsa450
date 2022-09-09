package dsa450;

import java.util.HashSet;

public class duplicateremove {

	public static void main(String[] args) {
		int a[]= {1,1,3,5,2,2};
		HashSet<Integer> set=new HashSet<>();
         for(int i=0;i<a.length;i++) {
        	 set.add(a[i]);
         }
         System.out.println(set);
	}

}
