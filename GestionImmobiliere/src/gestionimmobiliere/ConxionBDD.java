package gestionimmobiliere;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author user
 */
/**
 * 
 * Cette classe permet d'établir la connexion entre le projet sur Netbeans et la BDD sur le serveur.
 */
public class ConxionBDD {


      public static Connection connection = null; // manages connection
      public static Statement stmt = null; // query statement

    public static Statement getStmt() {
        return stmt;
    }
    
      //private static ResultSetMetaData metaData=null;


  //*********************************************************************//

/**
 * Cette méthode permet d'établir la connexion entre le projet et la BDD.
 */
public static void connect() {
   String url = "jdbc:mysql://localhost:3306/agence_immobiliere";

    try {
            // establish connection to database   url , user , password
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            connection = DriverManager.getConnection(url,  "root", "");
            stmt = connection.createStatement();// excute database query codes

        }
            catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,
                                          "Erreur - SQL - lors de la connexion:\n" +
                                          ex.getMessage(),
                                          "ERREUR", JOptionPane.ERROR_MESSAGE);
        }

        catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,
                                          "Erreur - Class not found - lors de la connexion:\n" +
                                          ex.getMessage(), "ERREUR",
                                          JOptionPane.ERROR_MESSAGE);
        }

        catch (IllegalAccessException ex) {
            JOptionPane.showMessageDialog(null,
                                          "Erreur - Illegal access - lors de la connexion:\n" +
                                          ex.getMessage(), "ERREUR",
                                          JOptionPane.ERROR_MESSAGE);
        }

        catch (InstantiationException ex) {
            JOptionPane.showMessageDialog(null,
                                          "Erreur - Instantiation - lors de la connexion:\n" +
                                          ex.getMessage(), "ERREUR",
                                          JOptionPane.ERROR_MESSAGE);
        }
    }

//***********************************************************************//
//------------------------------------------------------------------------------
//                       FONCTION DE DECONNECTION A LA BDD
//------------------------------------------------------------------------------
/**
 * Cette méthode permet de fermer la BDD.
 */
    public static void close() {
        try {
            //statement = connect.createStatement();
            //statement.executeQuery("SHUTDOWN");
            connection.close();
            stmt.close();
        }
         catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,
                                          "Erreur de fermeture de la base de données",
                                          "ERREUR",
                                          JOptionPane.ERROR_MESSAGE);
        }

    }
}
