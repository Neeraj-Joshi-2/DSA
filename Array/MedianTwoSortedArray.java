//different size arrays
class MedianTwoSortedArray {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int index1 = 0;
        int index2 = 0;
        int med1 = 0;
        int med2 = 0;
        for (int i = 0; i <= (nums1.length + nums2.length) / 2; i++) {
            med1 = med2;
            if (index1 == nums1.length) {
                med2 = nums2[index2];
                index2++;
            } else if (index2 == nums2.length) {
                med2 = nums1[index1];
                index1++;
            } else if (nums1[index1] < nums2[index2]) {
                med2 = nums1[index1];
                index1++;
            } else {
                med2 = nums2[index2];
                index2++;
            }
        }

        if ((nums1.length + nums2.length) % 2 == 0) {
            return (float) (med1 + med2) / 2;
        }

        return med2;
    }
    public static void main(String[] args) {
        int nums1[] = {1,3} ;
        int nums2[] = {2} ;
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
}
/*
// Java program for the above approach
import java.io.*;
import java.util.Arrays;

public class MedianTwoSortedArray {
	public static int Solution(int[] arr)
	{
		int n = arr.length;
	
		// If length of array is even
		if (n % 2 == 0)
		{
			int z = n / 2;
			int e = arr[z];
			int q = arr[z - 1];

			int ans = (e + q) / 2;
			return ans;
		}
	
		// If length if array is odd
		else
		{
			int z = Math.round(n / 2);
			return arr[z];
		}
	}

	// Driver Code
	public static void main(String[] args)
	{
		
		int[] arr1 = { -5, 3, 6, 12, 15 };
		int[] arr2 = { -12, -10, -6, -3, 4, 10 };

		int i = arr1.length;
		int j = arr2.length;

		int[] arr3 = new int[i + j];

		// Merge two array into one array
		System.arraycopy(arr1, 0, arr3, 0, i);
		System.arraycopy(arr2, 0, arr3, i, j);

		// Sort the merged array
		Arrays.sort(arr3);

		// calling the method
		System.out.print("Median = " + Solution(arr3));
	}
}
// This code is contributed by Manas Tole

*/