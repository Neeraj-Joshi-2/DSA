import java.util.Arrays;

public class FindDuplicate {

    static int floydMethod(int arr[]){
        if (arr.length > 1)
        {
            int slow = arr[0];
            int fast = arr[arr[0]];

            while (slow != fast)
            {
                slow = arr[slow];
                fast = arr[arr[fast]];
            }

            fast = 0;
            while (fast != slow)
            {
                fast = arr[fast];
                slow = arr[slow];
            }
            return slow;
        }
        return -1;
    }

    static int binarySearchMethod(int arr[]) {
        int n = arr.length - 1;
        int low = 1;
        int high = n;
        int mid;
        while (low < high) {
            mid = (low + high) / 2;
            int count = 0;
            for (int num : arr) {
                if (num <= mid)
                    count++;
            }
            if (count > mid)
                high = mid;
            else
                low = mid + 1;
        }
        return low;
    }

    static int sortingMethod(int arr[]) {

        int duplicate = 0;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                duplicate = arr[i];
                break;
            }
        }
        return duplicate;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 1, 3, 2, 2 };
        System.out.println(sortingMethod(arr));
        System.out.println(binarySearchMethod(arr));
        System.out.println(floydMethod(arr));
    }

}
