
package sports;

import javax.swing.JOptionPane;

public class MAIN extends javax.swing.JFrame {


    public MAIN() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        CRIC = new javax.swing.JButton();
        FOOTBALL = new javax.swing.JButton();
        BOX = new javax.swing.JButton();
        KABADDI = new javax.swing.JButton();
        LOGOUT = new javax.swing.JButton();
        EVENT = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));
        jPanel1.setForeground(new java.awt.Color(102, 255, 153));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 204));
        jLabel2.setText("Sports Mangement Sysytem");

        CRIC.setBackground(new java.awt.Color(255, 255, 255));
        CRIC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CRIC.setForeground(new java.awt.Color(0, 51, 255));
        CRIC.setText("CRICKET");
        CRIC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CRICActionPerformed(evt);
            }
        });

        FOOTBALL.setBackground(new java.awt.Color(204, 204, 204));
        FOOTBALL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        FOOTBALL.setForeground(new java.awt.Color(0, 51, 255));
        FOOTBALL.setText("FOOTBALL");
        FOOTBALL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FOOTBALLActionPerformed(evt);
            }
        });

        BOX.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BOX.setForeground(new java.awt.Color(0, 51, 255));
        BOX.setText("BOXING");
        BOX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOXActionPerformed(evt);
            }
        });

        KABADDI.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        KABADDI.setForeground(new java.awt.Color(0, 51, 255));
        KABADDI.setText("KABADDI");
        KABADDI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KABADDIActionPerformed(evt);
            }
        });

        LOGOUT.setBackground(new java.awt.Color(255, 102, 102));
        LOGOUT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LOGOUT.setForeground(new java.awt.Color(204, 0, 51));
        LOGOUT.setText("SIGNOUT");
        LOGOUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGOUTActionPerformed(evt);
            }
        });

        EVENT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EVENT.setForeground(new java.awt.Color(0, 51, 255));
        EVENT.setText("EVENTS");
        EVENT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EVENTActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dhananjay\\Documents\\NetBeansProjects\\proj tp\\src\\sports\\avtar.png")); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(63, 63, 63)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LOGOUT, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(395, 395, 395)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EVENT, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FOOTBALL)
                    .addComponent(CRIC, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BOX, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KABADDI, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(374, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LOGOUT, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(CRIC, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(FOOTBALL, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(BOX, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(KABADDI, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(EVENT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EVENTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EVENTActionPerformed

        EVENT ev=new EVENT();//create object of class.
            
        ev.setVisible(true);//show class frame.
        
    }//GEN-LAST:event_EVENTActionPerformed

    private void LOGOUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGOUTActionPerformed
        dispose();//dispose is distroy or exit the page.
        JOptionPane.showMessageDialog(null,"Sign out Sucessful");//after exit the page show this message.
    }//GEN-LAST:event_LOGOUTActionPerformed

    private void KABADDIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KABADDIActionPerformed
       Kabbd kb=new Kabbd();// create object of a class.
        
        kb.setVisible(true);//show kabbd class frame.
       
    }//GEN-LAST:event_KABADDIActionPerformed

    private void BOXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOXActionPerformed
         Box BX=new Box();
        setVisible(true);
        BX.setVisible(true);
    }//GEN-LAST:event_BOXActionPerformed

    private void FOOTBALLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FOOTBALLActionPerformed
        Foot_ball FB=new Foot_ball();
        setVisible(true);
        FB.setVisible(true);
    }//GEN-LAST:event_FOOTBALLActionPerformed

    private void CRICActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CRICActionPerformed
        // TODO add your handling code here:
        CRICKET CR=new CRICKET();
        setVisible(true);
        CR.setVisible(true);

    }//GEN-LAST:event_CRICActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MAIN().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BOX;
    private javax.swing.JButton CRIC;
    private javax.swing.JButton EVENT;
    private javax.swing.JButton FOOTBALL;
    private javax.swing.JButton KABADDI;
    private javax.swing.JButton LOGOUT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
