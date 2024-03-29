/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package HealthCareUI;

import HealthCare.Patient;

/**
 *
 * @author pavan
 */
public class PatientTasks extends javax.swing.JFrame {

    private Patient patient;
    /**
     * Creates new form DoctorInfo
     */
    public PatientTasks(Patient patient) {
        initComponents();
        this.patient = patient;
        jLabel1.setText(patient.name);
    }

    PatientTasks() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane2 = new javax.swing.JSplitPane();
        jPanel3 = new javax.swing.JPanel();
        btnAdminAddDcotor = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        btnAdminAddDcotor2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane2.setDividerLocation(250);

        jPanel3.setBackground(new java.awt.Color(102, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(100, 200));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAdminAddDcotor.setFont(new java.awt.Font("Yrsa SemiBold", 1, 18)); // NOI18N
        btnAdminAddDcotor.setText("Search Nearby Hospital");
        btnAdminAddDcotor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminAddDcotorActionPerformed(evt);
            }
        });
        jPanel3.add(btnAdminAddDcotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 349, -1, 56));
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 73, 93, 56));

        Back.setFont(new java.awt.Font("Yrsa SemiBold", 1, 18)); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel3.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 609, -1, 56));

        btnAdminAddDcotor2.setFont(new java.awt.Font("Yrsa SemiBold", 1, 18)); // NOI18N
        btnAdminAddDcotor2.setText("Encounter History");
        btnAdminAddDcotor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminAddDcotor2ActionPerformed(evt);
            }
        });
        jPanel3.add(btnAdminAddDcotor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 423, -1, 56));

        jLabel3.setIcon(new javax.swing.ImageIcon("/home/pavan/Downloads/patient.jpg")); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 810));

        jSplitPane2.setLeftComponent(jPanel3);

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon("/home/pavan/Downloads/patient.jpg")); // NOI18N
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 810));

        jSplitPane2.setRightComponent(jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 947, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdminAddDcotorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminAddDcotorActionPerformed
        // TODO add your handling code here:
        jSplitPane2.setRightComponent(new PatientSearchHospital(this.patient));
    }//GEN-LAST:event_btnAdminAddDcotorActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new MainPage().setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

    private void btnAdminAddDcotor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminAddDcotor2ActionPerformed
        // TODO add your handling code here:
         jSplitPane2.setRightComponent(new PatientEncounterHistory(this.patient));
    }//GEN-LAST:event_btnAdminAddDcotor2ActionPerformed

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
            java.util.logging.Logger.getLogger(PatientTasks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientTasks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientTasks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientTasks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton btnAdminAddDcotor;
    private javax.swing.JButton btnAdminAddDcotor2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSplitPane jSplitPane2;
    // End of variables declaration//GEN-END:variables
}
