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
public class pnlClientes extends javax.swing.JPanel {

    /**
     * Creates new form pnlInicioSesion
     */
    private DefaultTableModel dtm;
    private Object[] obj = new Object[6];
    public static boolean estado = true;
    public static Vector registro;

    public pnlClientes() {
        initComponents();
        dtm = new DefaultTableModel();
        dtm.addColumn("ID");
        dtm.addColumn("SUCURSAL");
        dtm.addColumn("NOMBRE");
        dtm.addColumn("CIUDAD");
        dtm.addColumn("NACIMIENTO");
        dtm.addColumn("CEDULA");
        tblClientes.setModel(dtm);
        if (pnlInicioSesion.usuario.equals("roberth")) {
            LlenarTabla("SELECT * FROM cliente_norte");
        } else {
            LlenarTabla("select * from cliente_sur");
            System.out.println("surrrr");
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
                obj[3] = rs.getString(4);
                obj[4] = rs.getString(5);
                obj[5] = rs.getString(6);
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

        btnEliminar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        pnlSucursal = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(590, 388));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
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
        tblClientes.setToolTipText("");
        tblClientes.setDragEnabled(true);
        tblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblClientes);

        javax.swing.GroupLayout pnlSucursalLayout = new javax.swing.GroupLayout(pnlSucursal);
        pnlSucursal.setLayout(pnlSucursalLayout);
        pnlSucursalLayout.setHorizontalGroup(
            pnlSucursalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSucursalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlSucursalLayout.setVerticalGroup(
            pnlSucursalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSucursalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNuevo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(pnlSucursal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlSucursal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnNuevo))
                .addGap(7, 7, 7))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        try {
            int index = tblClientes.getSelectedRow();
            registro = (Vector) dtm.getDataVector().elementAt(index);
            if (registro.elementAt(3).toString().toUpperCase().trim().equals("NORTE") && pnlInicioSesion.usuario.equals("roberth")) {
                // TODO add your handling code here:

                //String cmd = "DELETE FROM tarjeta WHERE codigocliente = ?";
                //PreparedStatement pst = pnlInicioSesion.conn.getConnSin().prepareStatement(cmd);

                //pst.setString(1, registro.elementAt(0).toString());
                String comando = "DELETE FROM cliente_norte WHERE codigocliente = ?";
                PreparedStatement pst2 = pnlInicioSesion.conn.getConnSin().prepareStatement(comando);
                pst2.setString(1, registro.elementAt(0).toString());
                //pst.executeUpdate();
                pst2.executeUpdate();
                JOptionPane.showMessageDialog(null, "Eliminado exitosamente", "Transacción exitosa",
                        JOptionPane.INFORMATION_MESSAGE);
                limpiarTabla();
            } else {
                if (registro.elementAt(3).toString().toUpperCase().trim().equals("SUR") && pnlInicioSesion.usuario.equals("mauricio")) {
                   // String cmd = "DELETE FROM tarjeta@conectRoberth WHERE codigocliente = ?";
                    //PreparedStatement pst = pnlInicioSesion.conn.getConnSin().prepareStatement(cmd);

                    //pst.setString(1, registro.elementAt(0).toString());
                    String comando = "DELETE FROM cliente_sur WHERE codigocliente = ?";
                    PreparedStatement pst2 = pnlInicioSesion.conn.getConnSin().prepareStatement(comando);
                    pst2.setString(1, registro.elementAt(0).toString());
                    //pst.executeUpdate();
                    pst2.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Eliminado exitosamente", "Transacción exitosa",
                            JOptionPane.INFORMATION_MESSAGE);
                    limpiarTabla();
                } else {
                    JOptionPane.showMessageDialog(null, "Se presentó un error", "Transacción fallida",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(PnlEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        estado = false;
        JPanel pnlEditar = new PnlEditarCliente();
        Inicio.agregarPanelDerecho(pnlEditar);

    }//GEN-LAST:event_btnNuevoActionPerformed

    private void tblClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblClientesMouseClicked

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
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JPanel pnlSucursal;
    private javax.swing.JTable tblClientes;
    // End of variables declaration//GEN-END:variables
}
