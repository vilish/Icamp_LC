package org.example.icamp.chap05.binarysearch;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class SortedArray03_InsertItemTest {

    private SortedArray03_InsertItem inSortedArr;

    @BeforeEach
    void setUp() {
        inSortedArr = new SortedArray03_InsertItem();
    }

    @AfterEach
    void tearDown() {
        inSortedArr = null;
    }

    @Test
    @Order(1)
    void insertAt_nullArray() {
        assertEquals(-1, inSortedArr.insertAt(null, 10));
    }

    @Test
    @Order(2)
    void insertAt_emptyArr() {
        int a[] = {};
        assertEquals(0, inSortedArr.insertAt(a, 10));
    }

    @Test
    @Order(3)
    void insertAt_singleElementArr_moreThanTarget() {
        int a[] = {12};
        assertEquals(1, inSortedArr.insertAt(a, 15));
    }

    @Test
    @Order(3)
    void insertAt_singleElementArr_lessThanTarget() {
        int a[] = {12};
        assertEquals(0, inSortedArr.insertAt(a, 3));
    }

    @Test
    @Order(3)
    void insertAt_singleElementArr_equalThanTarget() {
        int a[] = {12};
        assertEquals(1, inSortedArr.insertAt(a, 12));
    }

    @Test
    @Order(4)
    void insertAt_manyElementArr_allLessThanTarget() {
        int a[] = {12, 15};
        assertEquals(2, inSortedArr.insertAt(a, 20));
    }

    @Test
    @Order(4)
    void insertAt_manyElementArr_allMoreThanTarget() {
        int a[] = {12, 15};
        assertEquals(0, inSortedArr.insertAt(a, 1));
    }

    @Test
    @Order(5)
    void insertAt_manyElementArr() {
        int a[] = {12, 15, 20, 25, 100, 329};
        assertEquals(2, inSortedArr.insertAt(a, 17));
    }

    //    A = [1,2,4,5,6,8] and T = 3, return index 2
    @Test
    @Order(5)
    void insertAt_manyElementArr_InMiddle() {
        int a[] = {1, 2, 4, 5, 6, 8};
        assertEquals(2, inSortedArr.insertAt(a, 3));
    }

    //A = [1,2,4,5,6,8] and T = 0, return index 0

    @Test
    @Order(5)
    void insertAt_manyElementArr_shouldBeFirst() {
        int a[] = {1, 2, 4, 5, 6, 8};
        assertEquals(0, inSortedArr.insertAt(a, 0));
    }

    //A = [1,2,4,5,6,8] and T = 4, return index 3.
    @Test
    @Order(5)
    void insertAt_manyElementArr_withExistingDuplicate() {
        int a[] = {1, 2, 4, 5, 6, 8};
        assertEquals(3, inSortedArr.insertAt(a, 4));
    }
}