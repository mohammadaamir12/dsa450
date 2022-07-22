package dsa450;

public class buyandsellstocktwice {

	public static void main(String[] args) {
		int []prices= {5,1,6,3,2,4};
		int profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                profit+=prices[i]-prices[i-1];
            }
        }
        System.out.println(profit);

	}

}
