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

    public int getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(int idLocal) {
        this.idLocal = idLocal;
    }

    public String getEtageNporteV() {
        return etageNporteV;
    }

    public void setEtageNporteV(String etageNporteV) {
        this.etageNporteV = etageNporteV;
    }

    public String getSurfaceV() {
        return surfaceV;
    }

    public void setSurfaceV(String surfaceV) {
        this.surfaceV = surfaceV;
    }

    public int getFiV() {
        return FiV;
    }

    public void setFiV(int FiV) {
        this.FiV = FiV;
    }

    public String getPrixV() {
        return prixV;
    }

    public void setPrixV(String prixV) {
        this.prixV = prixV;
    }

    public String getDescriptionV() {
        return descriptionV;
    }

    public void setDescriptionV(String descriptionV) {
        this.descriptionV = descriptionV;
    }

    public String getDateDebutV() {
        return dateDebutV;
    }

    public void setDateDebutV(String dateDebutV) {
        this.dateDebutV = dateDebutV;
    }

    public String getDureeV() {
        return dureeV;
    }

    public void setDureeV(String dureeV) {
        this.dureeV = dureeV;
    }

    public String getVersementV() {
        return versementV;
    }

    public void setVersementV(String versementV) {
        this.versementV = versementV;
    }

    public int getLocataireV() {
        return locataireV;
    }

    public void setLocataireV(int locataireV) {
        this.locataireV = locataireV;
    }

   
   
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
 * Cette méthode recherche un local par son: etageNporte, prix, surface, nombrePieces, et sa description
 * Elle retourne un entier: égal à -1 si la table 'locaux' dans la BDD est vide;
 * sinon, elle retourne l'id du dernier local existant dans la table 'locaux'.
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
    {  sqlException.printStackTrace(); }
return i;
}

   
}
