/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package HealthCareUI;

import HealthCare.City;
import HealthCare.Community;
import HealthCare.Doctor;
import HealthCare.Hospital;
import HealthCare.SystemAdmin;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pavan
 */
public class SystemAdminCommunityAddCommunity extends javax.swing.JPanel {

    /**
     * Creates new form CommunityAddCommunity
     */
    public SystemAdminCommunityAddCommunity() {
        initComponents();
         fillTable();
        fillTable1();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        communityName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnAdminAddDcotor = new javax.swing.JButton();
        user = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        pass = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 204));
        jLabel3.setText("User Name");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 173, 35));

        communityName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                communityNameActionPerformed(evt);
            }
        });
        add(communityName, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 450, 193, 32));

        jTable1.setBackground(new java.awt.Color(204, 204, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "City Name", "City Object"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 580, 197));

        jTable2.setBackground(new java.awt.Color(204, 204, 204));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Community Name", "city", "Community Object"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 510, 590, 197));

        btnAdminAddDcotor.setFont(new java.awt.Font("Yrsa SemiBold", 1, 18)); // NOI18N
        btnAdminAddDcotor.setText("Add Community");
        btnAdminAddDcotor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminAddDcotorActionPerformed(evt);
            }
        });
        add(btnAdminAddDcotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 440, -1, 56));

        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 193, 32));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 204));
        jLabel4.setText("Community Name");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 450, 173, 35));

        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 193, 32));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 204));
        jLabel5.setText("Password");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 173, 35));

        jLabel1.setIcon(new javax.swing.ImageIcon("/home/pavan/Downloads/5.jpg")); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 790));
    }// </editor-fold>//GEN-END:initComponents

    private void communityNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_communityNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_communityNameActionPerformed

    private void btnAdminAddDcotorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminAddDcotorActionPerformed
        // TODO add your handling code here:
         if(jTable1.getSelectedRow()>-1) {
          City c = (City)jTable1.getValueAt(jTable1.getSelectedRow(),1);
         Community b= new Community(communityName.getText(),c,user.getText(),pass.getText());
         SystemAdmin.communityList.add(b);
         fillTable1();
        }
        else{
             JOptionPane.showMessageDialog(null, "Please Select City");
        }
    }//GEN-LAST:event_btnAdminAddDcotorActionPerformed
//Doctor doctor = new Doctor(id, doctoruser.getText(), doctorpassword.getText(), name.getText(), age.getText(), department.getText(),(Hospital)jTable1.getValueAt(jTable1.getSelectedRow(), 1));
//         SystemAdmin.doctorList.add(doctor);
//         JOptionPane.showMessageDialog(null, "Added Doctor");
    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdminAddDcotor;
    private javax.swing.JTextField communityName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField pass;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
private void fillTable() {
       DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
       model.setRowCount(0);
       for(City  p : SystemAdmin.cityList ){
           
           Object[] row = new Object[2];
           row[0]= p.cityName;
           row[1]= p;
           
           
           
           model.addRow(row);
       }}

private void fillTable1() {
       DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
       model.setRowCount(0);
       for(Community  p : SystemAdmin.communityList ){
           
           Object[] row = new Object[3];
           row[0]= p.getCommunityName();
           row[1]= p.getCity();
           row[2]=p;
           
           
           
           model.addRow(row);
       }}
}
