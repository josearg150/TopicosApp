/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opcion_c;

import java.awt.Color;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSlider;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Juanma
 */
public class GrasaCorporal extends javax.swing.JFrame {
        private ImageIcon imagen1 = new ImageIcon ("src/opcion_c/1.png");
        private ImageIcon imagen2 = new ImageIcon ("src/opcion_c/2.png");
        private ImageIcon imagen3 = new ImageIcon ("src/opcion_c/3.png");
        private ImageIcon imagen4 = new ImageIcon ("src/opcion_c/6.png");
       
    Border border = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED); //Crea un TIPO de borde
    TitledBorder titleBorder = BorderFactory.createTitledBorder(border,"Sexo"); //Crea el borde con un titulo
    TitledBorder titleBorder2 = BorderFactory.createTitledBorder(border,"Datos");
    TitledBorder titleBorder3 = BorderFactory.createTitledBorder(border,"Indicador");
    TitledBorder titleBorder4 = BorderFactory.createTitledBorder(border,"%GC");
    TitledBorder titleBorder5 = BorderFactory.createTitledBorder(border,"Resultado");
    
    public GrasaCorporal() {
        initComponents();
        slider.setVisible(false);
        imagen.setVisible(false);
        setIconImage(new ImageIcon(getClass().getResource("/opcion_c/icono.jpg")).getImage());
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("%GC");
        Prueba.setVisible(false);
        jPanelResultado.setBorder(titleBorder4);
        jPanelSexo.setBorder(titleBorder);
        jPanel1.setBorder(titleBorder2);
        bajo.setVisible(false);
        normal.setVisible(false);
        sobre.setVisible(false);
        obesidad.setVisible(false);
        
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
    
    private int getRangoH(double gc){
      if(gc<6)
         return 1; //esencial
      else if (gc<14)
          return 2; //Atleta
      else if (gc<18)
          return 3; //en forma
      else if (gc<=25)
          return 4; //promedio
      else 
          return 5;//elevado
    }
    
    private int getRangoM(double gc){
      if(gc<14)
         return 1; //esencial
      else if (gc<21)
          return 2; //Atleta
      else if (gc<25)
          return 3; //en forma
      else if (gc<=32)
          return 4; //promedio
      else 
          return 5;//elevado
    }
    
    private void RangoH(double gc,JSlider slider,JLabel label,JLabel label2){
      if(gc<=6){
        slider.setValue(15);//esencial
        label.setVisible(true);
        Icon icono = new ImageIcon(imagen1.getImage().getScaledInstance(170, 360,Image.SCALE_DEFAULT));
        label.setIcon(icono);
        label.repaint();
        label2.setText("Grsa Esencial");
      }
      
      else if (gc<14){
        slider.setValue(36);   //atleta
        Icon icono = new ImageIcon(imagen2.getImage().getScaledInstance(170, 360,Image.SCALE_DEFAULT));
        label.setIcon(icono);
        label.repaint();
        label2.setText("Atleta");
         }
      
      else if (gc<18){
        slider.setValue(45);  //en forma
        Icon icono = new ImageIcon(imagen2.getImage().getScaledInstance(170, 360,Image.SCALE_DEFAULT));
        label.setIcon(icono);
        label.repaint();
        label2.setText("En Forma");
      }
      
      else if (gc<=25){
        slider.setValue(60);   //promedio
        Icon icono = new ImageIcon(imagen3.getImage().getScaledInstance(170, 360,Image.SCALE_DEFAULT));
        label.setIcon(icono);
        label.repaint();
        label2.setText("Promedio");
      }
      
      else {
        slider.setValue(80);   //elevado
        Icon icono = new ImageIcon(imagen4.getImage().getScaledInstance(170, 360,Image.SCALE_DEFAULT));
        label.setIcon(icono);
        label.repaint();
        label2.setText("Nivel de Grsa Elevado!");
      }
    }
    
    private void RangoM(double gc,JSlider slider,JLabel label,JLabel label2){
      if(gc<=14){
        slider.setValue(15);//esencial
        label.setVisible(true);
        Icon icono = new ImageIcon(imagen1.getImage().getScaledInstance(170, 360,Image.SCALE_DEFAULT));
        label.setIcon(icono);
        label.repaint();
        label2.setText("Grsa Esencial");
      }
      
      else if (gc<21){
        slider.setValue(36);   //atleta
        Icon icono = new ImageIcon(imagen2.getImage().getScaledInstance(170, 360,Image.SCALE_DEFAULT));
        label.setIcon(icono);
        label.repaint();
        label2.setText("Atleta");
         }
      
      else if (gc<25){
        slider.setValue(45);  //en forma
        Icon icono = new ImageIcon(imagen2.getImage().getScaledInstance(170, 360,Image.SCALE_DEFAULT));
        label.setIcon(icono);
        label.repaint();
        label2.setText("En Forma");
      }
      
      else if (gc<=32){
        slider.setValue(60);   //promedio
        Icon icono = new ImageIcon(imagen3.getImage().getScaledInstance(170, 360,Image.SCALE_DEFAULT));
        label.setIcon(icono);
        label.repaint();
        label2.setText("Promedio");
      }
      
      else {
        slider.setValue(80);   //elevado
        Icon icono = new ImageIcon(imagen4.getImage().getScaledInstance(170, 360,Image.SCALE_DEFAULT));
        label.setIcon(icono);
        label.repaint();
        label2.setText("Nivel de Grsa Elevado!");
      }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanelBarras = new javax.swing.JPanel();
        slider = new javax.swing.JSlider();
        imagen = new javax.swing.JLabel();
        jPanelImg = new javax.swing.JPanel();
        Prueba = new javax.swing.JLabel();
        jPanelSexo = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        r2 = new javax.swing.JRadioButton();
        r1 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jPanelResultado = new javax.swing.JPanel();
        LabGC = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        SpinEstatura = new javax.swing.JSpinner();
        metros = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        SpinPeso = new javax.swing.JSpinner();
        kilos = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSpinnerEdad = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        bajo = new javax.swing.JLabel();
        normal = new javax.swing.JLabel();
        sobre = new javax.swing.JLabel();
        obesidad = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuRegresar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MenuAcerca = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        MenuSalir = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Porcentaje de Grasa Corporal");

        slider.setBackground(new java.awt.Color(255, 255, 255));
        slider.setForeground(new java.awt.Color(0, 0, 0));
        slider.setMinorTickSpacing(25);
        slider.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/opcion_c/barraimc.png"))); // NOI18N

        javax.swing.GroupLayout jPanelBarrasLayout = new javax.swing.GroupLayout(jPanelBarras);
        jPanelBarras.setLayout(jPanelBarrasLayout);
        jPanelBarrasLayout.setHorizontalGroup(
            jPanelBarrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBarrasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBarrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(slider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanelBarrasLayout.setVerticalGroup(
            jPanelBarrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBarrasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(slider, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imagen)
                .addGap(100, 100, 100))
        );

        Prueba.setBackground(new java.awt.Color(255, 255, 255));
        Prueba.setMaximumSize(new java.awt.Dimension(264, 264));
        Prueba.setMinimumSize(new java.awt.Dimension(160, 160));

        javax.swing.GroupLayout jPanelImgLayout = new javax.swing.GroupLayout(jPanelImg);
        jPanelImg.setLayout(jPanelImgLayout);
        jPanelImgLayout.setHorizontalGroup(
            jPanelImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelImgLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(Prueba, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanelImgLayout.setVerticalGroup(
            jPanelImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelImgLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(Prueba, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/opcion_c/1200px-Symbol_venus.svg.png"))); // NOI18N
        jLabel5.setText("jLabel5");

        r2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(r2);
        r2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        r2.setText("Femenino");

        r1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(r1);
        r1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        r1.setText("Masculino");
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/opcion_c/masculino-png-6.png"))); // NOI18N
        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout jPanelSexoLayout = new javax.swing.GroupLayout(jPanelSexo);
        jPanelSexo.setLayout(jPanelSexoLayout);
        jPanelSexoLayout.setHorizontalGroup(
            jPanelSexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSexoLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(r1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(r2)
                .addGap(31, 31, 31)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        jPanelSexoLayout.setVerticalGroup(
            jPanelSexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSexoLayout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(jPanelSexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(r2)
                    .addComponent(r1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        LabGC.setBackground(new java.awt.Color(153, 255, 153));
        LabGC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabGC.setOpaque(true);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanelResultadoLayout = new javax.swing.GroupLayout(jPanelResultado);
        jPanelResultado.setLayout(jPanelResultadoLayout);
        jPanelResultadoLayout.setHorizontalGroup(
            jPanelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelResultadoLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(LabGC, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelResultadoLayout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanelResultadoLayout.setVerticalGroup(
            jPanelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelResultadoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(LabGC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Estatura");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/opcion_c/tall-human-silhouette_icon-icons.com_70362.png"))); // NOI18N

        SpinEstatura.setModel(new javax.swing.SpinnerNumberModel(1.1d, null, null, 0.02d));
        SpinEstatura.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SpinEstaturaStateChanged(evt);
            }
        });

        metros.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        metros.setText("Mts");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Peso");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/opcion_c/peso.png"))); // NOI18N

        SpinPeso.setModel(new javax.swing.SpinnerNumberModel(50.0d, null, null, 1.0d));

        kilos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        kilos.setText("Kg");

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Calcular mi %GC");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Edad");

        jSpinnerEdad.setModel(new javax.swing.SpinnerNumberModel(20, null, 130, 1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Años");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/opcion_c/age.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 158, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11)
                                .addComponent(jLabel10))
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSpinnerEdad, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                            .addComponent(SpinEstatura)
                            .addComponent(SpinPeso))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(metros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(kilos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(metros)
                                    .addComponent(SpinEstatura, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(SpinPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(kilos)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel3))
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel10))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSpinnerEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))))
                .addGap(28, 28, 28)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        bajo.setText("Esencial 2-5%");

        normal.setText("En forma 14 - 17%");

        sobre.setText("Promedio 18-25%");

        obesidad.setText("Elevado mas de 25%");

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

        MenuAcerca.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        MenuAcerca.setText("Acerca De");
        MenuAcerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAcercaActionPerformed(evt);
            }
        });
        jMenu2.add(MenuAcerca);

        jMenuBar1.add(jMenu2);

        jMenu5.setText("Salir");

        MenuSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        MenuSalir.setText("Salir");
        MenuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSalirActionPerformed(evt);
            }
        });
        jMenu5.add(MenuSalir);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(bajo)
                                        .addGap(41, 41, 41)
                                        .addComponent(normal)
                                        .addGap(18, 18, 18)
                                        .addComponent(sobre)
                                        .addGap(49, 49, 49)
                                        .addComponent(obesidad)
                                        .addGap(26, 26, 26))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jPanelBarras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addComponent(jPanelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanelSexo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(78, 78, 78)
                                .addComponent(jPanelImg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(jLabel1)))
                .addGap(0, 53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanelImg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelBarras, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bajo)
                            .addComponent(normal)
                            .addComponent(sobre)
                            .addComponent(obesidad))))
                .addGap(103, 103, 103))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       if(!r1.isSelected()&&!r2.isSelected()){
          JOptionPane.showMessageDialog(this, "Introduzca su Sexo");
       }
       else{
       double peso = Double.parseDouble(SpinPeso.getValue()+"");
       double estatura = Double.parseDouble(SpinEstatura.getValue()+"");
       double imc = peso/Math.pow(estatura, 2);
       int edad = Integer.parseInt(jSpinnerEdad.getValue()+"");
       double GC;
       GC = (1.2*imc)+(0.23*edad)-(10.8*(r1.isSelected()?1:0))-5.4;
       JOptionPane.showMessageDialog(this, "Su Porcentaje de Grasa Corporal es: "+GC);
       LabGC.setText(GC+"");
       int rango = 0;
       if(r1.isSelected()){
          rango = getRangoH(GC);
          RangoH(GC,slider,Prueba,jLabel8);
       }
       else{
          rango = getRangoM(GC);
          RangoM(GC,slider,Prueba,jLabel8);
          bajo.setText("Esencial  10-13%");
          normal.setText("En froma 21 -24%");
          sobre.setText("Promedio 25 - 32%");
          obesidad.setText("Elevado  mas de 32%");
       }
       
       if(rango == 3 || rango ==2)
          LabGC.setBackground(Color.green);
       else if(rango == 1||rango == 4)
           LabGC.setBackground(Color.yellow);
       else
           LabGC.setBackground(Color.red);
       
       Prueba.setVisible(true);
       slider.setVisible(true);
       imagen.setVisible(true);
       bajo.setVisible(true);
       normal.setVisible(true);
       sobre.setVisible(true);
       obesidad.setVisible(true);
       jPanelImg.setBorder(titleBorder5); //setea los paneles correspondientes
       jPanelBarras.setBorder(titleBorder3);
       }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void SpinEstaturaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SpinEstaturaStateChanged

    }//GEN-LAST:event_SpinEstaturaStateChanged

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setBackground(Color.cyan);
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_jButton1MouseExited

    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r1ActionPerformed

    private void MenuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_MenuSalirActionPerformed

    private void MenuRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRegresarActionPerformed
       Principal p = new Principal ();
       p.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_MenuRegresarActionPerformed

    private void MenuAcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAcercaActionPerformed
        JOptionPane.showMessageDialog(this,"Debido a que la prueba del IMC no distingue entre masa muscular y grasa\n"
                + "se ha ideado una fórmula que estima el porcentaje de grasa corporal que tiene una persona ya que\n "
                + "hay aparatos electrónicos especializados en calcular dicho porcentaje con una precisión muy alta, sin\n "
                + "embargo esta fórmula es bastante precisa sin ser tan precisa como dichos aparatos electrónicos");
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
            java.util.logging.Logger.getLogger(GrasaCorporal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GrasaCorporal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GrasaCorporal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GrasaCorporal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GrasaCorporal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabGC;
    private javax.swing.JMenuItem MenuAcerca;
    private javax.swing.JMenuItem MenuRegresar;
    private javax.swing.JMenuItem MenuSalir;
    private javax.swing.JLabel Prueba;
    private javax.swing.JSpinner SpinEstatura;
    private javax.swing.JSpinner SpinPeso;
    private javax.swing.JLabel bajo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel imagen;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelBarras;
    private javax.swing.JPanel jPanelImg;
    private javax.swing.JPanel jPanelResultado;
    private javax.swing.JPanel jPanelSexo;
    private javax.swing.JSpinner jSpinnerEdad;
    private javax.swing.JLabel kilos;
    private javax.swing.JLabel metros;
    private javax.swing.JLabel normal;
    private javax.swing.JLabel obesidad;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JSlider slider;
    private javax.swing.JLabel sobre;
    // End of variables declaration//GEN-END:variables
}
