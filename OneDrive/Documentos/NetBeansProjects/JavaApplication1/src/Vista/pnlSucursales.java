/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import Modelo.Conexion;
import java.awt.BorderLayout;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author mauri
 */
public class pnlSucursales extends javax.swing.JPanel {

    /**
     * Creates new form pnlInicioSesion
     */
    private DefaultTableModel dtm;
    private Object[] obj = new Object[3];
    public static boolean estado = true;
    public static Vector registro;

    public pnlSucursales() {
        initComponents();
        dtm = new DefaultTableModel();
        dtm.addColumn("ID");
        dtm.addColumn("DIRECCIÓN");
        dtm.addColumn("CIUDAD");
        tblSucursales.setModel(dtm);
        if (pnlInicioSesion.usuario.equals("roberth")) {
            LlenarTabla("SELECT * FROM sucursal_norte");
        } else {
            LlenarTabla("SELECT * FROM sucursal_sur");

        }
        System.out.println(pnlInicioSesion.usuario);
    }

    private void LlenarTabla(String comando) {
        try {
            PreparedStatement pst = pnlInicioSesion.conn.getConnSin().prepareStatement(comando);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                obj[0] = rs.getString(1);
                obj[1] = rs.getString(2);
                obj[2] = rs.getString(3);
                dtm.addRow(obj);
            }
            pst.execute();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    private void limpiarTabla() {
        System.out.println(dtm.getRowCount());
        int n = dtm.getRowCount();
        int bandera = 0;
        while (bandera < n) {
            dtm.removeRow(0);
            bandera += 1;
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

        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        cmbCiudades = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        pnlSucursal = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSucursales = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(590, 388));

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.setEnabled(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        cmbCiudades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Quito", "Guayaquil" }));

        jLabel1.setText("Zona");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(168, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbCiudades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnBuscar)
                .addGap(160, 160, 160))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(cmbCiudades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        tblSucursales.setModel(new javax.swing.table.DefaultTableModel(
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
        tblSucursales.setToolTipText("");
        tblSucursales.setDragEnabled(true);
        tblSucursales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSucursalesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSucursales);

        javax.swing.GroupLayout pnlSucursalLayout = new javax.swing.GroupLayout(pnlSucursal);
        pnlSucursal.setLayout(pnlSucursalLayout);
        pnlSucursalLayout.setHorizontalGroup(
            pnlSucursalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSucursalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        pnlSucursalLayout.setVerticalGroup(
            pnlSucursalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSucursalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btnNuevo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(pnlSucursal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(pnlSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminar)
                    .addComponent(btnNuevo))
                .addGap(7, 7, 7))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        limpiarTabla();
        String comando = "";
        int index = cmbCiudades.getSelectedIndex();
        String ciudad = cmbCiudades.getSelectedItem().toString();
        System.out.println(ciudad);
        if (index == 0) {
            comando = "SELECT * FROM todas_sucursales";
        }
        if (index == 1) {
            comando = "SELECT * FROM sucursal";
        }
        if (index == 2) {
            comando = "SELECT * FROM todas_sucursales WHERE ciudadsucur = 'GUAYAQUIL'";
        }
        LlenarTabla(comando);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        estado = true;
        JPanel pnlEditar = new PnlEditarSucursales();
        PnlEditarSucursales.txtNumeroSuc.setEditable(false);
        int index = tblSucursales.getSelectedRow();
        if (index != -1) {
            try {

                registro = (Vector) dtm.getDataVector().elementAt(index);
                String comando = "";
                if (pnlInicioSesion.usuario.equals("roberth")) {
                    comando = "SELECT * FROM sucursal_norte WHERE numerosucur = " + registro.elementAt(0).toString();
                } else {
                    comando = "SELECT * FROM sucursal_sur WHERE numerosucur = " + registro.elementAt(0).toString();
                }
                PreparedStatement pst = pnlInicioSesion.conn.getConnSin().prepareStatement(comando);
                ResultSet rs = pst.executeQuery();
                String ciudad = "";
                while (rs.next()) {
                    PnlEditarSucursales.txtNumeroSuc.setText(rs.getString(1));
                    PnlEditarSucursales.txtDireccion.setText(rs.getString(2));
                    ciudad = rs.getString(3);
                }
                if (ciudad.toUpperCase().trim().equals("SUR")) {
                    PnlEditarSucursales.rbtGuayaquil.setSelected(true);
                } else {
                    PnlEditarSucursales.rbtQuito.setSelected(true);
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e, "Transacción fallida",
                        JOptionPane.ERROR_MESSAGE);
            }

            Inicio.agregarPanelDerecho(pnlEditar);
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona una fila", "Acceso no permitido", 2);

        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        try {
            int index = tblSucursales.getSelectedRow();
            registro = (Vector) dtm.getDataVector().elementAt(index);
            System.out.println(registro.elementAt(2).toString());
            if (registro.elementAt(2).toString().toUpperCase().trim().equals("NORTE") && pnlInicioSesion.usuario.equals("roberth")) {
                // TODO add your handling code here:

                String comando = "DELETE FROM sucursal_norte WHERE numerosucur= ?";
                PreparedStatement pst2 = pnlInicioSesion.conn.getConnSin().prepareStatement(comando);
                pst2.setString(1, registro.elementAt(0).toString());

                pst2.executeUpdate();
                JOptionPane.showMessageDialog(null, "Eliminado exitosamente", "Transacción exitosa",
                        JOptionPane.INFORMATION_MESSAGE);
                limpiarTabla();
            } else {
                if ((registro.elementAt(2).toString().toUpperCase().trim().equals("SUR") && pnlInicioSesion.usuario.equals("mauricio"))) {
                    String comando = "DELETE FROM sucursal_sur WHERE numerosucur = ?";
                    PreparedStatement pst2 = pnlInicioSesion.conn.getConnSin().prepareStatement(comando);
                    pst2.setString(1, registro.elementAt(0).toString());

                    pst2.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Eliminado exitosamente", "Transacción exitosa",
                            JOptionPane.INFORMATION_MESSAGE);
                    limpiarTabla();
                } else {
                    JOptionPane.showMessageDialog(null, "Se produjo un error", "Transacción fallida",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(PnlEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //LlenarTabla("SELECT * FROM cliente");
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        estado = false;
        JPanel pnlEditar = new PnlEditarSucursales();
        Inicio.agregarPanelDerecho(pnlEditar);

    }//GEN-LAST:event_btnNuevoActionPerformed

    private void tblSucursalesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSucursalesMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_tblSucursalesMouseClicked

    private void agregarPanel(JPanel pnl) {
        //ajustamos el tamaño
        pnl.setSize(578, 273);
        //colocamos, la esquina superior izquierda posee coordenadas (0,0)
        pnl.setLocation(0, 0);
        //remueve lo del panel inicio
        pnlSucursal.removeAll();
        //en el panel inicio agregue el panel clientes con una ubicación
        pnlSucursal.add(pnl, BorderLayout.CENTER);
        //elimina toda la jerarquia y la construye nuevamente
        System.out.println("revalidate");
        pnlSucursal.revalidate();
        pnlSucursal.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cmbCiudades;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JPanel pnlSucursal;
    private javax.swing.JTable tblSucursales;
    // End of variables declaration//GEN-END:variables
}
