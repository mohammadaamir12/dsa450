package dsa450;
import java.util.*;
public class counterpairwithgivensum {

	public static void main(String[] args) {
		int a[]= {1,5,7,1};
		int n=a.length;
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		getPairsCount(a,n,k);

	}
	
	static void getPairsCount(int[] arr, int n, int k) {
		HashMap<Integer,Integer> m=new HashMap<>();
        int counter =0;
        for(int i=0;i<n;i++){
            if(arr[i]<k){
               int element=k-arr[i];
                if(m.containsKey(element)){
                    counter+=m.get(element);
                }
                if(m.get(arr[i])==null){
                    m.put(arr[i],0);
                }
                m.put(arr[i],m.get(arr[i])+1);
            }
        }
       System.out.println(counter); 
    }

}
