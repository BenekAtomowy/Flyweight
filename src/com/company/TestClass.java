package com.company;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;
/**
 * Autor : Emilian Ossowski
 *
 * Testy jednostkowe testujace utworzone obiekty
 *
 * **/
public class TestClass {
    Posilek p1 = new Pizza();
    Posilek p2 = new Burger();
    Posilek p3 = new Burger();


    @Before
    public void setUp(){

    }

    @Test
    public void test(){
        p1 = new SosPom(p1);
        assertFalse(p1 == null);
    }

    @Test
    public void test1(){
        assertTrue( p1 != p2 );
    }


    @Test
    public void test2(){
        p2 = new SosPom(p2);
        p3 = new Ogorek(p3);
        assertFalse(p2== p3);
    }

}
