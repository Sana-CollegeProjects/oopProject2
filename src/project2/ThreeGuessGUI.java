/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

/**
 *
 * @author x15007707
 */
public class ThreeGuessGUI extends javax.swing.JFrame {

    private int lottoNum[];
    private int userGuess1[];
    private int userGuess2[];
    private int userGuess3[];
    private int winNum1;
    private int winNum2;
    private int winNum3;

    /**
     * Creates new form ThreeGuessGUI
     */
    public ThreeGuessGUI() {
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

        resultsLbl2 = new javax.swing.JLabel();
        resultsLbl1 = new javax.swing.JLabel();
        titleLbl = new javax.swing.JLabel();
        guess1Lbl = new javax.swing.JLabel();
        guess3Lbl = new javax.swing.JLabel();
        guess2Lbl1 = new javax.swing.JLabel();
        userGuess1Txt = new javax.swing.JTextField();
        userGuess3Txt = new javax.swing.JTextField();
        userGuess2Txt = new javax.swing.JTextField();
        submitBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        subtitleLbl = new javax.swing.JLabel();
        otherGamesFrame = new javax.swing.JInternalFrame();
        otherGamesLbl = new javax.swing.JLabel();
        oneTrialBtn = new javax.swing.JButton();
        twoTrialBtn = new javax.swing.JButton();
        danyGameLbl = new javax.swing.JLabel();
        danyGameBtn = new javax.swing.JButton();
        backgroundLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 700));
        getContentPane().setLayout(null);

        resultsLbl2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        resultsLbl2.setForeground(new java.awt.Color(255, 204, 204));
        getContentPane().add(resultsLbl2);
        resultsLbl2.setBounds(80, 660, 600, 22);

        resultsLbl1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        resultsLbl1.setForeground(new java.awt.Color(255, 204, 204));
        resultsLbl1.setText("  ");
        getContentPane().add(resultsLbl1);
        resultsLbl1.setBounds(110, 630, 570, 22);

        titleLbl.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(255, 255, 204));
        titleLbl.setText("Please enter your two guesses!");
        getContentPane().add(titleLbl);
        titleLbl.setBounds(153, 85, 358, 30);

        guess1Lbl.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        guess1Lbl.setForeground(new java.awt.Color(255, 255, 204));
        guess1Lbl.setText("Guess 1");
        getContentPane().add(guess1Lbl);
        guess1Lbl.setBounds(75, 170, 92, 30);

        guess3Lbl.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        guess3Lbl.setForeground(new java.awt.Color(255, 255, 204));
        guess3Lbl.setText("Guess 3");
        getContentPane().add(guess3Lbl);
        guess3Lbl.setBounds(80, 360, 92, 30);

        guess2Lbl1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        guess2Lbl1.setForeground(new java.awt.Color(255, 255, 204));
        guess2Lbl1.setText("Guess 2");
        getContentPane().add(guess2Lbl1);
        guess2Lbl1.setBounds(75, 264, 92, 30);

        userGuess1Txt.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        userGuess1Txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userGuess1TxtActionPerformed(evt);
            }
        });
        getContentPane().add(userGuess1Txt);
        userGuess1Txt.setBounds(75, 206, 324, 40);

        userGuess3Txt.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        getContentPane().add(userGuess3Txt);
        userGuess3Txt.setBounds(80, 390, 324, 40);

        userGuess2Txt.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        getContentPane().add(userGuess2Txt);
        userGuess2Txt.setBounds(75, 300, 324, 40);

        submitBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(submitBtn);
        submitBtn.setBounds(100, 520, 116, 37);

        resetBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });
        getContentPane().add(resetBtn);
        resetBtn.setBounds(240, 520, 104, 37);

        subtitleLbl.setText("Please ensure that they are between 1 and 40 and are separated by commas");
        getContentPane().add(subtitleLbl);
        subtitleLbl.setBounds(150, 110, 474, 16);

        otherGamesFrame.setVisible(true);
        otherGamesFrame.getContentPane().setLayout(null);

        otherGamesLbl.setText("You may also try the games with :");
        otherGamesFrame.getContentPane().add(otherGamesLbl);
        otherGamesLbl.setBounds(32, 11, 213, 16);

        oneTrialBtn.setText("1 Trial");
        oneTrialBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneTrialBtnActionPerformed(evt);
            }
        });
        otherGamesFrame.getContentPane().add(oneTrialBtn);
        oneTrialBtn.setBounds(88, 58, 84, 29);

        twoTrialBtn.setText("2 Trials");
        twoTrialBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoTrialBtnActionPerformed(evt);
            }
        });
        otherGamesFrame.getContentPane().add(twoTrialBtn);
        twoTrialBtn.setBounds(88, 92, 91, 29);

        danyGameLbl.setText("Or alternatively,");
        otherGamesFrame.getContentPane().add(danyGameLbl);
        danyGameLbl.setBounds(32, 160, 100, 16);

        danyGameBtn.setText("Lotto, Plus 1 and Plus 2 Game");
        danyGameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                danyGameBtnActionPerformed(evt);
            }
        });
        otherGamesFrame.getContentPane().add(danyGameBtn);
        danyGameBtn.setBounds(20, 192, 231, 29);

        getContentPane().add(otherGamesFrame);
        otherGamesFrame.setBounds(410, 180, 280, 319);

        backgroundLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2/Images/background.jpg"))); // NOI18N
        getContentPane().add(backgroundLbl);
        backgroundLbl.setBounds(0, 0, 700, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userGuess1TxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userGuess1TxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userGuess1TxtActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:
        winNum1=0;
        winNum2=0;
        winNum3=0;
        
        lottoNum = new int[5];
        for (int i = 0; i < 5; i++) {
            lottoNum[i] = (int) (Math.random() * 40 + 1);
            System.out.println("lotto num are:" + lottoNum[i]);
        }
        String[] tokens = userGuess1Txt.getText().split(",");
        userGuess1 = new int[5];
        for (int i = 0; i < 5; i++) {
            userGuess1[i] = Integer.parseInt(tokens[i]);
        }

        String[] tokens2 = userGuess2Txt.getText().split(",");
        userGuess2 = new int[5];
        for (int i = 0; i < 5; i++) {
            userGuess2[i] = Integer.parseInt(tokens2[i]);
        }
        
        String[] tokens3 = userGuess3Txt.getText().split(",");
        userGuess3 = new int[5];
        for (int i = 0; i < 5; i++) {
            userGuess3[i] = Integer.parseInt(tokens3[i]);
        }

        //userGuess = Arrays.stream(userGuess1Txt.getText().split(",")).mapToInt(Integer::parseInt).toArray();
        //userGuess1 = Arrays.stream(userGuess2Txt.getText().split(",")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < 5; i++) {
            if (lottoNum[i] == userGuess1[0] || lottoNum[i] == userGuess1[1] || lottoNum[i] == userGuess1[2] || lottoNum[i] == userGuess1[3] || lottoNum[i] == userGuess1[4]) {
                winNum1++;
            }
        }
        for (int j = 0; j < 5; j++) {
            if (lottoNum[j] == userGuess2[0] || lottoNum[j] == userGuess2[1] || lottoNum[j] == userGuess2[2] || lottoNum[j] == userGuess2[3] || lottoNum[j] == userGuess2[4]) {
                winNum2++;
            }
        }
        
        for (int j = 0; j < 5; j++) {
            if (lottoNum[j] == userGuess3[0] || lottoNum[j] == userGuess3[1] || lottoNum[j] == userGuess3[2] || lottoNum[j] == userGuess3[3] || lottoNum[j] == userGuess3[4]) {
                winNum3++;
            }
        }

        resultsLbl1.setText("You've got "+winNum1+" right guesses in line 1");
        resultsLbl2.setText(winNum2+" in line 2."+" and "+winNum3+" in line 3");
    }//GEN-LAST:event_submitBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        // TODO add your handling code here:
        winNum1 = 0;
        winNum2 = 0;
        winNum3 = 0;
        resultsLbl1.setText(" ");
        userGuess1Txt.setText("");
        userGuess3Txt.setText("");
        userGuess2Txt.setText("");
    }//GEN-LAST:event_resetBtnActionPerformed

    private void oneTrialBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneTrialBtnActionPerformed
        // TODO add your handling code here:
        OneGuessGUI myGuess = new OneGuessGUI();
        myGuess.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_oneTrialBtnActionPerformed

    private void twoTrialBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoTrialBtnActionPerformed
        // TODO add your handling code here:
        TwoGuessGUI myGuess = new TwoGuessGUI();
        myGuess.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_twoTrialBtnActionPerformed

    private void danyGameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_danyGameBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_danyGameBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ThreeGuessGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThreeGuessGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThreeGuessGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThreeGuessGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThreeGuessGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundLbl;
    private javax.swing.JButton danyGameBtn;
    private javax.swing.JLabel danyGameLbl;
    private javax.swing.JLabel guess1Lbl;
    private javax.swing.JLabel guess2Lbl1;
    private javax.swing.JLabel guess3Lbl;
    private javax.swing.JButton oneTrialBtn;
    private javax.swing.JInternalFrame otherGamesFrame;
    private javax.swing.JLabel otherGamesLbl;
    private javax.swing.JButton resetBtn;
    private javax.swing.JLabel resultsLbl1;
    private javax.swing.JLabel resultsLbl2;
    private javax.swing.JButton submitBtn;
    private javax.swing.JLabel subtitleLbl;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JButton twoTrialBtn;
    private javax.swing.JTextField userGuess1Txt;
    private javax.swing.JTextField userGuess2Txt;
    private javax.swing.JTextField userGuess3Txt;
    // End of variables declaration//GEN-END:variables
}
