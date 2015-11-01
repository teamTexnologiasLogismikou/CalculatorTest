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
public class multiplyTest {
    
    public multiplyTest() {
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
     * Test of multiplication method, of class multiply.
     */
    @Test
    public void testMultiplication() {
        System.out.println("multiplication");
        String s1 = "2";
        String s2 = "2";
        multiply instance = new multiply();
        double expResult = 4;
        double result = instance.multiplication(s1, s2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testMultiplication2() {
        System.out.println("multiplication");
        String s1 = "2";
        String s2 = "8";
        multiply instance = new multiply();
        double expResult = 16;
        double result = instance.multiplication(s1, s2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testMultiplication3() {
        System.out.println("multiplication");
        String s1 = "2.2";
        String s2 = "6.4";
        multiply instance = new multiply();
        float expResult = (float) 14.08;
        float result = (float) instance.multiplication(s1, s2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testMultiplication4() {
        System.out.println("multiplication");
        String s1 = "2";
        String s2 = "-6";
        multiply instance = new multiply();
        double expResult = -12;
        double result = instance.multiplication(s1, s2);
        assertEquals(expResult, result, 0.0);
    }
    
}
