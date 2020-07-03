package org.example.icamp.chap05.binarysearch;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class SortedArray06_UnknownLength_FindItemTest {
    private SortedArray06_UnknownLength_FindItem unkownlength_findItem;

    @BeforeEach
    void setUp() {
        unkownlength_findItem = new SortedArray06_UnknownLength_FindItem();
    }

    @AfterEach
    void tearDown() {
        unkownlength_findItem = null;
    }

    @Test
    @Order(0)
    void findItem_NullAndEmptyArray() {
        int a[] = null;
        Assertions.assertEquals(-1, unkownlength_findItem.findItem(a, 12));
        a = new int[]{};
        Assertions.assertEquals(-1, unkownlength_findItem.findItem(a, 12));

    }

    @Test
    @Order(1)
    void findItem_TargetTowardsEndOfArray() {
        int a[] = {1, 2, 4, 6, 8, 10, 12, 17};
        Assertions.assertEquals(6, unkownlength_findItem.findItem(a, 12));
    }

    @Test
    @Order(2)
    void findItem_TargetTLastInArray() {
        int a[] = {1, 2, 4, 6, 8, 10, 12, 17};
        Assertions.assertEquals(7, unkownlength_findItem.findItem(a, 17));
    }

    @Test
    @Order(2)
    void findItem_TargetTFirstInArray() {
        int a[] = {1, 2, 4, 6, 8, 10, 12, 17};
        Assertions.assertEquals(0, unkownlength_findItem.findItem(a, 1));
    }

    @Test
    @Order(3)
    void findItem_TargetTNotInArray() {
        int a[] = {1, 2, 4, 6, 8, 10, 12, 17};
        Assertions.assertEquals(-1, unkownlength_findItem.findItem(a, 21));
    }


}