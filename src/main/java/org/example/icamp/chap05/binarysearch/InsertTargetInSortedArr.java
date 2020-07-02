package org.example.icamp.chap05.binarysearch;

public class InsertTargetInSortedArr {

    public int insertAt(int[] a, int target) {

        if (a == null) return -1;

        int low = 0, high = a.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            //if target is less than or equal to mid element
            if (target >= a[mid]) {

                //if mid is hi end, return hi+1
                if (mid == high) {
                    return high + 1;
                }
                low = mid + 1;       // move right
            } else {  // when target is less than mid element

                //if mid is lo end, return lo
                if (mid == low) {
                    return mid;
                }

                high = mid - 1;       // move left
            }

        }

        return low;  // empty array
    }

    private int calculateDiff(int[] a, int mid, int target, int currentDiff) {
        return Math.min(a[mid] - target, currentDiff);
    }
}
