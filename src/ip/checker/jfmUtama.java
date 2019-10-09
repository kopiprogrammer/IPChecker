package ip.checker;

import java.awt.*;
import java.net.InetAddress;
import java.net.UnknownHostException;
import javax.swing.*;

/**
 * @author aldi
 **/
public class jfmUtama extends javax.swing.JFrame {

    public jfmUtama() {
        initComponents();
        setTitle("IP CHECKER APLIKASI");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = getSize();
        setLocation(
        (screenSize.width - frameSize.width) / 2,
        (screenSize.height - frameSize.height) / 2);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfHostName = new javax.swing.JTextField();
        tfIpAddress = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(501, 300));
        setModalExclusionType(null);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("IP CHECKER");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 30, 149, 29);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("HOSTNAME");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 100, 70, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("IP ADDRESS");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 140, 80, 17);

        tfHostName.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        getContentPane().add(tfHostName);
        tfHostName.setBounds(90, 90, 210, 30);

        tfIpAddress.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        getContentPane().add(tfIpAddress);
        tfIpAddress.setBounds(90, 130, 210, 30);

        jButton1.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jButton1.setText("CEK IP ADDRESS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(310, 130, 160, 30);

        jButton2.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jButton2.setText("CEK HOSTNAME");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(310, 90, 160, 30);

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    try{
        if(tfIpAddress.getText().trim().equals("")){
            JOptionPane.showMessageDialog(rootPane, "HARAP ISI IP ADDRESS ", "INFORMASI", JOptionPane.WARNING_MESSAGE);
        }
        else{
         String strhostname = InetAddress.getByName(tfIpAddress.getText()).getHostName();
         tfHostName.setText(strhostname);
        }
        }
    catch(HeadlessException | UnknownHostException Ex){
        JOptionPane.showMessageDialog(null, "ERROR" + Ex, "INFORMASI", JOptionPane.ERROR_MESSAGE);
    }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       try{
        if(tfHostName.getText().trim().equals("")){
            JOptionPane.showMessageDialog(rootPane, "HARAP ISI HOSTNAME ADDRESS ", "INFORMASI", JOptionPane.WARNING_MESSAGE);
        }
        else{
            String Ipaddress = InetAddress.getByName(tfHostName.getText()).getHostAddress();
            tfIpAddress.setText(Ipaddress);
        }
       }
       catch(HeadlessException | UnknownHostException Ex){
           JOptionPane.showMessageDialog(null, "ERROR" + Ex, "INFORMASI", JOptionPane.ERROR_MESSAGE);
       }
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(jfmUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfmUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfmUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfmUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new jfmUtama().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField tfHostName;
    private javax.swing.JTextField tfIpAddress;
    // End of variables declaration//GEN-END:variables
}
