//same size arrays

import java.util.*;

public class MedianTwoSortedArray_ {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int j = 0;
        int i = n - 1;
        while (nums1[i] > nums2[j] && j < n && i > -1) {
            int temp = nums1[i];
            nums1[i] = nums2[j];
            nums2[j] = temp;
            i--;
            j++;
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        return (nums1[n - 1] + nums2[0]) / 2;
    }

    public static void main(String[] args) {

        int nums1[] = {1, 12, 15, 26, 38};
        int nums2[] = {2, 13, 17, 30, 45};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

}
