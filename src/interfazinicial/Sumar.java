/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazinicial;

/**
 *
 * @author IFC
 */
public class Sumar extends javax.swing.JFrame {

    /**
     * Creates new form Sumar
     */
    public Sumar() {
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

        jLabelNumero1 = new javax.swing.JLabel();
        jTextFieldNumero1 = new javax.swing.JTextField();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelNumero2 = new javax.swing.JLabel();
        jTextFieldNumero2 = new javax.swing.JTextField();
        jTextFieldNumero3 = new javax.swing.JTextField();
        jLabelResultado = new javax.swing.JLabel();
        jButtonClean = new javax.swing.JButton();
        jButtonAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelNumero1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelNumero1.setText("Numero 1");

        jTextFieldNumero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumero1ActionPerformed(evt);
            }
        });

        jLabelTitulo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelTitulo.setText("Sumar Numeros");

        jLabelNumero2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelNumero2.setText("Numero 2");

        jTextFieldNumero2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumero2ActionPerformed(evt);
            }
        });

        jTextFieldNumero3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumero3ActionPerformed(evt);
            }
        });

        jLabelResultado.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelResultado.setText("Resultado");

        jButtonClean.setText("Limpiar");
        jButtonClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCleanActionPerformed(evt);
            }
        });

        jButtonAdd.setText("Sumar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabelNumero2)
                            .addGap(73, 73, 73)
                            .addComponent(jTextFieldNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelNumero1)
                                .addGap(73, 73, 73)
                                .addComponent(jTextFieldNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonClean)
                            .addComponent(jLabelResultado))
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldNumero3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAdd))))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabelTitulo)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumero1)
                    .addComponent(jTextFieldNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumero2)
                    .addComponent(jTextFieldNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelResultado)
                    .addComponent(jTextFieldNumero3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonClean)
                    .addComponent(jButtonAdd))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNumero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumero1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumero1ActionPerformed

    private void jTextFieldNumero2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumero2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumero2ActionPerformed

    private void jTextFieldNumero3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumero3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumero3ActionPerformed

    private void jButtonCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCleanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCleanActionPerformed

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
            java.util.logging.Logger.getLogger(Sumar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sumar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sumar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sumar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sumar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonClean;
    private javax.swing.JLabel jLabelNumero1;
    private javax.swing.JLabel jLabelNumero2;
    private javax.swing.JLabel jLabelResultado;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JTextField jTextFieldNumero1;
    private javax.swing.JTextField jTextFieldNumero2;
    private javax.swing.JTextField jTextFieldNumero3;
    // End of variables declaration//GEN-END:variables
}