/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class minusTest {
    
    public minusTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of removal method, of class minus.
     */
     @Test
    public void testRemoval() {
        System.out.println("removal");
        String s1 = "2";
        String s2 = "2";
        minus instance = new minus();
        double expResult = 0.0;
        double result = instance.removal(s1, s2);
        assertEquals(expResult, result, 0.0);
    }
    
       @Test
    public void testRemoval2() {
        System.out.println("removal");
        String s1 = "2";
        String s2 = "-6";
        minus instance = new minus();
        double expResult = 8;
        double result = instance.removal(s1, s2);
        assertEquals(expResult, result, 0.0);
    }
    
       @Test
    public void testRemoval3() {
        System.out.println("removal");
        String s1 = "2";
        String s2 = "9";
        minus instance = new minus();
        double expResult = -7;
        double result = instance.removal(s1, s2);
        assertEquals(expResult, result, 0.0);
    }
    
       @Test
    public void testRemoval4() {
        System.out.println("removal");
        String s1 = "7.6";
        String s2 = "3.4";
        minus instance = new minus();
        float expResult = (float) 4.2;
        float result = (float) instance.removal(s1, s2);
        assertEquals(expResult, result, 0.0);
    }
    
}
