package assignment1;

import java.awt.Color;
import java.awt.Component;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class GradingSys extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(GradingSys.class.getName());

    public GradingSys() {
        initComponents();
        Utils.defaultSettings(this);
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        
        File file = new File("src/assignment1/DATA/Grading.txt");
        if (!file.exists()) return;
        
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\|");
                if (parts.length != 5) continue;
                
                model.addRow(new Object[]{
                    parts[0],
                    parts[1],
                    parts[2],
                    parts[3],
                    parts[4]
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel1.setText("Admin Panel");

        jButton1.setText("User Management");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jButton2.setText("Lecture Assignment");
        jButton2.addActionListener(this::jButton2ActionPerformed);

        jButton3.setText("Grding System");
        jButton3.addActionListener(this::jButton3ActionPerformed);

        jButton4.setText("Class Management");

        jButton5.setText("Sign Out");
        jButton5.addActionListener(this::jButton5ActionPerformed);

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jLabel2.setText("Grading System");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Min Score", "Max Score", "Grade", "GPA", "Description"
            }
        ));
        jTable1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTable1FocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton6.setText("jButton6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jButton6))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AdminDashboard ad = new AdminDashboard();
        ad.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        AssignLeader al = new AssignLeader();
        al.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jButton3.setEnabled(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTable1FocusGained
        System.out.println("focus gained");
        
        Set<Integer> invalidRows = new HashSet<>();
        Set<Integer> invalidGradeRows = new HashSet<>();
        Set<Integer> invalidGpaRows = new HashSet<>();
        
        invalidRows.clear();
        invalidGradeRows.clear();
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int rowCount = model.getRowCount();
        
        List<int[]> ranges = new ArrayList<>();
        Map<String, Integer> gradeMap = new HashMap<>();
                
        for (int i = 0; i < rowCount; i++) {
            try {
                int min = Integer.parseInt(model.getValueAt(i, 0).toString());
                int max = Integer.parseInt(model.getValueAt(i, 1).toString());
                String grade = model.getValueAt(i, 2).toString().trim();
                
                if (min > max) {
                    invalidRows.add(i);
                }
                
                ranges.add(new int[]{min, max, i});
                
                if (gradeMap.containsKey(grade)) {
                    invalidGradeRows.add(i);
                    invalidGradeRows.add(gradeMap.get(grade));
                }else {
                    gradeMap.put(grade, i);
                }
                
            } catch (Exception e) {
                invalidRows.add(i);
            }
        }
        
        //Rule 2 - overlap range
        for (int i = 0; i < ranges.size(); i++) {
            for (int j = i + 1; j < ranges.size(); j++) {
                int min1 = ranges.get(i)[0];
                int max1 = ranges.get(i)[1];
                int row1 = ranges.get(i)[2];
                
                int min2 = ranges.get(j)[0];
                int max2 = ranges.get(j)[1];
                int row2 = ranges.get(j)[2];
                
                boolean overlap = min1 <= max2 && min2 <= max1 || min1 == max1 || min2 == max2;
                
                if (overlap) {
                    invalidRows.add(row1);
                    invalidRows.add(row2);
                }
            }
        }
        
        //Rule 3 - GPA
        invalidGpaRows.clear();

        ranges.sort((a, b) -> Integer.compare(b[0], a[0]));
        
        for (int i = 1; i < ranges.size() -1; i++) {
            int upperRow = ranges.get(i - 1)[2];
            int currentRow = ranges.get(i)[2];
            int lowerRow = ranges.get(i + 1)[2];
            
            try {
                double upperGpa = Double.parseDouble(model.getValueAt(upperRow, 3).toString());
                double currentGpa = Double.parseDouble(model.getValueAt(currentRow, 3).toString());
                double lowerGpa = Double.parseDouble(model.getValueAt(lowerRow, 3).toString());
                
                if (!(upperGpa > currentGpa && currentGpa > lowerGpa)) {
                    invalidGpaRows.add(upperRow);
                    invalidGpaRows.add(currentRow);
                    invalidGpaRows.add(lowerRow);
                }
            } catch (Exception e) {
                invalidGpaRows.add(upperRow);
                invalidGpaRows.add(currentRow);
                invalidGpaRows.add(lowerRow);
            }
        }
        
        //Red color invalid
        jTable1.setDefaultRenderer(Object.class, new DefaultTableCellRenderer(){
        
            @Override
            public Component getTableCellRendererComponent(
                JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                
                Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                
                c.setForeground(isSelected 
                        ? table.getSelectionForeground()
                        : table.getForeground());
                
                if (invalidRows.contains(row)) {
                    c.setForeground(Color.red);
                } 
                
                if (column == 2 && invalidGradeRows.contains(row)) {
                    c.setForeground(Color.RED);
                }
                
                if (column == 3 && invalidGpaRows.contains(row)) {
                    c.setForeground(Color.RED);
                }
                return c;
            }
        });
        
    }//GEN-LAST:event_jTable1FocusGained

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
        java.awt.EventQueue.invokeLater(() -> new GradingSys().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
