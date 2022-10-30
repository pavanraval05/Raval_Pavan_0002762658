/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package HealthCareUI;

/**
 *
 * @author pavan
 */
public class SystemAdminDoctorTask extends javax.swing.JFrame {

    /**
     * Creates new form DoctorInfo
     */
    public SystemAdminDoctorTask() {
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

        jScrollBar1 = new javax.swing.JScrollBar();
        jSplitPane2 = new javax.swing.JSplitPane();
        jPanel3 = new javax.swing.JPanel();
        btnAdminAddDcotor = new javax.swing.JButton();
        btnAdminSearchDoctor = new javax.swing.JButton();
        btnAdminViewDoctor = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane2.setDividerLocation(250);

        jPanel3.setBackground(new java.awt.Color(102, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(100, 200));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAdminAddDcotor.setFont(new java.awt.Font("Yrsa SemiBold", 1, 18)); // NOI18N
        btnAdminAddDcotor.setText("Add Doctor");
        btnAdminAddDcotor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminAddDcotorActionPerformed(evt);
            }
        });
        jPanel3.add(btnAdminAddDcotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 189, 132, 56));

        btnAdminSearchDoctor.setFont(new java.awt.Font("Yrsa SemiBold", 1, 18)); // NOI18N
        btnAdminSearchDoctor.setText("Search Doctor");
        btnAdminSearchDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminSearchDoctorActionPerformed(evt);
            }
        });
        jPanel3.add(btnAdminSearchDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 426, -1, 56));

        btnAdminViewDoctor.setFont(new java.awt.Font("Yrsa SemiBold", 1, 18)); // NOI18N
        btnAdminViewDoctor.setText("View Doctor");
        btnAdminViewDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminViewDoctorActionPerformed(evt);
            }
        });
        jPanel3.add(btnAdminViewDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 311, 132, 56));

        jButton1.setFont(new java.awt.Font("Yrsa SemiBold", 1, 18)); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 570, -1, 37));
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 830));

        jSplitPane2.setLeftComponent(jPanel3);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jSplitPane2.setRightComponent(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdminAddDcotorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminAddDcotorActionPerformed
        // TODO add your handling code here:
//          this.setVisible(false);
//          jPanel4.add(new SystemAdminAddDoctorJPanel());
          jSplitPane2.setRightComponent(new SystemAdminAddDoctorJPanel());
//        new SystemAdminAddDoctorJPanel().setVisible(true); 
    }//GEN-LAST:event_btnAdminAddDcotorActionPerformed

    private void btnAdminSearchDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminSearchDoctorActionPerformed
        // TODO add your handling code here:
         jSplitPane2.setRightComponent(new SystemAdminSearchDoctorJPanel());
    }//GEN-LAST:event_btnAdminSearchDoctorActionPerformed

    private void btnAdminViewDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminViewDoctorActionPerformed
        // TODO add your handling code here:
        jSplitPane2.setRightComponent(new SystemAdminViewDoctorJPanel1());
    }//GEN-LAST:event_btnAdminViewDoctorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new SystemAdminTask().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(SystemAdminDoctorTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SystemAdminDoctorTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SystemAdminDoctorTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SystemAdminDoctorTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new SystemAdminDoctorTask().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdminAddDcotor;
    private javax.swing.JButton btnAdminSearchDoctor;
    private javax.swing.JButton btnAdminViewDoctor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JSplitPane jSplitPane2;
    // End of variables declaration//GEN-END:variables
}
