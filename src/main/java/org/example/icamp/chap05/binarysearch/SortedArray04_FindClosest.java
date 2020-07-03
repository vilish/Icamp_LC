package org.example.icamp.chap05.binarysearch;

public class SortedArray04_FindClosest {

    public int findClosest(int a[], int target) {

        if (a == null || a.length == 0) return -1;

        int result = Integer.MAX_VALUE;
        int low = 0, high = a.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            result = record(a, mid, target, result);

            if (target < a[mid]) {
                high = mid - 1;
            } else if (target > a[mid]) {
                low = mid + 1;
            } else {
                return a[mid];  // will return if target is in the array
            }

        }

        return a[result];
    }

    public int record(int a[], int mid, int target, int result) {
        if (result == Integer.MAX_VALUE ||
                Math.abs(a[mid] - target) < Math.abs(a[result] - target))
            result = mid;
        return result;
    }
}
