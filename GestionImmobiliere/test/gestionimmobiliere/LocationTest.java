/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionimmobiliere;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author user
 */
public class LocationTest {
     Location instance;
    public LocationTest() {
        instance=new Location();
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
        Locataire expResult = null;
        Locataire result = instance.getLocataire();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setLocataire method, of class Location.
     */
    @Test
    public void testSetLocataire() {
        System.out.println("setLocataire");
        Locataire locataire = new Locataire();
        instance.setLocataire(locataire);
        Locataire result = instance.getLocataire();
        assertEquals(locataire, instance);
    }

    /**
     * Test of getLocal method, of class Location.
     */
    @Test
    public void testGetLocal() {
        System.out.println("getLocal");
        Local expResult = null;
        Local result = instance.getLocal();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setLocal method, of class Location.
     */
    @Test
    public void testSetLocal() {
        System.out.println("setLocal");
        Local local = new Local();
        instance.setLocal(local);
        Local result = instance.getLocal();
        assertEquals(local, result);
    }

    /**
     * Test of miseAJourLocal method, of class Location.
     */
    @Test
    public void testMiseAJourLocal() {
        System.out.println("miseAJourLocal");
        Location instance = new Location();
        //init instance puis enregistrere et appré recuperer est verifier
        instance.miseAJourLocal();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertirDate method, of class Location.
     */
    @Test
    public void testConvertirDate() {
        System.out.println("convertirDate string=>date");
        String date = "2012-11-10";
        Date expResult = new java.util.Date(112,11,10);
        Date result = Location.convertirDate(date);
        assertEquals(expResult, result);
       
        
        
    }
}
