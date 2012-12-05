package gestionimmobiliere;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author souad
 */

/**
 * Cette classe permet de faire les testes unitaires sur les methodes de la class Location du projet
 */

public class LocationTest {
    Local localinst;
    Locataire locataireinst;
    Location instance;
   
    
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
    
   
    /**
     * Test of testInitialiserLocation method, of class Location.
     * verifier la recuperation des informations d'une location a partire de la base de donnée
     * 
     */
   
    public void testInitialiserLocation(){
        System.out.println("InitialiserLocation");
        instance.getLocal().setIdLocal(15);
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
        Local local=new Local(35,"5emme etage N°10","90M²",3,"25milles dinars","appartement non meubler","2012-11-11","1mois","20milles dinars",25);
        instance.setLocal(local);          
        instance.miseAJourLocal();
        instance.initialiserLocation();
        assertEquals("20milles dinars", instance.getLocal().getVersementV());
        assertEquals(25, instance.getLocal().getLocataireV());
        assertEquals("2012-11-11", instance.getLocal().getDateDebutV());
        assertEquals("appartement non meubler", instance.getLocal().getDescriptionV());
    }

    /**
     * Test of convertirDate method, of class Location.
     * dans la creation de l'objet date on a utiliser le constructeur :
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
