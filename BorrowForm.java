/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.sql.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class BorrowForm extends javax.swing.JFrame {
    Connection con;
    List<Integer> pkStudentList = new ArrayList<>();
    List<Integer> pkBookList = new ArrayList<>();

    public BorrowForm() {
        initComponents();
        connect();
        setLocationRelativeTo(null);
        loadBook();
        loadStudent();
        activestudentid.setVisible(true);
        activebookid.setVisible(true);
    }
    
    public void connect() {
        this.con = DatabaseConnector.connect();
        if (this.con !=null) {
        }else {
            JOptionPane.showMessageDialog(this, "Database connection failed", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

private void loadStudent() {
    pkStudentList.add(0);
    cbsStudentname.removeAllItems();
    cbsStudentname.addItem("Select Student");
    try {
        String sql = "SELECT studentid, fullname FROM student_account";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            int id = rs.getInt("studentid");
            String studentname = rs.getString("fullname");

            cbsStudentname.addItem(studentname);
            pkStudentList.add(id);
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }
}

private void loadBook() {
    pkBookList.clear();
    pkBookList.add(0);
    cbBooktitle.removeAllItems();
    cbBooktitle.addItem("Select Book");
    try {
        String sql = "SELECT pk,booktitle FROM book WHERE status = 'available'";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
            
        while (rs.next()) {
            int id = rs.getInt("pk");
            String title = rs.getString("booktitle");

            cbBooktitle.addItem(title);
            pkBookList.add(id);
            }
            
    }catch(SQLException e) {
            e.printStackTrace();
        }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblBooktitle = new javax.swing.JLabel();
        lblStudentid = new javax.swing.JLabel();
        lblBorroweddate = new javax.swing.JLabel();
        lblReturningdate = new javax.swing.JLabel();
        cbBooktitle = new javax.swing.JComboBox<>();
        cbsStudentname = new javax.swing.JComboBox<>();
        txtBorroweddate = new javax.swing.JTextField();
        txtReturningdate = new javax.swing.JTextField();
        btnConfirm = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        activebookid = new javax.swing.JTextField();
        activestudentid = new javax.swing.JTextField();
        btnTodashboard = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 43, 103));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBooktitle.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        lblBooktitle.setForeground(new java.awt.Color(255, 255, 255));
        lblBooktitle.setText("Book ID/Title:");
        jPanel1.add(lblBooktitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, -1, -1));

        lblStudentid.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        lblStudentid.setForeground(new java.awt.Color(255, 255, 255));
        lblStudentid.setText("Student Name:");
        jPanel1.add(lblStudentid, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, -1));

        lblBorroweddate.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        lblBorroweddate.setForeground(new java.awt.Color(255, 255, 255));
        lblBorroweddate.setText("Borrowed Date:");
        jPanel1.add(lblBorroweddate, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, -1, -1));

        lblReturningdate.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        lblReturningdate.setForeground(new java.awt.Color(255, 255, 255));
        lblReturningdate.setText("Returning Date:");
        jPanel1.add(lblReturningdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, -1, -1));

        cbBooktitle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Book" }));
        cbBooktitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBooktitleActionPerformed(evt);
            }
        });
        jPanel1.add(cbBooktitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 195, 30));

        cbsStudentname.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Student" }));
        cbsStudentname.setToolTipText("");
        cbsStudentname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbsStudentnameActionPerformed(evt);
            }
        });
        jPanel1.add(cbsStudentname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 216, 30));
        jPanel1.add(txtBorroweddate, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 219, 30));
        jPanel1.add(txtReturningdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 219, 30));

        btnConfirm.setBackground(new java.awt.Color(204, 204, 204));
        btnConfirm.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btnConfirm.setForeground(new java.awt.Color(0, 51, 102));
        btnConfirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circle.png"))); // NOI18N
        btnConfirm.setText("Confirm");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });
        jPanel1.add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, -1, -1));

        jLabel5.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Welcome to Borrow Book Form");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(518, 622, 37, -1));

        activebookid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activebookidActionPerformed(evt);
            }
        });
        activebookid.setEditable(false);
        jPanel1.add(activebookid, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 24, 30));

        activestudentid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activestudentidActionPerformed(evt);
            }
        });
        activestudentid.setEditable(false);
        jPanel1.add(activestudentid, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 216, 30));

        btnTodashboard.setBackground(new java.awt.Color(204, 204, 204));
        btnTodashboard.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btnTodashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.png"))); // NOI18N
        btnTodashboard.setText("Go To Dashboard");
        btnTodashboard.setToolTipText("");
        btnTodashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodashboardActionPerformed(evt);
            }
        });
        jPanel1.add(btnTodashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, -1, -1));

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Student ID:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibraryManagementSystem.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
            String dateBorrowed = txtBorroweddate.getText();
            String returnDate = txtReturningdate.getText();
            String bookid = activebookid.getText();
            String studentid = activestudentid.getText();

            if (bookid.isEmpty() || studentid.isEmpty() || dateBorrowed.isEmpty() || returnDate.isEmpty()) {
            JOptionPane.showMessageDialog(this,"Oppssssss: All fields are required!","Error",JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            if (cbBooktitle.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(this, "Please select a book title.", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }

            if (cbsStudentname.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(this, "Please select a student name.", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }

            String sql = "UPDATE book SET status = ?, studentid = ? WHERE pk = ?";
            String sql2 = "INSERT INTO borrowed_history (bookid, studentid, dateborrowed, returningdate) VALUES (?,?,?,?)";

            cbBooktitle.setSelectedIndex(0);
            cbsStudentname.setSelectedIndex(0);
            txtBorroweddate.setText("");
            txtReturningdate.setText("");

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            PreparedStatement stmt2 = con.prepareStatement(sql2);
            stmt.setString(1, "borrowed");
            stmt.setString(2, studentid);
            stmt.setString(3, bookid);

            stmt2.setString(1, bookid);
            stmt2.setString(2, studentid);
            stmt2.setString(3, dateBorrowed);
            stmt2.setString(4, returnDate);

            int rowsUpdated = stmt.executeUpdate();
            int rowsUpdated2 = stmt2.executeUpdate();

            if (rowsUpdated > 0 && rowsUpdated2 > 0) {
                JOptionPane.showMessageDialog(this, "Book borrowed successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            loadBook();
            } else {
                JOptionPane.showMessageDialog(this, "Please select book to borrow!", "Oppsssss", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void cbsStudentnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbsStudentnameActionPerformed
            int selectedIndex = cbsStudentname.getSelectedIndex();

            if (selectedIndex != -1) {
            int selectedPk = pkStudentList.get(selectedIndex);
            activestudentid.setText(String.valueOf(selectedPk));
        }
    }//GEN-LAST:event_cbsStudentnameActionPerformed

    private void activestudentidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activestudentidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_activestudentidActionPerformed

    private void activebookidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activebookidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_activebookidActionPerformed

    private void cbBooktitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBooktitleActionPerformed
        int selectedIndex = cbBooktitle.getSelectedIndex();
        
        if (selectedIndex != -1){
            int selectedPk = pkBookList.get(selectedIndex);
            activebookid.setText(String.valueOf(selectedPk));
        }
    }//GEN-LAST:event_cbBooktitleActionPerformed

    private void btnTodashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodashboardActionPerformed
        Dashboard dashboard = new Dashboard();
        dashboard.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnTodashboardActionPerformed

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
            java.util.logging.Logger.getLogger(BorrowForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BorrowForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BorrowForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BorrowForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BorrowForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField activebookid;
    private javax.swing.JTextField activestudentid;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnTodashboard;
    private javax.swing.JComboBox<String> cbBooktitle;
    private javax.swing.JComboBox<String> cbsStudentname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBooktitle;
    private javax.swing.JLabel lblBorroweddate;
    private javax.swing.JLabel lblReturningdate;
    private javax.swing.JLabel lblStudentid;
    private javax.swing.JTextField txtBorroweddate;
    private javax.swing.JTextField txtReturningdate;
    // End of variables declaration//GEN-END:variables
}
