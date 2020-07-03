package org.example.icamp.chap05.binarysearch;

//Find the square root of an integer X.
// For example, squareRoot(4) = 2. It is ok to find the integer floor of the square root.
// So squareRoot(5) or squareRoot(8) can also return 2. squareRoot(9) will return 3.


public class SS01_SquareRoot {

    public int getSqrt(int num) {

        if (num < 0) return -1;
        if (num < 2) return num;

        int start = 0, end = start + num / 2, mid = 0;

        while (start <= end) {
            mid = start + (end - start) / 2;
            if (square(mid) < num) {
                start = mid + 1;
            } else if (square(mid) > num) {
                end = mid - 1;
            } else {
                return mid;
            }
        }

        // to get the integer component of number
        if (square(mid) > num)
            return --mid; // reduce the interger to get the nearest int part of square root.


        return -1;
    }

    private int square(int x) {
        return x * x;
    }
}
