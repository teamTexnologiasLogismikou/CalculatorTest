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
public class devideTest {
    
    public devideTest() {
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
     * Test of division method, of class devide.
     */
    @Test
    public void testDivision() {
        System.out.println("division");
        String s1 = "9";
        String s2 = "3";
        devide instance = new devide();
        double expResult = 3;
        double result = instance.division(s1, s2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testDivision2() {
        System.out.println("division");
        String s1 = "9";
        String s2 = "-3";
        devide instance = new devide();
        double expResult = -3;
        double result = instance.division(s1, s2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testDivision3() {
        System.out.println("division");
        String s1 = "5.3";
        String s2 = "3.6";
        devide instance = new devide();
        float expResult = (float) 1.47222222;
        float result = (float) instance.division(s1, s2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testDivision4() {
        System.out.println("division");
        String s1 = "2";
        String s2 = "4";
        devide instance = new devide();
        double expResult = 0.5;
        double result = instance.division(s1, s2);
        assertEquals(expResult, result, 0.0);
    }
    
}
