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
 * @author souad   
 */
/**
 *Cette classe permet de créer un objet LOCATION. Elle contient en plus des getters et des stters:
 *Deux constructeurs,
 *Une méthode d'initialisation,
 *Et une méthode de mise à jour dans la BDD.
 * 
 **/
 public class Location {
    private Locataire locataire;
    private Local local;
   /**
    * 
    * Le constructeur de la classe qui permet de créer une instance de la classe en précisant tout ses paramètres.
    * @param locataire est le locataire conserné par la location
    * @param local est le local conserné par la location
    */

     public Location(Locataire locataire,Local local){
     this.locataire=locataire;
     this.local=local;
     }
   /**
    * Le constructeur par défaut de la classe.
    */

     public Location(){
     locataire=new Locataire();
     local=new Local();}
   /**
    * 
    * Cette méthode retourne le locataire correspondant à la location
    * @return le locataire
    */
    public Locataire getLocataire() {
        return locataire;
    }
   /**
    * 
    * Cette méthode affecte le paramètre en entrée (locataire) au champs (locataire) de l'instance de la classe
    * @param locataire 
    */

    public void setLocataire(Locataire locataire) {
        this.locataire = locataire;
    }
   /**
    * 
    * Cette méthode retourne le local correspondant à la location 
    * @return local
    */
    public Local getLocal() {
        return local;
    }
   /**
    * 
    * Cette méthode affecte le paramètre en entrée (local) au champs (local) de l'instance de la classe
    * @param local
    */
    public void setLocal(Local local) {
        this.local = local;
    }
     
     
    /**
     * Cette méthode permet d'initialiser la location avec les coordonnées du local et l'id du locataire correspondant à l'id du local choisi.
     */
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
            } catch (SQLException ex) 
                    {
                      Logger.getLogger(AjouterLocation.class.getName()).log(Level.SEVERE, null, ex);
                    }
    }
    /**
     * Cette méthode permet de mettre à jour le local 
     */
    public void miseAJourLocal(){
       String query = "UPDATE locaux SET locataire = "+local.getLocataireV()+" , versement = '"+local.getVersementV()+"' , dateDebut = '"+local.getDateDebutV()+"' , prix= '"+local.getPrixV()+"', duree = '"+local.getDureeV()+"', description = '"+local.getDescriptionV()+"' WHERE id = "+local.getIdLocal() ;
            try {
                ConxionBDD.stmt.executeUpdate(query);
                } catch (SQLException ex)
                       {
                          Logger.getLogger(AjouterLocation.class.getName()).log(Level.SEVERE, null, ex);
                       }
    }
    
    
    /**
     * Cette méthode permet de convertir une chaine de caractères à un objet Date de java. 
     * @param date de type string (chaine de caractère)
     * @return date un objet de java
     */
    public static java.util.Date convertirDate(String date) {
      java.util.Date dateC=null;
      SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
      try {
            dateC= (java.util.Date) formatter.parse(date);
          } catch (ParseException ex)
                  {
                    Logger.getLogger(AjouterLocation.class.getName()).log(Level.SEVERE, null, ex);
                  }
      return dateC;
    }
  
}
