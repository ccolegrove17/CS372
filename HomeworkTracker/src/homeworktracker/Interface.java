/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworktracker;

import java.util.*;

/**
 *
 * @author ccolegrove17
 */
public class Interface extends javax.swing.JFrame {
    

    List<Double> list = new ArrayList<Double>();
    HomeworkTracker homework = new HomeworkTracker();

    /**
     * Creates new form Interface
     */
    public Interface() {
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
        score = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        min = new javax.swing.JLabel();
        max = new javax.swing.JLabel();
        average = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        scoreArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Homework Tracker");

        jLabel1.setText("Score:");

        score.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scoreActionPerformed(evt);
            }
        });
        score.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                scoreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                scoreKeyTyped(evt);
            }
        });

        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        min.setText("Min: ");

        max.setText("Max:");

        average.setText("Average:");

        scoreArea.setEditable(false);
        scoreArea.setColumns(10);
        scoreArea.setFont(scoreArea.getFont());
        scoreArea.setRows(5);
        scoreArea.setText("Score History:\n");
        jScrollPane2.setViewportView(scoreArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(9, 9, 9)
                        .addComponent(score, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(submit))
                    .addComponent(min)
                    .addComponent(max)
                    .addComponent(average)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(score, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submit))
                .addGap(17, 17, 17)
                .addComponent(min)
                .addGap(16, 16, 16)
                .addComponent(max)
                .addGap(16, 16, 16)
                .addComponent(average)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void scoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scoreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_scoreActionPerformed

    /**
     *
     * @param evt When submit is pressed Takes the value from the textbox and
     * adds it to a List calculates the min, max, and average of the list and
     * displays it
     */

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        if (!score.getText().equals("")){
        double c = Double.parseDouble(score.getText());//reads from the textfield
        list.add(c);//adds the score to the List
        String f = String.format("Max: %.1f", homework.findMax(list));//calculates the max of the List
        max.setText(f);//displays the max onto the label
        String g = String.format("Min: %.1f", homework.findMin(list));//calculates the min of the List
        min.setText(g);//displays the min on the label
        String h = String.format("Average: %.1f", homework.findAverage(list));//calculates the average of the List
        average.setText(h);//displays the average on the label
        score.setText("");//resets the textbox
        h = String.format("%.1f\n", c);
        scoreArea.append(h);
        }
    }//GEN-LAST:event_submitActionPerformed

    private void scoreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_scoreKeyPressed

        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            submit.doClick();
        }
    }//GEN-LAST:event_scoreKeyPressed

    private void scoreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_scoreKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_scoreKeyTyped

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
                    javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel average;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel max;
    private javax.swing.JLabel min;
    private javax.swing.JTextField score;
    private javax.swing.JTextArea scoreArea;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
