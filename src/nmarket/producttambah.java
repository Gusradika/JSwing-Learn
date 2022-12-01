/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package nmarket;

import java.sql.*;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.*;
import java.lang.System.*;
import java.lang.System.Logger.Level;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aditn
 */
public class producttambah extends javax.swing.JFrame {

    public Connection conn1;
    public Statement st;
    public Statement st2;
    public ResultSet rs;
    public ResultSet rs2;

    /**
     * Creates new form producttambah
     */
    public producttambah() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        product_id = new javax.swing.JTextField();
        product_name = new javax.swing.JTextField();
        description = new javax.swing.JTextField();
        standart_cost = new javax.swing.JTextField();
        list_price = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        categoryid = new javax.swing.JComboBox<>();
        save = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel1.setText("Product ID");

        jLabel2.setText("Product Name");

        jLabel3.setText("Description");

        jLabel4.setText("Standart Cost");

        jLabel5.setText("List Price");

        product_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product_idActionPerformed(evt);
            }
        });

        product_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product_nameActionPerformed(evt);
            }
        });

        description.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descriptionActionPerformed(evt);
            }
        });

        standart_cost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                standart_costActionPerformed(evt);
            }
        });

        list_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list_priceActionPerformed(evt);
            }
        });

        jLabel6.setText("Category");

        categoryid.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        categoryid.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                categoryidComponentShown(evt);
            }
        });
        categoryid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryidActionPerformed(evt);
            }
        });

        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        update.setText("Update");

        delete.setText("Delete");

        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(save)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(update)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(delete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancel))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(standart_cost, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(41, 41, 41)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(categoryid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(list_price, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(product_id, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                            .addComponent(product_name))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(product_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(product_name, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(standart_cost, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(list_price, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(categoryid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(save)
                            .addComponent(update)
                            .addComponent(delete)
                            .addComponent(cancel)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void product_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_product_nameActionPerformed

    private void descriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descriptionActionPerformed

    private void standart_costActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_standart_costActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_standart_costActionPerformed

    private void list_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_list_priceActionPerformed

    private void product_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_product_idActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        try {
            conn1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "market", "market");
            if (conn1 != null) {
                Statement st = conn1.createStatement();
                String sql = "insert into PRODUCTS(PRODUCT_ID,PRODUCT_NAME,DESCRIPTION,STANDARD_COST,LIST_PRICE,CATEGORY_ID)values(" + "'" + product_id.getText() + "'," + "'" + product_name.getText().toString() + "','" + description.getText().toString() + "'," + Integer.valueOf(standart_cost.getText()) + "," + Integer.valueOf(list_price.getText()) + "," + (categoryid.getSelectedIndex() + 1) + ")";
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(rootPane, "anda belum memilih", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
// Logger.getLogger(kelima.class.getName()).log(Level.SEVERE, null, ex);
        }

        this.setVisible(false);
        products k = new products();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        k.setAlwaysOnTop(true);
// k.setBounds(0+200,0+200,screenSize.width-400, screenSize.height-400);
        k.toFront();
        k.requestFocus();
        k.setVisible(true);
        k.toFront();
        k.requestFocus();

    }//GEN-LAST:event_saveActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        this.setVisible(false);
        products m = new products();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        m.setAlwaysOnTop(true);
        m.requestFocus();
        m.setVisible(true);
    }//GEN-LAST:event_cancelActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        try {
            Class.forName("oracle.jdbc.OracleDriver");

            conn1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "market", "market");
            if (conn1 != null) {
                int i = 0;
                st = conn1.createStatement();
                rs = st.executeQuery("select * from products order by product_id desc ");
                st2 = conn1.createStatement();
                rs2 = st2.executeQuery("select * from product_categories");
                DefaultTableModel model = new DefaultTableModel();
                DefaultComboBoxModel cbm = new DefaultComboBoxModel();
                model.addColumn("ID");
                model.addColumn("NAME");
                model.addColumn("DESCRIPTION");
                model.addColumn("COST");
                model.addColumn("PRICE");
                model.addColumn("CATEGORY");
                while (rs.next()) {

                    String id = rs.getString("PRODUCT_ID");
                    String name = rs.getString("PRODUCT_NAME");
                    String description = rs.getString("DESCRIPTION");
                    String cost = rs.getString("STANDARD_COST");
                    String price = rs.getString("LIST_PRICE");
                    String category = rs.getString("CATEGORY_ID");

                    model.addRow(new Object[]{id, name, description, cost, price, category});
                }

                while (rs2.next()) {
                    String comboValue = rs2.getString("CATEGORY_NAME");
                    cbm.addElement(comboValue);
                }

                categoryid.setModel(cbm);
                tabel.setModel(model);

                conn1.close();
            } else {

            }
        } catch (ClassNotFoundException ex) {

        } catch (SQLException ex) {

        }
    }//GEN-LAST:event_formComponentShown

    private void categoryidComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_categoryidComponentShown
        // TODO add your handling code here:

    }//GEN-LAST:event_categoryidComponentShown

    private void categoryidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryidActionPerformed

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
            java.util.logging.Logger.getLogger(producttambah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(producttambah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(producttambah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(producttambah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new producttambah().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton cancel;
    public javax.swing.JComboBox<String> categoryid;
    public javax.swing.JButton delete;
    public javax.swing.JTextField description;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField list_price;
    public javax.swing.JTextField product_id;
    public javax.swing.JTextField product_name;
    public javax.swing.JButton save;
    public javax.swing.JTextField standart_cost;
    private javax.swing.JTable tabel;
    public javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
