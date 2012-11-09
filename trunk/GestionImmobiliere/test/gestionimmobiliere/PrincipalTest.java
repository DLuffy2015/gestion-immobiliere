/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionimmobiliere;

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
public class PrincipalTest {
    
    public PrincipalTest() {
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
     * Test of main method, of class Principal.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Principal.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initTabLocaux method, of class Principal.
     */
    @Test
    public void testInitTabLocaux() {
        System.out.println("initTabLocaux");
        String query = "";
        Principal.initTabLocaux(query);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initTabLocataires method, of class Principal.
     */
    @Test
    public void testInitTabLocataires() {
        System.out.println("initTabLocataires");
        Principal.initTabLocataires();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
