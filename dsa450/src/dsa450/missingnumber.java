package dsa450;

public class missingnumber {

	public static void main(String[] args) {
		int[]nums= {3,0,1,2};
        int res=0;
        int n=nums.length;
        for(int i=0;i<=n;i++){
           res=res^i; 
        }
        for(int j=0;j<nums.length;j++){
            res=res^nums[j];
        }
System.out.println(res);

	}

}
