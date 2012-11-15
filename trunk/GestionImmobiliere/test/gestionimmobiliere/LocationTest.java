/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionimmobiliere;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author user
 */
public class LocationTest {
    Local localinst;
    Locataire locataireinst;
    Location instance;
    //hna linstance location li ana rayhine
    
    public LocationTest() {
    localinst=new Local(4,"etage 5 Num 15","166m²",4,"22000","vaste appartement","2012-05-17","5mois","15000",1);
    locataireinst= new Locataire("Sonia","soniaAlg@yahoo.fr","0556789123","cité militaire num15");
    instance=new Location(locataireinst,localinst);
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
     * Test of testInitialiserLocation method, of class Location.
     * verifier la recuperation des informations d'une location a partire de la base de donnée
     * 
     */
   
    public void testInitialiserLocation(){
        System.out.println("InitialiserLocation");
        Location expResult1 = new Location();
        instance.getLocal().setIdLocal(3);
        instance.initialiserLocation();
        
        assertEquals("nouar meriem", instance.getLocataire().getNomV());
        assertEquals("1er etage N°2", instance.getLocal().getEtageNporteV());
    }

   
    /**
     * Test of miseAJourLocal method, of class Location.
     * consiste a cree un objet existant dans la base de donnee  
     * puis modifier ces coordonées dans la base
     * et en fin le recuperer pour verifier la modification
     */
    @Test
    public void testMiseAJourLocal() {
        System.out.println("miseAJourLocal");
        Local local=new Local(4,"","",0,"25milles dinars","appartement non meubler","2012-11-11","1mois","23milles dinars",2);
        instance.setLocal(local);          
        instance.miseAJourLocal();
        instance.initialiserLocation();//on doit avoir une ligne 2 dans local qui contien qlq info cm tu veux puis on modifier aussi une clé etrangere vars client n import tani w ykon un client d id 2 déja enreg
        assertEquals("23milles dinars", instance.getLocal().getVersementV());
        assertEquals(2, instance.getLocal().getLocataireV());
    
    }

    /**
     * Test of convertirDate method, of class Location.
     * dans la creation de l objet date on a utiliser le constructeur :
     * public Date(int year,int month, int date) 
     * Avec les parameters:     - the year minus 1900 month. 
     *                          - the month between 0-11 date. 
     *                          - the day of the month between 1-31.
     */
    @Test
    public void testConvertirDate() {
        System.out.println("convertirDate string->date");
        String date = "2012-11-10";
        java.util.Date expResult;
        expResult = new java.util.Date(112,10,10);
        java.util.Date result = instance.convertirDate(date);
        assertEquals(expResult,result);
    }

    /**
     * Test of getLocataire method, of class Location.
     */
    @Test
    public void testGetLocataire() {
        System.out.println("getLocataire");
        Locataire expResult = locataireinst;
        Locataire result = instance.getLocataire();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setLocataire method, of class Location.
     */
    @Test
    public void testSetLocataire() {
        System.out.println("setLocataire");
        Locataire locataire = new Locataire("Samir","samirAlg@yahoo.fr","0556789123","cité dehlya num15");
        instance.setLocataire(locataire);
        Locataire result= instance.getLocataire();
        assertEquals(locataire, result);
    }

    /**
     * Test of getLocal method, of class Location.
     */
    @Test
    public void testGetLocal() {
        System.out.println("getLocal");
        Local expResult = localinst;
        Local result = instance.getLocal();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setLocal method, of class Location.
     */
    @Test
    public void testSetLocal() {
        System.out.println("setLocal");
        Local local = new Local(5,"etage 3 Num 19","177m²",4,"28000","belle appartement","2012-05-27","5mois","19000",2);
        instance.setLocal(local);
        Local result=instance.getLocal();
        assertEquals(result, local);
    }
}