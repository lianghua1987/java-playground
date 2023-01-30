package com.hua.test;

import org.junit.jupiter.api.*;


@org.junit.jupiter.api.TestInstance(org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestInstance {

    StringBuilder sb = new StringBuilder();

    @AfterEach
    public void afterEach(){
        System.out.println(sb.toString());
    }

    @BeforeAll
    public static void beforeAll(){
        System.out.println("before all executed");
    }

    @Order(1)
    @Test
    public void testa() {
        sb.append("1");
    }

    @Order(3)
    @Test
    public void testd() {
        sb.append("3");
    }

    @Order(2)
    @Test
    public void testc() {
        sb.append("2");
    }

    @Order(4)
    @Test
    public void testb() {
        sb.append("4");
    }
}
