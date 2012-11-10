/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionimmobiliere;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
    
    public void initialiserLocation(){
        ResultSet rs;
        String query =" SELECT locaux.etageNumPorte, locaux.surface,locaux.versement,locaux.prix,locaux.dateDebut,locaux.duree,locaux.description,locataire.nom FROM locaux LEFT JOIN locataire on locaux.locataire=locataire.id WHERE locaux.id = "+local.getIdLocal();
        try {
             ConxionBDD.stmt.getMoreResults(Statement.KEEP_CURRENT_RESULT);
             rs = ConxionBDD.stmt.executeQuery(query);
        
             while(rs.next()){ 
             locataire.setNomV(rs.getString(8));
             local.setEtageNporteV(rs.getString(1));
             local.setSurfaceV(rs.getString(2));
             local.setVersementV(rs.getString(3));
             local.setDateDebutV(rs.getString(5));
             local.setPrixV(rs.getString(4));
             local.setDureeV(rs.getString(6));
             local.setDescriptionV(rs.getString(7));
                     }
        } catch (SQLException ex) {
            Logger.getLogger(AjouterLocation.class.getName()).log(Level.SEVERE, null, ex);
        }}
    
    public void miseAJourLocal(){
    String query = "UPDATE locaux SET locataire = "+local.getLocataireV()+" ,versement = '"+local.getVersementV()+"' , dateDebut = "+local.getDateDebutV()+" ,prix='"+local.getPrixV()+"' duree = '"+local.getDureeV()+"', description ='"+local.getDescriptionV()+"' WHERE id = "+local.getIdLocal() ;
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
