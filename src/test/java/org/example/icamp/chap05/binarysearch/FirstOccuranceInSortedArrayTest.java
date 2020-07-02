package org.example.icamp.chap05.binarysearch;


import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class FirstOccuranceInSortedArrayTest {

    private FirstOccuranceInSortedArray firstOccuranceInSortedArray;

    @BeforeEach
    public void setup() {
        firstOccuranceInSortedArray = new FirstOccuranceInSortedArray();
    }

    @AfterEach
    public void teardown() {
        firstOccuranceInSortedArray = null;
    }

    @Test
    @Order(1)
    public void searchFirstOccurrence_NullArray() {
        assertEquals(-1, firstOccuranceInSortedArray.searchFirstOccurrence(null, 3));
    }

    @Test
    @Order(2)
    public void searchFirstOccurrence_EmptyArray() {
        int a[] = {};
        assertEquals(-1, firstOccuranceInSortedArray.searchFirstOccurrence(a, 10));
    }

    @Test
    @Order(3)
    public void searchFirstOccurrence_SingleItemArray() {
        int a[] = {10};
        assertEquals(0, firstOccuranceInSortedArray.searchFirstOccurrence(a, 10));
    }


    @Test
    @Order(4)
    public void searchFirstOccurrence_TwoElementArray() {
        int a[] = {10, 10};
        assertEquals(0, firstOccuranceInSortedArray.searchFirstOccurrence(a, 10));
    }

    @Test
    @Order(5)
    public void searchFirstOccurrence_regularArray() {
        int a[] = {1, 5, 10, 10, 23, 28, 100};
        assertEquals(2, firstOccuranceInSortedArray.searchFirstOccurrence(a, 10));
    }

    @Test
    @Order(6)
    public void searchFirstOccurrence_targetNotInArray() {
        int a[] = {1, 5, 10, 10, 23, 28, 100};
        assertEquals(-1, firstOccuranceInSortedArray.searchFirstOccurrence(a, 15));
    }
}