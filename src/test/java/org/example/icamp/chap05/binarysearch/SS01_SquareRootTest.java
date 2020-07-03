package org.example.icamp.chap05.binarysearch;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class SS01_SquareRootTest {

    SS01_SquareRoot squareRoot;

    @BeforeEach
    void setUp() {
        squareRoot = new SS01_SquareRoot();
    }

    @AfterEach
    void tearDown() {
        squareRoot = null;
    }

    @Test
    @Order(1)
    public void getSqrt_OfNum_4(){
        Assertions.assertEquals(2, squareRoot.getSqrt(4));

    }

    @Test
    @Order(2)
    public void getSqrt_OfNum_25(){
        Assertions.assertEquals(5, squareRoot.getSqrt(25));

    }

    @Test
    @Order(3)
    public void getSqrt_OfNum_9(){
        Assertions.assertEquals(3, squareRoot.getSqrt(9));

    }

    @Test
    @Order(3)
    public void getSqrt_OfNum_12(){
        Assertions.assertEquals(3, squareRoot.getSqrt(12));

    }

    @Test
    @Order(3)
    public void getSqrt_OfNum_8(){
        Assertions.assertEquals(2, squareRoot.getSqrt(8));

    }

    @Test
    @Order(4)
    public void getSqrt_OfNum_1(){
        Assertions.assertEquals(1, squareRoot.getSqrt(1));

    }

    @Test
    @Order(5)
    public void getSqrt_OfNum_0(){
        Assertions.assertEquals(0, squareRoot.getSqrt(0));

    }
}