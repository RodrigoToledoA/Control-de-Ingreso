/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ui;

import clases.*;
import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author rodrigo
 */
public class CargarUsuarios extends javax.swing.JFrame {

    /**
     * Creates new form cargarUsuarios
     */
    public CargarUsuarios() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txbNomb = new javax.swing.JTextField();
        txbDNI = new javax.swing.JTextField();
        txbEdad = new javax.swing.JTextField();
        txbTel = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txbMail = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuSobreMi = new javax.swing.JMenuItem();
        mnuAyuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setText("Nuevo usuario:");

        jLabel2.setText("Nombre completo:");

        jLabel3.setText("Nº de telefono:");

        jLabel4.setText("DNI:");

        jLabel5.setText("Edad:");

        txbEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txbEdadActionPerformed(evt);
            }
        });

        txbTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txbTelActionPerformed(evt);
            }
        });

        jLabel6.setText("Mail:");

        txbMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txbMailActionPerformed(evt);
            }
        });

        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/agregar.png"))); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnSalir.setText("Atras");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        mnuSalir.setText("Salir");
        mnuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSalirActionPerformed(evt);
            }
        });
        jMenu1.add(mnuSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");

        mnuSobreMi.setText("Sobre mi...");
        mnuSobreMi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSobreMiActionPerformed(evt);
            }
        });
        jMenu2.add(mnuSobreMi);

        mnuAyuda.setText("Ayuda");
        mnuAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAyudaActionPerformed(evt);
            }
        });
        jMenu2.add(mnuAyuda);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txbNomb)
                            .addComponent(txbEdad)
                            .addComponent(txbDNI)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6))
                                .addGap(42, 42, 42))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txbMail)
                            .addComponent(txbTel)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txbNomb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txbDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txbEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txbTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txbMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnSalir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txbEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txbEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txbEdadActionPerformed

    private void txbTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txbTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txbTelActionPerformed

    private void txbMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txbMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txbMailActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        try{
            String nombre = txbNomb.getText();
            int edad = Integer.parseInt(txbEdad.getText());
            int dni = Integer.parseInt(txbDNI.getText());
            int tel = Integer.parseInt(txbTel.getText());
            String mail = txbMail.getText();
            Usuario user = new Usuario(nombre, dni, edad, tel, mail);            
            // Se crea un objeto de la calse usuario
            ListaUsuarios.addUser(user);
            ListaUsuarios.guardarUsuario();
            
            GeneradorQr qr = new GeneradorQr();
            // Creacion del QR
            
            File f = new File("Codigos/"+txbNomb.getText()+".png");
            // Nombre del archivo
            
            String text ="Nombre:" + txbNomb.getText() +"\nEdad:"+ txbEdad.getText() + "\nDni:" + txbDNI.getText() + "\nNº Tel:" +  txbTel.getText() + "\nMail:" + txbMail.getText();
            // Texto que lleva el QR
            try {

                qr.generateQR(f, text, 400, 400);
                // Pasaje de parametros para crear el QR

                System.out.println("QRCode Generated: " + f.getAbsolutePath());
                // QRCode Generated: c:\tmp\qrCode.png

                String qrString = qr.decoder(f);
                // String que te muestra lo que tiene el QR
                System.out.println("Text QRCode: " + qrString);

            } catch (Exception e) {
                e.printStackTrace();
            }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "No se han dado los datos necesarios o son incorrectos", "Error", JOptionPane.ERROR_MESSAGE);       
            }
//Dejo en blanco los txb para volver a cargar otro usuario

        txbDNI.setText(null);
        txbEdad.setText(null);
        txbMail.setText(null);
        txbTel.setText(null);
        txbNomb.setText(null);

    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
        Main obj = new Main();
        obj.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    private void mnuAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAyudaActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Debe cargar todos los datos que se le piden.\n"
                + "Estos datos son para crear un Codigo QR que lo identificara.", "Ayuda", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_mnuAyudaActionPerformed
 
    private void mnuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_mnuSalirActionPerformed

    private void mnuSobreMiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSobreMiActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Programa creado por Rodrigo Toledo.", "Sobre mi...", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_mnuSobreMiActionPerformed

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
            java.util.logging.Logger.getLogger(CargarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CargarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CargarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CargarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CargarUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mnuAyuda;
    private javax.swing.JMenuItem mnuSalir;
    private javax.swing.JMenuItem mnuSobreMi;
    private javax.swing.JTextField txbDNI;
    private javax.swing.JTextField txbEdad;
    private javax.swing.JTextField txbMail;
    private javax.swing.JTextField txbNomb;
    private javax.swing.JTextField txbTel;
    // End of variables declaration//GEN-END:variables
}