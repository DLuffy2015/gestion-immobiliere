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
public class LocataireTest {
    
    public LocataireTest() {
    }
    
    @BeforeClass
    public static void setUpClass() 
    {ConxionBDD.connect();
    }
    
    @AfterClass
    public static void tearDownClass() {
        ConxionBDD.close();
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNomV method, of class Locataire.
     */
    @Test
    public void testGetNomV() {
        System.out.println("getNomV");
        Locataire instance = new Locataire();
        String expResult = "";
        String result = instance.getNomV();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNomV method, of class Locataire.
     */
    @Test
    public void testSetNomV() {
        System.out.println("setNomV");
        String nomV = "";
        Locataire instance = new Locataire();
        instance.setNomV(nomV);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMailV method, of class Locataire.
     */
    @Test
    public void testGetMailV() {
        System.out.println("getMailV");
        Locataire instance = new Locataire();
        String expResult = "";
        String result = instance.getMailV();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMailV method, of class Locataire.
     */
    @Test
    public void testSetMailV() {
        System.out.println("setMailV");
        String mailV = "";
        Locataire instance = new Locataire();
        instance.setMailV(mailV);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTéléphoneV method, of class Locataire.
     */
    @Test
    public void testGetTéléphoneV() {
        System.out.println("getT\u00e9l\u00e9phoneV");
        Locataire instance = new Locataire();
        String expResult = "";
        String result = instance.getTéléphoneV();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTéléphoneV method, of class Locataire.
     */
    @Test
    public void testSetTéléphoneV() {
        System.out.println("setT\u00e9l\u00e9phoneV");
        String téléphoneV = "";
        Locataire instance = new Locataire();
        instance.setTéléphoneV(téléphoneV);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAdresseV method, of class Locataire.
     */
    @Test
    public void testGetAdresseV() {
        System.out.println("getAdresseV");
        Locataire instance = new Locataire();
        String expResult = "";
        String result = instance.getAdresseV();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAdresseV method, of class Locataire.
     */
    @Test
    public void testSetAdresseV() {
        System.out.println("setAdresseV");
        String adresseV = "";
        Locataire instance = new Locataire();
        instance.setAdresseV(adresseV);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rechercheNom method, of class Locataire.
     */
    @Test
    public void testRechercheNom() {
        System.out.println("rechercheNom");
        Locataire instance = new Locataire();
        int expResult = 1;//id
        instance.setNomV("Tebbi souad");
        int result = instance.rechercheNom();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of insererLocataire method, of class Locataire.
     */
    @Test
    public void testInsererLocataire() {
        System.out.println("insererLocataire");
        Locataire instance = new Locataire("meddahi imane","ai_meddahi@esi.dz","05553669877","Dar el beida");
       instance.insererLocataire();
      // on peut utilisé recherche  nom
        
    }

    /**
     * Test of rechercherLocataire method, of class Locataire.
     */
    @Test
    public void testRechercherLocataire() {
        System.out.println("rechercherLocataire");
        Locataire instance = new Locataire();
        instance.setNomV("Samia B");
        int expResult = -1;
        int result = instance.rechercherLocataire();
        assertEquals(expResult, result);
       
         System.out.println("rechercherLocataire");
         instance.setNomV("Tebbi souad");
         expResult = 1;
         result = instance.rechercherLocataire();
         assertEquals(expResult, result);
        
    }
}
