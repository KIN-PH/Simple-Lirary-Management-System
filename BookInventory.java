/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.Color;
public class BookInventory extends javax.swing.JFrame {
    
    Connection con;
    PreparedStatement pst;

    public BookInventory() {
        initComponents();
        tblBooktable.setOpaque(false);
        ((DefaultTableCellRenderer)tblBooktable.getDefaultRenderer(Object.class)).setOpaque(false);
        tblBooktable.setShowGrid(true);
        tblBooktable.setGridColor(Color.WHITE);
        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);
        tblBooktable.setBackground(new Color(0,0,0,0));
        tblBooktable.getTableHeader().setBackground(Color.WHITE);
        setLocationRelativeTo(null);
        connect();
        fetchDataTable();
    }
public void connect() {
    this.con = DatabaseConnector.connect();
    if (this.con !=null) {
        System.out.println("Database connected successfully");
    }else {
        JOptionPane.showMessageDialog(this, "Database connection failed", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

private void fetchDataTable() {
    
    try {
            String sql = "SELECT book.pk,book.booktitle,book.status,student_account.fullname FROM book LEFT JOIN student_account ON book.studentid = student_account.studentid";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            DefaultTableModel model = (DefaultTableModel) tblBooktable.getModel();
            
            model.setRowCount(0);
            
            while(rs.next()) {
                int id = rs.getInt("pk");
                String booktitle = rs.getString("booktitle");
                String status = rs.getString("status");
                String fullname = rs.getString("fullname");
                
                model.addRow(new Object[]{id,booktitle,status,fullname});
            }
        }catch(SQLException e) {
            e.printStackTrace();
        }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBooktable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnReturn = new javax.swing.JButton();
        btnReturntodashboard = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 43, 103));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 204, 204));

        tblBooktable.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        tblBooktable.setForeground(new java.awt.Color(255, 255, 255));
        tblBooktable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book ID", "Book Title", "Status", "Student Name"
            }
        ));
        tblBooktable.setDefaultEditor(Object.class,null);
        tblBooktable.setOpaque(false);
        tblBooktable.setSelectionBackground(new java.awt.Color(204, 204, 204));
        tblBooktable.setBackground(new java.awt.Color(204,204,204));
        jScrollPane1.setViewportView(tblBooktable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 660, 250));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome to Book Inventory");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, -1, 60));

        btnReturn.setBackground(new java.awt.Color(204, 204, 204));
        btnReturn.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btnReturn.setForeground(new java.awt.Color(0, 51, 102));
        btnReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/return.png"))); // NOI18N
        btnReturn.setText("Return Book");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });
        jPanel1.add(btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, -1, -1));

        btnReturntodashboard.setBackground(new java.awt.Color(204, 204, 204));
        btnReturntodashboard.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btnReturntodashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.png"))); // NOI18N
        btnReturntodashboard.setText("Return to Dashboard");
        btnReturntodashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturntodashboardActionPerformed(evt);
            }
        });
        jPanel1.add(btnReturntodashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibraryManagementSystem.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReturntodashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturntodashboardActionPerformed
        Dashboard dashboard = new Dashboard();
        dashboard.setLocationRelativeTo(null);
        dashboard.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnReturntodashboardActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        int selectedRow = tblBooktable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a book to return.", "No Selection", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String bookId = tblBooktable.getValueAt(selectedRow, 0).toString();
        String checkStatus = "SELECT status FROM book WHERE pk = ? LIMIT 1";
        String updateSql = "UPDATE book SET status = 'available', studentid = NULL WHERE pk = ?";

        try (
            PreparedStatement cspst = con.prepareStatement(checkStatus)
        ) {
            cspst.setString(1, bookId);
            try (ResultSet data = cspst.executeQuery()) {
                if (data.next()) {
                    String status = data.getString("status");
                    if ("borrowed".equalsIgnoreCase(status)) {
                        try (PreparedStatement pst = con.prepareStatement(updateSql)) {
                            pst.setString(1, bookId);
                            int updated = pst.executeUpdate();
                            if (updated > 0) {
                                JOptionPane.showMessageDialog(this, "Book returned successfully!");
                                fetchDataTable();
                            } else {
                                JOptionPane.showMessageDialog(this, "Failed to return book.");
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "You cannot return an unborrowed book!", "Oops!", JOptionPane.WARNING_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Book not found in the database.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnReturnActionPerformed

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
            java.util.logging.Logger.getLogger(BookInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookInventory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnReturntodashboard;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBooktable;
    // End of variables declaration//GEN-END:variables

    private void loadBookInventory() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
