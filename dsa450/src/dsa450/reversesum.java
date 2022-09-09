package dsa450;

import java.util.Arrays;

public class reversesum {

	public static void main(String[] args) {
		int arr[]= {2,4,7,2};
		int x=0;
		for(int i=0;i<arr.length;i++) {
			x=(x*10)+arr[i];
		}
		int y=0;
		for(int i=arr.length-1;i>=0;i--) {
			y=(y*10)+arr[i];
		}
		int sum=x+y;
		System.out.println(sum);
		String s=Integer.toString(sum);
		char[]a=s.toCharArray();
		for(char b:a) {
			System.out.println(b);
		}
	}

}
