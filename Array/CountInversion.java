public class CountInversion {

    static int inversionCount(int arr[] , int N){
        int count = 0 ;

        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                if(arr[i]>arr[j]){
                    count+=1 ;
                }
            }
            
        }
        return count ;
    }
    public static void main(String[] args) {
        
        int arr[] = {2,4,1,3,5} ;
        System.out.println(inversionCount(arr, arr.length));

    }
    
}
