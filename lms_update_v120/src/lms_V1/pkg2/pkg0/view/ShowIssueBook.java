/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms_V1.pkg2.pkg0.view;

import java.util.List;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import lms_V1.pkg2.pkg0.domain.BookIssue;
import lms_V1.pkg2.pkg0.service.BookIssueService;

/**
 *
 * @author anik
 */
public class ShowIssueBook extends javax.swing.JFrame {

    private BookIssueService bookIssueService;
    
    /**
     * Creates new form ShowIssueBook
     */
    public ShowIssueBook() {
        this.setTitle("Issue Book List ( LMS )");
        initComponents();
        displayBookIssueWithInTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel26 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tblDisplayBookIssue = new javax.swing.JTable();
        btnDisplayBookInformation = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));
        jPanel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3));

        tblDisplayBookIssue.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        tblDisplayBookIssue.setForeground(new java.awt.Color(102, 102, 102));
        tblDisplayBookIssue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Book Id", "Member Id", "Issue Date", "Return Date", "Expire Date", "Qty", "Submit By"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDisplayBookIssue.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblDisplayBookIssue.setFillsViewportHeight(true);
        tblDisplayBookIssue.setRowHeight(50);
        tblDisplayBookIssue.setShowVerticalLines(false);
        jScrollPane9.setViewportView(tblDisplayBookIssue);

        btnDisplayBookInformation.setText("<< Refaresh Table >>");
        btnDisplayBookInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayBookInformationActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText(">> Show All Issue Book List");

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 848, Short.MAX_VALUE)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDisplayBookInformation)))
                .addContainerGap())
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDisplayBookInformation))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDisplayBookInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayBookInformationActionPerformed
        // TODO add your handling code here:
        clearTableForBookIssue();
    }//GEN-LAST:event_btnDisplayBookInformationActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

    
    private void displayBookIssueWithInTable() {

        bookIssueService = new BookIssueService();

        List<BookIssue> getBookIssue = bookIssueService.getIssueBookList();
        DefaultTableModel model = (DefaultTableModel) tblDisplayBookIssue.getModel();
        Object[] row = new Object[8];

        for (int i = 0; i < getBookIssue.size(); i++) {

            row[0] = getBookIssue.get(i).getId();
            row[1] = getBookIssue.get(i).getBookId();
            row[2] = getBookIssue.get(i).getLibraryMemberId();
            row[3] = getBookIssue.get(i).getIssueDate();
            row[4] = getBookIssue.get(i).getReturnDate();
            row[5] = getBookIssue.get(i).getExpireDate();
            row[6] = getBookIssue.get(i).getQty();
            row[7] = getBookIssue.get(i).getStatus();

            model.addRow(row);
        }
    }

    private void clearTableForBookIssue() {

        DefaultTableModel model = (DefaultTableModel) tblDisplayBookIssue.getModel();
        model.setRowCount(0);

        displayBookIssueWithInTable();

    }
    
    
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ShowIssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowIssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowIssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowIssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowIssueBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDisplayBookInformation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable tblDisplayBookIssue;
    // End of variables declaration//GEN-END:variables
}
