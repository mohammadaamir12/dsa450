package dsa450;

public class numbersof1 {

	public static void main(String[] args) {
		 int sum=0;
		 int n=12;
	        while(n!=0){
	            n=n&(n-1);
	            sum++;
	        }
        System.out.println(sum);

	}

}
