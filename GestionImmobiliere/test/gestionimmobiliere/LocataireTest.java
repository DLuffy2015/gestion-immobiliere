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
    Locataire instance;
    public LocataireTest() {
     instance= new Locataire("asma","asma28@hotmail.fr","0556789567","cité mohammadia Bt 23 Num 89");   
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
        String expResult = "asma";
        String result = instance.getNomV();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setNomV method, of class Locataire.
     */
    @Test
    public void testSetNomV() {
        System.out.println("setNomV");
        String nomV = "lina";
        instance.setNomV(nomV);
        String result=instance.getNomV();
        assertEquals(nomV, result);
       
    }

    /**
     * Test of getMailV method, of class Locataire.
     */
    @Test
    public void testGetMailV() {
        System.out.println("getMailV");
        String expResult = "asma28@hotmail.fr";
        String result = instance.getMailV();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setMailV method, of class Locataire.
     */
    @Test
    public void testSetMailV() {
        System.out.println("setMailV");
        String mailV = "linaGH@esi.dz";
        instance.setMailV(mailV);
        String result= instance.getMailV();
        assertEquals(mailV,result);
      
    }

    /**
     * Test of getTéléphoneV method, of class Locataire.
     */
    @Test
    public void testGetTéléphoneV() {
        System.out.println("getTelephoneV");
        String expResult = "0556789567";
        String result = instance.getTéléphoneV();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setTéléphoneV method, of class Locataire.
     */
    @Test
    public void testSetTéléphoneV() {
        System.out.println("setTphoneV");
        String téléphoneV = "0555555555";
        instance.setTéléphoneV(téléphoneV);
        String result=instance.getTéléphoneV();
        assertEquals(téléphoneV,result);
       
    }

    /**
     * Test of getAdresseV method, of class Locataire.
     */
    @Test
    public void testGetAdresseV() {
        System.out.println("getAdresseV");
        String expResult = "cité mohammadia Bt 23 Num 89";
        String result = instance.getAdresseV();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setAdresseV method, of class Locataire.
     */
    @Test
    public void testSetAdresseV() {
        System.out.println("setAdresseV");
        String adresseV = "cité Bab El Oued Num 119";
        instance.setAdresseV(adresseV);
        String result=instance.getAdresseV();
        assertEquals(adresseV, result);
        
    }


    /**
     * Test of insererLocataire method, of class Locataire.
     */
    @Test
    public void testInsererLocataire() {
        System.out.println("insererLocataire");
        Locataire instance = new Locataire("meddahi imane","ai_meddahi@esi.dz","0553669877","Dar el beida");
        instance.insererLocataire();
        int expResult = -1;//id du locataire 
        int result = instance.rechercherLocataire();
        assertTrue(result!=expResult);
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
