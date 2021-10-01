/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opcion_c;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Juanma
 */
public class Rutinas extends javax.swing.JFrame {
    private ImageIcon imagen1 = new ImageIcon ("src/opcion_c.Rutinas_images/abs.png");
    /**
     * Creates new form Rutinas
     */
    public Rutinas() {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
        Transparente();
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Work Out");
        setIconImage(new ImageIcon(getClass().getResource("/opcion_c/iconoPesa.png")).getImage());
        
        ImageIcon salir = new ImageIcon ("src/opcion_c/salir.png");
        salir = new ImageIcon(salir.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT));
        MenuSalir.setIcon(salir);
        
        ImageIcon regresar = new ImageIcon ("src/opcion_c/back.png");
        regresar = new ImageIcon(regresar.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
        MenuRegresar.setIcon(regresar);
        
        ImageIcon Acerca = new ImageIcon ("src/opcion_c/info.png");
        Acerca = new ImageIcon(Acerca.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
        MenuAcerca.setIcon(Acerca);
     }
    
    private void Transparente (){
     btnPecho.setOpaque(false);
     btnPecho.setContentAreaFilled(false);
     btnPecho.setBorderPainted(false);
     
     btnBiceps1.setOpaque(false);
     btnBiceps1.setContentAreaFilled(false);
     btnBiceps1.setBorderPainted(false);
     
     btnBiceps2.setOpaque(false);
     btnBiceps2.setContentAreaFilled(false);
     btnBiceps2.setBorderPainted(false);
     
     btnAntebrazo.setOpaque(false);
     btnAntebrazo.setContentAreaFilled(false);
     btnAntebrazo.setBorderPainted(false);
     
     btnAntebrazo2.setOpaque(false);
     btnAntebrazo2.setContentAreaFilled(false);
     btnAntebrazo.setBorderPainted(false);
     
     btnABS.setOpaque(false);
     btnABS.setContentAreaFilled(false);
     btnABS.setBorderPainted(false);
     
     btnTrapecio.setOpaque(false);
     btnTrapecio.setContentAreaFilled(false);
     btnTrapecio.setBorderPainted(false);
     
     btnHombro.setOpaque(false);
     btnHombro.setContentAreaFilled(false);
     btnHombro.setBorderPainted(false);
     
     btnHombro2.setOpaque(false);
     btnHombro2.setContentAreaFilled(false);
     btnHombro2.setBorderPainted(false);
     
     btnPiernas.setOpaque(false);
     btnPiernas.setContentAreaFilled(false);
     btnPiernas.setBorderPainted(false);
     
     btnEspalda.setOpaque(false);
     btnEspalda.setContentAreaFilled(false);
     btnEspalda.setBorderPainted(false);
     
     btnGluteos.setOpaque(false);
     btnGluteos.setContentAreaFilled(false);
     btnGluteos.setBorderPainted(false);
     
     btnFemoral.setOpaque(false);
     btnFemoral.setContentAreaFilled(false);
     btnFemoral.setBorderPainted(false);
     
     btnPantorrilla.setOpaque(false);
     btnPantorrilla.setContentAreaFilled(false);
     btnPantorrilla.setBorderPainted(false);
     
     Triceps1.setOpaque(false);
     Triceps1.setContentAreaFilled(false);
     Triceps1.setBorderPainted(false);
     
     Triceps2.setOpaque(false);
     Triceps2.setContentAreaFilled(false);
     Triceps2.setBorderPainted(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnABS = new javax.swing.JButton();
        btnPecho = new javax.swing.JButton();
        btnBiceps1 = new javax.swing.JButton();
        btnBiceps2 = new javax.swing.JButton();
        btnTrapecio = new javax.swing.JButton();
        btnHombro2 = new javax.swing.JButton();
        btnHombro = new javax.swing.JButton();
        btnAntebrazo = new javax.swing.JButton();
        btnAntebrazo2 = new javax.swing.JButton();
        btnPiernas = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnEspalda = new javax.swing.JButton();
        Triceps1 = new javax.swing.JButton();
        btnGluteos = new javax.swing.JButton();
        btnFemoral = new javax.swing.JButton();
        btnPantorrilla = new javax.swing.JButton();
        Triceps2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuRegresar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MenuAcerca = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        MenuSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/opcion_c/body1.png"))); // NOI18N

        btnABS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnABS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnABSActionPerformed(evt);
            }
        });

        btnPecho.setBorder(null);
        btnPecho.setBorderPainted(false);
        btnPecho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPecho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPechoActionPerformed(evt);
            }
        });

        btnBiceps1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBiceps1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBiceps1ActionPerformed(evt);
            }
        });

        btnBiceps2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBiceps2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBiceps2ActionPerformed(evt);
            }
        });

        btnTrapecio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTrapecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrapecioActionPerformed(evt);
            }
        });

        btnHombro2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHombro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHombro2ActionPerformed(evt);
            }
        });

        btnHombro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHombro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHombroActionPerformed(evt);
            }
        });

        btnAntebrazo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAntebrazo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAntebrazoActionPerformed(evt);
            }
        });

        btnAntebrazo2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAntebrazo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAntebrazo2ActionPerformed(evt);
            }
        });

        btnPiernas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPiernas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPiernasActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/opcion_c/body2.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");

        btnEspalda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEspalda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEspaldaActionPerformed(evt);
            }
        });

        Triceps1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Triceps1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Triceps1ActionPerformed(evt);
            }
        });

        btnGluteos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGluteos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGluteosActionPerformed(evt);
            }
        });

        btnFemoral.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFemoral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFemoralActionPerformed(evt);
            }
        });

        btnPantorrilla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPantorrilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPantorrillaActionPerformed(evt);
            }
        });

        Triceps2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Triceps2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Triceps2ActionPerformed(evt);
            }
        });

        jMenu1.setText("Regresar");

        MenuRegresar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        MenuRegresar.setText("Regresar");
        MenuRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRegresarActionPerformed(evt);
            }
        });
        jMenu1.add(MenuRegresar);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Mas Informacion");

        MenuAcerca.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        MenuAcerca.setText("Acerca De");
        MenuAcerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAcercaActionPerformed(evt);
            }
        });
        jMenu2.add(MenuAcerca);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Salir");

        MenuSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        MenuSalir.setText("Salir");
        MenuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSalirActionPerformed(evt);
            }
        });
        jMenu3.add(MenuSalir);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(btnHombro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(btnABS, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnBiceps1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(btnAntebrazo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(btnBiceps2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(btnTrapecio, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btnAntebrazo2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(btnPecho, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(btnHombro2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(btnPiernas, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(Triceps1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnEspalda, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(btnPantorrilla, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(btnFemoral, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(Triceps2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(btnGluteos, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(btnHombro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(btnABS, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnBiceps1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(btnAntebrazo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(btnBiceps2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(btnTrapecio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(btnAntebrazo2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(btnPecho, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(btnHombro2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(btnPiernas, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(Triceps1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnEspalda, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(190, 190, 190)
                        .addComponent(btnPantorrilla, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(380, 380, 380)
                        .addComponent(btnFemoral, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(Triceps2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(btnGluteos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_MenuSalirActionPerformed

    private void MenuRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRegresarActionPerformed
       Principal p = new Principal ();
       p.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_MenuRegresarActionPerformed

    private void btnABSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnABSActionPerformed
        JOptionPane.showMessageDialog(this, "Seleccionaste Abdomen");
        Abdomen ab = new Abdomen();
        ab.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnABSActionPerformed

    private void btnPechoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPechoActionPerformed
        JOptionPane.showMessageDialog(this, "Seleccionaste Pecho");
        Pecho p = new Pecho();
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnPechoActionPerformed

    private void btnBiceps1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBiceps1ActionPerformed
        JOptionPane.showMessageDialog(this, "Seleccionaste Biceps");
        Bicep b = new Bicep();
        b.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBiceps1ActionPerformed

    private void btnBiceps2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBiceps2ActionPerformed
        JOptionPane.showMessageDialog(this, "Seleccionaste Biceps");
        Bicep b = new Bicep();
        b.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBiceps2ActionPerformed

    private void btnTrapecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrapecioActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Seleccionaste Trapecios");
        Trapecio trap = new Trapecio();
        trap.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnTrapecioActionPerformed

    private void btnHombro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHombro2ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Seleccionaste Hombros");
        Hombro hom = new Hombro();
        hom.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnHombro2ActionPerformed

    private void btnHombroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHombroActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Seleccionaste Hombros");
        Hombro hom = new Hombro();
        hom.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnHombroActionPerformed

    private void btnAntebrazoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAntebrazoActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Seleccionaste Antebrazo");
        Antebrazo a = new Antebrazo();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAntebrazoActionPerformed

    private void btnAntebrazo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAntebrazo2ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Seleccionaste Antebrazos");
        Antebrazo a = new Antebrazo();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAntebrazo2ActionPerformed

    private void btnPiernasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPiernasActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Seleccionaste Cuadriceps");
        Cuadricep c = new Cuadricep();
        c.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnPiernasActionPerformed

    private void btnEspaldaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEspaldaActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Seleccionaste Espalda");
        Espalda e = new Espalda();
        e.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnEspaldaActionPerformed

    private void Triceps1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Triceps1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Seleccionaste Triceps");
        Tricep t = new Tricep();
        t.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Triceps1ActionPerformed

    private void btnGluteosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGluteosActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Seleccionaste Gluteos");
        Gluteo g = new Gluteo();
        g.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnGluteosActionPerformed

    private void btnFemoralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFemoralActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Seleccionaste Biceps Femoral");
        Femoral f = new Femoral();
        f.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnFemoralActionPerformed

    private void btnPantorrillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPantorrillaActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Seleccionaste Pantorrilla");
        Pantorrilla p = new Pantorrilla();
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnPantorrillaActionPerformed

    private void Triceps2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Triceps2ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Seleccionaste Triceps");
        Tricep t = new Tricep();
        t.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Triceps2ActionPerformed

    private void MenuAcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAcercaActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Esta aplicación tiene el propósito de instruir\n"
                + "y orientar a las personas que desean comenzar a realizar ejercicios con pesas\n"
                + "o que ya lo hacen.Es importante mencionar que los ejercicios se deben realizar\n "
                + "con un peso adecuado dependiendo de la habilidad de la persona, si se es\n "
                + "principiante se recomienda realizar los ejercicios con pesos bajos, siempre se\n "
                + "deben de realizar los ejercicios de manera adecuada y segura, se recomienda que\n "
                + "de ser posible el usuario sea supervisado por un instructor de gimnasio, también\n "
                + "es importante usar de manera adecuada los aparatos, maquinas, mancuernas, discos,\n "
                + "seguros, poleas, cuerdas y todo el equipo de un gimnasio*\n");
    }//GEN-LAST:event_MenuAcercaActionPerformed

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
            java.util.logging.Logger.getLogger(Rutinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rutinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rutinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rutinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rutinas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuAcerca;
    private javax.swing.JMenuItem MenuRegresar;
    private javax.swing.JMenuItem MenuSalir;
    private javax.swing.JButton Triceps1;
    private javax.swing.JButton Triceps2;
    private javax.swing.JButton btnABS;
    private javax.swing.JButton btnAntebrazo;
    private javax.swing.JButton btnAntebrazo2;
    private javax.swing.JButton btnBiceps1;
    private javax.swing.JButton btnBiceps2;
    private javax.swing.JButton btnEspalda;
    private javax.swing.JButton btnFemoral;
    private javax.swing.JButton btnGluteos;
    private javax.swing.JButton btnHombro;
    private javax.swing.JButton btnHombro2;
    private javax.swing.JButton btnPantorrilla;
    private javax.swing.JButton btnPecho;
    private javax.swing.JButton btnPiernas;
    private javax.swing.JButton btnTrapecio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
