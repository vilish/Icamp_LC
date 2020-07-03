package org.example.icamp.chap05.binarysearch;

public class SortedArray06_UnknownLength_FindItem {

    public int findItem(int a[], int target) {


        if (a == null) return -1;

        int start = 1, end;

        // Find the end (and target together).
        // check if target is at start else double start,  -> search 1, 2, 4, 8, 16...
        // break if target is less than a[start] -> do binary search
        // catch ArrayOutOfBoundException, array len should be in start/2, start
        try {
            while (true) {
                if (a[start] < target) {
                    start *= 2;
                } else if (a[start] == target) {
                    return start;
                } else {
                    end = start - 1;
                    start = start / 2;
                    break;
                }
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            end = start - 1;
            start = start / 2;
        }

        return binarySearch(a, start, end, target);


    }

    //loop to get the array length and also look target there.
    private int binarySearch(int a[], int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            try {
                if (a[mid] < target) {
                    start = mid + 1;
                } else if (a[mid] > target) {
                    end = mid - 1;
                } else {
                    return mid;
                }

            } catch (ArrayIndexOutOfBoundsException ex) {
                end = mid - 1;
            }
        }

        return -1;
    }
}
