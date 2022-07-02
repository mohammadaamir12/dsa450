package dsa450;
import java.util.*;

public class reverseandarraywith2pointer {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+ " ");
	}
		Reverse(arr);
		System.out.print(Arrays.toString(arr));
	}
	static void Reverse(int[] arr) {
		int start=0;
		int end=arr.length-1;
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}

}
