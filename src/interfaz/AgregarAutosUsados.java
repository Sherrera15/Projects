/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Helper;
import clases.Autos;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author rmorales1
 */
public class AgregarAutosUsados extends javax.swing.JDialog {

    /**
     * Creates new form Agregar
     */
    String ruta;
    ObjectOutputStream salida;
    ArrayList<Autos> auto;
    int aux = 0;

    public AgregarAutosUsados(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        JButton botonesH[]={cmdBuscar, cmdCancelar};
        JButton botonesD[]={cmdGuardar,cmdEliminar};
        
        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
        ruta = "src/datos/autosUsados.txt";
        try {
            auto = Helper.traerDatos(ruta);
            salida = new ObjectOutputStream(new FileOutputStream(ruta));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        Helper.volcado(salida, auto);
        Helper.llenarTablaAutosUsados(tblTablaPersonas, ruta);
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
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        cmdGuardar = new javax.swing.JButton();
        cmdEliminar = new javax.swing.JButton();
        cmdCancelar = new javax.swing.JButton();
        cmdBuscar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTipoMarca = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        cmbMarca = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTablaPersonas = new javax.swing.JTable();

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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("AGREGAR PERSONAS");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdGuardar.setText("Guardar");
        cmdGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGuardarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 100, -1));

        cmdEliminar.setText("Eliminar");
        cmdEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEliminarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 100, -1));

        cmdCancelar.setText("Cancelar");
        cmdCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCancelarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 100, -1));

        cmdBuscar.setText("Buscar");
        cmdBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBuscarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 100, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 120, 150));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Persona"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Cédula:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 20));
        jPanel2.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 120, -1));

        jLabel2.setText("Nombre:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 20));
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 120, -1));

        jLabel3.setText("Apellido:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 20));

        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });
        jPanel2.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 120, -1));

        jLabel4.setText("Marca");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel5.setText("Tipo Marca:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel6.setText("Modelo:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));
        jPanel2.add(txtTipoMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 120, -1));
        jPanel2.add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 120, -1));

        cmbMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nissan", "Chevrolet", "Ford" }));
        jPanel2.add(cmbMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 120, -1));

        jLabel7.setText("Telefono:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));
        jPanel2.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 120, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 360, 230));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Autos"));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblTablaPersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombre", "Apellido", "Marca", "Tipo Marca", "Modelo", "Telefono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTablaPersonas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTablaPersonasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblTablaPersonas);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 500, 200));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 520, 230));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(612, 588));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGuardarActionPerformed
        String cedula, nombre, apellido, marca, tipomarca, modelo, telefono;
            if(txtNombre.getText().trim().isEmpty())
            {
                Helper.mensaje(this, "Introduzca el nombre de la persona", 3);
                txtNombre.requestFocusInWindow();
            }
            else if (txtModelo.getText().trim().isEmpty())
            {
                Helper.mensaje(this, "Introduzca el modelo del vehiculo", 3);
                txtModelo.requestFocusInWindow();
            }
            else if (txtTipoMarca.getText().trim().isEmpty())
            {
                Helper.mensaje(this, "Introduzca el tipo de marca del vehiculo", 3);
                txtTipoMarca.requestFocusInWindow();
            }
            
            else if(txtApellido.getText().trim().isEmpty())
            {
                Helper.mensaje(this, "Introduzca el apellido de la persona", 3);
                txtApellido.requestFocusInWindow();
            }
            else if (txtTelefono.getText().trim().isEmpty())
            {
                Helper.mensaje(this, "Introduzca el telefono de la persona", 3);
                txtTelefono.requestFocusInWindow();
            }
            else if (txtCedula.getText().trim().isEmpty())
            {
                Helper.mensaje(this, "Introduzca la cedula de la persona", 3);
                txtCedula.requestFocusInWindow();
            }
            else {
        cedula = txtCedula.getText();
        nombre = txtNombre.getText();
        apellido = txtApellido.getText();
        marca = cmbMarca.getSelectedItem().toString();
        tipomarca = txtTipoMarca.getText();
        modelo = txtModelo.getText();
        telefono = txtTelefono.getText();
        ArrayList<Autos> personasModificado;
        try {
            if (aux == 0) {

                Autos a = new Autos(nombre, apellido, cedula, modelo, marca, tipomarca, telefono);

                a.guardar(salida);

            } else {
                personasModificado = Helper.modificarAuto(ruta, cedula, nombre, apellido, marca, tipomarca, modelo, telefono);
                salida = new ObjectOutputStream(new FileOutputStream(ruta));
                Helper.volcado(salida, personasModificado);
                aux=0;
                Helper.mensaje(this, "Persona Actualizada Correctamente!", 1);
            }
        } catch (IOException ex) {
            Logger.getLogger(AgregarAutosUsados.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Helper.llenarTablaAutosUsados(tblTablaPersonas, ruta);

        txtCedula.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtModelo.setText("");
        txtTelefono.setText("");
        cmbMarca.setSelectedIndex(0);
        txtCedula.requestFocusInWindow();
        JButton botonesH[]={cmdBuscar,cmdCancelar};
        JButton botonesD[]={cmdEliminar,cmdGuardar};
        
        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
            }
    }//GEN-LAST:event_cmdGuardarActionPerformed

    private void cmdCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCancelarActionPerformed
        txtCedula.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtModelo.setText("");
        txtTelefono.setText("");
        cmbMarca.setSelectedIndex(0);

        txtCedula.requestFocusInWindow();
        JButton botonesH[]={cmdBuscar,cmdCancelar};
        JButton botonesD[]={cmdEliminar,cmdGuardar};
        
        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
    }//GEN-LAST:event_cmdCancelarActionPerformed

    private void tblTablaPersonasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTablaPersonasMouseClicked
        int i;
        Autos a;
        ArrayList<Autos> auto = Helper.traerDatos(ruta);
        i = tblTablaPersonas.getSelectedRow();

        a = auto.get(i);

        txtCedula.setText(a.getCedula());
        txtNombre.setText(a.getNombre());
        txtApellido.setText(a.getApellido());
        txtTelefono.setText(a.getTelefono());
        txtModelo.setText(a.getTelefono());

        cmbMarca.setSelectedItem(a.getMarca());
        aux=1;
        JButton botonesH[]={cmdEliminar,cmdGuardar,cmdCancelar};
        JButton botonesD[]={cmdBuscar};
        
        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
    }//GEN-LAST:event_tblTablaPersonasMouseClicked

    private void cmdEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEliminarActionPerformed
        int i, op;
        op = JOptionPane.showConfirmDialog(this, "¿Seguro que desea eliminar a esta persona?", "Eliminar", JOptionPane.YES_NO_OPTION);

        ArrayList<Autos> auto = Helper.traerDatos(ruta);
        if (op == JOptionPane.YES_OPTION) {
            i = tblTablaPersonas.getSelectedRow();
            auto.remove(i);
            try {
                salida = new ObjectOutputStream(new FileOutputStream(ruta));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(AgregarAutosUsados.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(AgregarAutosUsados.class.getName()).log(Level.SEVERE, null, ex);
            }
            Helper.volcado(salida, auto);
            Helper.llenarTablaAutosUsados(tblTablaPersonas, ruta);
            txtCedula.setText("");
            txtNombre.setText("");
            txtApellido.setText("");
            txtModelo.setText("");
            txtTelefono.setText("");
            cmbMarca.setSelectedIndex(0);
            txtCedula.requestFocusInWindow();
        }
        JButton botonesH[]={cmdBuscar,cmdCancelar};
        JButton botonesD[]={cmdEliminar,cmdGuardar};
        
        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
    }//GEN-LAST:event_cmdEliminarActionPerformed

    private void cmdBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBuscarActionPerformed
        String cedula;
        cedula = txtCedula.getText();
        Autos a;
        if (Helper.buscarAutoCedula(cedula, ruta)) {
            a = Helper.traerPersonaCedula(cedula, ruta);
            txtNombre.setText(a.getNombre());
            txtApellido.setText(a.getApellido());
            cmbMarca.setSelectedItem(a.getMarca());
            aux = 1;
        } else {
            txtNombre.requestFocusInWindow();
            aux = 0;
        }
        JButton botonesH[]={cmdGuardar,cmdCancelar, cmdEliminar};
        JButton botonesD[]={cmdBuscar};
        
        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);

    }//GEN-LAST:event_cmdBuscarActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarAutosUsados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarAutosUsados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarAutosUsados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarAutosUsados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AgregarAutosUsados dialog = new AgregarAutosUsados(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbMarca;
    private javax.swing.JButton cmdBuscar;
    private javax.swing.JButton cmdCancelar;
    private javax.swing.JButton cmdEliminar;
    private javax.swing.JButton cmdGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblTablaPersonas;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTipoMarca;
    // End of variables declaration//GEN-END:variables
}