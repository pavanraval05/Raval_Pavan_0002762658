/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package HealthCareUI;

import HealthCare.Community;

/**
 *
 * @author pavan
 */
public class CommunityAdminTask extends javax.swing.JFrame {

    private Community user;
    /**
     * Creates new form DoctorInfo
     */
    public CommunityAdminTask(Community user) {
        initComponents();
        this.user = user;
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
        jSplitPane2 = new javax.swing.JSplitPane();
        jPanel3 = new javax.swing.JPanel();
        btnAdminAddDcotor = new javax.swing.JButton();
        btnAdminSearchDoctor = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane2.setDividerLocation(250);

        jPanel3.setBackground(new java.awt.Color(102, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(100, 200));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAdminAddDcotor.setFont(new java.awt.Font("Yrsa SemiBold", 1, 18)); // NOI18N
        btnAdminAddDcotor.setText("Add Community");
        btnAdminAddDcotor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminAddDcotorActionPerformed(evt);
            }
        });
        jPanel3.add(btnAdminAddDcotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, 56));

        btnAdminSearchDoctor.setFont(new java.awt.Font("Yrsa SemiBold", 1, 18)); // NOI18N
        btnAdminSearchDoctor.setText("Add House");
        btnAdminSearchDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminSearchDoctorActionPerformed(evt);
            }
        });
        jPanel3.add(btnAdminSearchDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 147, 56));

        jButton1.setFont(new java.awt.Font("Yrsa SemiBold", 1, 18)); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 100, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon("/home/pavan/Downloads/9.png")); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 890));

        jSplitPane2.setLeftComponent(jPanel3);

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon("/home/pavan/Downloads/9.png")); // NOI18N
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 890));

        jButton2.setText("jButton2");
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, -1, -1));

        jSplitPane2.setRightComponent(jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1295, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdminAddDcotorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminAddDcotorActionPerformed
        // TODO add your handling code here:
        jSplitPane2.setRightComponent(new CommunityAdminAddCommunity());
    }//GEN-LAST:event_btnAdminAddDcotorActionPerformed

    private void btnAdminSearchDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminSearchDoctorActionPerformed
        // TODO add your handling code here:
                 jSplitPane2.setRightComponent(new CommunityAdminAddHouse());

    }//GEN-LAST:event_btnAdminSearchDoctorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new MainPage().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdminAddDcotor;
    private javax.swing.JButton btnAdminSearchDoctor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSplitPane jSplitPane2;
    // End of variables declaration//GEN-END:variables
}
