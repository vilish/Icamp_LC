package org.example.icamp.chap05.binarysearch;

public class SortedArray02_FirstOccurrence {

    public int searchFirstOccurrence(int[] a, int target) {

        if (a == null)
            return -1;

        int lo = 0, hi = a.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (target < a[mid] || (a[mid] == target && mid > 0 && a[mid] == a[mid - 1])) {
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
