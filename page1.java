/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author subbo
 */
public class page1 extends javax.swing.JFrame {

    /**
     * Creates new form page1
     */
    public page1() {
        
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        cb002 = new javax.swing.JCheckBox();
        cb001 = new javax.swing.JCheckBox();
        cb003 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        rb1 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        cb1 = new javax.swing.JCheckBox();
        cb3 = new javax.swing.JCheckBox();
        cb2 = new javax.swing.JCheckBox();
        cb5 = new javax.swing.JCheckBox();
        cb4 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        rb3 = new javax.swing.JRadioButton();
        rb4 = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        cb01 = new javax.swing.JCheckBox();
        cb03 = new javax.swing.JCheckBox();
        cb02 = new javax.swing.JCheckBox();
        cb04 = new javax.swing.JCheckBox();
        jPanel7 = new javax.swing.JPanel();
        rb5 = new javax.swing.JRadioButton();
        rb6 = new javax.swing.JRadioButton();
        jPanel8 = new javax.swing.JPanel();
        tf1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Choose Truely!"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cb002.setText("travelled in last 21 days");
        cb002.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb002ActionPerformed(evt);
            }
        });
        jPanel2.add(cb002, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        cb001.setText("travelled to any area with COVID");
        jPanel2.add(cb001, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        cb003.setText("Met any COVID patient,or someone in contact with patient");
        cb003.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb003ActionPerformed(evt);
            }
        });
        jPanel2.add(cb003, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 213, 400, 80));

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton1.setText("Calculate score");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton2.setText("Proceed");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 431, 150, 30));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Above your Chest!", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        buttonGroup1.add(rb1);
        rb1.setText("Yes");
        rb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rb2);
        rb2.setText("No");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rb2)
                    .addComponent(rb1))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rb1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rb2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, -1));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Problem"));

        cb1.setText("Cough prevails");

        cb3.setText("sore throat");
        cb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb3ActionPerformed(evt);
            }
        });

        cb2.setText("headaches");

        cb5.setText("difficulty breathing");

        cb4.setText("fever(even mild...in last 15 days)");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb1)
                    .addComponent(cb2))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(cb4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(cb3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(cb5)
                        .addGap(35, 35, 35))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb1)
                    .addComponent(cb3)
                    .addComponent(cb5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb2)
                    .addComponent(cb4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 400, 90));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Choose Yes if you have any of the attributes \nmatching to you or your body which are \nmentioned alongside!!\nPlease Choose Truely.. Don't Panic and select \nthe boxes only if it is true!");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 380, -1));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "All about your Body!", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        buttonGroup2.add(rb3);
        rb3.setText("Yes");

        buttonGroup2.add(rb4);
        rb4.setText("No");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rb3)
                    .addComponent(rb4))
                .addGap(0, 95, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(rb3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rb4)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 150, 80));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Problems"));

        cb01.setText("severe chills and cold");

        cb03.setText("fatigue and dizziness");

        cb02.setText("body aches and/or rashes");

        cb04.setText("Diarrhea prevails");
        cb04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb04ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb01)
                    .addComponent(cb02))
                .addGap(26, 26, 26)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb03)
                    .addComponent(cb04))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb01)
                    .addComponent(cb03))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb02)
                    .addComponent(cb04))
                .addGap(0, 18, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 400, 90));

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "COVID-Connection", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        buttonGroup3.add(rb5);
        rb5.setText("Yes");

        buttonGroup3.add(rb6);
        rb6.setText("No");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rb5)
                    .addComponent(rb6))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rb5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rb6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 150, 80));

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Your Score is:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, 180, 70));

        jLabel1.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        jLabel1.setText("REMEMBER YOUR SCORE TO COMPARE WITH THE CHART IN THE NEXT PAGE AND TAKE ACTION ACCORDINGLY!");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 610, -1));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -6, 670, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    new page1().setVisible(false);
    new page1().dispose();
        String dis = null;
    new page2(dis).setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
int scr = 0;
int scr1 = 0;
int scr2 = 0;
int finscr;
        
if(rb1.isSelected())
{
    if(cb1.isSelected()|| cb2.isSelected()|| cb3.isSelected()||cb4.isSelected()||cb5.isSelected())
    {
        scr = 1;
    }
    if((cb1.isSelected() && cb2.isSelected())
            || (cb1.isSelected()&&cb3.isSelected())
            || (cb1.isSelected()&&cb4.isSelected())
            || (cb1.isSelected()&&cb5.isSelected())
            || (cb2.isSelected()&&cb3.isSelected())
            || (cb2.isSelected()&&cb4.isSelected())
            || (cb2.isSelected()&&cb5.isSelected())
            || (cb3.isSelected()&&cb4.isSelected())
            || (cb3.isSelected()&&cb5.isSelected())
            || (cb4.isSelected()&&cb5.isSelected()))
    {
        scr = 2;
    }
     if( (cb1.isSelected()&&cb2.isSelected()&&cb3.isSelected())
            || (cb1.isSelected()&&cb2.isSelected()&&cb4.isSelected())
            ||(cb1.isSelected()&&cb2.isSelected()&&cb5.isSelected())
            ||(cb1.isSelected()&&cb3.isSelected()&&cb4.isSelected())
            ||(cb1.isSelected()&&cb3.isSelected()&&cb5.isSelected())
            || (cb1.isSelected()&&cb4.isSelected()&&cb5.isSelected())
            || (cb2.isSelected()&&cb3.isSelected()&&cb4.isSelected())
            || (cb2.isSelected()&&cb3.isSelected()&&cb5.isSelected())
            || (cb3.isSelected()&&cb4.isSelected()&&cb5.isSelected()))
     {
        scr = 3;
     }
     if( (cb1.isSelected()&&cb2.isSelected()&&cb3.isSelected()&&cb4.isSelected())
            ||(cb1.isSelected()&&cb2.isSelected()&&cb3.isSelected()&&cb5.isSelected())
            ||(cb1.isSelected()&&cb2.isSelected()&&cb4.isSelected()&&cb5.isSelected())
            ||(cb1.isSelected()&&cb3.isSelected()&&cb4.isSelected()&&cb5.isSelected())
            || (cb2.isSelected()&&cb3.isSelected()&&cb4.isSelected()&&cb5.isSelected()))
     {
        scr = 4;
     }
     if(cb1.isSelected()&&cb2.isSelected()&&cb3.isSelected()&&cb4.isSelected()&&cb5.isSelected())
    {
        scr = 5;
    }

}
if(rb2.isSelected())
    scr = 0;



if(rb3.isSelected())
{
    if(cb01.isSelected()||cb02.isSelected()||cb03.isSelected()||cb04.isSelected())
    {
        scr1 = 1;
    }
    if((cb01.isSelected()&&cb02.isSelected())
            || (cb01.isSelected()&&cb03.isSelected())
            || (cb01.isSelected()&&cb04.isSelected())
            ||(cb02.isSelected()&&cb03.isSelected())
            || (cb02.isSelected()&&cb04.isSelected())
            || (cb03.isSelected()&&cb04.isSelected()))
    {
        scr1 = 2;
    }
     if( (cb01.isSelected()&&cb02.isSelected()&&cb03.isSelected())
            || (cb01.isSelected()&&cb02.isSelected()&&cb04.isSelected())
            || (cb01.isSelected()&&cb03.isSelected()&&cb04.isSelected())
            || (cb02.isSelected()&&cb03.isSelected()&&cb04.isSelected()))
     {
        scr1 = 3;
     }
     if(cb01.isSelected() && cb02.isSelected() && cb03.isSelected() && cb04.isSelected())
     {
        scr1 = 4;
     }
}
if(rb4.isSelected())
{
    scr1 = 0;
}

if(rb5.isSelected())
{
 
    if(cb001.isSelected()||cb002.isSelected()||cb003.isSelected())
    {
        scr2 = 3;
    }
     if( (cb001.isSelected()&&cb002.isSelected())
            || (cb001.isSelected()&&cb003.isSelected())
            || (cb002.isSelected()&&cb003.isSelected()))
         
    {
        scr2 = 6;
    }
     if(cb001.isSelected()&&cb002.isSelected()&&cb003.isSelected())
     {
        scr2 = 9;
     }
}

if(rb6.isSelected())
{
    scr2 = 0;
}


finscr = scr+scr1+scr2;
tf1.setText(" "+finscr);

// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb3ActionPerformed

    private void cb04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb04ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb04ActionPerformed

    private void rb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb1ActionPerformed

    private void cb003ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb003ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb003ActionPerformed

    private void cb002ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb002ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb002ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(page1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new page1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JCheckBox cb001;
    private javax.swing.JCheckBox cb002;
    private javax.swing.JCheckBox cb003;
    private javax.swing.JCheckBox cb01;
    private javax.swing.JCheckBox cb02;
    private javax.swing.JCheckBox cb03;
    private javax.swing.JCheckBox cb04;
    private javax.swing.JCheckBox cb1;
    private javax.swing.JCheckBox cb2;
    private javax.swing.JCheckBox cb3;
    private javax.swing.JCheckBox cb4;
    private javax.swing.JCheckBox cb5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JRadioButton rb3;
    private javax.swing.JRadioButton rb4;
    private javax.swing.JRadioButton rb5;
    private javax.swing.JRadioButton rb6;
    private javax.swing.JTextField tf1;
    // End of variables declaration//GEN-END:variables
}
