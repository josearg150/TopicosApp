/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package opcion_c;

import static java.awt.SystemColor.desktop;
import java.io.IOException;
import java.net.URISyntaxException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Juanma
 */
public class Bicep extends javax.swing.JFrame {

    /** Creates new form Bicep */
    public Bicep() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/opcion_c/pesas.png")).getImage());
        setLocationRelativeTo(null);
        setTitle("Bicep");
        setSize(760, 710);
        setResizable(false);
        ImageIcon icono = new ImageIcon("src/opcion_c/toBack.png"); 
        ImageIcon ej1 = new ImageIcon("src/opcion_c/40.png");
        ImageIcon ej2 = new ImageIcon("src/opcion_c/41.png");
        ImageIcon ej3 = new ImageIcon("src/opcion_c/42.png");
        ImageIcon ver = new ImageIcon("src/opcion_c/ver.png");
        Regresar.setIcon(icono);
        jLabel3.setIcon(ej1);
        jLabel5.setIcon(ej2);
        jLabel7.setIcon(ej3);
        jButton1.setIcon(ver);
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Regresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Regresar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/opcion_c/toBack.png"))); // NOI18N
        Regresar.setText("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Ejercicios");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Curl de Biceps Con Barra");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("De pie, sostenga una barra con las manos colocadas a una separación \nligeramente mayor que la anchura de sus hombros, con las palmas hacia \nadelante. Flexione ambos brazos sin impulsarse con el cuerpo.Descienda la \nbarra de forma lenta. Mantenga la espalda derecha durante todo el ejercicio.\nRutina de biceps:4 series de 8-10 repeticiones.");
        jScrollPane1.setViewportView(jTextArea1);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/opcion_c/40.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Curl de Bicep en Predicador Con Barra");

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("Sentado en una banca para predicador, sostenga una barra con las \nmanos colocadas a una separación igual que la anchura de sus \nhombros, con las palmas hacia adentro.Extienda ambos brazos para \ndescender la barra. Ascienda la carga por medio de la flexión de sus \nbrazos. Las ejecuciones en predicador, son de los mejores ejercicios \nde biceps.  Rutina para biceps:4 series de 13 repeticiones.");
        jScrollPane2.setViewportView(jTextArea2);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/opcion_c/41.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Curl Alterno Con Mancuernas");

        jTextArea3.setEditable(false);
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextArea3.setRows(5);
        jTextArea3.setText("Sentado o de pie, sostenga una mancuerna en cada mano. \nLa posición de inicio consiste en flexionar un brazo y extender el otro\nInicie el ejercicio para biceps extendiendo el brazo flexionado al mismo\ntiempo que flexiona el brazo extendido.Continue realizando el mismo \nmovimiento anterior de forma sucesiva, manteniendo la espalda derecha y\nlos brazos fijos. Rutina de biceps:4 series de 18 repeticiones. \nUna repetición se cuenta con la flexión de cada brazo.");
        jScrollPane3.setViewportView(jTextArea3);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/opcion_c/42.png"))); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/opcion_c/ver.png"))); // NOI18N
        jButton1.setText("Ver Un Video");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(151, 151, 151)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel5))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(jLabel7))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Regresar)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel2)))
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1)
                        .addGap(13, 13, 13)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3)
                        .addGap(16, 16, 16)
                        .addComponent(jButton1)))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(13, 13, 13)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        Rutinas r =  new Rutinas();
        r.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RegresarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(java.awt.Desktop.isDesktopSupported()){
          java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
          
          if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
             try{
              java.net.URI uri = new java.net.URI("https://www.youtube.com/watch?v=8n_TI8J5F6U");
              desktop.browse(uri);
             } catch(URISyntaxException| IOException ex){JOptionPane.showMessageDialog(this, "Ha Ocurrido Un Error, Compruebe Su Conexion");
                }
          }
        }
          
          
         
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Bicep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bicep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bicep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bicep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bicep().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Regresar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    // End of variables declaration//GEN-END:variables

}
