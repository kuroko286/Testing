package TestDongDuLieu.driver;

public class Driver {
    public int maxArr(int[] arr, int n) {
        int currMax = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (currMax < arr[i]) {
                currMax = arr[i];
            }
        }
        return currMax;
    }
}
