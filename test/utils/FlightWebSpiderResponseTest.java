/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Halil
 */
public class FlightWebSpiderResponseTest {
    
    public FlightWebSpiderResponseTest() {
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
     * Test of getList method, of class FlightWebSpiderResponse.
     */
    @Test
    public void testGetList() {
        System.out.println("getList");
        FlightWebSpiderResponse instance = new FlightWebSpiderResponse();
        List<FlightInformation> expResult = null;
        List<FlightInformation> result = instance.getList();
        assertEquals(expResult, result);
    }

    /**
     * Test of setList method, of class FlightWebSpiderResponse.
     */
    @Test
    public void testSetList() {
        System.out.println("setList");
        List<FlightInformation> list = null;
        FlightWebSpiderResponse instance = new FlightWebSpiderResponse();
        instance.setList(list);
    }
    
}
