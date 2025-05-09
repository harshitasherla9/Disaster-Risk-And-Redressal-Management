/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.disasterredressalmanagementsysterm;
import java.sql.*;
import dao.ConnectionProvider;
/**
 *
 * @author harsh
 */
public class RegComplaint extends javax.swing.JFrame {
    public String phoneNumberPattern = "^[0-9]*$";
    /**
     * Creates new form RegComplaint
     */
    public RegComplaint() {
        initComponents();
        SubmitBtn.setEnabled(false);
    }
    
    public void clear()
    {
        NameField.setText("");
        PhoneField.setText("");
        StateField.setText("");
        PlaceField.setText("");
        DisasterComboBox.setText("");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NameLabel = new javax.swing.JLabel();
        PhoneLabel = new javax.swing.JLabel();
        DisasterLabel = new javax.swing.JLabel();
        ComplaintLabel = new javax.swing.JLabel();
        PlaceIncLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        DateLabel = new javax.swing.JLabel();
        StateRCLabel = new javax.swing.JLabel();
        PostLabel = new javax.swing.JLabel();
        SubmitBtn = new javax.swing.JButton();
        NameField = new javax.swing.JTextField();
        PhoneField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ComplaintField = new javax.swing.JTextArea();
        StateField = new javax.swing.JTextField();
        PlaceField = new javax.swing.JTextField();
        DateField = new javax.swing.JTextField();
        PostField = new javax.swing.JLabel();
        UploadPicBtn = new javax.swing.JButton();
        DisasterComboBox = new javax.swing.JComboBox<>();
        RcLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NameLabel.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        NameLabel.setForeground(new java.awt.Color(255, 255, 255));
        NameLabel.setText("Name");
        getContentPane().add(NameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 175, -1));

        PhoneLabel.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        PhoneLabel.setForeground(new java.awt.Color(255, 255, 255));
        PhoneLabel.setText("Phone Number");
        getContentPane().add(PhoneLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 220, -1));

        DisasterLabel.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        DisasterLabel.setForeground(new java.awt.Color(255, 255, 255));
        DisasterLabel.setText("Disaster ");
        getContentPane().add(DisasterLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 560, 175, -1));

        ComplaintLabel.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        ComplaintLabel.setForeground(new java.awt.Color(255, 255, 255));
        ComplaintLabel.setText("Complaint");
        getContentPane().add(ComplaintLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 640, 175, -1));

        PlaceIncLabel.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        PlaceIncLabel.setForeground(new java.awt.Color(255, 255, 255));
        PlaceIncLabel.setText("Place of incidence");
        getContentPane().add(PlaceIncLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 480, 240, -1));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 927, -1, -1));

        DateLabel.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        DateLabel.setForeground(new java.awt.Color(255, 255, 255));
        DateLabel.setText("Date ");
        getContentPane().add(DateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 840, 100, 30));

        StateRCLabel.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        StateRCLabel.setForeground(new java.awt.Color(255, 255, 255));
        StateRCLabel.setText("State ");
        getContentPane().add(StateRCLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 175, -1));

        PostLabel.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        PostLabel.setForeground(new java.awt.Color(255, 255, 255));
        PostLabel.setText("Picture proof");
        getContentPane().add(PostLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 800, 169, -1));

        SubmitBtn.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        SubmitBtn.setForeground(new java.awt.Color(0, 0, 102));
        SubmitBtn.setText("SUBMIT");
        SubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(SubmitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 990, -1, -1));

        NameField.setFont(new java.awt.Font("Georgia", 1, 20)); // NOI18N
        NameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameFieldActionPerformed(evt);
            }
        });
        getContentPane().add(NameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 578, -1));

        PhoneField.setFont(new java.awt.Font("Georgia", 1, 20)); // NOI18N
        getContentPane().add(PhoneField, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, 578, -1));

        ComplaintField.setColumns(20);
        ComplaintField.setFont(new java.awt.Font("Georgia", 1, 20)); // NOI18N
        ComplaintField.setRows(5);
        jScrollPane1.setViewportView(ComplaintField);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 630, 578, 116));

        StateField.setFont(new java.awt.Font("Georgia", 1, 20)); // NOI18N
        StateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StateFieldActionPerformed(evt);
            }
        });
        getContentPane().add(StateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, 578, -1));

        PlaceField.setFont(new java.awt.Font("Georgia", 1, 20)); // NOI18N
        PlaceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlaceFieldActionPerformed(evt);
            }
        });
        getContentPane().add(PlaceField, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 480, 578, -1));

        DateField.setFont(new java.awt.Font("Georgia", 1, 20)); // NOI18N
        DateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateFieldActionPerformed(evt);
            }
        });
        getContentPane().add(DateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 840, 230, -1));

        PostField.setBackground(new java.awt.Color(255, 255, 204));
        PostField.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(PostField, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 788, 578, 160));

        UploadPicBtn.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        UploadPicBtn.setForeground(new java.awt.Color(0, 0, 102));
        UploadPicBtn.setText("Upload");
        getContentPane().add(UploadPicBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 880, -1, -1));

        DisasterComboBox.setFont(new java.awt.Font("Georgia", 1, 20)); // NOI18N
        DisasterComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(DisasterComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 557, 578, -1));

        RcLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Register Complaint.png"))); // NOI18N
        RcLabel.setText("Label");
        getContentPane().add(RcLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameFieldActionPerformed

    private void PlaceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlaceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PlaceFieldActionPerformed

    private void DateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DateFieldActionPerformed

    private void StateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StateFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StateFieldActionPerformed

    private void SubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitBtnActionPerformed
        // TODO add your handling code here:
        String NameLabel=NameField.getText();
        String PhoneLabel=PhoneField.getText();
        String StateRCLabel=StateField.getText();
        String PlaceIncLabel=PlaceField.getText();
        String DisasterLabel=DisasterComboBox.getSelectedItem();
        String ComplaintLable=ComplaintField.getText();
        
        try{
                Connection con = ConnectionProvider.getCon();
                Statement st=con.createStatement();
                st.execute("insert into complaint()");
                JoptionPane.showMessageDilaog(null,"Complaint filed successfully");
                setVisible(false);
        }
        catch(Exception e)
        {
            JoptionPane.showMessageDilaog(null,"Fields already exist");
            setVisible(false);
        }
    }//GEN-LAST:event_SubmitBtnActionPerformed

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
            java.util.logging.Logger.getLogger(RegComplaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegComplaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegComplaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegComplaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegComplaint().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea ComplaintField;
    private javax.swing.JLabel ComplaintLabel;
    private javax.swing.JTextField DateField;
    private javax.swing.JLabel DateLabel;
    private javax.swing.JComboBox<String> DisasterComboBox;
    private javax.swing.JLabel DisasterLabel;
    private javax.swing.JTextField NameField;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JTextField PhoneField;
    private javax.swing.JLabel PhoneLabel;
    private javax.swing.JTextField PlaceField;
    private javax.swing.JLabel PlaceIncLabel;
    private javax.swing.JLabel PostField;
    private javax.swing.JLabel PostLabel;
    private javax.swing.JLabel RcLabel;
    private javax.swing.JTextField StateField;
    private javax.swing.JLabel StateRCLabel;
    private javax.swing.JButton SubmitBtn;
    private javax.swing.JButton UploadPicBtn;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
