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
public class pnlTarjetas extends javax.swing.JPanel {

    /**
     * Creates new form pnlInicioSesion
     */
    private DefaultTableModel dtm;
    private Object[] obj = new Object[5];
    public static boolean estado = true;
    public static Vector registro;

    public pnlTarjetas() {
        initComponents();
        dtm = new DefaultTableModel();
        dtm.addColumn("NUMERO");
        dtm.addColumn("CLIENTE");
        dtm.addColumn("NOMBRE");
        dtm.addColumn("CODIGO");
        dtm.addColumn("VENCIMIENTO");
        tblTarjetas.setModel(dtm);
        if (pnlInicioSesion.usuario.equals("roberth")) {
            LlenarTabla("SELECT * FROM tarjeta");
        } else {
            LlenarTabla("SELECT * FROM vwtarjeta");
            btnEditar.setEnabled(false);
            btnEliminar.setEnabled(false);
            btnNuevo.setEnabled(false);
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
        btnNuevo = new javax.swing.JButton();
        pnlSucursal = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTarjetas = new javax.swing.JTable();

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

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        tblTarjetas.setModel(new javax.swing.table.DefaultTableModel(
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
        tblTarjetas.setToolTipText("");
        tblTarjetas.setDragEnabled(true);
        tblTarjetas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTarjetasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTarjetas);

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
                .addComponent(pnlSucursal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminar)
                    .addComponent(btnNuevo))
                .addGap(7, 7, 7))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        estado = true;
        JPanel pnlEditar = new PnlEditarTarjeta();
        PnlEditarTarjeta.txtCodigo.setEditable(false);
        PnlEditarTarjeta.txtNumero.setEditable(false);
        PnlEditarTarjeta.rbtMC.setEnabled(false);
        PnlEditarTarjeta.rbtVisa.setEnabled(false);
        int index = tblTarjetas.getSelectedRow();
        if (index != -1) {
            try {

                registro = (Vector) dtm.getDataVector().elementAt(index);
                String comando = "SELECT * FROM tarjeta WHERE numerotarjeta = " + registro.elementAt(0).toString();
                PreparedStatement pst = pnlInicioSesion.conn.getConnSin().prepareStatement(comando);
                ResultSet rs = pst.executeQuery();
                String tipo = "";
                while (rs.next()) {
                    PnlEditarTarjeta.txtNumero.setText(rs.getString(1));
                    PnlEditarTarjeta.txtCodigo.setText(rs.getString(4));
                    tipo = rs.getString(3);
                }
                if (tipo.toUpperCase().equals("VISA")) {
                    PnlEditarTarjeta.rbtVisa.setSelected(true);
                } else {
                    PnlEditarTarjeta.rbtMC.setSelected(true);
                }

            } catch (Exception e) {
                System.out.println(e);
            }

            Inicio.agregarPanelDerecho(pnlEditar);
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona una fila", "Acceso no permitido", 2);

        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            int index = tblTarjetas.getSelectedRow();

            String cmd = "DELETE FROM tarjeta WHERE numerotarjeta = ?";
            PreparedStatement pst = pnlInicioSesion.conn.getConnSin().prepareStatement(cmd);
            registro = (Vector) dtm.getDataVector().elementAt(index);

            pst.setString(1, registro.elementAt(0).toString());
            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Eliminado exitosamente", "Transacción exitosa",
                    JOptionPane.INFORMATION_MESSAGE);
            limpiarTabla();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(PnlEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        LlenarTabla("SELECT * FROM tarjeta");
        System.out.println("Finalizado");
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        estado = false;
        JPanel pnlEditar = new PnlEditarTarjeta();
        Inicio.agregarPanelDerecho(pnlEditar);

    }//GEN-LAST:event_btnNuevoActionPerformed

    private void tblTarjetasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTarjetasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblTarjetasMouseClicked

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
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JPanel pnlSucursal;
    private javax.swing.JTable tblTarjetas;
    // End of variables declaration//GEN-END:variables
}
