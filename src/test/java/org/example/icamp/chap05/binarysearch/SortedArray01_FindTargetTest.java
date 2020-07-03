package org.example.icamp.chap05.binarysearch;


import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SortedArray01_FindTargetTest {

    private SortedArray01_FindTarget targetInSortedArray;


    @BeforeEach
    public void setUp() {
        targetInSortedArray = new SortedArray01_FindTarget();
    }

    @AfterEach
    public void tearDown() {
        targetInSortedArray = null;
    }


    @Test
    @Order(3)
    public void searchTargetNotFound() {

        int a[] = {1, 2};
        int target = 3;
        assertEquals(-1, targetInSortedArray.search(a, target));
    }

    @Test
    @Order(1)
    public void searchEmptyArray() {

        int a[] = {};
        int target = 3;

        assertEquals(-1, targetInSortedArray.search(a, target));
    }

    @Test
    @Order(2)
    public void searchNullArray() {

        int a[] = null;
        int target = 3;

        assertEquals(-1, targetInSortedArray.search(a, target));
    }

    @Test
    @Order(4)
    public void searchArrayContainsTargetOnly() {

        int a[] = {3};
        int target = 3;

        assertEquals(0, targetInSortedArray.search(a, target));
    }

    @Test
    @Order(5)
    public void searchInRegularSortedArray() {

        int a[] = {3, 6, 9, 12, 45, 123, 5678};
        int target = 6;

        assertEquals(1, targetInSortedArray.search(a, target));
    }

    @Test
    @Order(6)
    public void searchInRegularSortedArrayTargetFirstElement() {

        int a[] = {3, 6, 9, 12, 45, 123, 5678};
        int target = 3;

        assertEquals(0, targetInSortedArray.search(a, target));
    }

    @Test
    @Order(7)
    public void searchInRegularSortedArrayTargetLastElement() {

        int a[] = {3, 6, 9, 12, 45, 123, 1000};
        int target = 1000;

        assertEquals(6, targetInSortedArray.search(a, target));
    }

    @Test
    @Order(8)
    public void searchInRegularSortedArrayTargetNotFound() {

        int a[] = {3, 6, 9, 12, 45, 123, 1000};
        int target = 200;

        assertEquals(-1, targetInSortedArray.search(a, target));
    }
}