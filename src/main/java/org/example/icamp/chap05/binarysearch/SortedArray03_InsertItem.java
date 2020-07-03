package org.example.icamp.chap05.binarysearch;

public class SortedArray03_InsertItem {

    public int insertAt(int[] a, int target) {
        if (a == null) return -1;

        int low = 0, high = a.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (target < a[mid]) {

                //if mid is low end, return mid index
                if (mid == low) {
                    return mid;
                }
                high = mid - 1;       // move left
            } else {
                //if mid is high end, return next index
                if (mid == high) {
                    return mid + 1;
                }
                low = mid + 1;       // move right
            }

        }

        return low;  // empty array
    }

}
