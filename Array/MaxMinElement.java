// max and min element from the array

// METHOD 1 (Simple Linear Search) 

public class MaxMinElement {

    static class Pair {
 
        int min;
        int max;
    }

    static Pair getMinMax(int arr[], int n) {
        Pair minmax = new Pair();
        int i;
 
        if (n == 1) {
            minmax.max = arr[0];
            minmax.min = arr[0];
            return minmax;
        }

        if (arr[0] > arr[1]) {
            minmax.max = arr[0];
            minmax.min = arr[1];
        } else {
            minmax.max = arr[1];
            minmax.min = arr[0];
        }
 
        for (i = 2; i < n; i++) {
            if (arr[i] > minmax.max) {
                minmax.max = arr[i];
            } else if (arr[i] < minmax.min) {
                minmax.min = arr[i];
            }
        }
 
        return minmax;
    }

    public static void main(String[] args) {
        int arr[] = {1000, 11, 445, 1, 330, 3000};
        int arr_size = 6;
        Pair minmax = getMinMax(arr, arr_size);
        System.out.printf("\nMinimum element is %d", minmax.min);
        System.out.printf("\nMaximum element is %d", minmax.max);
    }
    
}

/*
// METHOD 2 (Tournament Method) 
// Divide the array into two parts and compare the maximums and minimums of the two parts to get the maximum and the minimum of the whole array.


public class MaxMinArray {
	static class MaxMinArray {

		int min;
		int max;
	}

	static Pair getMinMax(int arr[], int low, int high) {
		Pair minmax = new Pair();
		Pair mml = new Pair();
		Pair mmr = new Pair();
		int mid;

		if (low == high) {
			minmax.max = arr[low];
			minmax.min = arr[low];
			return minmax;
		}

		if (high == low + 1) {
			if (arr[low] > arr[high]) {
				minmax.max = arr[low];
				minmax.min = arr[high];
			} else {
				minmax.max = arr[high];
				minmax.min = arr[low];
			}
			return minmax;
		}

		mid = (low + high) / 2;
		mml = getMinMax(arr, low, mid);
		mmr = getMinMax(arr, mid + 1, high);

		if (mml.min < mmr.min) {
			minmax.min = mml.min;
		} else {
			minmax.min = mmr.min;
		}

		if (mml.max > mmr.max) {
			minmax.max = mml.max;
		} else {
			minmax.max = mmr.max;
		}

		return minmax;
	}

	public static void main(String args[]) {
		int arr[] = {1000, 11, 445, 1, 330, 3000};
		int arr_size = 6;
		Pair minmax = getMinMax(arr, 0, arr_size - 1);
		System.out.printf("\nMinimum element is %d", minmax.min);
		System.out.printf("\nMaximum element is %d", minmax.max);

	}
}


// METHOD 3 (Compare in Pairs) 

public class MaxMinArray {

    static class Pair {

        int min;
        int max;
    }

    static Pair getMinMax(int arr[], int n) {
        Pair minmax = new Pair();
        int i;

        if (n % 2 == 0) {
            if (arr[0] > arr[1]) {
                minmax.max = arr[0];
                minmax.min = arr[1];
            } else {
                minmax.min = arr[0];
                minmax.max = arr[1];
            }
            i = 2;

        } else {
            minmax.min = arr[0];
            minmax.max = arr[0];
            i = 1;
        }

        while (i < n - 1) {
            if (arr[i] > arr[i + 1]) {
                if (arr[i] > minmax.max) {
                    minmax.max = arr[i];
                }
                if (arr[i + 1] < minmax.min) {
                    minmax.min = arr[i + 1];
                }
            } else {
                if (arr[i + 1] > minmax.max) {
                    minmax.max = arr[i + 1];
                }
                if (arr[i] < minmax.min) {
                    minmax.min = arr[i];
                }
            }
            i += 2;
        }

        return minmax;
    }

    public static void main(String args[]) {
        int arr[] = { 1000, 11, 445, 1, 330, 3000 };
        int arr_size = 6;
        Pair minmax = getMinMax(arr, arr_size);
        System.out.printf("\nMinimum element is %d", minmax.min);
        System.out.printf("\nMaximum element is %d", minmax.max);

    }
}

*/
