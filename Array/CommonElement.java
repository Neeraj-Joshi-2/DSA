
class CommonElement {

    void findCommon(int ar1[], int ar2[], int ar3[])
    {
        int i = 0, j = 0, k = 0;

        while (i < ar1.length && j < ar2.length && k < ar3.length)
        {
             if (ar1[i] == ar2[j] && ar2[j] == ar3[k])
             {   System.out.print(ar1[i]+" ");   i++; j++; k++; }

             else if (ar1[i] < ar2[j])
                 i++;
 
             else if (ar2[j] < ar3[k])
                 j++;
 
             else
                 k++;
        }
    }

    void findCommonWithDuplicates(int ar1[], int ar2[], int ar3[]) {

        int i = 0, j = 0, k = 0;
        int n1 = ar1.length;
        int n2 = ar2.length;
        int n3 = ar3.length;

        int prev1, prev2, prev3;

        prev1 = prev2 = prev3 = Integer.MIN_VALUE;

        while (i < n1 && j < n2 && k < n3) {

            while (i < n1 && ar1[i] == prev1)
                i++;

            while (j < n2 && ar2[j] == prev2)
                j++;

            while (k < n3 && ar3[k] == prev3)
                k++;

            if (i < n1 && j < n2 && k < n3) {

                if (ar1[i] == ar2[j] && ar2[j] == ar3[k]) {
                    System.out.print(ar1[i] + " ");
                    prev1 = ar1[i];
                    prev2 = ar2[j];
                    prev3 = ar3[k];
                    i++;
                    j++;
                    k++;
                }

                else if (ar1[i] < ar2[j]) {
                    prev1 = ar1[i];
                    i++;
                }

                else if (ar2[j] < ar3[k]) {
                    prev2 = ar2[j];
                    j++;
                }

                else {
                    prev3 = ar3[k];
                    k++;
                }
            }
        }
    }

    public static void commonElementsWithDuplicates(int[] arr1, int[] arr2, int[] arr3) {

        int n1=arr1.length, n2=arr2.length, n3=arr3.length ;

        int max = Integer.MIN_VALUE;

        int res1 = 1;
        for (int i = 1; i < n1; i++) {
            max = Math.max(arr1[i], max);
            if (arr1[i] != arr1[res1 - 1]) {
                arr1[res1] = arr1[i];
                res1++;
            }
        }

        int res2 = 1;
        for (int i = 1; i < n2; i++) {
            max = Math.max(arr2[i], max);
            if (arr2[i] != arr2[res2 - 1]) {
                arr2[res2] = arr2[i];
                res2++;
            }
        }

        int res3 = 1;
        for (int i = 1; i < n3; i++) {
            max = Math.max(arr3[i], max);
            if (arr3[i] != arr3[res3 - 1]) {
                arr3[res3] = arr3[i];
                res3++;
            }
        }

        int[] freq = new int[max + 1];

        for (int i = 0; i < res1; i++)
            freq[arr1[i]]++;
        for (int i = 0; i < res2; i++)
            freq[arr2[i]]++;
        for (int i = 0; i < res3; i++)
            freq[arr3[i]]++;

        for (int i = 0; i <= max; i++)
            if (freq[i] == 3)
                System.out.print(i + " ");
    }

    public static void main(String args[]) {
        CommonElement ob = new CommonElement();

        int ar1[] = { 1, 5, 10, 20, 40, 80, 80 };
        int ar2[] = { 6, 7, 20, 80, 80, 100 };
        int ar3[] = { 3, 4, 15, 20, 30, 70, 80, 80, 120 };

        System.out.print("Common elements are ");

        ob.findCommonWithDuplicates(ar1, ar2, ar3);
    }
}
