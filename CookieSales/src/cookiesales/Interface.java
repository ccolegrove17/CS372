/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cookiesales;

/**
 * This interface lets the user type in how many boxes of cookies they bought
 * then shows how many boxes were sold and how much money was earned.
 * @author ccolegrove17
 */
public class Interface extends javax.swing.JFrame {

    CookieSales cookies = new CookieSales();

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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        thinmints = new javax.swing.JTextField();
        samoas = new javax.swing.JTextField();
        chocolatechips = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        totalsales = new javax.swing.JLabel();
        chocolatechipsales = new javax.swing.JLabel();
        samoassales = new javax.swing.JLabel();
        thinmintsales = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Thin Mints ($3):");

        jLabel2.setText("Samoas ($4):");

        jLabel3.setText("Chocolate Chip ($5):");

        thinmints.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                thinmintsKeyPressed(evt);
            }
        });

        samoas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                samoasKeyPressed(evt);
            }
        });

        chocolatechips.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                chocolatechipsKeyPressed(evt);
            }
        });

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Sales:");

        jLabel5.setText("Thin Mints:");

        jLabel6.setText("Samoas:");

        jLabel7.setText("Chocolate Chip:");

        jLabel8.setText("Total:");

        totalsales.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        totalsales.setText("$0 of sales from 0 boxes.");
        totalsales.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        chocolatechipsales.setText("$0 of sales from 0 boxes.");

        samoassales.setText("$0 of sales from 0 boxes.");

        thinmintsales.setText("$0 of sales from 0 boxes.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(samoas)
                            .addComponent(thinmints)
                            .addComponent(chocolatechips, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(totalsales, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                        .addComponent(chocolatechipsales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(samoassales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(thinmintsales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(thinmints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(samoas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(chocolatechips, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(thinmintsales))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(samoassales))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(chocolatechipsales))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(totalsales))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int c; //I don't want the declaration to be conditional
        String f; //I don't want the declaration to be conditional
        if (!thinmints.getText().equals("")) { //makes sure there is text in the box
            c = Integer.parseInt(thinmints.getText()); //converts the text to an integer
            cookies.addThinMints(c); //adds a certain number of thin mints
            if (cookies.thinMintsNumber == 1) { //if only 1 box has been sold
                f = String.format("$%d of sales from %d box.", (int) cookies.thinMints, (int) cookies.thinMintsNumber);
            } else { //if not one box has been sold
                f = String.format("$%d of sales from %d boxes.", (int) cookies.thinMints, (int) cookies.thinMintsNumber);
            }
            thinmintsales.setText(f); //change the label to display the sales
        }
        if (!samoas.getText().equals("")) { //this is the same code as above but with the samoas
            c = Integer.parseInt(samoas.getText());
            cookies.addSamoas(c);
            if (cookies.samoasNumber == 1) {
                f = String.format("$%d of sales from %d box.", (int) cookies.samoas, (int) cookies.samoasNumber);
            } else {
                f = String.format("$%d of sales from %d boxes.", (int) cookies.samoas, (int) cookies.samoasNumber);
            }
            samoassales.setText(f);
        }
        if (!chocolatechips.getText().equals("")) { //this is the same code as above but the the chocolate chip
            c = Integer.parseInt(chocolatechips.getText());
            cookies.addChocolateChip(c);
            if (cookies.chocolateChipNumber == 1) {
                f = String.format("$%d of sales from %d box.", (int) cookies.chocolateChip, (int) cookies.chocolateChipNumber);
            } else {
                f = String.format("$%d of sales from %d boxes.", (int) cookies.chocolateChip, (int) cookies.chocolateChipNumber);
            }
            chocolatechipsales.setText(f);
        }
        if (cookies.thinMintsNumber + cookies.samoasNumber + cookies.chocolateChipNumber == 1) { //checks if only 1 box has been sold
            f = String.format("$%d of sales from %d box.", (int) cookies.thinMints + cookies.samoas + cookies.chocolateChip,
                    (int) cookies.thinMintsNumber + cookies.samoasNumber + cookies.chocolateChipNumber);
        } else { //if not 1 box has been sold
            f = String.format("$%d of sales from %d boxes.", (int) cookies.thinMints + cookies.samoas + cookies.chocolateChip,
                    (int) cookies.thinMintsNumber + cookies.samoasNumber + cookies.chocolateChipNumber);
        }
        totalsales.setText(f);//set the total label to the total sales
    }//GEN-LAST:event_jButton1ActionPerformed

    private void thinmintsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_thinmintsKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) { //checks if the user presses enter in the text field
            jButton1.doClick();//clicks the button
        }
    }//GEN-LAST:event_thinmintsKeyPressed

    private void samoasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_samoasKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) { //same code as above but for samoas
            jButton1.doClick();
        }
    }//GEN-LAST:event_samoasKeyPressed

    private void chocolatechipsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_chocolatechipsKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) { //same code as above but for chocolate chips
            jButton1.doClick();
        }
    }//GEN-LAST:event_chocolatechipsKeyPressed

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
    private javax.swing.JTextField chocolatechips;
    private javax.swing.JLabel chocolatechipsales;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField samoas;
    private javax.swing.JLabel samoassales;
    private javax.swing.JTextField thinmints;
    private javax.swing.JLabel thinmintsales;
    private javax.swing.JLabel totalsales;
    // End of variables declaration//GEN-END:variables
}
