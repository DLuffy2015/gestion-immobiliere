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
 * @author souad
 */
/**
 *Cette classe permet de créer un objet LOCATAIRE. Elle contient en plus des getters et des stters:
 *Deux constructeurs,
 *Une méthode d'initialisation,
 *Une méthode de suppression,
 *Et une méthode de recherche dans la BDD.
 **/
  public class Locataire {
    
    private String nomV="";
    private String mailV="";
    private String téléphoneV="";
    private String adresseV="";
   /**
    * 
    * Le constructeur de la classe qui permet de créer une instance de la classe en précisant tout ses paramètres.
    * @param nomV le nom du locataire
    * @param mailV l'e_mail du locataire
    * @param téléphoneV le numéro de téléphone du locataire
    * @param adresseV l'adresse du locataire
    */
    public Locataire(String nom,String mail, String telephone, String adresse){
      nomV=nom;
      mailV=mail;
      téléphoneV=telephone;
      adresseV=adresse;
    }
     /**
    * Le constructeur par défaut de la classe.
    */
    public Locataire(){};
    
   /**
    * 
    * Cette méthode retourne le nom du locataire
    * @return le nom du locataire
    */
    public String getNomV() {
        return nomV;
    }
   /**
    * 
    * Cette méthode affecte le paramètre en entrée (nomV) au champs (nomV) de l'instance de la classe
    * @param le nom du locataire
    */
    public void setNomV(String nomV) {
        this.nomV = nomV;
    }
   /**
    * 
    * Cette méthode retourne le mail du locataire
    * @return le mail du locataire
    */
    public String getMailV() {
        return mailV;
    }
   /**
    * 
    * Cette méthode affecte le paramètre en entrée (mailV) au champs (mailV) de l'instance de la classe
    * @param l'e_mail du locataire
    */
    public void setMailV(String mailV) {
        this.mailV = mailV;
    }
   /**
    * 
    * Cette méthode retourne le numéro de téléphone du locataire
    * @return le numéro de telephone du locataire
    */
    public String getTéléphoneV() {
        return téléphoneV;
    }
   /**
    * 
    * Cette méthode affecte le paramètre en entrée (téléphoneV) au champs (téléphoneV) de l'instance de la classe
    * @param le numéro de telephone du locataire
    */
    public void setTéléphoneV(String téléphoneV) {
        this.téléphoneV = téléphoneV;
    }
   /**
    * 
    * Cette méthode retourne l'adresse du locataire
    * @return l'adresse du locataire
    */
    public String getAdresseV() {
        return adresseV;
    }
   /**
    * 
    * Cette méthode affecte le paramètre en entrée (adresseV) au champs (adresseV) de l'instance de la classe
    *@param l'adresse du locataire
    */
    public void setAdresseV(String adresseV) {
        this.adresseV = adresseV;
    }
    
    
   /**
    * Cette méthode recherche un locataire par son nom . 
    * Elle retourne un entier: égal à -1 si le locataire n'existent pas dans la table 'locataire' de la BDD;
    * sinon, elle retourne l'id du locataire.
    * @return id du locataire dans la base de donnée
    */ 
    public int rechercherLocataire(){ 
      int i=-1;
      try{
            String query;
            query= " SELECT id FROM locataire  WHERE nom = '"+this.nomV+"'";
            ConxionBDD.stmt.getMoreResults(Statement.KEEP_CURRENT_RESULT);
            ResultSet rs= ConxionBDD.stmt.executeQuery(query);
            while(rs.next()) i=rs.getInt(1);

         }catch ( SQLException sqlException )
                 {
                   sqlException.printStackTrace();
                 }
      return i;
     }
     
     
   /**
    * Cette méthode permet d'insérer un locataire dans la BDD.
    */
    public void insererLocataire(){
      String query="INSERT INTO locataire (nom, mail, telephone,adresse ) VALUES ('"+this.nomV+"','" +this.mailV+"','" +this.téléphoneV+"','"+this.adresseV+"')";
      try {
            ConxionBDD.stmt.executeUpdate(query);
          } catch (SQLException ex) 
          {
            Logger.getLogger(AjouterLocal.class.getName()).log(Level.SEVERE, null, ex);
          }
        
    
     }
    /**
     * Cette méthode permet de supprimer un locataire de la BDD 
     * @param idLocataire l'id du locataire dans la base de donnée
     */
     public void supprimerLocataire(int idLocataire){
       try {
            String query = "DELETE FROM locataire WHERE id = "+idLocataire;
            ConxionBDD.stmt.executeUpdate(query);
           } catch (SQLException sqlException )
                   {  
                     sqlException.printStackTrace();
                   }
     }  
}
