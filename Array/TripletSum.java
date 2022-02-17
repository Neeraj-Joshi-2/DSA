import java.util.Arrays;
public class TripletSum {
    
    static boolean tripleSum(int arr[], int X){
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int l = i+1 ;
            int r = arr.length-1;
            int target = X-arr[i] ;
            while(l<r){
                if(arr[l] + arr[r] == target){
                    return true ;
                }
                else if(arr[l] + arr[r] < target){
                    l+=1; 
                }
                else{
                    r-=1 ;
                }
            }
        }
        return false ;
    }
    public static void main(String[] args) {
        int arr[]={1, 4, 45, 6, 10, 8} ;
        int target = 13;
        System.out.println(tripleSum(arr,target));
    }
}
