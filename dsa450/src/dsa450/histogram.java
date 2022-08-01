package dsa450;

public class histogram {

	public static void main(String[] args) {
		int a[]= {4,2,1,5,6,3,2,4,2};
		int n=a.length;
		int Maxarea=0;
		for(int i=0;i<n;i++) {
			 int minHeight = Integer.MAX_VALUE;
	            for (int j = i; j < n; j++) {
	              minHeight = Math.min(minHeight, a[j]);
	              Maxarea = Math.max(Maxarea, minHeight * (j - i + 1));
	            }
     
		}
		System.out.println(Maxarea);
	}

}
