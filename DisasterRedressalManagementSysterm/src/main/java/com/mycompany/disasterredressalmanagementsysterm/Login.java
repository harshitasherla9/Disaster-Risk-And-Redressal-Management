/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.disasterredressalmanagementsysterm;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author harsh
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        LoginBtn.setEnabled(false);
    }
    public void clear(){
        UsernameField.setText("");
        PasswordField.setText("");
        LoginBtn.setEnabled(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UsernameLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        UsernameField = new javax.swing.JTextField();
        LoginBtn = new javax.swing.JButton();
        ExitBtn = new javax.swing.JButton();
        ViewCompDetBtn = new javax.swing.JButton();
        AssResForBtn = new javax.swing.JButton();
        PasswordField = new javax.swing.JPasswordField();
        Login = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UsernameLabel.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        UsernameLabel.setForeground(new java.awt.Color(0, 0, 102));
        UsernameLabel.setText("Username ");
        getContentPane().add(UsernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 310, -1, -1));

        PasswordLabel.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        PasswordLabel.setForeground(new java.awt.Color(0, 0, 102));
        PasswordLabel.setText("Password");
        getContentPane().add(PasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 430, 201, -1));

        UsernameField.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        UsernameField.setForeground(new java.awt.Color(0, 0, 102));
        getContentPane().add(UsernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 310, 317, -1));

        LoginBtn.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        LoginBtn.setForeground(new java.awt.Color(0, 0, 102));
        LoginBtn.setText("Login");
        LoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBtnActionPerformed(evt);
            }
        });
        getContentPane().add(LoginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 580, -1, -1));

        ExitBtn.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        ExitBtn.setForeground(new java.awt.Color(0, 0, 153));
        ExitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/exit.png"))); // NOI18N
        ExitBtn.setText("Exit");
        ExitBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ExitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(ExitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1710, 100, -1, -1));

        ViewCompDetBtn.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        ViewCompDetBtn.setForeground(new java.awt.Color(0, 0, 102));
        ViewCompDetBtn.setText("View Complaint Details");
        getContentPane().add(ViewCompDetBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 810, -1, -1));

        AssResForBtn.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        AssResForBtn.setForeground(new java.awt.Color(0, 0, 102));
        AssResForBtn.setText("Assign Response Force");
        getContentPane().add(AssResForBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 810, -1, -1));

        PasswordField.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        PasswordField.setForeground(new java.awt.Color(0, 0, 102));
        getContentPane().add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 430, 310, -1));

        Login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Admin Login.png"))); // NOI18N
        Login.setText("Label");
        getContentPane().add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBtnActionPerformed
        // TODO add your handling code here:
        if(UsernameField.getText().equals("admin") && PasswordField.getText().equals("admin") )
        {
            setVisible(false);
        }
        else
            JOptionPane.showMessageDialog(null,"Incorrect Username or Password!");
    }//GEN-LAST:event_LoginBtnActionPerformed

    private void ExitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBtnActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null,"Do you want to exit?","Select",JOptionPane.YES_NO_OPTION);
        
        System.exit(0);
    }//GEN-LAST:event_ExitBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AssResForBtn;
    private javax.swing.JButton ExitBtn;
    private javax.swing.JLabel Login;
    private javax.swing.JButton LoginBtn;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JTextField UsernameField;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JButton ViewCompDetBtn;
    // End of variables declaration//GEN-END:variables
}
