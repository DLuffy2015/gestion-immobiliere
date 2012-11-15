package gestionimmobiliere;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
/**
 *
 * Cette classe permet de créer la fenêtre d'acceuil du projet.
 * Elle affiche les locaux et les locataires existants dans la BDD dans deux tables.
 * A partir de cette fenêtre, l'utilisateur peut lancer la fenêtre d'ajout de local ou de locataire, 
 * ou lancer la recherche d'un local.
 * Elle contient un constructeur et deux méthodes d'initialisation de tables.
 */
public class Principal extends javax.swing.JFrame {

/**
    * 
    * Le constructeur de la classe permet de créer une instance de la classe en initialisant la table des locaux et 
    * la table des locataires avec tout les locaux et locataires existants dans la BDD.
    * 
    */
    public Principal() {
        initComponents();
        initTabLocaux( " SELECT locaux.id,locaux.etageNumPorte, locaux.nombrePieces,locaux.prix,agence_immobiliere.locataire.nom FROM locaux LEFT JOIN locataire on agence_immobiliere.locaux.locataire=agence_immobiliere.locataire.id WHERE 1");
        initTabLocataires();
        this.setLocationRelativeTo(null);
    }

    /**
     * Cette méthode est appellée dans le constructeur pour initialiser la fenêtre.
     * Attention: Ne pas modifier son code!
     * 
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuTabLocaux = new javax.swing.JPopupMenu();
        AjoutLocation = new javax.swing.JMenuItem();
        SuppLocation = new javax.swing.JMenuItem();
        menuTabLocataires = new javax.swing.JPopupMenu();
        SuppLocataire = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        AjouLocal = new javax.swing.JButton();
        AjouLocataire = new javax.swing.JButton();
        Apropo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        lancerRecherche = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        critereRechercher = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        detailRecherche = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        AjoutLocation.setText("Modifier la location");
        AjoutLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjoutLocationActionPerformed(evt);
            }
        });
        menuTabLocaux.add(AjoutLocation);

        SuppLocation.setText("supprimerLocation");
        SuppLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuppLocationActionPerformed(evt);
            }
        });
        menuTabLocaux.add(SuppLocation);

        SuppLocataire.setText("supprimerLocataire");
        SuppLocataire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuppLocataireActionPerformed(evt);
            }
        });
        menuTabLocataires.add(SuppLocataire);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Acceuil");

        AjouLocal.setText("Ajouter un local");
        AjouLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjouLocalActionPerformed(evt);
            }
        });

        AjouLocataire.setText("Ajouter un locataire");
        AjouLocataire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjouLocataireActionPerformed(evt);
            }
        });

        Apropo.setText("A propos");
        Apropo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApropoActionPerformed(evt);
            }
        });

        jLabel3.setText("jLabel3");

        jLabel4.setText("75M² -3pieces-1er etage");

        jLabel5.setText("centre Ain benian");

        jLabel6.setText("prix 22milles dinars(Négociable)");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AjouLocal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AjouLocataire, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(Apropo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AjouLocal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AjouLocataire)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(Apropo)
                .addGap(46, 46, 46))
        );

        jTable1.setModel(model);
        jTable1.setShowHorizontalLines(false);

        jTable1.setShowVerticalLines(false);

        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        lancerRecherche.setText("Lancer");
        lancerRecherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lancerRechercheActionPerformed(evt);
            }
        });

        jLabel1.setText("Recherche par:");

        critereRechercher.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Aucune", "Prix", "Nombre de pieces", "Disponibilité", "Non disponibilité" }));
        critereRechercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                critereRechercherActionPerformed(evt);
            }
        });

        jLabel2.setText("Détail");

        detailRecherche.setEnabled(false);
        detailRecherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailRechercheActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lancerRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(critereRechercher, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(detailRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(critereRechercher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(detailRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lancerRecherche))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTable2.setModel(model1);
        jTable1.setShowHorizontalLines(false);

        jTable1.setShowVerticalLines(false);

        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        jMenu1.setText("Menu");

        jMenuItem1.setText("Quitter");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AjouLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjouLocalActionPerformed
   AjouterLocal local=new AjouterLocal();
   local.setVisible(true);
    }//GEN-LAST:event_AjouLocalActionPerformed

    private void ApropoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApropoActionPerformed
      
    }//GEN-LAST:event_ApropoActionPerformed

    private void AjouLocataireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjouLocataireActionPerformed
        AjouterLocataire locataire=new AjouterLocataire();
        locataire.setVisible(true);
    }//GEN-LAST:event_AjouLocataireActionPerformed

    private void critereRechercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_critereRechercherActionPerformed
        critereRech=critereRechercher.getSelectedIndex();
        if(critereRech==0) {
            detailRecherche.setEnabled(false);
        }
        else {
            detailRecherche.setEnabled(true);
        }
    }//GEN-LAST:event_critereRechercherActionPerformed

    private void detailRechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailRechercheActionPerformed
detailRech=detailRecherche.getText();
    }//GEN-LAST:event_detailRechercheActionPerformed

    private void lancerRechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lancerRechercheActionPerformed
        
        if(critereRech!=0){
    switch (critereRech)
       {
           case 1: 
           {initTabLocaux( " SELECT locaux.id,locaux.etageNumPorte, locaux.nombrePieces,locaux.prix,locataire.nom FROM locaux LEFT JOIN locataire on locaux.locataire=locataire.id WHERE locaux.prix = '"+detailRech+"'");
           }break;
           case 2:
           {initTabLocaux( " SELECT locaux.id,locaux.etageNumPorte, locaux.nombrePieces,locaux.prix,locataire.nom FROM locaux LEFT JOIN locataire on locaux.locataire=locataire.id WHERE locaux.nombrePieces = "+detailRech);
           }break;
           case 3:
           {initTabLocaux( " SELECT locaux.id,locaux.etageNumPorte, locaux.nombrePieces,locaux.prix,locataire.nom FROM locaux LEFT JOIN locataire on locaux.locataire=locataire.id WHERE locaux.locataire = null");
           }break;
           case 4:
           {initTabLocaux( " SELECT locaux.id,locaux.etageNumPorte, locaux.nombrePieces,locaux.prix,locataire.nom FROM locaux LEFT JOIN locataire on locaux.locataire=locataire.id WHERE locaux.locataire != null");
           }break;
        }    }
            
    }//GEN-LAST:event_lancerRechercheActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
    if((evt.getButton()==3)&&(jTable1.getSelectedRowCount()==1)){
            menuTabLocaux.show(jTable1,evt.getX(),evt.getY());
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void AjoutLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjoutLocationActionPerformed
        try {
            int det=jTable1.getSelectedRow() ;
                  boolean rsVide=rsLocaux.first();
                 if(rsVide){
                   rsLocaux.absolute(det+1);
                   AjouterLocation location=new AjouterLocation( rsLocaux.getInt(1));
                   location.setVisible(true);
                 }
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_AjoutLocationActionPerformed

    private void SuppLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuppLocationActionPerformed
     try {
            int det=jTable1.getSelectedRow() ;
                  boolean rsVide=rsLocaux.first();
                 if(rsVide){
                   rsLocaux.absolute(det+1);
                  localASupprimer.setIdLocal(rsLocaux.getInt(1));
                  localASupprimer.supprimerLocal();
                  ConxionBDD.stmt.getMoreResults(Statement.KEEP_CURRENT_RESULT);
                  initTabLocaux( " SELECT locaux.id,locaux.etageNumPorte, locaux.nombrePieces,locaux.prix,agence_immobiliere.locataire.nom FROM locaux LEFT JOIN locataire on agence_immobiliere.locaux.locataire=agence_immobiliere.locataire.id WHERE 1");
                 }
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_SuppLocationActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        if((evt.getButton()==3)&&(jTable2.getSelectedRowCount()==1)){
            menuTabLocataires.show(jTable2,evt.getX(),evt.getY());
        }
    }//GEN-LAST:event_jTable2MouseClicked

    private void SuppLocataireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuppLocataireActionPerformed
        try {
            int det=jTable2.getSelectedRow() ;
               boolean rsVide=rsLocataires.first();
              if(rsVide){
                rsLocataires.absolute(det+1);
                locataireASupprimer.supprimerLocataire(rsLocataires.getInt(1));
                ConxionBDD.stmt.getMoreResults(Statement.KEEP_CURRENT_RESULT);
                initTabLocataires();
                ConxionBDD.stmt.getMoreResults(Statement.KEEP_CURRENT_RESULT);
                initTabLocaux( " SELECT locaux.id,locaux.etageNumPorte, locaux.nombrePieces,locaux.prix,agence_immobiliere.locataire.nom FROM locaux LEFT JOIN locataire on agence_immobiliere.locaux.locataire=agence_immobiliere.locataire.id WHERE 1");
              }
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SuppLocataireActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ConxionBDD.connect();
                new Principal().setVisible(true);
            }
        });
    }
    /**
     * 
     * @param query 
     * Cette méthode permet d'initialiser la table des locaux avec tout les locaux existants dans la BDD.
     */
    public static void initTabLocaux(String query){
        try {
            ConxionBDD.stmt.getMoreResults(Statement.KEEP_CURRENT_RESULT);
            rsLocaux= ConxionBDD.stmt.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
 int row=0;
 while(jTable1.getRowCount()!=0){  model.removeRow(0); } 
        try {
            while(rsLocaux.next()){

            if(row>=jTable1.getRowCount())
            {
            model.insertRow(jTable1.getRowCount(),new Object[]{"","","",""});}
            jTable1.setValueAt(rsLocaux.getString(2),row,0);
            jTable1.setValueAt(rsLocaux.getString(3),row,1);
            jTable1.setValueAt(rsLocaux.getString(4),row,2);
            jTable1.setValueAt(rsLocaux.getString(5),row,3); 
            row++;
            }       
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    /**
     * 
     * Cette méthode permet d'initialiser la table des locataires avec tout les locataires existants dans la BDD.
     */
    public static void initTabLocataires(){
    String query;
query ="SELECT id, nom, telephone, mail, adresse FROM locataire WHERE 1";
        try {
              ConxionBDD.stmt.getMoreResults(Statement.KEEP_CURRENT_RESULT);
              rsLocataires = ConxionBDD.stmt.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        int row=0;
 while(jTable2.getRowCount()!=0){  model1.removeRow(0); } 
        try {
            while(rsLocataires.next()){

            if(row>=jTable2.getRowCount())
            {
            model1.insertRow(jTable2.getRowCount(),new Object[]{"","","",""});}
            jTable2.setValueAt(rsLocataires.getString(2),row,0);
            jTable2.setValueAt(rsLocataires.getString(4),row,1);
            jTable2.setValueAt(rsLocataires.getString(3),row,2);
            jTable2.setValueAt(rsLocataires.getString(5),row,3); 
            row++;
            }       
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
    
    
   private static DefaultTableModel model=new DefaultTableModel(
    new Object [][] {
        {null, null, null, null}     
    },
    new String [] {
      "N° de porte", "Nombre de pieces","Prix", "Locataire"  }
) {
    boolean[] canEdit = new boolean [] {
        false, false, false, false
    };

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
    }
};
     
  private static  DefaultTableModel model1=new DefaultTableModel(
    new Object [][] {
        {null, null, null, null}     
    },
    new String [] {
      "Nom et prénom", "E_mail","Téléphone","Adresse" }
) {
    boolean[] canEdit = new boolean [] {
        false, false, false, false
    };

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
    }
};
    private int critereRech=0;
    private String detailRech="";
    private static ResultSet rsLocaux;
    private static ResultSet rsLocataires;
    private Local localASupprimer=new Local();
    private Locataire locataireASupprimer=new Locataire();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AjouLocal;
    private javax.swing.JButton AjouLocataire;
    private javax.swing.JMenuItem AjoutLocation;
    private javax.swing.JButton Apropo;
    private javax.swing.JMenuItem SuppLocataire;
    private javax.swing.JMenuItem SuppLocation;
    private javax.swing.JComboBox critereRechercher;
    private javax.swing.JTextField detailRecherche;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private static javax.swing.JTable jTable1;
    private static javax.swing.JTable jTable2;
    private javax.swing.JButton lancerRecherche;
    private javax.swing.JPopupMenu menuTabLocataires;
    private javax.swing.JPopupMenu menuTabLocaux;
    // End of variables declaration//GEN-END:variables
}
