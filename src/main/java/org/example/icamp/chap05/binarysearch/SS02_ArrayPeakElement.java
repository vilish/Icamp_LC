package org.example.icamp.chap05.binarysearch;

//Search for a Peak: A peak element in array A is an A[i] where its adjacent elements are less than A[i]. So, A[i - 1] < A[i] and A[i + 1] < A[i].
//
//Assume there are no duplicates. Also, assume that A[-1] and A[length] are negative infinity (-∞). So A[0] can be a peak if A[1] < A[0].
//
//A = [1,3,4,5,2] => Peak = 5
//A = [5,3,1] => Peak = 5
//A = [1,3,5] => Peak = 5
//int a[] = {7, 6, 5, 1, 2, 3, 4, 0}; => Peak 4 and 7, both answer are good

public class SS02_ArrayPeakElement {

    public int peakElement(int a[]) {

        if (a == null || a.length == 0) return -1;

        int start = 0, end = a.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            int left = mid > 0 ? a[mid - 1] : Integer.MIN_VALUE;
            int right = mid < a.length - 1 ? a[mid + 1] : Integer.MIN_VALUE;

            if ((mid == 0 && right < a[mid])
                    || (mid == end && a[mid] > left)
                    || (left < a[mid] && a[mid] > right)) {
                return a[mid];
            } else if (a[mid] < a[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        return -1;
    }
}
