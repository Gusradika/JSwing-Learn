/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MVC_GUI_1;

import java.text.SimpleDateFormat;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aditn
 */
public class view extends javax.swing.JFrame {

    
    // Object dari controller
    controller c = new controller();
    
//    Method untuk get value dari segala input (fungsi)
    public String getValueRadioButton(){
        String valueRB = null;
        
        if(men.isSelected()){
            valueRB = men.getText().toString();
        }else{
            valueRB = women.getText().toString() + ", ";
        }
        
        return valueRB;
    }
    
    public String getValueCheckBox(){
    String valueCB = "";
    JCheckBox[] jcb = new JCheckBox[]{accounting, administration, networking, graphicdesign};
    
    for(int i = 0; i < jcb.length; i++){
        if(jcb[i].isSelected()){
        valueCB += jcb[i].getText().toString();
        }
        
    }
    
    return valueCB;
    }
    
    public String getValueComboBox(){
    String valueCombo = "";
//    Jika tidak ada yang dipilih
    if(department.getSelectedIndex() == 0){
        JOptionPane.showMessageDialog(rootPane,"anda belum memilih", "Error", JOptionPane.ERROR_MESSAGE);
        valueCombo = "";
    }else{
    valueCombo = department.getSelectedItem().toString();
    }
//    else if(department.getSelectedIndex() == 1){
//        JOptionPane.showMessageDialog(rootPane, department.getSelectedItem().toString());
//        valueCombo = "HR";
//    }else if(department.getSelectedIndex() == 2){
//        JOptionPane.showMessageDialog(rootPane, department.getSelectedItem().toString());
//        valueCombo = "IT";
//    }else if(department.getSelectedIndex() == 3){
//        JOptionPane.showMessageDialog(rootPane, department.getSelectedItem().toString());
//        valueCombo = department.getSelectedItem().toString();
//    }


    
    return valueCombo;
    }
    
    public String getDate(){
        SimpleDateFormat sdf = new SimpleDateFormat();
        String date = null;
        
//         Checker if no date selected

    if(startdate.getDate() == null){
      JOptionPane.showMessageDialog(rootPane,"anda belum memilih Tanggal", "Error", JOptionPane.ERROR_MESSAGE);
    }else{
        sdf.applyPattern(startdate.getDateFormatString());
        date = sdf.format(startdate.getDate());
    }
        
        return date;
    }
    
    void displayJTable(){
        String column[] = {"FULL NAME", "SEX", "COMPETENCY", "DEPARTMENT", "WORK START DATE"};
        
//        Rows
//        Data = ArrayList

        Object[][] data = new Object[c.getArrayListSize()][5];
        
//       Tampil dengan perulangan
        int i = 0;
        while(i < c.getArrayListSize()){
            String temp[] = {
                c.getArrayList().get(i).getFullname(),
                c.getArrayList().get(i).getSex(),
                c.getArrayList().get(i).getCompetency(),
                c.getArrayList().get(i).getDepartment(),
                c.getArrayList().get(i).getStartdate()
            };
            data[i] = temp;
            i++;
        }
//        Tampilkan ke dalam jtable
DefaultTableModel dtm = new DefaultTableModel(data, column);
    tableEmp.setModel(dtm);
    }
    
    public view() {
        initComponents();
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fullname = new javax.swing.JTextField();
        men = new javax.swing.JRadioButton();
        women = new javax.swing.JRadioButton();
        accounting = new javax.swing.JCheckBox();
        networking = new javax.swing.JCheckBox();
        administration = new javax.swing.JCheckBox();
        graphicdesign = new javax.swing.JCheckBox();
        department = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableEmp = new javax.swing.JTable();
        submit = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        startdate = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setLabelFor(fullname);
        jLabel1.setText("FULL NAME");

        jLabel2.setText("SEX");

        jLabel3.setText("COMPETENCY");

        jLabel4.setText("DEPARTMENT");

        jLabel5.setLabelFor(startdate);
        jLabel5.setText("WORK START DATE");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setText("EMPLOYEES");

        buttonGroup1.add(men);
        men.setText("Men");

        buttonGroup1.add(women);
        women.setText("Women");

        accounting.setText("Accounting");

        networking.setText("Networking");

        administration.setText("Administration");
        administration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                administrationActionPerformed(evt);
            }
        });

        graphicdesign.setText("Graphic Design");

        department.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----Choose Department ----", "HR", "IT", "FA" }));
        department.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departmentActionPerformed(evt);
            }
        });

        tableEmp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableEmp.setShowGrid(true);
        jScrollPane1.setViewportView(tableEmp);

        submit.setText("SUBMIT");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        submit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                submitKeyReleased(evt);
            }
        });

        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        startdate.setDateFormatString("dd MMMMM Y");
        startdate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                startdateKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(department, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(men)
                                .addComponent(accounting)
                                .addComponent(administration))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(networking)
                                .addComponent(women)
                                .addComponent(graphicdesign)))
                        .addComponent(fullname, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(startdate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(submit))
                .addGap(102, 102, 102)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(update)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delete)))
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(426, 426, 426))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(fullname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(men)
                            .addComponent(jLabel2)
                            .addComponent(women))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(accounting)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(administration)
                            .addComponent(graphicdesign))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(department, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(startdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(networking)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submit)
                    .addComponent(update)
                    .addComponent(delete))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void administrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_administrationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_administrationActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        c.insert(fullname.getText(), getValueRadioButton(), getValueCheckBox(),getValueComboBox(), getDate());
        displayJTable();
    }//GEN-LAST:event_submitActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteActionPerformed

    private void submitKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_submitKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_submitKeyReleased

    private void startdateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_startdateKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_startdateKeyReleased

    private void departmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_departmentActionPerformed

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
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox accounting;
    private javax.swing.JCheckBox administration;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton delete;
    private javax.swing.JComboBox<String> department;
    private javax.swing.JTextField fullname;
    private javax.swing.JCheckBox graphicdesign;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton men;
    private javax.swing.JCheckBox networking;
    private com.toedter.calendar.JDateChooser startdate;
    private javax.swing.JButton submit;
    private javax.swing.JTable tableEmp;
    private javax.swing.JButton update;
    private javax.swing.JRadioButton women;
    // End of variables declaration//GEN-END:variables
}
