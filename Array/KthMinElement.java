//kth max min element
//Method 1 (using TreeMap)
import java.util.*;

class KthMinElement {

	static int Kth_smallest(TreeMap<Integer, Integer> m,int k)
	{
		int freq = 0;
		for (Map.Entry it : m.entrySet())
		{
			freq += (int)it.getValue();

			if (freq >= k) {
				return (int)it.getKey();
			}
		}

		return -1; 
	}

	public static void main(String[] args)
	{
		int n = 5;
		int k = 3;
		int[] arr = { 12, 3, 5, 7, 19 };

		TreeMap<Integer, Integer> m = new TreeMap<>();

		for (int i = 0; i < n; i++) {
			m.put(arr[i], m.getOrDefault(arr[i], 0) + 1);
		}

		int ans = Kth_smallest(m, k);

		System.out.println("The " + k + "rd smallest element is " + ans);
	}
}


/*
//Method 2
import java.util.Arrays;

class KthMinElement {

	public static int kthSmallest(Integer[] arr,int k)
	{
		Arrays.sort(arr);
		return arr[k - 1];
	}
	public static void main(String[] args)
	{
		Integer arr[] = new Integer[] { 12, 3, 5, 7, 19 };
		int k = 2;
		System.out.print("K'th smallest element is " + kthSmallest(arr, k));
	}
}
*/