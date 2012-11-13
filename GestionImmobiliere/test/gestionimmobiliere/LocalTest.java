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
public class LocalTest {
    Local instance;
    public LocalTest() {
    instance =new Local(3,"2emme etage N°3","120M²",5,"45milles dinars","prix négociable","2012/11/10","5 mois ","1000dinars",4);
   
    }
    
    @BeforeClass
    public static void setUpClass() {
        ConxionBDD.connect();
        
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
     * Test of getIdLocal method, of class Local.
     */
      @Test
    public void testGetIdLocal() {
        System.out.println("getEtageNporteV");
        int expResult = 3;
        int result = instance.getIdLocal();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setIdLocal method, of class Local.
    */
    @Test
    public void testSetIdLocal() {
        System.out.println("setIdLocal");
        int expResult = 4;
        instance.setIdLocal(expResult);
        int result = instance.getIdLocal();
        assertEquals(expResult, result);
    }
   
    /**
     * Test of getEtageNporteV method, of class Local.
     */
     @Test
    public void testGetEtageNporteV() {

        System.out.println("getIdLocal");
        String expResult = "2emme etage N°3";
        String result = instance.getEtageNporteV();
        assertEquals(expResult, result);
      
    }
   
     

    /**
     * Test of setEtageNporteV method, of class Local.
     */ 
    @Test
    public void testSetEtageNporteV() {
         System.out.println("setEtageNporteV");
         String etageNporteV = "4emme etage N°8";
         instance.setEtageNporteV(etageNporteV);
         String result = instance.getEtageNporteV();
         assertEquals(etageNporteV, result);
    }

    /**
     * Test of getSurfaceV method, of class Local.
     */
    @Test
    public void testGetSurfaceV() {
        System.out.println("getSurfaceV");
        String expResult = "120M²";
        String result = instance.getSurfaceV();
        assertEquals(expResult, result);
       
    }
   
   
         
    /**
     * Test of setSurfaceV method, of class Local.
     */
    @Test
    public void testSetSurfaceV() {
        System.out.println("setSurfaceV");
        String surfaceV = "76 M²";
        instance.setSurfaceV(surfaceV);
        String result = instance.getSurfaceV();
        assertEquals(surfaceV, result);
    }

    /**
     * Test of getFiV method, of class Local.
     */
    @Test
    public void testGetFiV() {
        System.out.println("getFiV");
        int expResult = 5;
        int result = instance.getFiV();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setFiV method, of class Local.
     */
    @Test
    public void testSetFiV() {
        System.out.println("setFiV");
        int FiV = 4;
        instance.setFiV(FiV);
        int result = instance.getFiV();
        assertEquals(FiV, result);
    }

    /**
     * Test of getPrixV method, of class Local.
     */
    @Test
    public void testGetPrixV() {
        System.out.println("getPrixV");
        String expResult = "45milles dinars";
        String result = instance.getPrixV();
        assertEquals(expResult, result);
       
    }
  /**
     * Test of setPrixV method, of class Local.
     */
    @Test
    public void testSetPrixV() {
        System.out.println("setPrixV");
        String prixV = "44milles dinars";
         instance.setPrixV(prixV);
        String result = instance.getPrixV();
         assertEquals(prixV, result);
    }

    /**
     * Test of getDescriptionV method, of class Local.
     */
    @Test
    public void testGetDescriptionV() {
        System.out.println("getDescriptionV");
        String expResult = "prix négociable";
        String result = instance.getDescriptionV();
        assertEquals(expResult, result);
       
    }
   
 
    /**
     * Test of setDescriptionV method, of class Local.
     */
    @Test
    public void testSetDescriptionV() {
        System.out.println("setDescriptionV");
        String descriptionV = "belle appartement ";
        instance.setDescriptionV(descriptionV);
        String result = instance.getDescriptionV();
        assertEquals(descriptionV, result);
       
    }
   /**
     * Test of getDateDebutV method, of class Local.
     */
    @Test
    public void testGetDateDebutV() {
        System.out.println("getDateDebutV");
        String expResult = "2012-11-10";
        String result = instance.getDateDebutV();
        assertEquals(expResult, result);
       
    }
    
  
    /**
     * Test of setDateDebutV method, of class Local.
     */
    @Test
    public void testSetDateDebutV() {
        System.out.println("setDateDebutV");
        String dateDebutV = "2012-11-13";
        Local instance = new Local();
        instance.setDateDebutV(dateDebutV);
    }

    /**
     * Test of getDureeV method, of class Local.
     */
    @Test
    public void testGetDureeV() {
        System.out.println("getDureeV");
        String expResult = "5 mois";
        String result = instance.getDureeV();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDureeV method, of class Local.
     */
    @Test
    public void testSetDureeV() {
        System.out.println("setDureeV");
        String dureeV = "2 mois";
        instance.setDureeV(dureeV);
       String result = instance.getDureeV();
        assertEquals(dureeV, result);
    }

    /**
     * Test of setVersementV method, of class Local.
     */
    @Test
    public void testSetVersementV() {
        System.out.println("setVersementV");
        String versementV = "50 Milles dinars";
        instance.setVersementV("50 Milles dinars");
        String result =instance.getVersementV();
        assertEquals(versementV, result);
    }

    /**
     * Test of getLocataireV method, of class Local.
     */
    @Test
    public void testGetLocataireV() {
        System.out.println("getLocataireV");
        int expResult = 4;
        int result = instance.getLocataireV();
        assertEquals(expResult, result);
        
    }
    

    /**
     * Test of insererLocal method, of class Local.
     */
    @Test
    public void testInsererLocal() {
        System.out.println("insererLocal");
        Local instancet = new Local(3,"2emme Etage N°5","80 M²",4,"25milles dinars","Une belle appartement meublé","2012-11-10","5 mois ","1000dinars",4);
        instancet.insererLocal();
        int expResult = -1;
        int result = instancet.rechercherLocal();
        assertEquals(expResult, result);//la difference 
        
    }

    /**
     * Test of rechercherLocal method, of class Local.
     */
    @Test
    public void testRechercherLocal() {
        System.out.println("rechercherLocal");
        Local instancet = new Local(3,"6emme Etage N°12","100 M²",5,"33milles dinars","Une belle appartement meublé","2012-11-10","5 mois ","1000dinars",4);
        int expResult = 1;
        int result = instancet.rechercherLocal();
        assertEquals(expResult, result);
          }
}
