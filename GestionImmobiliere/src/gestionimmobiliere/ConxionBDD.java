package gestionimmobiliere;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author souad
 */
/**
 * 
 * Cette classe permet d'établir la connexion entre le projet sur Netbeans et la BDD sur le serveur.
 */
public class ConxionBDD {


    public static Connection connection ; 
    public static Statement stmt ; 
    
    public ConxionBDD(){
        connection = null;
        stmt = null;
    }

    /**
     * Cette méthode retourne l'objet statement 
     * @return un objet de type statement qui permet l'execution des requettes sql
     */
    public static Statement getStmt() {
        return stmt;
    }
    
  
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


/**
 * Cette méthode permet de fermer la connexion avec la BDD.
 *
 */
    public static void close() {
        try {
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
