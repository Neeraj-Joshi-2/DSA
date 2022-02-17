public class TrapRainWater {

    static int getVolume(int bars[], int n) {
        int volume = 0, left = 0, right = n - 1;
        int l_max = bars[left], r_max = bars[right];
        while (left < right) {
            l_max = Math.max(bars[left], l_max);
            r_max = Math.max(bars[right], r_max);
            if (l_max <= r_max) {
                volume += l_max - bars[left];
                left += 1;
            } else {
                volume += r_max - bars[right];
                right -= 1;
            }
        }
        return volume;

    }

    public static void main(String[] args) {
        int arr[] = { 3, 0, 0, 2, 0, 4 };
        int n = arr.length;
        System.out.println(getVolume(arr, n));
    }

}
