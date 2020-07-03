package org.example.icamp.chap05.binarysearch;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class SortedArray04_FindClosestTest {

    private SortedArray04_FindClosest arrFindClosest;

    @BeforeEach
    void setUp() {
        arrFindClosest = new SortedArray04_FindClosest();
    }

    @AfterEach
    void tearDown() {
        arrFindClosest = null;
    }

    @Test
    @Order(1)
    void findClosest_nullArr() {
        int a[] = null;
        Assertions.assertEquals(-1, arrFindClosest.findClosest(a, 10));
    }

    @Test
    @Order(2)
    void findClosest_multipleItemArr() {
        int a[] = {2, 5, 6, 9, 10, 15, 21};
        Assertions.assertEquals(6, arrFindClosest.findClosest(a, 7));
    }

}