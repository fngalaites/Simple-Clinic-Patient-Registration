
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
public class Reg2 extends javax.swing.JFrame {

    /**
     * Creates new form Reg3
     */
    public Reg2() {
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
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("STAFF INFORMATION");
        setMinimumSize(new java.awt.Dimension(415, 301));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("CLINIC STAFF");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(130, 0, 160, 40);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(0, 40, 400, 20);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(0, 0, 400, 20);

        jLabel2.setText("Staff Name:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 70, 70, 16);

        jLabel3.setText("Staff ID:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(240, 70, 50, 16);

        jLabel4.setText("Patient ID: ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 150, 70, 16);

        jLabel5.setText("Staff Job:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(190, 150, 60, 16);

        jButton1.setText("<");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(10, 10, 60, 25);
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(0, 210, 400, 10);

        jButton2.setText("Next");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(300, 220, 79, 25);

        jButton3.setText("Submit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(210, 220, 73, 25);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(100, 60, 130, 30);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(300, 60, 80, 30);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(90, 140, 90, 30);

        jTextField4.setToolTipText("");
        jPanel1.add(jTextField4);
        jTextField4.setBounds(260, 140, 120, 30);

        jButton4.setText("Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(300, 100, 80, 20);

        jButton5.setText("Update");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(20, 220, 73, 25);

        jButton6.setText("Delete");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(110, 220, 69, 25);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 410, 310);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Reg1 reg = new Reg1();
                reg.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sanford_world_clinic_db", "root", "");
            
            int staff_id = 0, patient_id = 0;
            String staff_name = "",staff_job = "";
            
            staff_id = Integer.parseInt(jTextField2.getText());
            staff_name = jTextField1.getText();
            patient_id = Integer.parseInt(jTextField3.getText());
            staff_job = jTextField4.getText();
            
            Statement stm = conn.createStatement();
            
            String mysql = "INSERT INTO clinic_staff VALUES('"+staff_id+"','"+staff_name+"','"+patient_id+"','"+staff_job+"')";
            stm.execute(mysql);
            
            JOptionPane.showMessageDialog(null, "Record is successfully added");
            conn.close();
            
        }catch(Exception e){
        System.out.println("Error: " + e.getMessage());
    }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         Reg3 reg = new Reg3();
                reg.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sanford_world_clinic_db", "root", "");
            
            int staff_id, patient_id = 0;
            String staff_name, staff_job = "";
        
                staff_id = Integer.parseInt(jTextField2.getText());
            	staff_name = jTextField1.getText();
                patient_id = Integer.parseInt(jTextField3.getText());
                staff_job = jTextField4.getText();
                
                Statement stm = conn.createStatement(); 
                stm.executeUpdate("UPDATE clinic_staff SET staff_name = '"+staff_name+"',staff_job = '"+staff_job+"' WHERE staff_id = '"+staff_id+"'");
                JOptionPane.showMessageDialog(null, "The record was updated.");
                conn.close();
        
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sanford_world_clinic_db", "root", "");
            
            int staff_id = Integer.parseInt(jTextField2.getText());
            Statement stm = conn.createStatement();
            String sqlsearch = ("SELECT * FROM clinic_staff WHERE staff_id='"+staff_id+"'");
            ResultSet rs = stm.executeQuery(sqlsearch);
            
            if(rs.next()){
            jTextField1.setText(rs.getString("staff_name"));
            jTextField3.setText(rs.getString("patient_id"));
            jTextField4.setText(rs.getString("staff_job"));
            }
            
            
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sanford_world_clinic_db", "root", "");
            
            int staff_id = 0;
            
            staff_id = Integer.parseInt(jTextField2.getText());
            
            Statement stm = conn.createStatement();
            stm.executeUpdate("DELETE FROM clinic_staff WHERE staff_id='"+staff_id+"'");
            
            JOptionPane.showMessageDialog(null, "A record was successfully deleted");
            conn.close();
            
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(Reg2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reg2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reg2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reg2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reg2().setVisible(true);
            }
        });
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
