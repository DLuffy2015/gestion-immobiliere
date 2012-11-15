/*2
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
/**
 *Cette classe permet de créer un objet LOCAL. Elle contient en plus des getters et des stters:
 *Deux constructeurs,
 *Une méthode d'insertion dans la BDD,
 *Une méthode de suppression,
 *Et une méthode de recherche dans la BDD.
 **/
public class Local {
   private int idLocal;
   private String etageNporteV;
   private String surfaceV;
   private int FiV;
   private String prixV;
   private String descriptionV;  
   private String dateDebutV;
   private String dureeV;
   private String versementV;
   private int locataireV;

   /**
    * 
    * Le constructeur de la classe qui permet de créer une instance de la classe en précisant tout ses paramètres.
    * 
    */
   public Local(int idLocal,String etageNporteV,String surfaceV,int FiV,String prixV,String descriptionV,String dateDebutV,String dureeV,String versementV,int locataireV){
   this.idLocal=idLocal;
   this.etageNporteV=etageNporteV;
   this.surfaceV=surfaceV;
   this.FiV=FiV;
   this.prixV=prixV;
   this.descriptionV=descriptionV;  
   this.dateDebutV=dateDebutV;
   this.dureeV=dureeV;
   this.versementV=versementV;
   this.locataireV=locataireV;}
 /**
    * Le constructeur par défaut de la classe.
    */
    Local() {}
   
    /**
    * 
    * Cette méthode retourne l'id du local 
    */
     public int getIdLocal() {
        return idLocal;
    }
    /**
 * 
 * Cette méthode affecte le paramètre en entrée (idLocal) au champs (idLocal) de l'instance de la classe
 */
    public void setIdLocal(int idLocal) {
        this.idLocal = idLocal;
    }

    /**
    * 
    * Cette méthode retourne l'étage et le numéro du local 
    */
    public String getEtageNporteV() {
        return etageNporteV;
    }
/**
 * 
 * Cette méthode affecte le paramètre en entrée (etageNporteV) au champs (etageNporteV) de l'instance de la classe
 */
    public void setEtageNporteV(String etageNporteV) {
        this.etageNporteV = etageNporteV;
    }
/**
    * 
    * Cette méthode retourne la surface du local 
    */
    public String getSurfaceV() {
        return surfaceV;
    }
/**
 * 
 * Cette méthode affecte le paramètre en entrée (surfaceV) au champs (surfaceV) de l'instance de la classe
 */
    public void setSurfaceV(String surfaceV) {
        this.surfaceV = surfaceV;
    }
/**
    * 
    * Cette méthode retourne le nombre de pièces du local
    */
    public int getFiV() {
        return FiV;
    }
/**
 * 
 * Cette méthode affecte le paramètre en entrée (FiV) au champs (FiV) de l'instance de la classe
 */
    public void setFiV(int FiV) {
        this.FiV = FiV;
    }
/**
    * 
    * Cette méthode retourne le prix de la location du local
    */
    public String getPrixV() {
        return prixV;
    }
/**
 * 
 * Cette méthode affecte le paramètre en entrée (prixV) au champs (prixV) de l'instance de la classe
 */
    public void setPrixV(String prixV) {
        this.prixV = prixV;
    }
/**
    * 
    * Cette méthode retourne la description du local
    */
    public String getDescriptionV() {
        return descriptionV;
    }
/**
 * 
 * Cette méthode affecte le paramètre en entrée (descriptionV) au champs (descriptionV) de l'instance de la classe
 */
    public void setDescriptionV(String descriptionV) {
        this.descriptionV = descriptionV;
    }
/**
    * 
    * Cette méthode retourne la date de début de la location
    */
    public String getDateDebutV() {
        return dateDebutV;
    }
/**
 * 
 * Cette méthode affecte le paramètre en entrée (dateDebutV) au champs (dateDebutV) de l'instance de la classe
 */
    public void setDateDebutV(String dateDebutV) {
        this.dateDebutV = dateDebutV;
    }
/**
    * 
    * Cette méthode retourne la durée de la location
    */
    public String getDureeV() {
        return dureeV;
    }
/**
 * 
 * Cette méthode affecte le paramètre en entrée (dureeV) au champs (dureeV) de l'instance de la classe
 */
    public void setDureeV(String dureeV) {
        this.dureeV = dureeV;
    }
/**
    * 
    * Cette méthode retourne le versement donné pour la location
    */
    public String getVersementV() {
        return versementV;
    }
/**
 * 
 * Cette méthode affecte le paramètre en entrée (versementV) au champs (versementV) de l'instance de la classe
 */
    public void setVersementV(String versementV) {
        this.versementV = versementV;
    }
/**
    * 
    * Cette méthode retourne le locataire 
    */
    public int getLocataireV() {
        return locataireV;
    }
/**
 * 
 * Cette méthode affecte le paramètre en entrée (locataireV) au champs (locataireV) de l'instance de la classe
 */
    public void setLocataireV(int locataireV) {
        this.locataireV = locataireV;
    }

   
    /**
    * Cette méthode permet d'insérer un local dans la BDD.
    */
   public void insererLocal()
   {
   String query="INSERT INTO locaux (etageNumPorte, prix, surface, description, nombrePieces ) VALUES ('"+this.etageNporteV+"','" +this.prixV+"','" +this.surfaceV+"','"+this.descriptionV+"',"+this.FiV+")";
          try {
          
            ConxionBDD.stmt.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(AjouterLocal.class.getName()).log(Level.SEVERE, null, ex);
        }
   
       }
   
   /**
 * Cette méthode recherche un local par son étage et le numéro de porte, le prix, la surface, le nombre de pièces et la description du local
 * Elle retourne un entier: égal à -1 si le local n'existe pas dans la table 'locaux' de la BDD;
 * sinon, elle retourne l'id du local correspondant aux critères de recherche.
 * @return 
 */ 
   public int rechercherLocal()
{ int i=-1;
try{
String query;
      
query= " SELECT idLocal FROM locaux  WHERE etageNumPorte = '"+this.etageNporteV+"' AND prix = "+this.prixV+" AND surface = "+this.surfaceV+" AND  nombrePieces = "+this.FiV+" AND description = '"+this.descriptionV+"'";
ConxionBDD.stmt.getMoreResults(Statement.KEEP_CURRENT_RESULT);
ResultSet rs= ConxionBDD.stmt.executeQuery(query);
while(rs.next()) i=rs.getInt(1);

  }catch ( SQLException sqlException )
    {}
return i;
}

   /**
    *Cette méthode permet de supprimer un local de la BDD 
    */
   public void supprimerLocal()
   { try {
            String query = "DELETE FROM locaux WHERE idLocal = "+idLocal;
            ConxionBDD.stmt.executeUpdate(query);
        } catch (SQLException sqlException )
    {  sqlException.printStackTrace(); }
    }
}