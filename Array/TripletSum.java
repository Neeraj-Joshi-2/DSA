import java.util.Arrays;
import java.util.HashSet;

public class TripletSum {

    static boolean tripleSum(int arr[], int X) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int l = i + 1;
            int r = arr.length - 1;
            int target = X - arr[i];
            while (l < r) {
                if (arr[l] + arr[r] == target) {
                    return true;
                } else if (arr[l] + arr[r] < target) {
                    l += 1;
                } else {
                    r -= 1;
                }
            }
        }
        return false;
    }

    static boolean find3Numbers(int A[],int arr_size, int sum)
    {
        for (int i = 0; i < arr_size - 2; i++) {
            HashSet<Integer> s = new HashSet<Integer>();
            int curr_sum = sum - A[i];
            for (int j = i + 1; j < arr_size; j++)
            {
                if (s.contains(curr_sum - A[j]))
                {
                    System.out.printf("Triplet is %d %d, %d", A[i],A[j], curr_sum - A[j]);
                    return true;
                }
                s.add(A[j]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 45, 6, 10, 8 };
        int target = 13;
        System.out.println(tripleSum(arr, target));
    }
}
