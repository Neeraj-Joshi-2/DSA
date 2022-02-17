import java.util.Arrays;
import java.util.HashSet;

public class Subset {

    static String isSubset(int a1[], int a2[], int n, int m) {
        int count=0 ;
        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n; j++){
                if(a2[i]==a1[j]){
                    count++;
                }
            }
        }
        
        if(count==m){
            return "Yes" ;
        }
        else{
            return "No" ;
        }
    }

    static boolean isSubset_(int arr1[],int arr2[],int m,int n)
    {
        int i = 0, j = 0;
 
        if (m < n)
            return false;
 
        Arrays.sort(arr1); 
        Arrays.sort(arr2);
 
        while (i < n && j < m) {
            if (arr1[j] < arr2[i])
                j++;
            else if (arr1[j] == arr2[i]) {
                j++;
                i++;
            }
            else if (arr1[j] > arr2[i])
                return false;
        }
 
        if (i < n)
            return false;
        else
            return true;
    }

    static boolean isSubset__(int arr1[],int arr2[], int m,int n)
    {
        HashSet<Integer> hset = new HashSet<>();
 
        // hset stores all the values of arr1
        for (int i = 0; i < m; i++) {
            if (!hset.contains(arr1[i]))
                hset.add(arr1[i]);
        }
 
        // loop to check if all elements
        //  of arr2 also lies in arr1
        for (int i = 0; i < n; i++)
        {
            if (!hset.contains(arr2[i]))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int a1[] = {11, 1, 13, 21, 3, 7} ;
        int a2[] = {11, 3, 7, 1} ;
        System.out.println(isSubset(a1, a2, 6, 4));
        
    }
    
}
