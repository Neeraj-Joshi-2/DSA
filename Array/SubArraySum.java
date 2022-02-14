import java.util.HashMap;

class SubArraySum {

    public static void subArraySum(int[] arr, int n, int sum) {
        int cur_sum = 0;
        int start = 0;
        int end = -1;
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            cur_sum = cur_sum + arr[i];

            if (cur_sum - sum == 0) {
                start = 0;
                end = i;
                break;
            }

            if (hashMap.containsKey(cur_sum - sum)) {
                start = hashMap.get(cur_sum - sum) + 1;
                end = i;
                break;
            }
            
            hashMap.put(cur_sum, i);

        }

        if (end == -1) {
            System.out.println("No subarray with given sum exists");
        } else {
            System.out.println("Sum found between indexes "
                    + start + " to " + end);
        }

    }

    //doesn't work for negative sum

    public static int subarraySum(int arr[], int n, int sum) {
        int curr_sum, i, j;

        for (i = 0; i < n; i++) {
            curr_sum = arr[i];

            for (j = i + 1; j <= n; j++) {
                if (curr_sum == sum) {
                    int p = j - 1;
                    System.out.println("Sum found between indexes " + i + " and " + p);
                    return 1;
                }
                if (curr_sum > sum || j == n)
                    break;
                curr_sum = curr_sum + arr[j];
            }
        }

        System.out.println("No subarray found");
        return 0;
    }

    public static void main(String[] args) {
        // SubArraySum arraysum = new SubArraySum();
        // int arr[] = { 4, 6, 4, -1, 2 };
        int arr[] = {1, 4, 20, 3, 10, 5};
        int n = arr.length;
        int sum = 33;
        subArraySum(arr, n, sum);
    }
}
