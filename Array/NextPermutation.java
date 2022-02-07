public class NextPermutation {

    public static void reverse(int[] nums, int i) {
        int j = nums.length-1 ;
        while(i < j) {
            swap(nums, i++, j--);
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    static public void nextPermutation(int nums[]){
        int i = nums.length-1 , j = nums.length-1 ;
        while(i>0 && nums[i-1]>=nums[i]){
            i-=1;
        }
        if (i==0){
            reverse(nums, i);
            return ;
        }
        int k=i-1 ;
        while(nums[j]<=nums[k]){
            j-=1;
        }

        int temp ;
        temp = nums[k] ;
        nums[k] = nums[j]  ;
        nums[j] = temp ;

        int l = k+1 ;
        int r = nums.length-1 ;
        while(l<r){
            temp = nums[l] ;
            nums[l] = nums[r];
            nums[r] = temp ;
            l+=1 ;
            r-=1 ;
        }
    }

    public static void main(String[] args) {
        int nums[] = {1,3,4,9,8,4} ;
        nextPermutation(nums);
        for (int i : nums) {
            System.out.print(i+" ");
        }

        
    }
    
}
