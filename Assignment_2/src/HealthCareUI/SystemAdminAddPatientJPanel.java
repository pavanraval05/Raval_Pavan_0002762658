/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package HealthCareUI;

import HealthCare.Doctor;
import HealthCare.Patient;
import HealthCare.SystemAdmin;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author pavan
 */
public class SystemAdminAddPatientJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminDoctorJPanel
     */
    public SystemAdminAddPatientJPanel() {
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

        jLabel4 = new javax.swing.JLabel();
        patientID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        patientName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        patientCommunity = new javax.swing.JTextField();
        addDoctor = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        patientUser = new javax.swing.JTextField();
        patientPass = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        patientGender = new javax.swing.JTextField();
        patientCity = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel4.setText("Patient ID");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, -1, 35));
        add(patientID, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 193, 32));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText(" Name");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 105, 35));
        add(patientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 193, 32));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setText("Gender");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 105, 35));
        add(patientCommunity, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 480, 193, 32));

        addDoctor.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        addDoctor.setForeground(new java.awt.Color(0, 102, 204));
        addDoctor.setText("ADD PATIENT");
        addDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDoctorActionPerformed(evt);
            }
        });
        add(addDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 706, -1, 49));

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel15.setText("Community");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 480, 118, 35));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setText("Username");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 550, 105, 35));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("Password");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 620, 105, 35));

        patientUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientUserActionPerformed(evt);
            }
        });
        add(patientUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 550, 193, 32));

        patientPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientPassActionPerformed(evt);
            }
        });
        add(patientPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 620, 192, 32));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setText("ADD PATIENT");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(803, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, -1));
        add(patientGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 193, 32));

        patientCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientCityActionPerformed(evt);
            }
        });
        add(patientCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, 192, 32));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("City");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 105, 35));

        jLabel1.setIcon(new javax.swing.ImageIcon("/home/pavan/Downloads/2.jpg")); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1140, 800));
    }// </editor-fold>//GEN-END:initComponents

    private void addDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDoctorActionPerformed
if(!Pattern.compile("[a-zA-Z ]+").matcher(patientName.getText()).matches()){
            JOptionPane.showMessageDialog(this, "Please enter valid name");
            return;
//            ([a-z].[0-9])|([0-9].[a-z])
//           
        }
        
        if(!Pattern.compile("[a-zA-Z ]+").matcher(patientGender.getText()).matches()){
            JOptionPane.showMessageDialog(this, "Please enter valid Gender");
            return;
        }
        if(!Pattern.compile("[0-9]*$").matcher(patientID.getText()).matches()){
            JOptionPane.showMessageDialog(this, "Please enter valid ID");
            return;
            
        }
        if(!Pattern.compile("[a-zA-Z ]+").matcher(patientCommunity.getText()).matches()){
            JOptionPane.showMessageDialog(this, "please enter valid Community");
            return;
       
        }
        if(!Pattern.compile("[a-zA-Z ]+").matcher(patientCity.getText()).matches()){
            JOptionPane.showMessageDialog(this, "please enter valid City");
            return;
        }if(!Pattern.compile("^[a-zA-Z0-9._-]{3,}$").matcher(patientUser.getText()).matches()){
            JOptionPane.showMessageDialog(this, "6");
            return;
        }if(!Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$").matcher(patientPass.getText()).matches()){
            JOptionPane.showMessageDialog(this, "    Password must contain at least one digit [0-9].\n" +
"    Password must contain at least one lowercase Latin character [a-z].\n" +
"    Password must contain at least one uppercase Latin character [A-Z].\n" +
"    Password must contain at least one special character like ! @ # & ( ).\n" +
"    Password must contain a length of at least 8 characters and a maximum of 20 characters.");
            return;
        }
        int id = Integer.parseInt(patientID.getText());
//         String name = name.getText();
         Patient patient = new Patient(id, patientUser.getText(), patientPass.getText(), patientName.getText(), patientCommunity.getText(), patientCity.getText(), patientCommunity.getText());
         SystemAdmin.patientList.add(patient);
         JOptionPane.showMessageDialog(null, "Added Patient.");       
    }//GEN-LAST:event_addDoctorActionPerformed

    private void patientUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientUserActionPerformed

    private void patientPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientPassActionPerformed

    private void patientCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientCityActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDoctor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField patientCity;
    private javax.swing.JTextField patientCommunity;
    private javax.swing.JTextField patientGender;
    private javax.swing.JTextField patientID;
    private javax.swing.JTextField patientName;
    private javax.swing.JTextField patientPass;
    private javax.swing.JTextField patientUser;
    // End of variables declaration//GEN-END:variables
}
