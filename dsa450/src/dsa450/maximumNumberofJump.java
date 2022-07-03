package dsa450;
import java.util.Scanner;
public class maximumNumberofJump {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the element of Array");
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		int pos=a[0];
		int step=a[0];
		int jump=1;
		for(int i=1;i<n;i++) {
			if(a[i]+i>pos) {
				pos=a[i]+i;
				step--;
			}
			if(step==0) {
				jump++;
				step=pos-i;
			}
		}
		System.out.println(jump);

	}

}
