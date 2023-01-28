/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package student_result_management_system;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Feroz
 */
public class AdminPage extends javax.swing.JFrame {

    /**
     * Creates new form AdminPage
     */
    Statement statement = null;
    Connection connection = null;
    public AdminPage() {
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

        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnAddnewStudents = new javax.swing.JButton();
        btnInsertNewResult = new javax.swing.JButton();
        btnRegisteredStudents = new javax.swing.JButton();
        btnAllStudentsResults = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ddlGender = new javax.swing.JComboBox<>();
        ddlBranchName = new javax.swing.JComboBox<>();
        tfName = new javax.swing.JTextField();
        tfRollNo = new javax.swing.JTextField();
        ddlCourseName = new javax.swing.JComboBox<>();
        btnAddStudent = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        tfFatherName = new javax.swing.JTextField();

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 187, 140));
        jPanel1.setMaximumSize(new java.awt.Dimension(200, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(200, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAddnewStudents.setBackground(new java.awt.Color(175, 213, 170));
        btnAddnewStudents.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnAddnewStudents.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student_result_management_system/adduser.png"))); // NOI18N
        btnAddnewStudents.setText("Add new Students");
        btnAddnewStudents.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnAddnewStudents.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAddnewStudents.setPreferredSize(new java.awt.Dimension(138, 27));
        btnAddnewStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddnewStudentsActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddnewStudents, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 150, -1));

        btnInsertNewResult.setBackground(new java.awt.Color(175, 213, 170));
        btnInsertNewResult.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnInsertNewResult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student_result_management_system/result.png"))); // NOI18N
        btnInsertNewResult.setText("Insert new Result");
        btnInsertNewResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertNewResultActionPerformed(evt);
            }
        });
        jPanel1.add(btnInsertNewResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        btnRegisteredStudents.setBackground(new java.awt.Color(175, 213, 170));
        btnRegisteredStudents.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnRegisteredStudents.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student_result_management_system/registeredstudent.png"))); // NOI18N
        btnRegisteredStudents.setText("Registered Students");
        btnRegisteredStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisteredStudentsActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegisteredStudents, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        btnAllStudentsResults.setBackground(new java.awt.Color(175, 213, 170));
        btnAllStudentsResults.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnAllStudentsResults.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student_result_management_system/allresult.png"))); // NOI18N
        btnAllStudentsResults.setText("All students results");
        btnAllStudentsResults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllStudentsResultsActionPerformed(evt);
            }
        });
        jPanel1.add(btnAllStudentsResults, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        btnLogout.setBackground(new java.awt.Color(175, 213, 170));
        btnLogout.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student_result_management_system/logout.png"))); // NOI18N
        btnLogout.setText("log out");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 500));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Course Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, -1, 20));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Branch Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Roll No ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Gender");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Father's Name");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, -1, -1));

        ddlGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NA", "Male", "Female", " " }));
        ddlGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddlGenderActionPerformed(evt);
            }
        });
        getContentPane().add(ddlGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 90, -1));

        ddlBranchName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IT", "CSE", "MECH", "CIVIL", "EEE", "ECE", " " }));
        ddlBranchName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddlBranchNameActionPerformed(evt);
            }
        });
        getContentPane().add(ddlBranchName, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, -1, -1));

        tfName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNameActionPerformed(evt);
            }
        });
        getContentPane().add(tfName, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 190, -1));

        tfRollNo.setText(" ");
        getContentPane().add(tfRollNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 190, -1));

        ddlCourseName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "B.Tech", " ", " ", " " }));
        getContentPane().add(ddlCourseName, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, -1, -1));

        btnAddStudent.setBackground(new java.awt.Color(107, 75, 149));
        btnAddStudent.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnAddStudent.setForeground(new java.awt.Color(255, 255, 255));
        btnAddStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student_result_management_system/addstudent1.png"))); // NOI18N
        btnAddStudent.setText("Add Student");
        btnAddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStudentActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, -1, -1));

        jPanel2.setBackground(new java.awt.Color(165, 214, 243));
        jPanel2.setMaximumSize(new java.awt.Dimension(500, 500));
        jPanel2.setMinimumSize(new java.awt.Dimension(500, 500));
        jPanel2.setName(""); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 500));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(tfFatherName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 190, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 470, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertNewResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertNewResultActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new InsertNewResult().setVisible(true);
    }//GEN-LAST:event_btnInsertNewResultActionPerformed

    private void btnAddnewStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddnewStudentsActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnAddnewStudentsActionPerformed

    private void tfNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNameActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_tfNameActionPerformed

    private void ddlGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddlGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ddlGenderActionPerformed

    private void btnAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStudentActionPerformed
        // TODO add your handling code here:
        String name = tfName.getText();
        String rollNo = tfRollNo.getText();
        String gender = (String)ddlGender.getSelectedItem();
        String fatherName = tfFatherName.getText();
        String courseName = (String)ddlCourseName.getSelectedItem();
        String branchName = (String)ddlBranchName.getSelectedItem();
        
        if(tfName.getText().equals("")|| tfFatherName.getText().equals("")
                ||tfRollNo.getText().equals("")){
            JOptionPane.showMessageDialog(null,"please fill all the fields");
        }
       
        else{
        try {
            if(connection == null){
             connection = DatabaseHelper.getConnection();
            }
            statement = connection.createStatement();
             statement.executeUpdate("insert into student values('"+rollNo+"','"+name+"','"+gender+"','"+fatherName+"','"+courseName+"','"+branchName+"')");
             JOptionPane.showMessageDialog(null, "student added successfully");
             tfName.setText("");
             tfRollNo.setText("");
             tfFatherName.setText("");
             ddlBranchName.setSelectedIndex(0);
             ddlCourseName.setSelectedIndex(0);
             ddlGender.setSelectedIndex(0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        }
        
        
        
        
    }//GEN-LAST:event_btnAddStudentActionPerformed

    private void ddlBranchNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddlBranchNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ddlBranchNameActionPerformed

    private void btnRegisteredStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisteredStudentsActionPerformed
        // TODO add your handling code here:
         setVisible(false);
        new registeredStudents().setVisible(true);
    }//GEN-LAST:event_btnRegisteredStudentsActionPerformed

    private void btnAllStudentsResultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllStudentsResultsActionPerformed
        // TODO add your handling code here:
         setVisible(false);
        new AllStudentResults().setVisible(true);
    }//GEN-LAST:event_btnAllStudentsResultsActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new HomePage().setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddStudent;
    private javax.swing.JButton btnAddnewStudents;
    private javax.swing.JButton btnAllStudentsResults;
    private javax.swing.JButton btnInsertNewResult;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnRegisteredStudents;
    private javax.swing.JComboBox<String> ddlBranchName;
    private javax.swing.JComboBox<String> ddlCourseName;
    private javax.swing.JComboBox<String> ddlGender;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField tfFatherName;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfRollNo;
    // End of variables declaration//GEN-END:variables
}
