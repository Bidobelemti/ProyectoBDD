/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import java.sql.PreparedStatement;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author mauri
 */
public class PnlEditarFabrica extends javax.swing.JPanel {

    /**
     * Creates new form PnlEditarSucursales
     */
    public PnlEditarFabrica() {
        initComponents();
        System.out.println(pnlSucursales.estado + " estado");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        btgCiudad = new javax.swing.ButtonGroup();
        pnlSucursalEd = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtRUC = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        rbtMx = new javax.swing.JRadioButton();
        rbtBr = new javax.swing.JRadioButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        rbtEc = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        txtGerente = new javax.swing.JTextField();

        jScrollPane1.setViewportView(jEditorPane1);

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(578, 264));

        pnlSucursalEd.setBackground(new java.awt.Color(255, 255, 255));
        pnlSucursalEd.setBorder(javax.swing.BorderFactory.createTitledBorder("Fabrica"));

        jLabel1.setText("RUC");

        jLabel2.setText("NOMBRE");

        jLabel3.setText("Ciudad");

        btgCiudad.add(rbtMx);
        rbtMx.setText("MEXICO");

        btgCiudad.add(rbtBr);
        rbtBr.setText("BRASIL");
        rbtBr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtBrActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btgCiudad.add(rbtEc);
        rbtEc.setText("ECUADOR");
        rbtEc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtEcActionPerformed(evt);
            }
        });

        jLabel4.setText("GERENTE");

        javax.swing.GroupLayout pnlSucursalEdLayout = new javax.swing.GroupLayout(pnlSucursalEd);
        pnlSucursalEd.setLayout(pnlSucursalEdLayout);
        pnlSucursalEdLayout.setHorizontalGroup(
            pnlSucursalEdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSucursalEdLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnlSucursalEdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSucursalEdLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtGerente, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE))
                    .addGroup(pnlSucursalEdLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(30, 30, 30)
                        .addComponent(rbtMx)
                        .addGap(18, 18, 18)
                        .addComponent(rbtBr)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbtEc))
                    .addGroup(pnlSucursalEdLayout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(btnGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar))
                    .addGroup(pnlSucursalEdLayout.createSequentialGroup()
                        .addGroup(pnlSucursalEdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(pnlSucursalEdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtRUC, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                            .addComponent(txtNombre))))
                .addContainerGap(203, Short.MAX_VALUE))
        );
        pnlSucursalEdLayout.setVerticalGroup(
            pnlSucursalEdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSucursalEdLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlSucursalEdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtRUC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlSucursalEdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlSucursalEdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtGerente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(pnlSucursalEdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rbtMx)
                    .addComponent(rbtBr)
                    .addComponent(rbtEc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlSucursalEdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar))
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlSucursalEd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlSucursalEd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        JPanel pnl = new pnlFabrica();
        Inicio.agregarPanelDerecho(pnl);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:

        System.out.println("editar " + pnlSucursales.estado);
        try {
            String RUC = "";
            String nombre = txtNombre.getText();
            String gerente = txtGerente.getText();
            String pais = "";
            if (rbtBr.isSelected()) {
                pais = "Brasil";
                RUC = generarRUC(1);
            }
            if (rbtMx.isSelected()) {
                pais = "México";
                RUC = generarRUC(2);
            }
            if (rbtEc.isSelected()) {
                pais = "Ecuador";
                RUC = generarRUC(3);
            }
            txtRUC.setText(RUC);
            String comando = "INSERT INTO FABRICA (RUCFABRICA, NOMBREFABRICA, PAISFABRICA, GERENTEFABRICA) "
                    + "VALUES (?,?,?,?)";
            PreparedStatement pst = pnlInicioSesion.conn.getConnSin().prepareStatement(comando);
            if (!RUC.isBlank() && !nombre.isBlank() && (rbtEc.isSelected() || rbtBr.isSelected() || rbtMx.isSelected())) {
                pst.setString(1, RUC);
                pst.setString(2, nombre);
                pst.setString(3, pais);
                pst.setString(4, gerente);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Empleado creación exitosa", "Transacción exitosa",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Debe llenar todos los campos", "Error",
                        JOptionPane.WARNING_MESSAGE);
            }
            JPanel pnlTabla = new pnlFabrica();
            Inicio.agregarPanelDerecho(pnlTabla);
        } catch (Exception e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void rbtBrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtBrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtBrActionPerformed

    private void rbtEcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtEcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtEcActionPerformed

    public static String generarRUC(int numero) {
        Random rand = new Random();
        StringBuilder ruc = new StringBuilder();

        // Generar los primeros 9 dígitos aleatorios
        for (int i = 0; i < 9; i++) {
            int digito = rand.nextInt(10);
            ruc.append(digito);
        }

        // Agregar el número proporcionado (parte final del RUC)
        String numStr = String.format("%04d", numero);
        ruc.append(numStr);

        return ruc.toString();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgCiudad;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlSucursalEd;
    public static javax.swing.JRadioButton rbtBr;
    private javax.swing.JRadioButton rbtEc;
    public static javax.swing.JRadioButton rbtMx;
    public static javax.swing.JTextField txtGerente;
    public static javax.swing.JTextField txtNombre;
    public static javax.swing.JTextField txtRUC;
    // End of variables declaration//GEN-END:variables
}
