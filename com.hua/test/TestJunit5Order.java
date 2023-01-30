package com.hua.test;

import org.junit.jupiter.api.*;

//@TestMethodOrder(MethodOrderer.Random.class)
//@TestMethodOrder(MethodOrderer.MethodName.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestJunit5Order {


    @Nested
    @DisplayName("Group order not effective")
    class orderGroup {

        @Order(1)
        @Test
        public void testa() {

        }

        @Order(3)
        @Test
        public void testd() {

        }

        @Order(2)
        @Test
        public void testc() {

        }

        @Order(4)
        @Test
        public void testb() {

        }
    }

    @Test
    public void test1() {

    }

    @Test
    public void test5() {

    }

    @Test
    public void test4() {

    }

    @Test
    public void test2() {

    }

}
