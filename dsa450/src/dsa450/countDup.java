package dsa450;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class countDup {

	public static void main(String[] args) {
		String s="mightandmagic";
		String r="andmagicmigth";
		char []a=s.toCharArray();
		char []b=r.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		Boolean result=Arrays.equals(a, b);
		
		if(result==true) {
			System.out.println("Two Strings Are Equal");
		}
		else {
			System.out.println("Two Strings Are not Equal");
		}
		
	}

}
