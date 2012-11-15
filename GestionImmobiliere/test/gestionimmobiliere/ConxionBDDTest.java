/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionimmobiliere;

import java.sql.Statement;
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
public class ConxionBDDTest {
    
    public ConxionBDDTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
  

    /**
     * Test of getStmt method, of class ConxionBDD.
     */
    @Test
    public void testGetStmt() {
        System.out.println("getStmt");
        Statement expResult = null;
        Statement result = ConxionBDD.getStmt();
        assertTrue(expResult!=result);
       
    }

   
}
