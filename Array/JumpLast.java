class JumpLast {

    // Dynamic Programming

    private static int minJumps(int[] arr, int n) {
        int jumps[] = new int[n];
        int i, j;

        if (n == 0 || arr[0] == 0)
            return Integer.MAX_VALUE;

        jumps[0] = 0;

        for (i = 1; i < n; i++) {
            jumps[i] = Integer.MAX_VALUE;
            for (j = 0; j < i; j++) {
                if (i <= j + arr[j] && jumps[j] != Integer.MAX_VALUE) {
                    jumps[i] = Math.min(jumps[i], jumps[j] + 1);
                    break;
                }
            }
        }
        return jumps[n - 1];
    }

    // Greedy Approach

    public static int minJump(int[] nums) {
        int jumps = 0, currentJumpEnd = 0, farthest = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);
            if (i == currentJumpEnd) {
                jumps++;
                currentJumpEnd = farthest;
            }
        }
        return jumps;
    }

    //Recursive Approach
    static int minJumps_(int arr[], int l, int h) {

        if (h == l)
            return 0;

        if (arr[l] == 0)
            return Integer.MAX_VALUE;

        int min = Integer.MAX_VALUE;
        for (int i = l + 1; i <= h && i <= l + arr[l]; i++) {
            int jumps = minJumps_(arr, i, h);
            if (jumps != Integer.MAX_VALUE && jumps + 1 < min)
                min = jumps + 1;
        }
        return min;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 2 };

        System.out.println("Minimum number of jumps to reach end is : " + minJumps(arr, arr.length));
        System.out.println("Minimum number of jumps to reach end is : " + minJump(arr));
        System.out.println("Minimum number of jumps to reach end is : " + minJumps_(arr, 0, arr.length - 1));
    }
}
