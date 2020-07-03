package org.example.icamp.chap05.binarysearch;

// (Level: Easy) Given a sorted array A that has been rotated in a cycle, find the smallest element of the array in O(log(n)) time. For example,
//[1,2,4,5,7,8] rotated by 3 gives us A = [5,7,8,1,2,4] and the smallest number is 1.
//[1,2,4,5,7,8] rotated by 1 gives us A = [8,1,2,4,5,7] and the smallest number is 1.

public class SortedArray05_Rotated_FindSmallest {
    public int find(int a[]) {

        if (a == null || a.length == 0) return -1;

        // assume right most element as pivot to start
        int low = 0, high = a.length - 1, right = a[high];

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // case it doesn't match regular sorted array
            if (a[mid] <= right && (mid == 0 || a[mid - 1] > a[mid])) {
                return a[mid];
            } else if (a[mid] > right) {  // otherwise regular binary search op
                low = mid + 1;
            } else {
                high = mid - 1;
            }


        }

        return -1;
    }
}
