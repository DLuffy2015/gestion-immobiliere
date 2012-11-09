/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionimmobiliere;

import java.util.Date;
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
public class LocationTest {
    
    public LocationTest() {
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
     * Test of getLocataire method, of class Location.
     */
    @Test
    public void testGetLocataire() {
        System.out.println("getLocataire");
        Location instance = new Location();
        Locataire expResult = null;
        Locataire result = instance.getLocataire();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLocataire method, of class Location.
     */
    @Test
    public void testSetLocataire() {
        System.out.println("setLocataire");
        Locataire locataire = null;
        Location instance = new Location();
        instance.setLocataire(locataire);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLocal method, of class Location.
     */
    @Test
    public void testGetLocal() {
        System.out.println("getLocal");
        Location instance = new Location();
        Local expResult = null;
        Local result = instance.getLocal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLocal method, of class Location.
     */
    @Test
    public void testSetLocal() {
        System.out.println("setLocal");
        Local local = null;
        Location instance = new Location();
        instance.setLocal(local);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of miseAJourLocal method, of class Location.
     */
    @Test
    public void testMiseAJourLocal() {
        System.out.println("miseAJourLocal");
        Location instance = new Location();
        instance.miseAJourLocal();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertirDate method, of class Location.
     */
    @Test
    public void testConvertirDate() {
        System.out.println("convertirDate");
        String date = "";
        Date expResult = null;
        Date result = Location.convertirDate(date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
