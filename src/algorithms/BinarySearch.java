package algorithms;

import java.util.Arrays;

public class BinarySearch {
    public int applyBinarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length;

        Arrays.sort(array);

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;
            }

            if (array[mid] < target) {
                left = mid + 1;
            } else { right = mid - 1; }
        }

        return -1;
    }
}
