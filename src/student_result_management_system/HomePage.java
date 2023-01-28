/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package student_result_management_system;

/**
 *
 * @author Feroz
 */
public class HomePage extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    public HomePage() {
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

        btnStudent = new javax.swing.JButton();
        btnProfessor = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnStudent.setBackground(new java.awt.Color(247, 197, 159));
        btnStudent.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnStudent.setForeground(new java.awt.Color(20, 17, 21));
        btnStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student_result_management_system/icons8-edit student.png"))); // NOI18N
        btnStudent.setText("Student");
        btnStudent.setName(""); // NOI18N
        btnStudent.setOpaque(true);
        btnStudent.setPreferredSize(new java.awt.Dimension(100, 30));
        btnStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentActionPerformed(evt);
            }
        });
        getContentPane().add(btnStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 170, 40));

        btnProfessor.setBackground(new java.awt.Color(247, 197, 159));
        btnProfessor.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnProfessor.setForeground(new java.awt.Color(20, 17, 21));
        btnProfessor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student_result_management_system/icons8-admin-settings-male-30.png"))); // NOI18N
        btnProfessor.setText("professor");
        btnProfessor.setMinimumSize(new java.awt.Dimension(500, 200));
        btnProfessor.setPreferredSize(new java.awt.Dimension(100, 30));
        btnProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfessorActionPerformed(evt);
            }
        });
        getContentPane().add(btnProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 200, 40));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(20, 17, 21));
        jLabel1.setText("AccioJob");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student_result_management_system/school_pic2.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfessorActionPerformed
         // TODO add your handling code here:
        setVisible(false);
        new AdminCredentials().setVisible(true);
        
    }//GEN-LAST:event_btnProfessorActionPerformed

    private void btnStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new StudentPage().setVisible(true);
    }//GEN-LAST:event_btnStudentActionPerformed

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProfessor;
    private javax.swing.JButton btnStudent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
