/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Juana
 */
public class panel extends javax.swing.JFrame {

    /**
     * Creates new form panel
     */
    public panel() {
        initComponents();
        setLocationRelativeTo(null);
        txtid.setEnabled(false);
        limpiar();
        mostrartabla();

    }

    void limpiar() {
        txtid.setText("");
        txtnumeroS.setText("");
        txtmodelo.setText("");
        txtespecificacion.setText("");
        txtdescripcion.setText("");
        txtfecha.setText("");
        txtnumeroS.requestFocus();
    }

    void mostrartabla() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("NÚMERO DE SERIE");
        model.addColumn("MARCA");
        model.addColumn("MODELO");
        model.addColumn("ESPECIFICACIONES");
        model.addColumn("ESTADO");
        model.addColumn("DESCRIPCIÓN");
        model.addColumn("FECHA");
        tbtabla.setModel(model);
        String datos[] = new String[8];

        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM computadoras");
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                datos[7] = rs.getString(8);
                model.addRow(datos);
            }
        } catch (Exception e) {
            System.out.println("Error las tablas");
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtnumeroS = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jmarca = new javax.swing.JComboBox<>();
        txtmodelo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtespecificacion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        rdmbactivo = new javax.swing.JRadioButton();
        rdbmantenimineto = new javax.swing.JRadioButton();
        rdbmalogrado = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtdescripcion = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtfecha = new javax.swing.JFormattedTextField();
        btnAgregar_MichaellIbarra = new javax.swing.JButton();
        btnEliminar_MichaellIbarra = new javax.swing.JButton();
        btnModificar_MichaellIbarra = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel9 = new javax.swing.JLabel();
        terminos = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbtabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        jLabel1.setText("ID");

        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        jLabel2.setText("Número de serie");

        txtnumeroS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumeroSActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        jLabel3.setText("Marca");

        jmarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "hp", "mac", "lenovo" }));
        jmarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmarcaActionPerformed(evt);
            }
        });

        txtmodelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmodeloActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        jLabel4.setText("Modelo");

        jLabel5.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        jLabel5.setText("Especificaciones Técnicas");

        txtespecificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtespecificacionActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        jLabel6.setText("Estado");

        buttonGroup1.add(rdmbactivo);
        rdmbactivo.setText("activo");

        buttonGroup1.add(rdbmantenimineto);
        rdbmantenimineto.setText("mantenimiento");

        buttonGroup1.add(rdbmalogrado);
        rdbmalogrado.setText("malogrado");
        rdbmalogrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbmalogradoActionPerformed(evt);
            }
        });

        txtdescripcion.setColumns(20);
        txtdescripcion.setRows(5);
        jScrollPane2.setViewportView(txtdescripcion);

        jLabel7.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        jLabel7.setText("Descripción");

        jLabel8.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        jLabel8.setText("Fecha de compra");

        txtfecha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-d"))));

        btnAgregar_MichaellIbarra.setText("Agregar");
        btnAgregar_MichaellIbarra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar_MichaellIbarraActionPerformed(evt);
            }
        });

        btnEliminar_MichaellIbarra.setText("Eliminar");
        btnEliminar_MichaellIbarra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar_MichaellIbarraActionPerformed(evt);
            }
        });

        btnModificar_MichaellIbarra.setText("Modificar");
        btnModificar_MichaellIbarra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificar_MichaellIbarraActionPerformed(evt);
            }
        });

        jToggleButton1.setText("Limpiar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        jLabel9.setText("términos y condiciones");

        terminos.setText("acepto");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtespecificacion)
                            .addComponent(txtmodelo)
                            .addComponent(txtnumeroS, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(txtid)
                            .addComponent(jmarca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(rdmbactivo)
                        .addGap(18, 18, 18)
                        .addComponent(rdbmantenimineto)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jToggleButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAgregar_MichaellIbarra)
                .addGap(33, 33, 33)
                .addComponent(btnEliminar_MichaellIbarra)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdbmalogrado)
                    .addComponent(btnModificar_MichaellIbarra))
                .addGap(104, 104, 104))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(terminos))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnumeroS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jmarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtespecificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(rdmbactivo)
                    .addComponent(rdbmantenimineto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdbmalogrado)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(terminos))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar_MichaellIbarra)
                    .addComponent(btnEliminar_MichaellIbarra)
                    .addComponent(btnAgregar_MichaellIbarra))
                .addGap(5, 5, 5)
                .addComponent(jToggleButton1)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        tbtabla.setModel(new javax.swing.table.DefaultTableModel(
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
        tbtabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbtablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbtabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(262, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void txtnumeroSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumeroSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumeroSActionPerformed

    private void jmarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmarcaActionPerformed

    private void txtmodeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmodeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmodeloActionPerformed

    private void txtespecificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtespecificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtespecificacionActionPerformed

    private void rdbmalogradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbmalogradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbmalogradoActionPerformed

    private void btnAgregar_MichaellIbarraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar_MichaellIbarraActionPerformed
        // TODO add your handling code here:
        if (!terminos.isSelected()){
            JOptionPane.showMessageDialog(null, "ACEPTE LOS TERMINOS Y CONDICIONES");
        return;
        }
        try {
            String estado = "";
            if (rdmbactivo.isSelected()) {
                estado = rdmbactivo.getActionCommand();
            } else if (rdbmalogrado.isSelected()) {
                estado = rdbmalogrado.getActionCommand();
            } else if (rdbmantenimineto.isSelected()) {
                estado = rdbmantenimineto.getActionCommand();
            } 
            PreparedStatement ps = cn.prepareStatement("INSERT INTO computadoras(numeroS, marca, modelo, especificacionT, estadoM, descripcion, fecha) VALUES ('" + txtnumeroS.getText() + "', '" + jmarca.getSelectedItem().toString()+ "', '" + txtmodelo.getText() + "', '" + txtespecificacion.getText() + "', '" + estado + "', '" + txtdescripcion.getText() + "', ' " + txtfecha.getText() + "')");
            ps.executeUpdate();
            limpiar();
            mostrartabla();
            JOptionPane.showMessageDialog(null, "FUE REGISTRADO");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnAgregar_MichaellIbarraActionPerformed

    private void btnEliminar_MichaellIbarraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar_MichaellIbarraActionPerformed
        // TODO add your handling code here
   if (!terminos.isSelected()){
            JOptionPane.showMessageDialog(null, "ACEPTE LOS TERMINOS Y CONDICIONES");
        return;
        }
        try {
            PreparedStatement ps = cn.prepareStatement("DELETE FROM computadoras WHERE id=" + txtid.getText() + "");
            ps.executeUpdate();
            limpiar();
            mostrartabla();
            JOptionPane.showMessageDialog(null, "FUE ELIMINADO");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL  ELIMINADO");

        }
    }//GEN-LAST:event_btnEliminar_MichaellIbarraActionPerformed

    private void btnModificar_MichaellIbarraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificar_MichaellIbarraActionPerformed
        // TODO add your handling code here:
           if (!terminos.isSelected()){
            JOptionPane.showMessageDialog(null, "ACEPTE LOS TERMINOS Y CONDICIONES");
        return;
        }
        try {
            String estado = "";
            if (rdmbactivo.isSelected()) {
                estado = rdmbactivo.getActionCommand();
            } else if (rdbmalogrado.isSelected()) {
                estado = rdbmalogrado.getActionCommand();
            } else if (rdbmantenimineto.isSelected()) {
                estado = rdbmantenimineto.getActionCommand();
            } 
            PreparedStatement ps = cn.prepareStatement("UPDATE computadoras SET numeroS='" + txtnumeroS.getText() + "' , marca='" + jmarca.getSelectedItem().toString()+ "', modelo='" + txtmodelo.getText() + "', especificacionT='" + txtespecificacion.getText() + "', estadoM='"+estado+"', descripcion='" + txtdescripcion.getText() + "', fecha='" + txtfecha.getText() + "' WHERE id='" + txtid.getText() + "'");
            ps.executeUpdate();
            limpiar();
            mostrartabla();
            JOptionPane.showMessageDialog(null, "FUE ACTUALIZADO");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "ERROR AL  ACTUALIZAR");

        }
    }//GEN-LAST:event_btnModificar_MichaellIbarraActionPerformed

    private void tbtablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbtablaMouseClicked
        // TODO add your handling code here

        int fila = tbtabla.getSelectedRow();
        txtid.setText(tbtabla.getValueAt(fila, 0).toString());
        txtnumeroS.setText(tbtabla.getValueAt(fila, 1).toString());
        String marca = tbtabla.getValueAt(fila, 2).toString();
        jmarca.setSelectedItem(marca);
        txtmodelo.setText(tbtabla.getValueAt(fila, 3).toString());
        txtespecificacion.setText(tbtabla.getValueAt(fila, 4).toString());
        
        String estado = tbtabla.getValueAt(fila, 5).toString();
        if (estado.equals(rdbmalogrado.getActionCommand())){
            rdbmalogrado.setSelected(true);
        } else if(estado.equals(rdmbactivo.getActionCommand())){
            rdmbactivo.setSelected(true);
        }else if(estado.equals(rdbmantenimineto.getActionCommand())){
            rdbmantenimineto.setSelected(true);
        }
        txtdescripcion.setText(tbtabla.getValueAt(fila, 6).toString());
        txtfecha.setText(tbtabla.getValueAt(fila, 7).toString());


    }//GEN-LAST:event_tbtablaMouseClicked

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        limpiar();
        
    }//GEN-LAST:event_jToggleButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new panel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar_MichaellIbarra;
    private javax.swing.JButton btnEliminar_MichaellIbarra;
    private javax.swing.JButton btnModificar_MichaellIbarra;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JComboBox<String> jmarca;
    private javax.swing.JRadioButton rdbmalogrado;
    private javax.swing.JRadioButton rdbmantenimineto;
    private javax.swing.JRadioButton rdmbactivo;
    private javax.swing.JTable tbtabla;
    private javax.swing.JCheckBox terminos;
    private javax.swing.JTextArea txtdescripcion;
    private javax.swing.JTextField txtespecificacion;
    private javax.swing.JFormattedTextField txtfecha;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtmodelo;
    private javax.swing.JTextField txtnumeroS;
    // End of variables declaration//GEN-END:variables
    conexion objc = new conexion();
    Connection cn = objc.conexion();
}
