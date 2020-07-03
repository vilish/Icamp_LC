package org.example.icamp.chap05.binarysearch;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class SortedArray05_Rotated_FindSmallestTest {
    private SortedArray05_Rotated_FindSmallest rotated_findSmallest;

    @BeforeEach
    void setUp() {
        rotated_findSmallest = new SortedArray05_Rotated_FindSmallest();
    }

    @AfterEach
    void tearDown() {
        rotated_findSmallest = null;
    }

    @Test
    @Order(1)
    void rotated_findSmallest_nullNEmptyArr() {
        int a[] = null;
        Assertions.assertEquals(-1, rotated_findSmallest.find(a));
        a = new int[]{};
        Assertions.assertEquals(-1, rotated_findSmallest.find(a));
    }

    @Test
    @Order(2)
    void rotated_findSmallest_oneElement() {
        int a[] = {7};
        Assertions.assertEquals(7, rotated_findSmallest.find(a));
    }

    @Test
    @Order(3)
    void rotated_findSmallest_AllSame() {
        int a[] = {7, 7, 7};
        Assertions.assertEquals(7, rotated_findSmallest.find(a));
    }

    @Test
    @Order(3)
    void rotated_findSmallest_AllSame_SomeDuplicates() {
        int a[] = {1, 3, 7, 7, 7, 11, 12};
        Assertions.assertEquals(1, rotated_findSmallest.find(a));
    }

    @Test
    @Order(3)
    void rotated_findSmallest() {
        int a[] = {7, 8, 1, 2, 3, 4, 5};
        Assertions.assertEquals(1, rotated_findSmallest.find(a));
    }

    @Test
    @Order(3)
    void rotated_findSmallest_regularSortedArr() {
        int a[] = {0, 1, 2, 3, 4, 5};
        Assertions.assertEquals(0, rotated_findSmallest.find(a));
    }
}