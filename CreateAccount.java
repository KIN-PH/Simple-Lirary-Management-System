/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author USER
 */
import java.sql.*;
import javax.swing.*;
import java.awt.Color;
public class CreateAccount extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pst;
    
    public CreateAccount() {
        initComponents();
        txtFname.setBackground(new Color(0,0,0,0));
        txtUsername.setBackground(new Color(0,0,0,0));
        txtPassword.setBackground(new Color(0,0,0,0));
        txtLname.setBackground(new Color(0,0,0,0));
        txtEmail.setBackground(new Color(0,0,0,0));
        txtCnumber.setBackground(new Color(0,0,0,0));
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
public void clearTextfield() {
    txtFname.setText("");
    txtLname.setText("");
    txtUsername.setText("");
    txtEmail.setText("");
    txtCnumber.setText("");
    txtPassword.setText("");
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblFname = new javax.swing.JLabel();
        txtFname = new javax.swing.JTextField();
        lblLname = new javax.swing.JLabel();
        txtLname = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblCnumber = new javax.swing.JLabel();
        txtCnumber = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        btnCaccount1 = new javax.swing.JButton();
        btnCaccount = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 43, 103));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFname.setBackground(new java.awt.Color(255, 255, 255));
        lblFname.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        lblFname.setForeground(new java.awt.Color(255, 255, 255));
        lblFname.setText("First Name:");
        jPanel2.add(lblFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        txtFname.setForeground(new java.awt.Color(255, 255, 255));
        txtFname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtFname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFnameActionPerformed(evt);
            }
        });
        jPanel2.add(txtFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 150, 25));

        lblLname.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        lblLname.setForeground(new java.awt.Color(255, 255, 255));
        lblLname.setText("Last Name:");
        jPanel2.add(lblLname, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, -1, -1));

        txtLname.setForeground(new java.awt.Color(255, 255, 255));
        txtLname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel2.add(txtLname, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, 160, 25));

        lblUsername.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 255, 255));
        lblUsername.setText("Username:");
        jPanel2.add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        txtUsername.setForeground(new java.awt.Color(255, 255, 255));
        txtUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel2.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 150, 25));

        lblEmail.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Email:");
        jPanel2.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, -1, -1));

        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel2.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 160, 25));

        lblCnumber.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        lblCnumber.setForeground(new java.awt.Color(255, 255, 255));
        lblCnumber.setText("Contact Number:");
        jPanel2.add(lblCnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, -1, -1));

        txtCnumber.setForeground(new java.awt.Color(255, 255, 255));
        txtCnumber.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel2.add(txtCnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, 140, 25));

        lblPassword.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Password:");
        jPanel2.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, -1));

        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel2.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 150, 25));

        btnCaccount1.setBackground(new java.awt.Color(204, 204, 204));
        btnCaccount1.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        btnCaccount1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.png"))); // NOI18N
        btnCaccount1.setText("Go To Dashboard");
        btnCaccount1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaccount1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnCaccount1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, -1, -1));

        btnCaccount.setBackground(new java.awt.Color(204, 204, 204));
        btnCaccount.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        btnCaccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add-user.png"))); // NOI18N
        btnCaccount.setText("Create");
        btnCaccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaccountActionPerformed(evt);
            }
        });
        jPanel2.add(btnCaccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, -1, -1));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome to Create Account");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 350, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibraryManagementSystem.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCaccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaccountActionPerformed
        String fname = txtFname.getText();
        String lname = txtLname.getText();
        String username = txtUsername.getText();
        String email = txtEmail.getText();
        String cnumber = txtCnumber.getText();
        String password = txtPassword.getText();
        
        if (fname.isEmpty()|| lname.isEmpty()|| username.isEmpty()|| email.isEmpty()|| cnumber.isEmpty()|| password.isEmpty()) {
            JOptionPane.showMessageDialog(this,"All field are require", "error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        String sql = "INSERT INTO admin_account(firstname,lastname,username,email,contactnumber,password) VALUES(?,?,?,?,?,?)";
        
        try (Connection con = DatabaseConnector.connect();
                PreparedStatement pst = con.prepareStatement(sql)){
            
            pst.setString(1,fname);
            pst.setString(2,lname);
            pst.setString(3,username);
            pst.setString(4,email);
            pst.setString(5,cnumber);
            pst.setString(6,password);
            
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
    }//GEN-LAST:event_btnCaccountActionPerformed

    private void btnCaccount1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaccount1ActionPerformed
       Dashboard dashboard = new Dashboard();
          dashboard.setVisible(true);
          this.dispose();
    }//GEN-LAST:event_btnCaccount1ActionPerformed

    private void txtFnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFnameActionPerformed

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
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCaccount;
    private javax.swing.JButton btnCaccount1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCnumber;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFname;
    private javax.swing.JLabel lblLname;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtCnumber;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtLname;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
