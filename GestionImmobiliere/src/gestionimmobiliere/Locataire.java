/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionimmobiliere;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class Locataire {
    
    private String nomV="";
    private String mailV="";
    private String téléphoneV="";
    private String adresseV="";

    public String getNomV() {
        return nomV;
    }

    public void setNomV(String nomV) {
        this.nomV = nomV;
    }

    public String getMailV() {
        return mailV;
    }

    public void setMailV(String mailV) {
        this.mailV = mailV;
    }

    public String getTéléphoneV() {
        return téléphoneV;
    }

    public void setTéléphoneV(String téléphoneV) {
        this.téléphoneV = téléphoneV;
    }

    public String getAdresseV() {
        return adresseV;
    }

    public void setAdresseV(String adresseV) {
        this.adresseV = adresseV;
    }
    
    
    /**
 * Cette méthode retourne un entier: égal à -1 si la table 'locataire' dans la BDD est vide;
 * sinon, elle retourne l'id du dernier locataire existant dans la table 'locataire'.
 * @return 
 */ 
    public int rechercheNom(){
    int i=-1;
    ResultSet rs = null;
    String query ="SELECT id FROM locataire WHERE nom = '"+this.nomV+"'";
        try {
              ConxionBDD.stmt.getMoreResults(Statement.KEEP_CURRENT_RESULT);
              rs = ConxionBDD.stmt.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while(rs.next()){i=rs.getInt(1);}
        } catch (SQLException ex) {
            Logger.getLogger(AjouterLocataire.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
}
    public void insererLocataire(){
    String query="INSERT INTO locataire (nom, mail, telephone,adresse ) VALUES ('"+this.nomV+"','" +this.mailV+"','" +this.téléphoneV+"','"+this.adresseV+"')";
      try {
          
            ConxionBDD.stmt.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(AjouterLocal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    }
    
    public int rechercherLocataire()
    { 
      int i=-1;
    try{
            String query;
            query= " SELECT idLocataire FROM locataire  WHERE nomPrenom = '"+this.getNomV()+"'";
            ConxionBDD.stmt.getMoreResults(Statement.KEEP_CURRENT_RESULT);
             ResultSet rs= ConxionBDD.stmt.executeQuery(query);
            while(rs.next()) i=rs.getInt(1);

        }catch ( SQLException sqlException )
                                            {  sqlException.printStackTrace(); }
      return i;
     }
}
