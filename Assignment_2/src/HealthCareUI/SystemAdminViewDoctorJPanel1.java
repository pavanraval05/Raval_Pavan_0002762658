/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package HealthCareUI;

import HealthCare.Doctor;
import HealthCare.SystemAdmin;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pavan
 */
public class SystemAdminViewDoctorJPanel1 extends javax.swing.JPanel {

    /**
     * Creates new form AdminDoctorJPanel
     */
    public SystemAdminViewDoctorJPanel1() {
        initComponents();
        fillTable();
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
        doctorid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        firstname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        gender = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        department = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        search1 = new javax.swing.JButton();
        community = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        city = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 255));
        jLabel4.setText("Doctor ID");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 424, -1, 35));
        add(doctorid, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 424, 193, 32));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 204));
        jLabel3.setText("First Name");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 477, 105, 35));
        add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 477, 193, 32));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 204));
        jLabel6.setText("Gender");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 530, 105, 35));
        add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 532, 193, 32));

        update.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        update.setForeground(new java.awt.Color(0, 102, 204));
        update.setText("UPDATE DOCTOR");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 710, -1, 49));

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 102, 204));
        jLabel15.setText("Department");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 590, 118, 35));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 102, 204));
        jLabel19.setText("Username");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 652, 105, 35));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 102, 204));
        jLabel17.setText("Password");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 500, 105, 35));

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 654, 192, 32));

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 490, 192, 32));

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("View Doctors");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(772, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, -1));
        add(department, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 590, 193, 32));

        jTable1.setBackground(new java.awt.Color(102, 102, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NAME", "GENDER", "DEPARTMENT", "USERNAMEl", "PASSWORD", "DoctorObject"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 94, 960, 294));

        search1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        search1.setForeground(new java.awt.Color(0, 102, 204));
        search1.setText("DELETE DOCTOR");
        search1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search1ActionPerformed(evt);
            }
        });
        add(search1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 420, -1, 49));
        add(community, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 620, 193, 32));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 204));
        jLabel5.setText("CITY");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 560, 105, 35));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 204));
        jLabel7.setText("COMMUNITY");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 620, 129, 35));
        add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 560, 193, 32));

        jLabel1.setIcon(new javax.swing.ImageIcon("/home/pavan/Downloads/7.jpg")); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1140, 820));
    }// </editor-fold>//GEN-END:initComponents

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int selectedRowIndex = jTable1.getSelectedRow();
       
        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a Row to Update");
            return;
        }
       
       
       
       
       
       
        if(jTable1.getSelectedRowCount() == 1){
          Doctor p = (Doctor)model.getValueAt(jTable1.getSelectedRow(), 6);
         
          p.doctorID=Integer.parseInt( doctorid.getText());
//          p.city=city.getText();
//          p.community= community.getText();
          p.department=department.getText();
          p.gender=gender.getText();
          p.name=firstname.getText();
          p.username=username.getText();
          p.password=password.getText();
          
            //if single row is selected then update
         fillTable();
            JOptionPane.showMessageDialog(this, "Update Successful !!!");
        }
        else{
           
            if(jTable1.getRowCount () == 0){
                //if table is empty
                JOptionPane.showMessageDialog(this, "Table is empty !!!");
            }
            else{
                //if row is not selected or multiple row is selected
                JOptionPane.showMessageDialog(this, "Please select single row for update !!!");

            }
        }        
        

  
    }//GEN-LAST:event_updateActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void search1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        Doctor p = (Doctor)model.getValueAt(jTable1.getSelectedRow(), 6);
        if(p!= null){
            SystemAdmin.doctorList.remove(p);
            fillTable();
        }
    }//GEN-LAST:event_search1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        Doctor p = (Doctor)model.getValueAt(jTable1.getSelectedRow(), 6);
        doctorid.setText(String.valueOf(p.doctorID));
        firstname.setText(p.name);
        gender.setText(p.gender);
        department.setText(p.department);
//        city.setText(p.city);
//        community.setText(p.community);
        username.setText(p.username);
        password.setText(p.password);
        
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField city;
    private javax.swing.JTextField community;
    private javax.swing.JTextField department;
    private javax.swing.JTextField doctorid;
    private javax.swing.JTextField firstname;
    private javax.swing.JTextField gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField password;
    private javax.swing.JButton search1;
    private javax.swing.JButton update;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
private void fillTable() {
       DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
       model.setRowCount(0);
       for(Doctor  p : SystemAdmin.doctorList ){
           
           Object[] row = new Object[7];
           row[0]= p.doctorID;
           row[1]= p.name;
           row[2]= p.gender;
           row[3]= p.department;
//           row[4]= p.city;
//           row[5]= p.community;
           row[4]= p.username;
           row[5]= p.password;
           row[6]= p;
           
           
           model.addRow(row);
       }}
}
