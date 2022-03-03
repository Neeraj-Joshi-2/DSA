public class MakePalindrome {
    static int merge(int arr[], int N) {
        int ans = 0;
        int i = 0;
        int j = N - 1;
        while (i < j) {
            if (arr[i] == arr[j]) {
                i++;
                j--;
            } else if (arr[i] > arr[j]) {
                j--;
                arr[j] += arr[j + 1];
                ans++;
            } else {
                i++;
                arr[i] += arr[i - 1];
                ans++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 10,5,5,30,20, 10 };
        System.out.println(merge(arr, arr.length));

    }

}
