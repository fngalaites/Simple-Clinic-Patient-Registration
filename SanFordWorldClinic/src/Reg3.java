
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author felix
 */
public class Reg3 extends javax.swing.JFrame {

    /**
     * Creates new form Reg3
     */
    public Reg3() {
        initComponents();
        setLocationRelativeTo(null);
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
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(425, 315));
        setPreferredSize(new java.awt.Dimension(425, 315));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(400, 300));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 300));
        jPanel1.setLayout(null);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(0, 50, 410, 20);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(0, 0, 410, 20);
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(0, 220, 410, 10);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("PATIENT RECORDS ID");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(80, 0, 240, 50);

        jLabel2.setText("Patient Records ID:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 90, 120, 30);

        jLabel3.setText("Patient ID:");
        jLabel3.setToolTipText("");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(240, 90, 70, 30);

        jLabel4.setText("Staff Responsible ID:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 170, 120, 30);

        jButton1.setText("<");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(10, 10, 50, 25);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(150, 90, 80, 30);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(310, 90, 80, 30);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(160, 170, 70, 30);

        jButton2.setText("Next");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(330, 230, 57, 25);

        jButton3.setText("Submit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(240, 230, 73, 25);

        jButton4.setText("Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(150, 130, 80, 20);

        jButton5.setText("Delete");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(30, 230, 79, 25);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 410, 280);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         Reg2 reg = new Reg2();
                reg.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Reg4 reg = new Reg4();
                reg.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sanford_world_clinic_db", "root", "");
            
            int patient_recordsID, patient_id,staff_responsibleID = 0;
            
            patient_recordsID = Integer.parseInt(jTextField1.getText());
            patient_id = Integer.parseInt(jTextField2.getText());
            staff_responsibleID = Integer.parseInt(jTextField3.getText());
            
            Statement stm = conn.createStatement();
            
            String mysql = "INSERT INTO patient_records VALUES('"+patient_recordsID+"','"+patient_id+"','"+staff_responsibleID+"')";
            stm.execute(mysql);
            
            JOptionPane.showMessageDialog(null, "Record is successfully added");
            conn.close();
            
            
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sanford_world_clinic_db", "root", "");
            
            int patient_recordsID = Integer.parseInt(jTextField1.getText()); 
            Statement stm = conn.createStatement();
            String sqlsearch = ("SELECT * FROM patient_records WHERE patient_recordsID='"+patient_recordsID+"'");
            ResultSet rs = stm.executeQuery(sqlsearch);
            
            if(rs.next()){
            jTextField2.setText(rs.getString("patient_id"));
            jTextField3.setText(rs.getString("staff_responsibleID"));
            }
            
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sanford_world_clinic_db", "root", "");
            
            int patient_recordsID = 0;
            
            patient_recordsID = Integer.parseInt(jTextField1.getText());
            
            Statement stm = conn.createStatement();
            stm.executeUpdate("DELETE FROM patient_records WHERE patient_recordsID='"+patient_recordsID+"'");
            
            JOptionPane.showMessageDialog(null, "A record was successfully deleted");
            conn.close();           
            
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Reg3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reg3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reg3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reg3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reg3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
