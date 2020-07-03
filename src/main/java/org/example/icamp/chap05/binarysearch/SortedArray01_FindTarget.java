package org.example.icamp.chap05.binarysearch;

// Given a sorted array, search for a target item

public class SortedArray01_FindTarget {

    public int search(int[] a, int target) {

        if (a == null)
            return -1;

        int lo = 0, hi = a.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (target < a[mid]) {
                hi = mid - 1;
            } else if (target > a[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
