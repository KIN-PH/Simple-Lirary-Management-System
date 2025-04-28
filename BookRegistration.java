/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.sql.*;
import javax.swing.*;
import java.awt.Color;
public class BookRegistration extends javax.swing.JFrame {
    
    Connection con;
    PreparedStatement pst;
    
    public BookRegistration() {
        initComponents();
        txtBooktitle.setBackground(new Color(0,0,0,0));
        txtAuthor.setBackground(new Color(0,0,0,0));
        txtBookcategory.setBackground(new Color(0,0,0,0));
        txtDateregistered.setBackground(new Color(0,0,0,0));
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
    txtBooktitle.setText("");
    txtAuthor.setText("");
    txtBookcategory.setText("");
    txtDateregistered.setText("");
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lblBooktitle = new javax.swing.JLabel();
        lblAuthor = new javax.swing.JLabel();
        lblBookcategory = new javax.swing.JLabel();
        lblDateregistered = new javax.swing.JLabel();
        txtBooktitle = new javax.swing.JTextField();
        txtAuthor = new javax.swing.JTextField();
        txtBookcategory = new javax.swing.JTextField();
        txtDateregistered = new javax.swing.JTextField();
        btnRegister = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 43, 103));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBooktitle.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        lblBooktitle.setForeground(new java.awt.Color(255, 255, 255));
        lblBooktitle.setText("Book Title:");
        jPanel1.add(lblBooktitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, -1, -1));

        lblAuthor.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        lblAuthor.setForeground(new java.awt.Color(255, 255, 255));
        lblAuthor.setText("Author:");
        jPanel1.add(lblAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, -1, -1));

        lblBookcategory.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        lblBookcategory.setForeground(new java.awt.Color(255, 255, 255));
        lblBookcategory.setText("Book Category:");
        jPanel1.add(lblBookcategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, -1, -1));

        lblDateregistered.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        lblDateregistered.setForeground(new java.awt.Color(255, 255, 255));
        lblDateregistered.setText("Date Registered:");
        jPanel1.add(lblDateregistered, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, -1, -1));

        txtBooktitle.setForeground(new java.awt.Color(255, 255, 255));
        txtBooktitle.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(txtBooktitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 117, 210, 30));

        txtAuthor.setForeground(new java.awt.Color(255, 255, 255));
        txtAuthor.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(txtAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 167, 210, 30));

        txtBookcategory.setForeground(new java.awt.Color(255, 255, 255));
        txtBookcategory.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(txtBookcategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 217, 210, 30));

        txtDateregistered.setForeground(new java.awt.Color(255, 255, 255));
        txtDateregistered.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(txtDateregistered, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 267, 210, 30));

        btnRegister.setBackground(new java.awt.Color(204, 204, 204));
        btnRegister.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btnRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add-user.png"))); // NOI18N
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, -1, -1));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome to Book Registration");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, 75));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.png"))); // NOI18N
        jButton1.setText("Go to Dashboard");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibraryManagementSystem.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        String booktitle = txtBooktitle.getText();
        String author = txtAuthor.getText();
        String bookcategory = txtBookcategory.getText();
        String dateregistered = txtDateregistered.getText();
        
        if (booktitle.isEmpty()|| author.isEmpty()|| bookcategory.isEmpty()|| dateregistered.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All field are require", "error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String sql = "INSERT INTO book(booktitle,author,category,dateregistered) VALUES (?,?,?,?)";
        try (Connection con = DatabaseConnector.connect();
                PreparedStatement pst = con.prepareStatement(sql)){
            pst.setString(1,booktitle);
            pst.setString(2,author);
            pst.setString(3,bookcategory);
            pst.setString(4,dateregistered);
            
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          Dashboard dashboard = new Dashboard();
          dashboard.setVisible(true);
          this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
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
            java.util.logging.Logger.getLogger(BookRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblAuthor;
    private javax.swing.JLabel lblBookcategory;
    private javax.swing.JLabel lblBooktitle;
    private javax.swing.JLabel lblDateregistered;
    private javax.swing.JTextField txtAuthor;
    private javax.swing.JTextField txtBookcategory;
    private javax.swing.JTextField txtBooktitle;
    private javax.swing.JTextField txtDateregistered;
    // End of variables declaration//GEN-END:variables
}
