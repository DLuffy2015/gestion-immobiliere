/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionimmobiliere;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author user
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({gestionimmobiliere.AjouterLocataireTest.class, gestionimmobiliere.LocalTest.class, gestionimmobiliere.AjouterLocalTest.class, gestionimmobiliere.PrincipalTest.class, gestionimmobiliere.LocationTest.class, gestionimmobiliere.LocataireTest.class, gestionimmobiliere.AjouterLocationTest.class, gestionimmobiliere.ConxionBDDTest.class})
public class GestionimmobiliereSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
