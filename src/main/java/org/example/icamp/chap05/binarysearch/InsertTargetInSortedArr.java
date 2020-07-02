package org.example.icamp.chap05.binarysearch;

public class InsertTargetInSortedArr {

    public int insertAt(int[] a, int target) {
        if (a == null) return -1;

        int low = 0, high = a.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            //if target is less than  mid element
            if (target < a[mid]) {

                //if mid is hi end, return mid index
                if (mid == low) {
                    return mid;
                }
                high = mid - 1;       // move left
            } else {  // when target is more than or equal to mid element

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
