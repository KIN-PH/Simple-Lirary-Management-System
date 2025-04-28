/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.sql.*;
import javax.swing.*;
import java.awt.Color;
public class StudentRegistration extends javax.swing.JFrame {
    
    Connection con;
    PreparedStatement pst;

    public StudentRegistration() {
        initComponents();
        txtStudentID.setBackground(new Color(0,0,0,0));
        txtFullname.setBackground(new Color(0,0,0,0));
        txtCnumber.setBackground(new Color(0,0,0,0));
        txtEmail.setBackground(new Color(0,0,0,0));
        setLocationRelativeTo(null);
        connect();
    }
public void connect() {
    this.con = DatabaseConnector.connect();
    if (this.con !=null) {
        System.out.println("Database connected successfully");
    }else {
        JOptionPane.showMessageDialog(this, "Database connection failed", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

public void clearTextfield(){
    txtStudentID.setText("");
    txtFullname.setText("");
    txtCnumber.setText("");
    txtEmail.setText("");
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblStudentID = new javax.swing.JLabel();
        lblFullname = new javax.swing.JLabel();
        lblCnumber = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtStudentID = new javax.swing.JTextField();
        txtFullname = new javax.swing.JTextField();
        txtCnumber = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnRegister = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblStudentID.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        lblStudentID.setForeground(new java.awt.Color(255, 255, 255));
        lblStudentID.setText("Student ID");
        jPanel3.add(lblStudentID, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, -1, -1));

        lblFullname.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        lblFullname.setForeground(new java.awt.Color(255, 255, 255));
        lblFullname.setText("Full Name");
        jPanel3.add(lblFullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, -1, -1));

        lblCnumber.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        lblCnumber.setForeground(new java.awt.Color(255, 255, 255));
        lblCnumber.setText("Contact Number");
        jPanel3.add(lblCnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, -1, -1));

        lblEmail.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Email");
        jPanel3.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, -1, -1));

        txtStudentID.setForeground(new java.awt.Color(255, 255, 255));
        txtStudentID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtStudentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStudentIDActionPerformed(evt);
            }
        });
        jPanel3.add(txtStudentID, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 199, 32));

        txtFullname.setForeground(new java.awt.Color(255, 255, 255));
        txtFullname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel3.add(txtFullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 199, 32));

        txtCnumber.setForeground(new java.awt.Color(255, 255, 255));
        txtCnumber.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtCnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCnumberActionPerformed(evt);
            }
        });
        jPanel3.add(txtCnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 199, 32));

        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel3.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 200, 33));

        btnRegister.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegister.setText("Register");
        btnRegister.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        jPanel3.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 352, 70, 30));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Student Registration");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.png"))); // NOI18N
        btnBack.setText("Back To Login");
        btnBack.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel3.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, 130, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibraryManagementSystem.png"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        String studentid = txtStudentID.getText();
        String fullname = txtFullname.getText();
        String cnumber = txtCnumber.getText();
        String email = txtEmail.getText();
        
        if (studentid.isEmpty()|| fullname.isEmpty()|| cnumber.isEmpty()|| email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All field are require", "error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String sql = "INSERT INTO student_account(studentid,fullname,contactnumber,email) VALUES (?,?,?,?)";
        try (Connection con = DatabaseConnector.connect();
                PreparedStatement pst = con.prepareStatement(sql)){
            
            pst.setString(1,studentid);
            pst.setString(2,fullname);
            pst.setString(3,cnumber);
            pst.setString(4,email);
            
            int rowInserted = pst.executeUpdate();
            
            if(rowInserted > 0) {
                JOptionPane.showMessageDialog(this, "Created successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
                clearTextfield();
            }else {
                JOptionPane.showMessageDialog(this, "Something wrong.", "error",JOptionPane.ERROR_MESSAGE);
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"database error: "+ ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }                                          
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        login lg = new login();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtCnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCnumberActionPerformed

    private void txtStudentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStudentIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStudentIDActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

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
            java.util.logging.Logger.getLogger(StudentRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblCnumber;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFullname;
    private javax.swing.JLabel lblStudentID;
    private javax.swing.JTextField txtCnumber;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFullname;
    private javax.swing.JTextField txtStudentID;
    // End of variables declaration//GEN-END:variables
}
