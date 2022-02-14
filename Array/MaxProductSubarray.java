
public class MaxProductSubarray {
    /*
    public static int maxSubarrayProduct(int arr[], int n) {
        int max_ending_here = arr[0];
        int min_ending_here = arr[0];
        int max_so_far = arr[0];

        for (int i = 1; i < n; i++) {
            int temp = Math.max(arr[i], arr[i] * max_ending_here, arr[i] * min_ending_here);
            min_ending_here = Math.min(arr[i], arr[i] * max_ending_here, arr[i] * min_ending_here);
            max_ending_here = temp;
            max_so_far = Math.max(max_so_far, max_ending_here);
        }
        return max_so_far;
    }
    */

    public static int maxProduct(int arr[], int n) {

        int maxProd = arr[0];

        for (int i = 0; i < n; i++) {
            int curProd = arr[i];
            for (int j = i + 1; j < n; j++) {
                curProd = curProd * arr[j];
                maxProd = Math.max(maxProd, curProd);
            }
            maxProd = Math.max(maxProd, curProd);
        }
        return maxProd;
    }

    public static void main(String[] args) {
        int arr[] = { 6, -3, -10, 0, 2 };
        System.out.println(maxProduct(arr, arr.length));
    }

}
