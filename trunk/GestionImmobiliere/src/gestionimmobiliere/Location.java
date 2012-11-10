/*2
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionimmobiliere;


import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class Location {
    private Locataire locataire;
    private Local local;

     public Location(Locataire locataire,Local local){
     this.locataire=locataire;
     this.local=local;
     }
     public Location(){}
     
    public Locataire getLocataire() {
        return locataire;
    }

    public void setLocataire(Locataire locataire) {
        this.locataire = locataire;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
    
    
    
    public void miseAJourLocal(){
    String query = "UPDATE locaux SET locataire = '"+this.getLocal().getLocataireV()+"' ,versement = '"+this.getLocal().getVersementV()+"' , dateDebut = "+this.getLocal().getDateDebutV()+" ,prix='"+this.getLocal().getPrixV()+"' duree = '"+this.getLocal().getDureeV()+"', description ='"+this.getLocal().getDescriptionV()+"' WHERE id = "+this.getLocal().getIdLocal() ;
            try {
                ConxionBDD.stmt.executeUpdate(query);
            } catch (SQLException ex) {
                Logger.getLogger(AjouterLocation.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

    public static java.util.Date convertirDate(String date) {
     java.util.Date dateC=null;
       
      SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        try {
            dateC= (java.util.Date) formatter.parse(date);
        } catch (ParseException ex) {
            Logger.getLogger(AjouterLocation.class.getName()).log(Level.SEVERE, null, ex);
        }
      return dateC;
}
  
}
