package assignment1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;
import java.util.ArrayList;
import java.nio.file.Files;
import java.nio.file.Path;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class AssignLeader extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(AssignLeader.class.getName());
    public AssignLeader() {
        initComponents();
        Utils.defaultSettings(this);
        jButton2.setEnabled(false);
        
        JRadioButton[] lecturerButtons = {
            jRadioButton1,
            jRadioButton2,
            jRadioButton3,
            jRadioButton4,
            jRadioButton5,
            jRadioButton6,
            jRadioButton7,
            jRadioButton8,
            jRadioButton9
        };
        
        for (JRadioButton rb : lecturerButtons) {
            rb.setVisible(false);
            rb.setSelected(false);
            rb.setActionCommand(null);
        }
        
        File file = new File("src/assignment1/DATA/Lecturer.txt");
        if (!file.exists()) return;
        
        int index = 0;
        
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            
            while ((line = br.readLine()) != null && index < lecturerButtons.length) {
                String[] parts = line.split("\\|");
                if (parts.length !=5) continue;
                
                String name = parts[1];
                String subject = parts[4];
                
                JRadioButton rb = lecturerButtons[index];
                
                rb.setText(name + " - " + subject);
                rb.setActionCommand(line);
                rb.setVisible(true);
                index++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        //leader
        JRadioButton[] leaderButtons = {
            jRadioButton10,
            jRadioButton11,
            jRadioButton12,
            jRadioButton13,
            jRadioButton14,
            jRadioButton15,
            jRadioButton16,
            jRadioButton17,
            jRadioButton18,
        };
        
        for (JRadioButton rb : leaderButtons) {
            rb.setVisible(false);
            rb.setSelected(false);
            rb.setActionCommand(null);
        }
        
        File Leaderfile = new File("src/assignment1/DATA/Leader.txt");
        if (!file.exists()) return;
        
        index = 0;
        
        try (BufferedReader br = new BufferedReader(new FileReader(Leaderfile))) {
            String line;
            while ((line = br.readLine()) != null && index < leaderButtons.length) {
                String[] parts = line.split("\\|");
                if (parts.length != 5) continue;
                
                String name = parts[1];
                String subject = parts[4];
                
                JRadioButton rb = leaderButtons[index];
                
                rb.setText(name + " - " + subject);
                rb.setActionCommand(line);
                rb.setVisible(true);
                index++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jRadioButton15 = new javax.swing.JRadioButton();
        jRadioButton16 = new javax.swing.JRadioButton();
        jRadioButton17 = new javax.swing.JRadioButton();
        jRadioButton18 = new javax.swing.JRadioButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel1.setText("Admin Panel");

        jButton1.setText("User Management");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jButton2.setText("Lecture Assignment");

        jButton3.setText("Grding System");

        jButton4.setText("Class Management");

        jButton5.setText("Sign Out");

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jLabel2.setText("Lecturer Assignment");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("jRadioButton1");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("jRadioButton2");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("jRadioButton3");

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("jRadioButton4");

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setText("jRadioButton5");

        buttonGroup1.add(jRadioButton6);
        jRadioButton6.setText("jRadioButton6");

        buttonGroup1.add(jRadioButton7);
        jRadioButton7.setText("jRadioButton7");

        buttonGroup1.add(jRadioButton8);
        jRadioButton8.setText("jRadioButton8");

        buttonGroup1.add(jRadioButton9);
        jRadioButton9.setText("jRadioButton9");

        buttonGroup2.add(jRadioButton10);
        jRadioButton10.setText("jRadioButton10");

        buttonGroup2.add(jRadioButton11);
        jRadioButton11.setText("jRadioButton11");

        buttonGroup2.add(jRadioButton12);
        jRadioButton12.setText("jRadioButton12");

        buttonGroup2.add(jRadioButton13);
        jRadioButton13.setText("jRadioButton13");

        buttonGroup2.add(jRadioButton14);
        jRadioButton14.setText("jRadioButton14");

        buttonGroup2.add(jRadioButton15);
        jRadioButton15.setText("jRadioButton15");

        buttonGroup2.add(jRadioButton16);
        jRadioButton16.setText("jRadioButton16");

        buttonGroup2.add(jRadioButton17);
        jRadioButton17.setText("jRadioButton17");

        buttonGroup2.add(jRadioButton18);
        jRadioButton18.setText("jRadioButton18");

        jButton6.setText("jButton6");
        jButton6.addActionListener(this::jButton6ActionPerformed);

        jButton7.setText("jButton7");
        jButton7.addActionListener(this::jButton7ActionPerformed);

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel3.setText("Lecturers");

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel4.setText("Academic Leaders");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(50, 50, 50))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(27, 27, 27)))
                        .addComponent(jLabel2)
                        .addGap(415, 415, 415))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addGap(199, 199, 199)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jRadioButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jRadioButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jRadioButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jRadioButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jRadioButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jRadioButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jRadioButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jRadioButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jRadioButton1))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jButton6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton7)
                                .addGap(145, 145, 145))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(329, 329, 329)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRadioButton18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton10)))
                    .addComponent(jLabel4))
                .addGap(124, 124, 124))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButton10)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton11)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton12)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton13)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton14)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton15)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton16)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton17)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton18)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton3)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton4)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton5)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton6)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton7)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton8)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jButton6)
                            .addComponent(jButton7))
                        .addGap(34, 34, 34))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        ButtonModel selected = buttonGroup1.getSelection();
        if (selected == null) {
            JOptionPane.showMessageDialog(this, "Please select a lecturer");
            return;
        }
        
        String lecturerLine = selected.getActionCommand();
        
        String[] lecturerParts = lecturerLine.split("\\|");
        if (lecturerParts.length !=5) return;
        
        String lecName = lecturerParts[1];
        String id = lecturerParts[2];
        String password = lecturerParts[3];
        String lecSubject = lecturerParts[4];
        
        String newLeaderLine = "AcademicLeader|" + lecName + "|" + id + "|" + password + "|" + lecSubject;
        
        File leaderFile = new File("src/assignment1/DATA/Leader.txt");
        
        ArrayList<String> lines = new ArrayList<>();
        boolean replaced = false;
        
        try {
            if (leaderFile.exists()) {
                lines = (ArrayList<String>) Files.readAllLines(leaderFile.toPath());
            }
            
            ArrayList<String> updated = new ArrayList<>();
            
            for (String line : lines) {
                String[] p = line.split("\\|");
                if (p.length == 5 && p[4].equals(lecSubject)) {
                    updated.add(newLeaderLine);
                    replaced = true;
                } else {
                    updated.add(line);
                }
            }
            
            if (!replaced) {
                updated.add(newLeaderLine);
            }
            
            Files.write(leaderFile.toPath(), updated);
            
            JOptionPane.showMessageDialog(this, "Lecturer promoted to Academic Leader for " + lecSubject);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        //Remove promoted lectarer
        File file = new File("src/assignment1/DATA/Lecturer.txt");
        if (!file.exists()) return;
        
        try {
            List<String> promotedLines = Files.readAllLines(file.toPath());
            promotedLines.removeIf(line -> {
                String[] parts = line.split("\\|");
                return parts.length == 5 && parts[4].equals(lecSubject);
            });
            
            Files.write(file.toPath(), promotedLines);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        //refresh
        JRadioButton[] lecturerButtons = {
            jRadioButton1,
            jRadioButton2,
            jRadioButton3,
            jRadioButton4,
            jRadioButton5,
            jRadioButton6,
            jRadioButton7,
            jRadioButton8,
            jRadioButton9
        };
        
        for (JRadioButton rb : lecturerButtons) {
            rb.setVisible(false);
            rb.setSelected(false);
            rb.setActionCommand(null);
        }
        
        File lecFile = new File("src/assignment1/DATA/Lecturer.txt");
        if (!file.exists()) return;
        
        int index = 0;
        
        try (BufferedReader br = new BufferedReader(new FileReader(lecFile))) {
            String line;
            
            while ((line = br.readLine()) != null && index < lecturerButtons.length) {
                String[] parts = line.split("\\|");
                if (parts.length !=5) continue;
                
                String name = parts[1];
                String subject = parts[4];
                
                JRadioButton rb = lecturerButtons[index];
                
                rb.setText(name + " - " + subject);
                rb.setActionCommand(line);
                rb.setVisible(true);
                index++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        JRadioButton[] leaderButtons = {
            jRadioButton10,
            jRadioButton11,
            jRadioButton12,
            jRadioButton13,
            jRadioButton14,
            jRadioButton15,
            jRadioButton16,
            jRadioButton17,
            jRadioButton18,
        };
        
        for (JRadioButton rb : leaderButtons) {
            rb.setVisible(false);
            rb.setSelected(false);
            rb.setActionCommand(null);
        }
        
        File Leaderfile = new File("src/assignment1/DATA/Leader.txt");
        if (!file.exists()) return;
        
        index = 0;
        
        try (BufferedReader br = new BufferedReader(new FileReader(Leaderfile))) {
            String line;
            while ((line = br.readLine()) != null && index < leaderButtons.length) {
                String[] parts = line.split("\\|");
                if (parts.length != 5) continue;
                
                String name = parts[1];
                String subject = parts[4];
                
                JRadioButton rb = leaderButtons[index];
                
                rb.setText(name + " - " + subject);
                rb.setActionCommand(line);
                rb.setVisible(true);
                index++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AdminDashboard ad = new AdminDashboard();
        ad.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new AssignLeader().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton16;
    private javax.swing.JRadioButton jRadioButton17;
    private javax.swing.JRadioButton jRadioButton18;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    // End of variables declaration//GEN-END:variables
}
