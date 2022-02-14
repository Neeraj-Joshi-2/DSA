import java.util.HashMap;

public class SubArraySum_ {

    public static void sumZero(int[] arr, int n) {
        int cur_sum = 0;
        int start = 0;
        int end = -1;
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            cur_sum = cur_sum + arr[i];

            if (cur_sum == 0) {
                start = 0;
                end = i;
                break;
            }

            if (hashMap.containsKey(cur_sum)) {
                start = hashMap.get(cur_sum) + 1;
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

    static void sumZero_(int arr[], int n) {
        int curr_sum, i, j;
        for (i = 0; i < n; i++) {
            curr_sum = arr[i];

            for (j = i + 1; j <= n; j++) {
                if (curr_sum == 0) {
                    int p = j - 1;
                    System.out.println("Sum found between indexes " + i + " and " + p);

                }
                if (j == n)
                    break;
                curr_sum = curr_sum + arr[j];
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, -3, 1, 6 };
        sumZero(arr, arr.length);
    }

}
