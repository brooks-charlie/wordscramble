/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package citbyui.cit260.wordscramble.frames;

import javax.swing.JTextField;
import wordscramble.WordScramble;

/**
 *
 * @author charliebrooks
 */
public class PlayerName extends javax.swing.JFrame {
    public static String playerName;

    /**
     * Creates new form PlayerName
     */
    public PlayerName() {
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

        jpBody = new javax.swing.JPanel();
        jpMenuItems = new javax.swing.JPanel();
        jokButton = new javax.swing.JButton();
        jplayerName = new javax.swing.JTextField();
        jlTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpBody.setBackground(new java.awt.Color(255, 255, 204));
        jpBody.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 255, 153), 3));

        jpMenuItems.setBackground(new java.awt.Color(255, 255, 204));
        jpMenuItems.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 255, 153), 2));

        jokButton.setText("OK");
        jokButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jokButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpMenuItemsLayout = new javax.swing.GroupLayout(jpMenuItems);
        jpMenuItems.setLayout(jpMenuItemsLayout);
        jpMenuItemsLayout.setHorizontalGroup(
            jpMenuItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuItemsLayout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(jokButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpMenuItemsLayout.setVerticalGroup(
            jpMenuItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMenuItemsLayout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jokButton))
        );

        jplayerName.setToolTipText("Enter your name here.");
        jplayerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jplayerNameActionPerformed(evt);
            }
        });

        jlTitle.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        jlTitle.setText("Please enter your name?");
        jlTitle.setToolTipText("");

        javax.swing.GroupLayout jpBodyLayout = new javax.swing.GroupLayout(jpBody);
        jpBody.setLayout(jpBodyLayout);
        jpBodyLayout.setHorizontalGroup(
            jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBodyLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jlTitle)
                .addContainerGap(122, Short.MAX_VALUE))
            .addGroup(jpBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jplayerName)
                    .addComponent(jpMenuItems, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpBodyLayout.setVerticalGroup(
            jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jplayerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpMenuItems, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jokButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jokButtonActionPerformed
        // TODO add your handling code here:
        
        
         playerName=this.jplayerName.getText();
         java.awt.EventQueue.invokeLater(new Runnable(){
                public void run() {
                   WordScramble.mainFrame = new MainFrame();
                   WordScramble.mainFrame.setVisible(true);
                }
            });
        this.dispose();
    }//GEN-LAST:event_jokButtonActionPerformed

    private void jplayerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jplayerNameActionPerformed
        // TODO add your handling code here:
        playerName=this.jplayerName.getText();
         java.awt.EventQueue.invokeLater(new Runnable(){
                public void run() {
                   WordScramble.mainFrame = new MainFrame();
                   WordScramble.mainFrame.setVisible(true);
                }
            });
        this.dispose();
    }//GEN-LAST:event_jplayerNameActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jlTitle;
    private javax.swing.JButton jokButton;
    private javax.swing.JPanel jpBody;
    private javax.swing.JPanel jpMenuItems;
    private javax.swing.JTextField jplayerName;
    // End of variables declaration//GEN-END:variables
}
