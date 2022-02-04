// sort an array containing 0s , 1s and 2a without using sorting algorithm

//Method 1

class Sort012 {

    static void sort012(int a[], int arr_size) {
        int lo = 0;
        int hi = arr_size - 1;
        int mid = 0, temp = 0;
        while (mid <= hi) {
            switch (a[mid]) {
                case 0: {
                    temp = a[lo];
                    a[lo] = a[mid];
                    a[mid] = temp;
                    lo++;
                    mid++;
                    break;
                }
                case 1:
                    mid++;
                    break;
                case 2: {
                    temp = a[mid];
                    a[mid] = a[hi];
                    a[hi] = temp;
                    hi--;
                    break;
                }
            }
        }
    }

    static void printArray(int arr[], int arr_size) {
        int i;
        for (i = 0; i < arr_size; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }

    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 0, 1, 2};
        int arr_size = arr.length;
        sort012(arr, arr_size);
        System.out.println("Array after seggregation ");
        printArray(arr, arr_size);
    }
}




/*

//Method 1 (Count the number of 0’s, 1’s and 2’s. After Counting, put all 0’s first, then 1’s and lastly 2’s in the array)
public class Sort012 {

    static void sortArray(int arr[]) {

        int n = arr.length;
        int count0 = 0, count1 = 0, count2 = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                count0++;
            if (arr[i] == 1)
                count1++;
            if (arr[i] == 2)
                count2++;
        }

        for (int i = 0; i < count0; i++)
            arr[i] = 0;

        for (int i = count0; i < (count0 + count1); i++)
            arr[i] = 1;

        for (int i = (count0 + count1); i < n; i++)
            arr[i] = 2;

        printArray(arr, n);
    }

    static void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 0, 1, 2 };
        sortArray(arr);
    }
}

//Method 3 (alternative for above method)
import java.util.ArrayList;
import java.util.List;

class Sort012 {
    static int[] inputArray = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
    static List<Integer> outputArray = new ArrayList<>();
    static int indexOfOne = 0;

    static void print() {
        for (int item : inputArray) {
            if (item == 2) {
                outputArray.add(item);
            } else if (item == 1) {
                outputArray.add(indexOfOne, item);
                indexOfOne += 1;
            } else if (item == 0) {
                outputArray.add(0, item);
                indexOfOne += 1;
            } else {
                System.out.println(" wrong value - Aborting ");
                continue;
            }
        }
    }

    public static void main(String[] args) {
        print();
        for (int item : outputArray)
            System.out.print(item + ", ");
    }
}





*/
