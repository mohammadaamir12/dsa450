package dsa450;
import java.util.*;
public class countinversion2 {
	public static void main(String[] args)
	{
		int[] arr = { 8,4,2,1};
		int[] aux = Arrays.copyOf(arr, arr.length);
		System.out.println("The inversion count is " + mergesort(arr, aux, 0, arr.length - 1));
	}
	
	public static int mergesort(int[] arr, int[] aux, int low, int high)
	{
		if (high <= low) {		
			return 0;
		}

		int mid = (low + ((high - low) >> 1));
		int inversionCount = 0;
		
		inversionCount += mergesort(arr, aux, low, mid);

		
		inversionCount += mergesort(arr, aux, mid + 1, high);

		inversionCount += merge(arr, aux, low, mid, high);

		return inversionCount;
	}
	public static int merge(int[] arr, int[] aux, int low, int mid, int high)
	{
		int k = low, i = low, j = mid + 1;
		int inversionCount = 0;

		while (i <= mid && j <= high)
		{
			if (arr[i] <= arr[j]) {
				aux[k++] = arr[i++];
			}
			else {
				aux[k++] = arr[j++];
				inversionCount += (mid - i + 1);	
			}
		}

		while (i <= mid) {
			aux[k++] = arr[i++];
		}

		for (i = low; i <= high; i++) {
			arr[i] = aux[i];
		}

		return inversionCount;
	}
	
	
	
	
}
