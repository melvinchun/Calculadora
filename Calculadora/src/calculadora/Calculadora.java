/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Brenda
 */
public class Calculadora extends javax.swing.JFrame {

    public Calculadora() {
        initComponents();
        this.setLocationRelativeTo(null);
        model = new DefaultTableModel();
        model.addColumn("Expresion");
        model.addColumn("Resultado");
        String array[] = new String[2];
        array[0] = "Hola";
        array[1] = "5";
        model.addRow(array);
        tabla.setModel(model);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ventana_lista = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        click_menu = new javax.swing.JPopupMenu();
        B_modificar = new javax.swing.JMenuItem();
        B_eliminar = new javax.swing.JMenuItem();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        texto = new javax.swing.JTextField();
        B_2 = new javax.swing.JButton();
        B_1 = new javax.swing.JButton();
        B_7 = new javax.swing.JButton();
        B_6 = new javax.swing.JButton();
        B_8 = new javax.swing.JButton();
        B_4 = new javax.swing.JButton();
        B_5 = new javax.swing.JButton();
        B_3 = new javax.swing.JButton();
        B_lista = new javax.swing.JButton();
        B_9 = new javax.swing.JButton();
        B_cero = new javax.swing.JButton();
        B_mas = new javax.swing.JButton();
        B_por = new javax.swing.JButton();
        B_menos = new javax.swing.JButton();
        B_entre = new javax.swing.JButton();
        B_enter = new javax.swing.JButton();
        B_punto = new javax.swing.JButton();
        B_return = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tabla.setModel(new DefaultTableModel());
        tabla.setFocusable(false);
        tabla.setSelectionBackground(new java.awt.Color(153, 153, 255));
        tabla.setVerifyInputWhenFocusTarget(false);
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/EXIT-1.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusable(false);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/EXIT.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Chalkduster", 1, 24)); // NOI18N
        jLabel1.setText("Lista de Expresiones");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ventana_listaLayout = new javax.swing.GroupLayout(ventana_lista.getContentPane());
        ventana_lista.getContentPane().setLayout(ventana_listaLayout);
        ventana_listaLayout.setHorizontalGroup(
            ventana_listaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventana_listaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ventana_listaLayout.setVerticalGroup(
            ventana_listaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventana_listaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        click_menu.setSelected(null);

        B_modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        B_modificar.setText("Modificar");
        B_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_modificarActionPerformed(evt);
            }
        });
        click_menu.add(B_modificar);

        B_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Trash.png"))); // NOI18N
        B_eliminar.setText("Eliminar");
        click_menu.add(B_eliminar);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        texto.setBackground(new java.awt.Color(102, 102, 102));
        texto.setFont(new java.awt.Font("Chalkduster", 1, 24)); // NOI18N
        texto.setForeground(new java.awt.Color(255, 255, 255));
        texto.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        texto.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        texto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textoKeyPressed(evt);
            }
        });

        B_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2.png"))); // NOI18N
        B_2.setBorder(null);
        B_2.setBorderPainted(false);
        B_2.setContentAreaFilled(false);
        B_2.setFocusable(false);
        B_2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2-1.png"))); // NOI18N
        B_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_2ActionPerformed(evt);
            }
        });

        B_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1.png"))); // NOI18N
        B_1.setBorder(null);
        B_1.setBorderPainted(false);
        B_1.setContentAreaFilled(false);
        B_1.setFocusable(false);
        B_1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1-1.png"))); // NOI18N
        B_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_1ActionPerformed(evt);
            }
        });

        B_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/7.png"))); // NOI18N
        B_7.setBorder(null);
        B_7.setBorderPainted(false);
        B_7.setContentAreaFilled(false);
        B_7.setFocusable(false);
        B_7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/7-1.png"))); // NOI18N
        B_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_7ActionPerformed(evt);
            }
        });

        B_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/6.png"))); // NOI18N
        B_6.setBorder(null);
        B_6.setBorderPainted(false);
        B_6.setContentAreaFilled(false);
        B_6.setFocusable(false);
        B_6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/6-1.png"))); // NOI18N
        B_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_6ActionPerformed(evt);
            }
        });

        B_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/8.png"))); // NOI18N
        B_8.setBorder(null);
        B_8.setBorderPainted(false);
        B_8.setContentAreaFilled(false);
        B_8.setFocusable(false);
        B_8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/8-1.png"))); // NOI18N
        B_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_8ActionPerformed(evt);
            }
        });

        B_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/4.png"))); // NOI18N
        B_4.setBorder(null);
        B_4.setBorderPainted(false);
        B_4.setContentAreaFilled(false);
        B_4.setFocusable(false);
        B_4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/4-1.png"))); // NOI18N
        B_4.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/4-1.png"))); // NOI18N
        B_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_4ActionPerformed(evt);
            }
        });

        B_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/5.png"))); // NOI18N
        B_5.setBorder(null);
        B_5.setBorderPainted(false);
        B_5.setContentAreaFilled(false);
        B_5.setFocusable(false);
        B_5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/5-1.png"))); // NOI18N
        B_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_5ActionPerformed(evt);
            }
        });

        B_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/3.png"))); // NOI18N
        B_3.setBorder(null);
        B_3.setBorderPainted(false);
        B_3.setContentAreaFilled(false);
        B_3.setFocusable(false);
        B_3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/3-1.png"))); // NOI18N
        B_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_3ActionPerformed(evt);
            }
        });

        B_lista.setBackground(new java.awt.Color(255, 255, 255));
        B_lista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Lista.png"))); // NOI18N
        B_lista.setBorder(null);
        B_lista.setBorderPainted(false);
        B_lista.setContentAreaFilled(false);
        B_lista.setFocusable(false);
        B_lista.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lista-1.png"))); // NOI18N
        B_lista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_listaActionPerformed(evt);
            }
        });

        B_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/9.png"))); // NOI18N
        B_9.setBorder(null);
        B_9.setBorderPainted(false);
        B_9.setContentAreaFilled(false);
        B_9.setFocusable(false);
        B_9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/9-1.png"))); // NOI18N
        B_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_9ActionPerformed(evt);
            }
        });

        B_cero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/0.png"))); // NOI18N
        B_cero.setBorder(null);
        B_cero.setBorderPainted(false);
        B_cero.setContentAreaFilled(false);
        B_cero.setFocusable(false);
        B_cero.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/0-1.png"))); // NOI18N
        B_cero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_ceroActionPerformed(evt);
            }
        });

        B_mas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mas.png"))); // NOI18N
        B_mas.setBorder(null);
        B_mas.setBorderPainted(false);
        B_mas.setContentAreaFilled(false);
        B_mas.setFocusable(false);
        B_mas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mas-1.png"))); // NOI18N
        B_mas.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mas-1.png"))); // NOI18N
        B_mas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_masActionPerformed(evt);
            }
        });

        B_por.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/X.png"))); // NOI18N
        B_por.setBorder(null);
        B_por.setBorderPainted(false);
        B_por.setContentAreaFilled(false);
        B_por.setFocusable(false);
        B_por.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/x-1.png"))); // NOI18N
        B_por.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_porActionPerformed(evt);
            }
        });

        B_menos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menos.png"))); // NOI18N
        B_menos.setBorder(null);
        B_menos.setBorderPainted(false);
        B_menos.setContentAreaFilled(false);
        B_menos.setFocusable(false);
        B_menos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menos-1.png"))); // NOI18N
        B_menos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_menosActionPerformed(evt);
            }
        });

        B_entre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/division.png"))); // NOI18N
        B_entre.setBorder(null);
        B_entre.setBorderPainted(false);
        B_entre.setContentAreaFilled(false);
        B_entre.setFocusable(false);
        B_entre.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/division-1.png"))); // NOI18N
        B_entre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_entreActionPerformed(evt);
            }
        });

        B_enter.setBackground(new java.awt.Color(255, 255, 255));
        B_enter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/enter.png"))); // NOI18N
        B_enter.setBorder(null);
        B_enter.setBorderPainted(false);
        B_enter.setContentAreaFilled(false);
        B_enter.setFocusable(false);
        B_enter.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/enter-1.png"))); // NOI18N
        B_enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_enterActionPerformed(evt);
            }
        });

        B_punto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/point.png"))); // NOI18N
        B_punto.setBorder(null);
        B_punto.setBorderPainted(false);
        B_punto.setContentAreaFilled(false);
        B_punto.setFocusable(false);
        B_punto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/point-1.png"))); // NOI18N
        B_punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_puntoActionPerformed(evt);
            }
        });

        B_return.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/back.png"))); // NOI18N
        B_return.setBorder(null);
        B_return.setBorderPainted(false);
        B_return.setContentAreaFilled(false);
        B_return.setFocusable(false);
        B_return.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/back-1.png"))); // NOI18N
        B_return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_returnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(B_4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B_5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(B_cero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(B_1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(B_2)
                                    .addComponent(B_punto))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B_6)
                            .addComponent(B_3)
                            .addComponent(B_return, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(B_7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B_8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B_9)))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B_por)
                    .addComponent(B_mas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B_menos)
                    .addComponent(B_entre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(texto, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(B_lista, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(B_enter, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(texto, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(B_7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(B_8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(B_9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(B_6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(B_5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(B_4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(B_mas, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(B_menos, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B_por, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(B_1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(B_2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(B_3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(B_entre, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(B_punto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B_cero)
                            .addComponent(B_return, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B_lista, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B_enter, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_1ActionPerformed
        texto.setText(texto.getText() + "1");
    }//GEN-LAST:event_B_1ActionPerformed

    private void B_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_2ActionPerformed
        texto.setText(texto.getText() + "2");
    }//GEN-LAST:event_B_2ActionPerformed

    private void B_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_3ActionPerformed
        texto.setText(texto.getText() + "3");
    }//GEN-LAST:event_B_3ActionPerformed

    private void B_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_4ActionPerformed
        texto.setText(texto.getText() + "4");
    }//GEN-LAST:event_B_4ActionPerformed

    private void B_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_5ActionPerformed
        texto.setText(texto.getText() + "5");
    }//GEN-LAST:event_B_5ActionPerformed

    private void B_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_6ActionPerformed
        texto.setText(texto.getText() + "6");
    }//GEN-LAST:event_B_6ActionPerformed

    private void B_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_7ActionPerformed
        texto.setText(texto.getText() + "7");
    }//GEN-LAST:event_B_7ActionPerformed

    private void B_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_8ActionPerformed
        texto.setText(texto.getText() + "8");
    }//GEN-LAST:event_B_8ActionPerformed

    private void B_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_9ActionPerformed
        texto.setText(texto.getText() + "9");
    }//GEN-LAST:event_B_9ActionPerformed

    private void B_masActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_masActionPerformed
        texto.setText(texto.getText() + "+");
    }//GEN-LAST:event_B_masActionPerformed

    private void B_menosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_menosActionPerformed
        texto.setText(texto.getText() + "-");
    }//GEN-LAST:event_B_menosActionPerformed

    private void B_porActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_porActionPerformed
        texto.setText(texto.getText() + "*");
    }//GEN-LAST:event_B_porActionPerformed

    private void B_entreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_entreActionPerformed
        texto.setText(texto.getText() + "/");
    }//GEN-LAST:event_B_entreActionPerformed

    private void B_ceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_ceroActionPerformed
        texto.setText(texto.getText() + "0");
    }//GEN-LAST:event_B_ceroActionPerformed

    private void B_puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_puntoActionPerformed
        texto.setText(texto.getText() + ".");
    }//GEN-LAST:event_B_puntoActionPerformed

    private void B_returnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_returnActionPerformed
        //Validcion del Boton de Borrar
        String temp = texto.getText();
        int pos = texto.getCaretPosition() - 1;
        if ((texto.getText()).length() > 0 && pos >= 0) {
            String temp2 = "";
            for (int i = 0; i < temp.length(); i++) {
                if (i != pos) {
                    temp2 += temp.charAt(i);
                }
            }
            texto.setText(temp2);
            texto.setCaretPosition(pos);
        }
    }//GEN-LAST:event_B_returnActionPerformed

    private void textoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoKeyPressed
        char temp = evt.getKeyChar();
        if (!Character.isDigit(temp) && (temp != '*' && temp != '+' && temp != '-' && temp != '/'  && temp != 65535 && temp != 8 && temp != 10)) {
            String temp2 = "";
            JOptionPane.showMessageDialog(this, "Formato invalido");
            for (int i = 0; i < texto.getText().length(); i++) {
                if (texto.getText().charAt(i) != temp) {
                    temp2 += texto.getText().charAt(i);
                }
            }
            texto.setText(temp2);
        }
    }//GEN-LAST:event_textoKeyPressed

    private void B_listaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_listaActionPerformed
    ventana_lista.pack();
    ventana_lista.setModal(true);
    ventana_lista.setLocationRelativeTo(this);
    ventana_lista.setVisible(true);
    }//GEN-LAST:event_B_listaActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
    try {
        if (evt.isMetaDown()) {
                click_menu.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_tablaMouseClicked

    private void B_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_modificarActionPerformed

    }//GEN-LAST:event_B_modificarActionPerformed

    private void B_enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_enterActionPerformed
        //Boton de enter
        
        //Metodo validar
        validar(texto.getText());
    }//GEN-LAST:event_B_enterActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ventana_lista.setVisible(false);
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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    /*Hice metodo el metodo validar con lo que habias subido para que sea mas facil
    usar recibe un texto y retorna un bool para ver si es valido*/
    boolean validar(String temp){
        boolean continuar = true;
        if (temp.isEmpty()){
            JOptionPane.showMessageDialog(null, "¡No ha escrito nada!", "Calculadora Simple", 2);
            continuar = false;
        }
        for (int i = 0; i < temp.length(); i++) {
            if (i == temp.length()-1 && (temp.charAt(i) == '+' || temp.charAt(i) == '-' || temp.charAt(i) == '*' || temp.charAt(i) == '/')){
                JOptionPane.showMessageDialog(null, "Tiene un error de syntaxis, revise el ultimo signo", "Calculadora Simple", 2);
                break;
            }else{
                if (temp.charAt(i) == '+' && (temp.charAt(i+1) == '*' || temp.charAt(i+1) == '/')){
                    continuar = false;
                    JOptionPane.showMessageDialog(null, "Tiene un error de syntaxis, revise despues de un signo +", "Calculadora Simple", 2);
                    break;
                }
                if (temp.charAt(i) == '-' && (temp.charAt(i+1) == '*' || temp.charAt(i+1) == '/')){
                    continuar = false;
                    JOptionPane.showMessageDialog(null, "Tiene un error de syntaxis, revise despues de un signo -", "Calculadora Simple", 2);
                    break;
                }
                if (temp.charAt(i) == '*' && (temp.charAt(i+1) == '*' || temp.charAt(i+1) == '/')){
                    continuar = false;
                    JOptionPane.showMessageDialog(null, "Tiene un error de syntaxis, revise despues de un signo *", "Calculadora Simple", 2);
                    break;
                }
                if (temp.charAt(i) == '/' && (temp.charAt(i+1) == '*' || temp.charAt(i+1) == '/')){
                    continuar = false;
                    JOptionPane.showMessageDialog(null, "Tiene un error de syntaxis, revise despues de un signo /", "Calculadora Simple", 2);
                    break;
                }
            }
        }
        return continuar;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_1;
    private javax.swing.JButton B_2;
    private javax.swing.JButton B_3;
    private javax.swing.JButton B_4;
    private javax.swing.JButton B_5;
    private javax.swing.JButton B_6;
    private javax.swing.JButton B_7;
    private javax.swing.JButton B_8;
    private javax.swing.JButton B_9;
    private javax.swing.JButton B_cero;
    private javax.swing.JMenuItem B_eliminar;
    private javax.swing.JButton B_enter;
    private javax.swing.JButton B_entre;
    private javax.swing.JButton B_lista;
    private javax.swing.JButton B_mas;
    private javax.swing.JButton B_menos;
    private javax.swing.JMenuItem B_modificar;
    private javax.swing.JButton B_por;
    private javax.swing.JButton B_punto;
    private javax.swing.JButton B_return;
    private javax.swing.JPopupMenu click_menu;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField texto;
    private javax.swing.JDialog ventana_lista;
    // End of variables declaration//GEN-END:variables
    private DefaultTableModel model;
}
