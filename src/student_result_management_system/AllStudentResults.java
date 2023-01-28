/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package student_result_management_system;
import java.sql.*;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author Feroz
 */
public class AllStudentResults extends javax.swing.JFrame {
Connection connection = null;
    /**
     * Creates new form AllStudentResults
     */
    public AllStudentResults() {
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

        jPanel1 = new javax.swing.JPanel();
        btnAddnewStudents = new javax.swing.JButton();
        btnInsertNewResult = new javax.swing.JButton();
        btnRegisteredStudents = new javax.swing.JButton();
        btnAllStudentsResults = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
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
        btnAddnewStudents.setBorder(null);
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
        btnInsertNewResult.setBorder(null);
        btnInsertNewResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertNewResultActionPerformed(evt);
            }
        });
        jPanel1.add(btnInsertNewResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 150, 30));

        btnRegisteredStudents.setBackground(new java.awt.Color(175, 213, 170));
        btnRegisteredStudents.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnRegisteredStudents.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student_result_management_system/registeredstudent.png"))); // NOI18N
        btnRegisteredStudents.setText("Registered Students");
        btnRegisteredStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisteredStudentsActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegisteredStudents, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, 30));

        btnAllStudentsResults.setBackground(new java.awt.Color(175, 213, 170));
        btnAllStudentsResults.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnAllStudentsResults.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student_result_management_system/allresult.png"))); // NOI18N
        btnAllStudentsResults.setText("All students results");
        btnAllStudentsResults.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(btnAllStudentsResults, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, 30));

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

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        table.setMinimumSize(new java.awt.Dimension(500, 500));
        table.setPreferredSize(new java.awt.Dimension(500, 500));
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 500, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddnewStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddnewStudentsActionPerformed
        // TODO add your handling code here:
         setVisible(false);
        new AdminPage().setVisible(true);
    }//GEN-LAST:event_btnAddnewStudentsActionPerformed

    private void btnInsertNewResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertNewResultActionPerformed
        // TODO add your handling code here:
         setVisible(false);
        new InsertNewResult().setVisible(true);
    }//GEN-LAST:event_btnInsertNewResultActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        connection = DatabaseHelper.getConnection();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from result");
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"unable to load results");
        }
    }//GEN-LAST:event_formComponentShown

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new HomePage().setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnRegisteredStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisteredStudentsActionPerformed
        // TODO add your handling code here:
         setVisible(false);
        new registeredStudents().setVisible(true);
    }//GEN-LAST:event_btnRegisteredStudentsActionPerformed

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
            java.util.logging.Logger.getLogger(AllStudentResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AllStudentResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AllStudentResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AllStudentResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AllStudentResults().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddnewStudents;
    private javax.swing.JButton btnAllStudentsResults;
    private javax.swing.JButton btnInsertNewResult;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnRegisteredStudents;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}