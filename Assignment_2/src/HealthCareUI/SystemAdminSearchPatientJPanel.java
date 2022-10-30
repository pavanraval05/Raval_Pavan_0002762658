/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package HealthCareUI;

import HealthCare.Doctor;
import HealthCare.Patient;
import HealthCare.SystemAdmin;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author pavan
 */
public class SystemAdminSearchPatientJPanel extends javax.swing.JPanel {
private TableRowSorter<TableModel> sorter; 
    /**
     * Creates new form AdminDoctorJPanel
     */
    public SystemAdminSearchPatientJPanel() {
        initComponents();
         fillTable();
        sorter = new TableRowSorter<TableModel>(patientTable.getModel());
        patientTable.setRowSorter(sorter);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        search = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        patientTable = new javax.swing.JTable();
        search1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });
        add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 110, 336, 32));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setText("Search Patient");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(662, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, -1));

        patientTable.setBackground(new java.awt.Color(204, 255, 255));
        patientTable.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        patientTable.setForeground(new java.awt.Color(0, 102, 204));
        patientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NAME", "GENDER", "CITY", "USERNAME", "PASSWORD", "patient Obj"
            }
        ));
        jScrollPane1.setViewportView(patientTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 228, 790, 481));

        search1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        search1.setForeground(new java.awt.Color(0, 102, 204));
        search1.setText("SEARCH PATIENT");
        search1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search1ActionPerformed(evt);
            }
        });
        add(search1, new org.netbeans.lib.awtextra.AbsoluteConstraints(683, 110, -1, 32));

        jComboBox1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 102, 204));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NAME", "ID", "USERNAME", "GENDER" }));
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 111, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("/home/pavan/Downloads/2.jpg")); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 800));
    }// </editor-fold>//GEN-END:initComponents

    private void search1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search1ActionPerformed

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
        // TODO add your handling code here:
        String textBoxString = search.getText();
        sorter.setRowFilter(RowFilter.regexFilter(textBoxString));
      
    }//GEN-LAST:event_searchKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable patientTable;
    private javax.swing.JTextField search;
    private javax.swing.JButton search1;
    // End of variables declaration//GEN-END:variables

private void fillTable() {
       DefaultTableModel model = (DefaultTableModel)patientTable.getModel();
       model.setRowCount(0);
       for(Patient  p : SystemAdmin.patientList ){
           
           Object[] row = new Object[8];
           row[0]= p.patientID;
           row[1]= p.name;
           row[2]= p.gender;
           
           row[3]= p.city;
           row[4]= p.community;
           row[5]= p.username;
           row[6]= p.password;
           row[7]= p;
           
           
           model.addRow(row);
       }}}
