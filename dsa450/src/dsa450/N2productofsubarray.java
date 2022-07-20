package dsa450;

public class N2productofsubarray {

	public static void main(String[] args) {
		 long max = Integer.MIN_VALUE;
		 int []arr={6, -3, -10, 0, 2};
	      int n=  arr.length;
	        for (int i = 0; i < n; i++) {
	            max = Math.max(arr[i], max);
	            long product = arr[i];
	            for (int j = i+1; j < n; j++) {
	                product *= arr[j];
	                max = Math.max(product, max);
	            }
	        }
	        System.out.print(max+" ");

	}

}
