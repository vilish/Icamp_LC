package org.example.icamp.chap05.binarysearch;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class SS02_ArrayPeakElementTest {
    private SS02_ArrayPeakElement arrayPeakElement;

    @BeforeEach
    void setUp() {
        arrayPeakElement = new SS02_ArrayPeakElement();
    }

    @AfterEach
    void tearDown() {
        arrayPeakElement = null;
    }

    @Test
    @Order(1)
    void peakElement_nullOrEmptyArr() {
        int a[] = null;
        Assertions.assertEquals(-1, arrayPeakElement.peakElement(a));
        a = new int[]{};
        Assertions.assertEquals(-1, arrayPeakElement.peakElement(a));
    }

    @Test
    @Order(2)
    void peakElement_singleElementArr() {
        int a[] = {10};
        Assertions.assertEquals(10, arrayPeakElement.peakElement(a));
    }

    @Test
    @Order(3)
    void peakElement_twoElementArrPeakAtEnd() {
        int a[] = {10, 12};
        Assertions.assertEquals(12, arrayPeakElement.peakElement(a));
    }

    @Test
    @Order(3)
    void peakElement_twoElementArrPeakAtStart() {
        int a[] = {12, 11};
        Assertions.assertEquals(12, arrayPeakElement.peakElement(a));
    }


    @Test
    @Order(4)
    void peakElement_goodArr1() {
        int a[] = {1, 3, 4, 5, 2};
        Assertions.assertEquals(5, arrayPeakElement.peakElement(a));
    }

    @Test
    @Order(5)
    void peakElement_goodArr2() {
        int a[] = {5, 3, 1};
        Assertions.assertEquals(5, arrayPeakElement.peakElement(a));
    }

    @Test
    @Order(6)
    void peakElement_goodArr3() {
        int a[] = {1, 3, 5};
        Assertions.assertEquals(5, arrayPeakElement.peakElement(a));
    }



    @Test
    @Order(7)
    void peakElement_goodArr4() {
        int a[] = {7, 6, 5, 1, 2, 3, 4, 0};
        Assertions.assertEquals(4, arrayPeakElement.peakElement(a));
    }
}