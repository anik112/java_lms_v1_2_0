/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms_V1.pkg2.pkg0.view;

import java.util.List;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import lms_V1.pkg2.pkg0.domain.BookInformation;
import lms_V1.pkg2.pkg0.service.BookInformationService;

/**
 *
 * @author anik
 */
public class ShowAllBookInformation extends javax.swing.JFrame {

    private BookInformationService bookInformationService;
    /**
     * Creates new form ShowAllBookInformation
     */
    public ShowAllBookInformation() {
        this.setTitle("Show Book List ( LMS )");
        initComponents();
        displayBookInformationWithInTable();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDisplayBookInfo = new javax.swing.JTable();
        btnRefreshTable = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tblDisplayBookInfo.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        tblDisplayBookInfo.setForeground(new java.awt.Color(102, 102, 102));
        tblDisplayBookInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Book Name", "Book code", "Author", "Publisher", "Edition", "Unit Price", "Qty", "Total Price", "Rack No", "ISSN no", "Category", "Purchase Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDisplayBookInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblDisplayBookInfo.setFillsViewportHeight(true);
        tblDisplayBookInfo.setRowHeight(50);
        tblDisplayBookInfo.setShowVerticalLines(false);
        tblDisplayBookInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDisplayBookInfoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDisplayBookInfo);

        btnRefreshTable.setText("<< Refaresh Table >>");
        btnRefreshTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshTableActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText(">> Show All Book List");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 914, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRefreshTable)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefreshTable))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblDisplayBookInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDisplayBookInfoMouseClicked
        // TODO add your handling code here
    }//GEN-LAST:event_tblDisplayBookInfoMouseClicked

    private void btnRefreshTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshTableActionPerformed
        // TODO add your handling code here
        clearTableForBookInformation();
    }//GEN-LAST:event_btnRefreshTableActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

    
     private void displayBookInformationWithInTable() {

        bookInformationService = new BookInformationService();

        List<BookInformation> getBookInformation = bookInformationService.getBookInformation();
        DefaultTableModel model = (DefaultTableModel) tblDisplayBookInfo.getModel();
        Object[] row = new Object[13];


        for (int i = 0; i < getBookInformation.size(); i++) {

            row[0] = getBookInformation.get(i).getId();
            row[1] = getBookInformation.get(i).getName();
            row[2] = getBookInformation.get(i).getBookCode();
            row[3] = getBookInformation.get(i).getAuthor();
            row[4] = getBookInformation.get(i).getPublisher();
            row[5] = getBookInformation.get(i).getEdition();
            row[6] = getBookInformation.get(i).getUnitPrice();
            row[7] = getBookInformation.get(i).getQty();
            row[8] = getBookInformation.get(i).getTotalPrice();
            row[9] = getBookInformation.get(i).getRackNO();
            row[10] = getBookInformation.get(i).getIssnNo();
            row[11] = getBookInformation.get(i).getCategory();
            row[12] = getBookInformation.get(i).getPurchaseDate();

            model.addRow(row);
        }
    }

    private void clearTableForBookInformation() {

        DefaultTableModel model = (DefaultTableModel) tblDisplayBookInfo.getModel();
        model.setRowCount(0);

        displayBookInformationWithInTable();

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
            java.util.logging.Logger.getLogger(ShowAllBookInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowAllBookInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowAllBookInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowAllBookInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowAllBookInformation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRefreshTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDisplayBookInfo;
    // End of variables declaration//GEN-END:variables
}
