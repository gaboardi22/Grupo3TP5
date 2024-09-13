
package Vistas;

import Entidades.Contacto;
import Entidades.Directorio;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ezequiel
 */
public class vistaPrincipal extends javax.swing.JFrame {
    DefaultTableModel modelo = new DefaultTableModel();
    Directorio directorio;
    
    public vistaPrincipal() {
        initComponents();
        directorio = new Directorio(); 
        armarCabecera();
        cargarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlEncabezado = new javax.swing.JLabel();
        jlDNI = new javax.swing.JLabel();
        jlNombre = new javax.swing.JLabel();
        jlApellido = new javax.swing.JLabel();
        jlDireccion = new javax.swing.JLabel();
        jlCiudad = new javax.swing.JLabel();
        jtfDNI = new javax.swing.JTextField();
        jtfNombre = new javax.swing.JTextField();
        jtfApellido = new javax.swing.JTextField();
        jtfDireccion = new javax.swing.JTextField();
        jtfCiudad = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jlTelefono = new javax.swing.JLabel();
        jtfTelefono = new javax.swing.JTextField();
        jbNuevo = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbBorrar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaContacto = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlEncabezado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlEncabezado.setForeground(new java.awt.Color(0, 102, 255));
        jlEncabezado.setText("Formulario de contacto");

        jlDNI.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlDNI.setText("DNI:");

        jlNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlNombre.setText("Nombre:");

        jlApellido.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlApellido.setText("Apellido:");

        jlDireccion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlDireccion.setText("Direccion:");

        jlCiudad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlCiudad.setText("Ciudad:");

        jbBuscar.setForeground(new java.awt.Color(0, 102, 255));
        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/zoom_zooming_detective_searching_engine_search_icon_256456.png"))); // NOI18N
        jbBuscar.setText("Buscar");

        jlTelefono.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlTelefono.setText("Telefono:");

        jbNuevo.setForeground(new java.awt.Color(0, 102, 255));
        jbNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/arrow_rotate_reload_refresh_icon_256470.png"))); // NOI18N
        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbGuardar.setForeground(new java.awt.Color(0, 102, 255));
        jbGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/signs_button_plus_sign_add_icon_256475.png"))); // NOI18N
        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbBorrar.setForeground(new java.awt.Color(0, 102, 255));
        jbBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete_garbage_bin_trash_remove_icon_256469.png"))); // NOI18N
        jbBorrar.setText("Borrar");
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });

        jbSalir.setForeground(new java.awt.Color(0, 102, 255));
        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dismiss_circle_cancel_remove_delete_close_icon_256476.png"))); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jlTelefono)
                        .addGap(18, 18, 18)
                        .addComponent(jtfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlDNI)
                                    .addComponent(jlNombre)
                                    .addComponent(jlApellido)
                                    .addComponent(jlCiudad)
                                    .addComponent(jlDireccion))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfDNI)
                                    .addComponent(jtfCiudad)
                                    .addComponent(jtfNombre)
                                    .addComponent(jtfDireccion)
                                    .addComponent(jtfApellido))
                                .addGap(18, 18, 18)
                                .addComponent(jbBuscar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jbNuevo)
                                .addGap(18, 18, 18)
                                .addComponent(jbGuardar)
                                .addGap(18, 18, 18)
                                .addComponent(jbBorrar)
                                .addGap(18, 18, 18)
                                .addComponent(jbSalir)))
                        .addGap(63, 63, 63))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jlEncabezado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jlEncabezado)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlDNI))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlNombre)
                            .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jbBuscar))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlApellido)
                    .addComponent(jtfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDireccion)
                    .addComponent(jtfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCiudad)
                    .addComponent(jtfCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTelefono)
                    .addComponent(jtfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalir)
                    .addComponent(jbBorrar)
                    .addComponent(jbGuardar)
                    .addComponent(jbNuevo))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jTablaContacto.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTablaContacto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        try{
        int dni = Integer.parseInt(jtfDNI.getText());
        String apellido = jtfApellido.getText();
        String nombre = jtfNombre.getText();
        String ciudad  =jtfCiudad.getText();
        String domicilio = jtfDireccion.getText();
        Long telefono  = Long.valueOf(jtfTelefono.getText());
        int confirmacion = JOptionPane.showConfirmDialog(this, "¿los datos ingresados son correcto?");
           if (confirmacion == JOptionPane.YES_OPTION) {
               Contacto contacto  = new Contacto(dni, apellido, nombre, ciudad, domicilio);
               directorio.agregarContacto(telefono, contacto);
               cargarTabla();
           } else {
               JOptionPane.showMessageDialog(this, "Porfavor vuelva a cargar los datos");
                jtfDNI.setText("");
                jtfNombre.setText("");
                jtfApellido.setText("");
                jtfDireccion.setText("");
                jtfCiudad.setText("");
                jtfTelefono.setText("");
           }
        }catch(NumberFormatException  ex){
          JOptionPane.showMessageDialog(this, "El DNI y el telefono debe ser numeros");
        }
        
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
      dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed
        Long telefono  = Long.valueOf(jtfTelefono.getText());
        directorio.borrarContacto(telefono);
    }//GEN-LAST:event_jbBorrarActionPerformed

private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {                                        

        jtfDNI.setText("");
        jtfNombre.setText("");
        jtfApellido.setText("");
        jtfDireccion.setText("");
        jtfCiudad.setText("");
        jtfTelefono.setText("");
    }                          
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
            java.util.logging.Logger.getLogger(vistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new vistaPrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTablaContacto;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlApellido;
    private javax.swing.JLabel jlCiudad;
    private javax.swing.JLabel jlDNI;
    private javax.swing.JLabel jlDireccion;
    private javax.swing.JLabel jlEncabezado;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlTelefono;
    private javax.swing.JTextField jtfApellido;
    private javax.swing.JTextField jtfCiudad;
    private javax.swing.JTextField jtfDNI;
    private javax.swing.JTextField jtfDireccion;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfTelefono;
    // End of variables declaration//GEN-END:variables
private void armarCabecera(){
    modelo.addColumn("DNI");
    modelo.addColumn("Nombre");
    modelo.addColumn("Apellido");
    modelo.addColumn("Direccion");
    modelo.addColumn("Ciudad");
    modelo.addColumn("Telefono");
    jTablaContacto.setModel(modelo);
}
 private void cargarTabla() {
        modelo.setRowCount(0); 
        for (Map.Entry<Long, Contacto> entry : directorio.getDirectorio().entrySet()) {
            Contacto contacto = entry.getValue();
            Object[] fila = {
                contacto.getDni(),        
                contacto.getNombre(),
                contacto.getApellido(),
                contacto.getDireccion(),
                contacto.getCiudad(),
                entry.getKey()           
            };
            modelo.addRow(fila);
        }
    }
}
