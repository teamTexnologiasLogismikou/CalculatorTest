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
public class plusTest {
    
    public plusTest() {
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
     * Test of add method, of class plus.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        String s1 = "2";
        String s2 = "2";
        tests.plus instance = new tests.plus();
        double expResult = 4;
        double result = instance.add(s1, s2);
        assertEquals(expResult, result, 0.0);
        
    }
    
     @Test
    public void testAdd2() {
        System.out.println("add");
        String s1 = "2";
        String s2 = "6";
        tests.plus instance = new tests.plus();
        double expResult = 8;
        double result = instance.add(s1, s2);
        assertEquals(expResult, result, 0.0);
        
    }
    
     @Test
    public void testAdd3() {
        System.out.println("add");
        String s1 = "2";
        String s2 = "-3";
        tests.plus instance = new tests.plus();
        double expResult = -1;
        double result = instance.add(s1, s2);
        assertEquals(expResult, result, 0.0);
        
    }
    
     @Test
    public void testAdd4() {
        System.out.println("add");
        String s1 = "2.3";
        String s2 = "5.4";
        tests.plus instance = new tests.plus();
        double expResult = 7.7;
        double result = instance.add(s1, s2);
        assertEquals(expResult, result, 0.0);
        
    }
    
}
