/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms_V1.pkg2.pkg0.view;

import java.util.List;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import lms_V1.pkg2.pkg0.domain.LibraryMember;
import lms_V1.pkg2.pkg0.service.LibraryMemberService;

/**
 *
 * @author anik
 */
public class ShowAllMemberList extends javax.swing.JFrame {

    
    private LibraryMember libraryMember;
    private LibraryMemberService libraryMemberService;
    
    /**
     * Creates new form ShowAllMemberList
     */
    public ShowAllMemberList() {
        this.setTitle("Show Member List ( LMS )");
        initComponents();
        displayLibraryMemberInformationWithInTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        btnRefTable = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblDisplayMemberInfo = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btnRefTable.setText("<< Refaresh Table >>");
        btnRefTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefTableActionPerformed(evt);
            }
        });

        tblDisplayMemberInfo.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        tblDisplayMemberInfo.setForeground(new java.awt.Color(102, 102, 102));
        tblDisplayMemberInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Member Name", "Member Card No", "Mobile No", "Email", "House No", "Road No", "Block/Village", "Thana", "District", "Division", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDisplayMemberInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblDisplayMemberInfo.setFillsViewportHeight(true);
        tblDisplayMemberInfo.setRowHeight(50);
        tblDisplayMemberInfo.setShowVerticalLines(false);
        tblDisplayMemberInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDisplayMemberInfoMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblDisplayMemberInfo);

        jLabel1.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText(">> Show All Member List");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 982, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRefTable)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefTable, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblDisplayMemberInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDisplayMemberInfoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblDisplayMemberInfoMouseClicked

    private void btnRefTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefTableActionPerformed
        // TODO add your handling code here:
        clearTableForLibraryMemberInformation();
    }//GEN-LAST:event_btnRefTableActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

    
    private void displayLibraryMemberInformationWithInTable() {

        libraryMemberService = new LibraryMemberService();

        List<LibraryMember> getLibraryMember = libraryMemberService.getLibraryMemberInformationList();
        DefaultTableModel model = (DefaultTableModel) tblDisplayMemberInfo.getModel();
        Object[] row = new Object[12];

        for (int i = 0; i < getLibraryMember.size(); i++) {

            row[0] = getLibraryMember.get(i).getId();
            row[1] = getLibraryMember.get(i).getMemberName();
            row[2] = getLibraryMember.get(i).getCardNo();
            row[3] = getLibraryMember.get(i).getContactInfo().getMobileNumber();
            row[4] = getLibraryMember.get(i).getContactInfo().getEmail();
            row[5] = getLibraryMember.get(i).getAddressInfo().getHouseNo();
            row[6] = getLibraryMember.get(i).getAddressInfo().getRoadNo();
            row[7] = getLibraryMember.get(i).getAddressInfo().getBlockOrVillage();
            row[8] = getLibraryMember.get(i).getAddressInfo().getThana();
            row[9] = getLibraryMember.get(i).getAddressInfo().getDistrict();
            row[10] = getLibraryMember.get(i).getAddressInfo().getDivision();
            row[11] = getLibraryMember.get(i).getReport();

            model.addRow(row);
        }
    }

    private void clearTableForLibraryMemberInformation() {

        DefaultTableModel model = (DefaultTableModel) tblDisplayMemberInfo.getModel();
        model.setRowCount(0);

        displayLibraryMemberInformationWithInTable();

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
            java.util.logging.Logger.getLogger(ShowAllMemberList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowAllMemberList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowAllMemberList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowAllMemberList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowAllMemberList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRefTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tblDisplayMemberInfo;
    // End of variables declaration//GEN-END:variables
}
