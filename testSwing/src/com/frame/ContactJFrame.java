/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.frame;
import com.conn.exec.ExecContact;

import java.awt.Rectangle;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.Stack;
import java.util.Vector;
import java.util.regex.Pattern;
import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dreamworld
 */
public class ContactJFrame extends javax.swing.JFrame {

        /**
         * Creates new form ContactJFrame
         */
        public ContactJFrame(boolean isconn) throws SQLException {
                if(isconn)
                        isConnected = true;
                else
                        isConnected = false;
                initComponents();
        }
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">
        private void initComponents() throws SQLException {

                jScrollPane1 = new javax.swing.JScrollPane();
                jTable1 = new javax.swing.JTable();
                jTextField1 = new javax.swing.JTextField();
                jTextField2 = new javax.swing.JTextField();
                jTextField3 = new javax.swing.JTextField();
                jTextField4 = new javax.swing.JTextField();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                jButton1 = new javax.swing.JButton();
                jButton2 = new javax.swing.JButton();
                jTextField5 = new javax.swing.JTextField();
                jLabel7 = new javax.swing.JLabel();
                jButton3 = new javax.swing.JButton();
                jLabel8 = new javax.swing.JLabel();
                jSeparator1 = new javax.swing.JSeparator();
                jSeparator2 = new javax.swing.JSeparator();
                jButton4 = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);


                if(isConnected == true){
                        cursor = new ExecContact(username);
                        vdatas = cursor.GetAllRecords();
                        this.setTitle("[ONLINE MODE]");

                } else {
                        this.setTitle("[OFFLINE MODE]");
                }


                jTable1.setModel(new javax.swing.table.DefaultTableModel(
                        parse(vdatas)

                        ,
                      colnames
                ));
                jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                jTable1MouseClicked(evt);
                        }
                });
                jScrollPane1.setViewportView(jTable1);

                jTextField1.setText("Clark");
                jTextField1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jTextField1ActionPerformed(evt);
                        }
                });

                jTextField2.setText("Nantong");
                jTextField2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jTextField2ActionPerformed(evt);
                        }
                });
                jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyTyped(java.awt.event.KeyEvent evt) {
                                jTextField2KeyTyped(evt);
                        }
                });

                jTextField3.setText("12930492018");
                jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyPressed(java.awt.event.KeyEvent evt) {
                                jTextField3KeyPressed(evt);
                        }
                });

                jTextField4.setText("188122050@qq.com");
                jTextField4.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jTextField4ActionPerformed(evt);
                        }
                });
                jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyPressed(java.awt.event.KeyEvent evt) {
                                jTextField4KeyPressed(evt);
                        }
                });

                jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyPressed(java.awt.event.KeyEvent evt) {
                                jTextField5KeyPressed(evt);
                        }
                });

                jLabel1.setText("Name:");

                jLabel2.setText("Address");

                jLabel3.setText("Phone Number:");

                jLabel4.setText("Email:");

                jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
                jLabel5.setForeground(new java.awt.Color(0, 102, 102));
                jLabel5.setText("Double click to modify data");

                jButton1.setText("Add");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                try {
                                        jButton1ActionPerformed(evt);
                                } catch (SQLException e) {
                                        e.printStackTrace();
                                }
                        }
                });

                jButton2.setText("Delete");
                jButton2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                try {
                                        jButton2ActionPerformed(evt);
                                } catch (SQLException e) {
                                        e.printStackTrace();
                                }
                        }
                });

                jTextField5.setText("Clark");

                jLabel7.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
                jLabel7.setText("CONTACT DETAILS");

                jButton3.setText("Search");
                jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton3ActionPerformed(evt);
                        }
                });

                jLabel8.setText("Copyright Reserved By 633");

                jButton4.setText("<Back");
                jButton4.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton4ActionPerformed(evt);
                        }
                });


                ((DefaultTableModel)jTable1.getModel()).addTableModelListener(new TableModelListener() {
                        @Override
                        public void tableChanged(TableModelEvent e) {
                                try {
                                        jTable1tableChanged(e);
                                } catch (SQLException e1) {
                                        e1.printStackTrace();
                                }
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(68, 68, 68)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel1)
                                                .addComponent(jLabel2))
                                        .addGap(46, 46, 46)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(23, 23, 23))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(18, 18, 18))))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                                        .addComponent(jTextField3)
                                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(55, 55, 55))
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton4)
                                        .addGap(20, 20, 20)
                                        .addComponent(jLabel5)
                                        .addGap(66, 66, 66)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                .addComponent(jSeparator1)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8)
                                        .addGap(264, 264, 264))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel5)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(44, 44, 44)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton3))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel1)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel3)
                                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel4)
                                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(33, 33, 33)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jButton1)
                                                .addComponent(jButton2))
                                        .addGap(62, 62, 62)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8))
                );

                pack();
                this.setLocationRelativeTo(null);
        }// </editor-fold>

        /**
         * This method is called from within the constructor to initialize the
         * form. WARNING: Do NOT modify this code. The content of this method is
         * always regenerated by the Form Editor.
         */

        private boolean isPhoneValid(String phone){
                String phonepattern = "[\\+#]?[0-9]+";
                if (Pattern.matches(phonepattern, phone) == false)
                {
                        JOptionPane.showMessageDialog(this, "The phone number '" + phone + "' is not created by numbers or '#+'", "ERROR", JOptionPane.ERROR_MESSAGE);
                        return false;
                }
                return true;
        }

        private boolean isEmailValid(String email){
                String emailpattern = ".+@.+";
                if (Pattern.matches(emailpattern, email) == false){
                        JOptionPane.showMessageDialog(this, "The email address '" + email + "' is not the format of 'xxx@xxx'","ERROR", JOptionPane.ERROR_MESSAGE);
                        return false;
                }
                return true;
        }
        //get the clicked point
        private void jTable1MouseClicked(MouseEvent evt){
                int row = jTable1.getSelectedRow();
                int col = jTable1.getSelectedColumn();
                System.out.println(row);
                System.out.println(col);
                if (jTable1.getValueAt(row,col).toString() == "") {
                        if (col == 3) {
                                originalString = "66666";
//                                return;
                        }
                        else if (col == 4)
                                originalString = "****@****";
                        else
                                originalString = "";
                }
                else {
                        originalString = jTable1.getValueAt(row, col).toString();
                }
                if(row != -1 && col != -1){
                        if(jTable1.getValueAt(row,1) != null)
                                jTextField1.setText(jTable1.getValueAt(row, 1).toString());
                        else
                                jTextField1.setText("");
                        if(jTable1.getValueAt(row, 3) != null)
                                jTextField3.setText(jTable1.getValueAt(row, 3).toString());
                        else
                                jTextField3.setText("");
                        if(jTable1.getValueAt(row, 2) != null)
                                jTextField2.setText(jTable1.getValueAt(row, 2).toString());
                        else
                                jTextField3.setText("");
                        if(jTable1.getValueAt(row, 4) != null)
                                jTextField4.setText(jTable1.getValueAt(row, 4).toString());
                        else
                                jTextField4.setText("");

                }
                System.out.println(originalString);
        }
        //modify the element
        private void jTable1tableChanged(TableModelEvent evt) throws SQLException {
                int type = evt.getType();
                int row = evt.getFirstRow();
                int col = evt.getColumn();
//                System.out.println(jTable1.getValueAt(row,col));
                if(col == 1 && jTable1.getValueAt(row, col).equals("")){
                        JOptionPane.showMessageDialog(this, "Please enter the contact's name", "ERROR", JOptionPane.ERROR_MESSAGE);
                        jTable1.setValueAt(originalString, row, col);
                        return;
                }
                //if the element is illegal then change back to the orginal element
                if(col == 3 && isPhoneValid(jTable1.getValueAt(row, col).toString()) == false) {

                        jTable1.setValueAt(originalString, row, col);
                        return;
                }
                if(col == 4 && isEmailValid(jTable1.getValueAt(row, col).toString()) == false) {
                        jTable1.setValueAt(originalString, row, col);
                        return;
                }

                if(row != -1 && col != -1) {
                        String name = jTable1.getValueAt(row, 1).toString();
                        String address = jTable1.getValueAt(row, 2).toString();
                        String phonenumber = jTable1.getValueAt(row, 3).toString();
                        String email = jTable1.getValueAt(row, 4).toString();
                        if (col == 1) name = originalString;
                        if (col == 2) address = originalString;
                        if (col == 3) phonenumber = originalString;
                        if (col == 4) phonenumber = originalString;
                        String cname = jTable1.getColumnName(col);
                        String val = jTable1.getValueAt(row, col).toString();
                        System.out.println("yes");
                        cursor.Update(name, address, phonenumber, email, cname, val);
                }
                //TODO Add the database and file editor code here.
        }
        private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:
        }

        private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:
        }

        private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:
                this.dispose();
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new ChoosingJFrame(isConnected).setVisible(true);
                        }
                });

        }


        private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:
        }

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {
                // TODO add your handling code here:
                String a = jTextField1.getText();
                //without entering name -> stop
                if (a.equals("")){
                        JOptionPane.showMessageDialog(this, "Please enter the contact's name", "ERROR", JOptionPane.ERROR_MESSAGE);
                        //name textfield get the focus to let user to enter the name.
                        jTextField1.requestFocus();
                        return;
                }
                //forbidden repeated name
                Vector<Vector> dataVector = ((DefaultTableModel)jTable1.getModel()).getDataVector();
                for(int i = 0; i < dataVector.size(); i++){
                        //if there have repeated name -> stop
                        if (String.valueOf(dataVector.elementAt(i).get(1)).equals(jTextField1.getText())){
                                if(String.valueOf(dataVector.elementAt(i).get(2)).equals(jTextField2.getText().toString())) {
                                        if(dataVector.elementAt(i).get(3).equals(jTextField3.getText().toString())){
                                                if(dataVector.elementAt(i).get(4).equals(jTextField4.getText().toString())) {
                                                        jTable1.setRowSelectionInterval(i, i);
                                                        String message = "This record has already been in your contact";
                                                        Rectangle rect = jTable1.getCellRect(i, 0, true);
                                                        jTable1.scrollRectToVisible(rect);
                                                        JOptionPane.showMessageDialog(this, message, "ERROR", JOptionPane.ERROR_MESSAGE);
                                                }
                                        }
                                }
                                return;
                        }
                }

                String b = jTextField2.getText();
                String c = jTextField3.getText();
                //number can be started with + or #
                if (isPhoneValid(c) == false) {
                        jTextField3.requestFocus();
                        return;
                }
                String d = jTextField4.getText();
                if (isEmailValid(d) == false) {
                        jTextField4.requestFocus();
                        return;
                }

//                String[] RowStrings = {"1", a,b,c,d};
//                ((DefaultTableModel)jTable1.getModel()).addRow(RowStrings);
                cursor.Add(a,b,c,d);
                vdatas = cursor.GetAllRecords();
                ((DefaultTableModel)jTable1.getModel()).setDataVector(parse(vdatas),colnames);
                jTable1.clearSelection();
                for(int i = 0; i < vdatas.size(); i++){
                    if(vdatas.elementAt(i).elementAt(1).toString().equals(a)){
                            if(vdatas.elementAt(i).elementAt(2).equals(b)){
                                    if(vdatas.elementAt(i).elementAt(3).equals(c)){
                                            if(vdatas.elementAt(i).elementAt(4).equals(d)){
                                                    jTable1.setRowSelectionInterval(i,i);
                                                    Rectangle rect = jTable1.getCellRect(i, 0, true);
                                                    jTable1.scrollRectToVisible(rect);
                                                    return;
                                            }
                                    }
                            }
                    }
                }

        }

        public String[][] parse(Vector<Vector<Object>> v){
                int n = v.size();
                int m = v.elementAt(0).size();
                String[][]a = new String[n][m];
                for (int i = 0; i < n; i++){
                        for(int j = 0; j < m; j++){
                                if(v.elementAt(i).elementAt(j) == null)
                                        a[i][j] = "";
                                else
                                        a[i][j] = v.elementAt(i).elementAt(j).toString();
                        }
                }
                return a;
        }
        private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:
                Vector<Vector> dataVector = ((DefaultTableModel)jTable1.getModel()).getDataVector();
                jTable1.clearSelection();
                Stack<Integer> num = new Stack<Integer>();
                for(int i = 0; i < dataVector.size(); i++){
                        if (String.valueOf(dataVector.elementAt(i).get(1)).equalsIgnoreCase(jTextField5.getText())){
                                jTable1.addRowSelectionInterval(i, i);
                                num.push(i);
                        }
                }
                if (num.size() != 0) {
                        Rectangle rect = jTable1.getCellRect(num.pop(), 0, true);
                        jTable1.scrollRectToVisible(rect);
                }
        }

        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {
                // TODO add your handling code here:
                int selectedRow = jTable1.getSelectedRow();
                int selectedCol = jTable1.getSelectedColumn();
                String name = jTable1.getValueAt(selectedRow, 1).toString();
                String address = jTable1.getValueAt(selectedRow, 2).toString();
                String phonenumber = jTable1.getValueAt(selectedRow, 3).toString();
                String email = jTable1.getValueAt(selectedRow, 4).toString();

                if (selectedRow != -1) {
//                Vector<Vector> dataVector = ((DefaultTableModel)jTable1.getModel()).getDataVector();
                        cursor.Delete(name,address,phonenumber,email);
                }
                vdatas = cursor.GetAllRecords();
                ((DefaultTableModel)jTable1.getModel()).setDataVector(parse(vdatas),colnames);

        }
        private void jTextField4KeyPressed(java.awt.event.KeyEvent evt) {
                // TODO add your handling code here:
                if(evt.getKeyChar() == KeyEvent.VK_ENTER)
                        jButton1.doClick();

        }

        private void jTextField5KeyPressed(KeyEvent evt){
                if(evt.getKeyChar() == KeyEvent.VK_ENTER)
                        jButton3.doClick();
        }

        private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {
                // TODO add your handling code here:
                if(evt.getKeyChar() == KeyEvent.VK_ENTER)
                        jButton1.doClick();
        }

        private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {
                // TODO add your handling code here:
                if(evt.getKeyChar() == KeyEvent.VK_ENTER)
                        jButton1.doClick();
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
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(ContactJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(ContactJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(ContactJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(ContactJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                //</editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                try {
                                        new ContactJFrame(true).setVisible(true);
                                } catch (SQLException e) {

                                        e.printStackTrace();
                                }
                        }
                });
        }

        // Variables declaration - do not modify
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton2;
        private javax.swing.JButton jButton3;
        private javax.swing.JButton jButton4;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JSeparator jSeparator1;
        private javax.swing.JSeparator jSeparator2;
        private javax.swing.JTable jTable1;
        private javax.swing.JTextField jTextField1;
        private javax.swing.JTextField jTextField2;
        private javax.swing.JTextField jTextField3;
        private javax.swing.JTextField jTextField4;
        private javax.swing.JTextField jTextField5;
        private String originalString = new String();
        //initial
        private Boolean isConnected = true;
        ExecContact cursor;
        private Vector<Vector<Object>> vdatas = null;
        private String[]colnames =new String [] {
                "No","Name", "Address", "PhoneNumber", "Email"
        };
        private String username = "Name";
        // End of variables declaration
}
