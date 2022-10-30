/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package HealthCareUI;

import HealthCare.City;
import HealthCare.Community;
import HealthCare.Doctor;
import HealthCare.Encounter;
import HealthCare.Hospital;
import HealthCare.House;
import HealthCare.Patient;
import HealthCare.SystemAdmin;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author pavan
 */
public class PatientSearchHospital extends javax.swing.JPanel {
    private Patient patient;
private TableRowSorter<TableModel> sorter; 
    /**
     * Creates new form PatientSearchHospital
     */
    public PatientSearchHospital(Patient patient) {
        initComponents();
        fillTable();
        sorter = new TableRowSorter<TableModel>(jTable2.getModel());
        jTable2.setRowSorter(sorter);
        this.patient = patient;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sear = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        search = new javax.swing.JButton();
        search1 = new javax.swing.JButton();
        search2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searActionPerformed(evt);
            }
        });
        sear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searKeyReleased(evt);
            }
        });
        add(sear, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 137, 541, 55));

        jTable1.setBackground(new java.awt.Color(204, 204, 204));
        jTable1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 102, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "DOCTOR NAME", "DOCTOR ID", "DOC OBJ"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 520, 843, 172));

        search.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        search.setForeground(new java.awt.Color(0, 102, 204));
        search.setText("BOOK APPOINTMENT");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 750, -1, 59));

        search1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        search1.setForeground(new java.awt.Color(0, 102, 204));
        search1.setText("SEARCH NEARBY HOSPITAL");
        search1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search1ActionPerformed(evt);
            }
        });
        add(search1, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 23, -1, 59));

        search2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        search2.setForeground(new java.awt.Color(0, 102, 204));
        search2.setText("SEARCH HOSPITAL");
        search2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search2ActionPerformed(evt);
            }
        });
        add(search2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, 59));

        jTable2.setBackground(new java.awt.Color(204, 204, 204));
        jTable2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTable2.setForeground(new java.awt.Color(0, 102, 204));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NAME", "CITY", "COMMUNITY", "ZIP CODE", "Hosp Obj"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 843, 172));

        jLabel1.setIcon(new javax.swing.ImageIcon("/home/pavan/Downloads/patient.jpg")); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 840));
    }// </editor-fold>//GEN-END:initComponents

    private void searActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        if(jTable2.getSelectedRow()>-1 && jTable1.getSelectedRow()>-1){
            Hospital c = (Hospital)jTable2.getValueAt(jTable2.getSelectedRow(), 4);
            Doctor d = (Doctor)jTable1.getValueAt(jTable1.getSelectedRow(), 2);
            Encounter e = new Encounter(d,this.patient);
            SystemAdmin.encounterList.add(e);
           
            JOptionPane.showMessageDialog(null, "Appoointment Booked");
        }

//if(jTable1.getSelectedRow()>-1) {
//          City c = (City)jTable1.getValueAt(jTable1.getSelectedRow(),1);
//         Community b= new Community(communityName.getText(),c,user.getText(),pass.getText());
//         SystemAdmin.communityList.add(b);
//         fillTable1();
//        }
//        else{
//             JOptionPane.showMessageDialog(null, "Please Select City");
//        }
    }//GEN-LAST:event_searchActionPerformed

    private void search1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search1ActionPerformed

    private void search2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search2ActionPerformed

    private void searKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searKeyReleased
        // TODO add your handling code here:
          String textBoxString = sear.getText();
        sorter.setRowFilter(RowFilter.regexFilter(textBoxString));
    }//GEN-LAST:event_searKeyReleased

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        if(jTable2.getSelectedRow()>-1){
            Hospital c = (Hospital)jTable2.getValueAt(jTable2.getSelectedRow(), 4);
            fillTable1(c);
        }
    
    }//GEN-LAST:event_jTable2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField sear;
    private javax.swing.JButton search;
    private javax.swing.JButton search1;
    private javax.swing.JButton search2;
    // End of variables declaration//GEN-END:variables

private void fillTable() {
       DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
       model.setRowCount(0);
       for(Hospital  p : SystemAdmin.hospitalList ){
           
           Object[] row = new Object[5];
           row[0]= p.getHospitalName();
           row[1]= p.getBelongsToCummunity().getCity();
           row[2]= p.getBelongsToCummunity();
           
           row[3]= p.getBelongsToCummunity().getCity().zipCode;
           row[4]= p;
          
           
           
           model.addRow(row);
       }
}

    private void fillTable1(Hospital c) {
      DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
      System.out.println(SystemAdmin.doctorList);
       model.setRowCount(0);
       for(Doctor  p : SystemAdmin.doctorList ){
           if(p.hospital == c){
                Object[] row = new Object[3];
                row[0]= p.name;
                row[1]= p.doctorID;
                row[2]=p;



                model.addRow(row);
           }
       }
    }

}
