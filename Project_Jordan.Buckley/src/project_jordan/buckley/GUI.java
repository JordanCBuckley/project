/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_jordan.buckley;

/**
 *
 * @author x19112599
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        appTabs = new javax.swing.JTabbedPane();
        homescreenPnl = new javax.swing.JPanel();
        appNameLbl = new javax.swing.JLabel();
        goToMeetingBtn = new javax.swing.JButton();
        goToPrescriptionsBtn = new javax.swing.JButton();
        goToPatientsBtn = new javax.swing.JButton();
        meetingPnl = new javax.swing.JPanel();
        meetingHomescreenBtn = new javax.swing.JButton();
        prescriptionPnl = new javax.swing.JPanel();
        prescriptionHomescreenBtn = new javax.swing.JButton();
        patientsPnl = new javax.swing.JPanel();
        patientsHomescreenBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        patientList = new javax.swing.JList<>();
        newPatientBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        appNameLbl.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        appNameLbl.setText("Jordan's Project");

        goToMeetingBtn.setText("Go to Meeting");
        goToMeetingBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goToMeetingBtnMouseClicked(evt);
            }
        });

        goToPrescriptionsBtn.setText("Go to Prescriptions");
        goToPrescriptionsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goToPrescriptionsBtnMouseClicked(evt);
            }
        });

        goToPatientsBtn.setText("Go to Patients");
        goToPatientsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goToPatientsBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout homescreenPnlLayout = new javax.swing.GroupLayout(homescreenPnl);
        homescreenPnl.setLayout(homescreenPnlLayout);
        homescreenPnlLayout.setHorizontalGroup(
            homescreenPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homescreenPnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(homescreenPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(appNameLbl)
                    .addGroup(homescreenPnlLayout.createSequentialGroup()
                        .addComponent(goToMeetingBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(goToPatientsBtn)))
                .addGap(130, 130, 130))
            .addGroup(homescreenPnlLayout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(goToPrescriptionsBtn)
                .addContainerGap(218, Short.MAX_VALUE))
        );
        homescreenPnlLayout.setVerticalGroup(
            homescreenPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homescreenPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(appNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(173, 173, 173)
                .addGroup(homescreenPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(goToMeetingBtn)
                    .addComponent(goToPatientsBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(goToPrescriptionsBtn)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        appTabs.addTab("Homescreen", homescreenPnl);

        meetingHomescreenBtn.setText("Back to Homescreen");
        meetingHomescreenBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                meetingHomescreenBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout meetingPnlLayout = new javax.swing.GroupLayout(meetingPnl);
        meetingPnl.setLayout(meetingPnlLayout);
        meetingPnlLayout.setHorizontalGroup(
            meetingPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, meetingPnlLayout.createSequentialGroup()
                .addContainerGap(365, Short.MAX_VALUE)
                .addComponent(meetingHomescreenBtn)
                .addGap(30, 30, 30))
        );
        meetingPnlLayout.setVerticalGroup(
            meetingPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, meetingPnlLayout.createSequentialGroup()
                .addContainerGap(289, Short.MAX_VALUE)
                .addComponent(meetingHomescreenBtn)
                .addGap(30, 30, 30))
        );

        appTabs.addTab("Meeting", meetingPnl);

        prescriptionHomescreenBtn.setText("Back to Homescreen");
        prescriptionHomescreenBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prescriptionHomescreenBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout prescriptionPnlLayout = new javax.swing.GroupLayout(prescriptionPnl);
        prescriptionPnl.setLayout(prescriptionPnlLayout);
        prescriptionPnlLayout.setHorizontalGroup(
            prescriptionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, prescriptionPnlLayout.createSequentialGroup()
                .addContainerGap(365, Short.MAX_VALUE)
                .addComponent(prescriptionHomescreenBtn)
                .addGap(30, 30, 30))
        );
        prescriptionPnlLayout.setVerticalGroup(
            prescriptionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, prescriptionPnlLayout.createSequentialGroup()
                .addContainerGap(289, Short.MAX_VALUE)
                .addComponent(prescriptionHomescreenBtn)
                .addGap(30, 30, 30))
        );

        appTabs.addTab("Prescriptions", prescriptionPnl);

        patientsHomescreenBtn.setText("Back to Homescreen");
        patientsHomescreenBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                patientsHomescreenBtnMouseClicked(evt);
            }
        });
        patientsHomescreenBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientsHomescreenBtnActionPerformed(evt);
            }
        });

        patientList.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        patientList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Patient Name\tMedical History\tDate of Birth\t\tAddress", "Patient A\t", "Patient B", "Patient C", "Patient D", "Patient E", "Patient F", "Patient G", "Patient H", "Patient I", "Patient J", "Patient K", "Patient L" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(patientList);

        newPatientBtn.setText("Add new Patient");

        javax.swing.GroupLayout patientsPnlLayout = new javax.swing.GroupLayout(patientsPnl);
        patientsPnl.setLayout(patientsPnlLayout);
        patientsPnlLayout.setHorizontalGroup(
            patientsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, patientsPnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(patientsHomescreenBtn)
                .addGap(30, 30, 30))
            .addGroup(patientsPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(patientsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
                    .addGroup(patientsPnlLayout.createSequentialGroup()
                        .addComponent(newPatientBtn)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        patientsPnlLayout.setVerticalGroup(
            patientsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, patientsPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(newPatientBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(patientsHomescreenBtn)
                .addGap(30, 30, 30))
        );

        appTabs.addTab("Patients", patientsPnl);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(appTabs)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(appTabs, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void patientsHomescreenBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientsHomescreenBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientsHomescreenBtnActionPerformed

    private void patientsHomescreenBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patientsHomescreenBtnMouseClicked
        appTabs.setSelectedIndex(0);
    }//GEN-LAST:event_patientsHomescreenBtnMouseClicked

    private void prescriptionHomescreenBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prescriptionHomescreenBtnMouseClicked
        appTabs.setSelectedIndex(0);
    }//GEN-LAST:event_prescriptionHomescreenBtnMouseClicked

    private void meetingHomescreenBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_meetingHomescreenBtnMouseClicked
        appTabs.setSelectedIndex(0);
    }//GEN-LAST:event_meetingHomescreenBtnMouseClicked

    private void goToMeetingBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goToMeetingBtnMouseClicked
        appTabs.setSelectedIndex(1);
    }//GEN-LAST:event_goToMeetingBtnMouseClicked

    private void goToPrescriptionsBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goToPrescriptionsBtnMouseClicked
        appTabs.setSelectedIndex(2);
    }//GEN-LAST:event_goToPrescriptionsBtnMouseClicked

    private void goToPatientsBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goToPatientsBtnMouseClicked
        appTabs.setSelectedIndex(3);
    }//GEN-LAST:event_goToPatientsBtnMouseClicked

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appNameLbl;
    private javax.swing.JTabbedPane appTabs;
    private javax.swing.JButton goToMeetingBtn;
    private javax.swing.JButton goToPatientsBtn;
    private javax.swing.JButton goToPrescriptionsBtn;
    private javax.swing.JPanel homescreenPnl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton meetingHomescreenBtn;
    private javax.swing.JPanel meetingPnl;
    private javax.swing.JButton newPatientBtn;
    private javax.swing.JList<String> patientList;
    private javax.swing.JButton patientsHomescreenBtn;
    private javax.swing.JPanel patientsPnl;
    private javax.swing.JButton prescriptionHomescreenBtn;
    private javax.swing.JPanel prescriptionPnl;
    // End of variables declaration//GEN-END:variables
}