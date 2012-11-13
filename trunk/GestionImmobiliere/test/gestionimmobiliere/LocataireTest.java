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
        
    }

    /**
     * Test of setTéléphoneV method, of class Locataire.
     */
    @Test
    public void testSetTéléphoneV() {
        System.out.println("setTphoneV");
        String téléphoneV = "";
        Locataire instance = new Locataire();
        instance.setTéléphoneV(téléphoneV);
       
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
        
    }


    /**
     * Test of insererLocataire method, of class Locataire.
     */
    @Test
    public void testInsererLocataire() {
        System.out.println("insererLocataire");
        Locataire instance = new Locataire("meddahi imane","ai_meddahi@esi.dz","portable:05553669877","Dar el beida");
        instance.insererLocataire();
        int expResult = -1;//id du locataire 
        int result = instance.rechercherLocataire();
        //assertEquals(expResult, result); comment verifier != -1
    }

    /**
     * Test of rechercherLocataire method, of class Locataire.
     */
    @Test
    public void testRechercherLocataire() {
        System.out.println("rechercherLocataire (n'existe pas)");
        Locataire instance = new Locataire();
        instance.setNomV("Samia B");
        int expResult = -1;//id du locataire
        int result = instance.rechercherLocataire();
        assertEquals(expResult, result);
       
         System.out.println("rechercherLocataire (existe)");
         instance.setNomV("Tebbi souad");
         expResult = 1;
         result = instance.rechercherLocataire();
         assertEquals(expResult, result);
        
    }
}