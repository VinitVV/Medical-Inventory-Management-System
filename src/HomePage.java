
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LEGION
 */
public class HomePage extends javax.swing.JFrame {
public int z=0;
    /**
     * Creates new form HOME
     */
    public HomePage() {
        initComponents();
       employee.setVisible(false);
       company.setVisible(false);
       medicine.setVisible(false);
       customer.setVisible(false);
       sales.setVisible(false);
       logout.setVisible(false);
       close.setVisible(false);
       jLabel1.setVisible(false);
       jLabel2.setVisible(false);
       jLabel3.setVisible(false);
       jLabel4.setVisible(false);
       jLabel5.setVisible(false);
       jLabel6.setVisible(false);
       jLabel7.setVisible(false);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        customer = new javax.swing.JButton();
        company = new javax.swing.JButton();
        close = new javax.swing.JButton();
        employee = new javax.swing.JButton();
        sales = new javax.swing.JButton();
        medicine = new javax.swing.JButton();
        hide = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        customer.setBackground(new java.awt.Color(255, 255, 255));
        customer.setForeground(new java.awt.Color(255, 255, 255));
        customer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Customer1.png"))); // NOI18N
        customer.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                customerComponentShown(evt);
            }
        });
        customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerActionPerformed(evt);
            }
        });
        getContentPane().add(customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, 110, 90));

        company.setBackground(new java.awt.Color(255, 255, 255));
        company.setForeground(new java.awt.Color(255, 255, 255));
        company.setIcon(new javax.swing.ImageIcon(getClass().getResource("/company1.png"))); // NOI18N
        company.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                companyComponentShown(evt);
            }
        });
        company.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companyActionPerformed(evt);
            }
        });
        getContentPane().add(company, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, -1));

        close.setBackground(new java.awt.Color(255, 255, 255));
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Close.png"))); // NOI18N
        close.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                closeComponentShown(evt);
            }
        });
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 30, 110, 90));

        employee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee.png"))); // NOI18N
        employee.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                employeeComponentShown(evt);
            }
        });
        employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeActionPerformed(evt);
            }
        });
        getContentPane().add(employee, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 110, -1));

        sales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Salesicon-1.png"))); // NOI18N
        sales.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                salesComponentShown(evt);
            }
        });
        sales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesActionPerformed(evt);
            }
        });
        getContentPane().add(sales, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 30, -1, -1));

        medicine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Medical-icons-126.png"))); // NOI18N
        medicine.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                medicineComponentShown(evt);
            }
        });
        medicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicineActionPerformed(evt);
            }
        });
        getContentPane().add(medicine, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, -1, -1));

        hide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/control hide and show.png"))); // NOI18N
        hide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hideMouseClicked(evt);
            }
        });
        getContentPane().add(hide, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout-1.png"))); // NOI18N
        logout.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                logoutComponentShown(evt);
            }
        });
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 30, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setText("Employee");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, -1, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setText("Company");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, -1, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setText("Medicince");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel4.setText("Customer");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 130, -1, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel5.setText("Sales");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 120, -1, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel6.setText("Logout");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 130, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel7.setText("Close");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 130, -1, 20));

        bg.setBackground(new java.awt.Color(0, 0, 0));
        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home.PNG"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void companyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companyActionPerformed
        // TODO add your handling code here:
        new company().setVisible(true);
    }//GEN-LAST:event_companyActionPerformed

    private void customerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerActionPerformed
        // TODO add your handling code here:
        new customer().setVisible(true);
    }//GEN-LAST:event_customerActionPerformed

    private void employeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeActionPerformed
        // TODO add your handling code here:
        new employee().setVisible(true);
    }//GEN-LAST:event_employeeActionPerformed

    private void salesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesActionPerformed
        // TODO add your handling code here:
        new Sales().setVisible(true);
    }//GEN-LAST:event_salesActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        int a=JOptionPane.showConfirmDialog(null,"Do you really want to logout?","Select",JOptionPane.YES_NO_OPTION);
        if (a==0)
        {
            setVisible(false);
            new LoginPage().setVisible(true);
                            
        }
            
        
               
                    
                
    }//GEN-LAST:event_logoutActionPerformed

    private void hideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideMouseClicked
        // TODO add your handling code here:
        if (z==0)
        {
            try{
                Thread.sleep(250);
                employee.setVisible(true);
                jLabel1.setVisible(true);
            }
            catch(Exception e)
            {}
        }
            
            else
        {
            employee.setVisible(false);
       company.setVisible(false);
       medicine.setVisible(false);
       customer.setVisible(false);
       sales.setVisible(false);
       logout.setVisible(false);
       close.setVisible(false);
       jLabel1.setVisible(false);
       jLabel2.setVisible(false);
       jLabel3.setVisible(false);
       jLabel4.setVisible(false);
       jLabel5.setVisible(false);
       jLabel6.setVisible(false);
       jLabel7.setVisible(false);
       z=0;
        }
        
    }//GEN-LAST:event_hideMouseClicked

    private void employeeComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_employeeComponentShown
        // TODO add your handling code here:
        try{
                Thread.sleep(250);
                company.setVisible(true);
                jLabel1.setVisible(true);
            }
            catch(Exception e)
            {}
    }//GEN-LAST:event_employeeComponentShown

    private void companyComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_companyComponentShown
        // TODO add your handling code here:
        try{
                Thread.sleep(250);
                medicine.setVisible(true);
                jLabel2.setVisible(true);
            }
            catch(Exception e)
            {}
    }//GEN-LAST:event_companyComponentShown

    private void medicineComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_medicineComponentShown
        // TODO add your handling code here:
        try{
                Thread.sleep(250);
                customer.setVisible(true);
                jLabel3.setVisible(true);
            }
            catch(Exception e)
            {}
    }//GEN-LAST:event_medicineComponentShown

    private void customerComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_customerComponentShown
        // TODO add your handling code here:
        try{
                Thread.sleep(250);
                sales.setVisible(true);
                jLabel4.setVisible(true);
            }
            catch(Exception e)
            {}
    }//GEN-LAST:event_customerComponentShown

    private void salesComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_salesComponentShown
        // TODO add your handling code here:
        try{
                Thread.sleep(250);
                logout.setVisible(true);
                jLabel5.setVisible(true);
            }
            catch(Exception e)
            {}
    }//GEN-LAST:event_salesComponentShown

    private void logoutComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_logoutComponentShown
        // TODO add your handling code here:
        try{
                Thread.sleep(250);
                close.setVisible(true);
                jLabel6.setVisible(true);
                z=1;
            }
            catch(Exception e)
            {}
    }//GEN-LAST:event_logoutComponentShown

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        // TODO add your handling code here:
        int a=JOptionPane.showConfirmDialog(null,"Do you really want to close this application?","Select",JOptionPane.YES_NO_OPTION);
        if (a==0)
        {
            System.exit(0);
                            
        }
    }//GEN-LAST:event_closeActionPerformed

    private void closeComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_closeComponentShown
        // TODO add your handling code here:
        try{
                Thread.sleep(250);
                close.setVisible(true);
                jLabel7.setVisible(true);
                z=1;
            }
            catch(InterruptedException e)
            {}
        
    }//GEN-LAST:event_closeComponentShown

    private void medicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicineActionPerformed
        // TODO add your handling code here:
        new medicine().setVisible(true);
    }//GEN-LAST:event_medicineActionPerformed

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new HomePage().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton close;
    private javax.swing.JButton company;
    private javax.swing.JButton customer;
    private javax.swing.JButton employee;
    private javax.swing.JButton hide;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton logout;
    private javax.swing.JButton medicine;
    private javax.swing.JButton sales;
    // End of variables declaration//GEN-END:variables
}
