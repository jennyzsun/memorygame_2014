/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package memorygame;

    //import packages
    import java.awt.Color;
    import java.util.ArrayList;
    import javax.swing.*;
    import javax.swing.JButton; 




/**
 *
 * @author jenny.sun
 */


public class UserInterface extends javax.swing.JFrame {
    String value;
    
    String isMatch;
    
    int counter=0;
 
    //create arraylists for checkflip()
    ArrayList<String> buttons = new ArrayList<String> ();
    ArrayList<JButton> jbuttons = new ArrayList<JButton> ();
   
    /**
     * Creates new form UserInterface
     */
    public UserInterface() {
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

        button00 = new javax.swing.JButton();
        button02 = new javax.swing.JButton();
        button03 = new javax.swing.JButton();
        button01 = new javax.swing.JButton();
        button10 = new javax.swing.JButton();
        button11 = new javax.swing.JButton();
        button12 = new javax.swing.JButton();
        button13 = new javax.swing.JButton();
        button31 = new javax.swing.JButton();
        button21 = new javax.swing.JButton();
        button33 = new javax.swing.JButton();
        button22 = new javax.swing.JButton();
        button32 = new javax.swing.JButton();
        button23 = new javax.swing.JButton();
        button20 = new javax.swing.JButton();
        button30 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        trophy = new javax.swing.JLabel();
        instructions = new javax.swing.JButton();
        quit = new javax.swing.JButton();
        quit1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(624, 352));
        setMinimumSize(new java.awt.Dimension(624, 352));

        button00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button00ActionPerformed(evt);
            }
        });

        button02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button02ActionPerformed(evt);
            }
        });

        button03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button03ActionPerformed(evt);
            }
        });

        button01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button01ActionPerformed(evt);
            }
        });

        button10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button10ActionPerformed(evt);
            }
        });

        button11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button11ActionPerformed(evt);
            }
        });

        button12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button12ActionPerformed(evt);
            }
        });

        button13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button13ActionPerformed(evt);
            }
        });

        button31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button31ActionPerformed(evt);
            }
        });

        button21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button21ActionPerformed(evt);
            }
        });

        button33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button33ActionPerformed(evt);
            }
        });

        button22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button22ActionPerformed(evt);
            }
        });

        button32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button32ActionPerformed(evt);
            }
        });

        button23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button23ActionPerformed(evt);
            }
        });

        button20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button20ActionPerformed(evt);
            }
        });

        button30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button30ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setText("You found 0/8 pairs.");

        trophy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorygame/trophy.jpeg"))); // NOI18N

        instructions.setBackground(new java.awt.Color(204, 255, 255));
        instructions.setFont(new java.awt.Font("Lucida Grande", 2, 12)); // NOI18N
        instructions.setText("Instructions");
        instructions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instructionsActionPerformed(evt);
            }
        });

        quit.setBackground(new java.awt.Color(204, 255, 255));
        quit.setFont(new java.awt.Font("Lucida Grande", 2, 12)); // NOI18N
        quit.setText("Quit");
        quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitActionPerformed(evt);
            }
        });

        quit1.setBackground(new java.awt.Color(204, 255, 255));
        quit1.setFont(new java.awt.Font("Lucida Grande", 2, 12)); // NOI18N
        quit1.setText("Restart");
        quit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quit1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button00, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button10, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button20, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button01, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button11, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button21, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button02, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button12, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button22, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button03, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button13, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button23, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(button30, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(button31, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(button32, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(button33, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(trophy)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(quit1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(quit, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(instructions, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(button00, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(button10, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(button20, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(button01, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(button11, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(button21, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(button02, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(button12, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(button22, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(button03, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(button13, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(button23, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button30, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button31, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button32, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button33, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(instructions, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quit1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(trophy, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        trophy.setVisible(false);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button01ActionPerformed
        // TODO add your handling code here:
        
        //intiate card table by randomly assiging a color to the card
        set.flipCard(0, 1); 
        value = set.myCards[0][1].toString();
        button01.setBackground(color(value));
        
        //check if the card is flip or not
        checkflip();
        buttons.add("button01");
        jbuttons.add(button01);
              
        //if win
        if (set.checkWin()) {
                jLabel1.setText("Yay! You win."); 
                trophy.setVisible(true);
        }
        
        
    }//GEN-LAST:event_button01ActionPerformed

    private void button00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button00ActionPerformed
        set.flipCard(0, 0); 
        value = set.myCards[0][0].toString();
        button00.setBackground(color(value));
        
        checkflip();
        buttons.add("button00");
        jbuttons.add(button00);
        
        if (set.checkWin()) {
                jLabel1.setText("Yay! You win.");
                trophy.setVisible(true);
        }
        
    }//GEN-LAST:event_button00ActionPerformed

    private void button31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button31ActionPerformed
        // TODO add your handling code here:
        set.flipCard(3, 1); 
        value = set.myCards[3][1].toString();
        button31.setBackground(color(value));
        
        checkflip();
        buttons.add("button31");
        jbuttons.add(button31);
        
        if (set.checkWin()) {
                jLabel1.setText("Yay! You win.");
                trophy.setVisible(true);
        }
       
    }//GEN-LAST:event_button31ActionPerformed

    private void button02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button02ActionPerformed
        // TODO add your handling code here:
        set.flipCard(0, 2); 
        value = set.myCards[0][2].toString();
        button02.setBackground(color(value));
        
        checkflip();
        buttons.add("button02");
        jbuttons.add(button02);
        
        if (set.checkWin()) {
                jLabel1.setText("Yay! You win.");
                trophy.setVisible(true);
             
        }
    }//GEN-LAST:event_button02ActionPerformed

    private void button03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button03ActionPerformed
        // TODO add your handling code here:
        set.flipCard(0,3);    
        value = set.myCards[0][3].toString();
        button03.setBackground(color(value));
        
        checkflip();
        buttons.add("button03");
        jbuttons.add(button03);
        
        if (set.checkWin()) {
                jLabel1.setText("Yay! You win.");
                trophy.setVisible(true);
             
        }
    }//GEN-LAST:event_button03ActionPerformed

    private void button10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button10ActionPerformed
        // TODO add your handling code here:
        set.flipCard(1, 0);
        value = set.myCards[1][0].toString();
        button10.setBackground(color(value));
        
        checkflip();
        buttons.add("button10");
        jbuttons.add(button10);
        
        if (set.checkWin()) {
                jLabel1.setText("Yay! You win.");
                trophy.setVisible(true);
             
        }
    }//GEN-LAST:event_button10ActionPerformed

    private void button11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button11ActionPerformed
        // TODO add your handling code here:
        set.flipCard(1, 1);
        value = set.myCards[1][1].toString();
        button11.setBackground(color(value));
        
        checkflip();
        buttons.add("button11");
        jbuttons.add(button11);
        
        if (set.checkWin()) {
                jLabel1.setText("Yay! You win.");
                trophy.setVisible(true);
             
        }
    }//GEN-LAST:event_button11ActionPerformed

    private void button12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button12ActionPerformed
        set.flipCard(1,2); 
        value = set.myCards[1][2].toString();
        button12.setBackground(color(value));
        
        checkflip();
        buttons.add("button12");
        jbuttons.add(button12);
        
        if (set.checkWin()) {
                jLabel1.setText("Yay! You win.");
                trophy.setVisible(true);
             
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_button12ActionPerformed

    private void button13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button13ActionPerformed
        // TODO add your handling code here:
        set.flipCard(1,3);
        value = set.myCards[1][3].toString();
        button13.setBackground(color(value));
        
        checkflip();
        buttons.add("button13");
        jbuttons.add(button13);
        
        if (set.checkWin()) {
                jLabel1.setText("Yay! You win.");
                trophy.setVisible(true);
             
        }
    }//GEN-LAST:event_button13ActionPerformed

    private void button20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button20ActionPerformed
        // TODO add your handling code here:
        set.flipCard(2,0); 
        value = set.myCards[2][0].toString();
        button20.setBackground(color(value));
        
        checkflip();
        buttons.add("button20");
        jbuttons.add(button20);
        
        if (set.checkWin()) {
                jLabel1.setText("Yay! You win.");
                trophy.setVisible(true);
             
        }
    }//GEN-LAST:event_button20ActionPerformed

    private void button21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button21ActionPerformed
        // TODO add your handling code here:
        set.flipCard(2,1); 
        value = set.myCards[2][1].toString();
        button21.setBackground(color(value));
        
        checkflip();
        buttons.add("button21");
        jbuttons.add(button21);
        
        if (set.checkWin()) {
                jLabel1.setText("Yay! You win.");
                 trophy.setVisible(true);
        }   
    }//GEN-LAST:event_button21ActionPerformed

    private void button22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button22ActionPerformed
        // TODO add your handling code here:
        set.flipCard(2,2); 
        value = set.myCards[2][2].toString();
        button22.setBackground(color(value));
        
        checkflip();
        buttons.add("button22");
        jbuttons.add(button22);
        
        if (set.checkWin()) {
                jLabel1.setText("Yay! You win.");
                trophy.setVisible(true);
        }
        // TODO add your handling code here:

    }//GEN-LAST:event_button22ActionPerformed

    private void button23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button23ActionPerformed
        // TODO add your handling code here
        set.flipCard(2,3); 
        value = set.myCards[2][3].toString();
        button23.setBackground(color(value));
        
        checkflip();
        buttons.add("button23");
        jbuttons.add(button23);
        
        if (set.checkWin()) {
                jLabel1.setText("Yay! You win.");
                trophy.setVisible(true);
        }
    }//GEN-LAST:event_button23ActionPerformed

    private void button30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button30ActionPerformed
        // TODO add your handling code here:
        set.flipCard(3,0); 
        value = set.myCards[3][0].toString();
        button30.setBackground(color(value));
        
        checkflip();
        buttons.add("button30");
        jbuttons.add(button30);
        
        if (set.checkWin()) {
                jLabel1.setText("Yay! You win.");
                trophy.setVisible(true);
             
        }
    }//GEN-LAST:event_button30ActionPerformed

    private void button32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button32ActionPerformed
        // TODO add your handling code here:
        
        set.flipCard(3,2); 
        value = set.myCards[3][2].toString();
        button32.setBackground(color(value));
        
        checkflip();
        buttons.add("button32");
        jbuttons.add(button32);
        
        if (set.checkWin()) {
                jLabel1.setText("Yay! You win.");
                trophy.setVisible(true);
        }
    }//GEN-LAST:event_button32ActionPerformed

    private void button33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button33ActionPerformed

        set.flipCard(3,3); 
        value = set.myCards[3][3].toString();
        button33.setBackground(color(value));
        
        checkflip();
        buttons.add("button33");
        jbuttons.add(button33);
        
        if (set.checkWin()) {
                jLabel1.setText("Yay! You win.");
                trophy.setVisible(true);
        }
        
    }//GEN-LAST:event_button33ActionPerformed

    private void instructionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instructionsActionPerformed
        // TODO add your handling code here:
        new instructions().setVisible(true);
    }//GEN-LAST:event_instructionsActionPerformed

    private void quitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_quitActionPerformed

    private void quit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quit1ActionPerformed
        // TODO add your handling code here:
        dispose();
        new UserInterface().setVisible(true);
    }//GEN-LAST:event_quit1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new UserInterface().setVisible(true);
                
            }
        });
    }
    
    CardTable set = new CardTable(4,4);
    //"triangle", "square", "circle","octagon", "trapezoid", "rhombus", "happyface", "sadface",
    
    
    public void setLabelText(String txt){
     jLabel1.setText(txt);
    }
    
    //method: set color for each card
    public Color color(String value){
        Color c = null;
        if (value.equals("triangle")){
            c = Color.blue;
        }
        if (value.equals("square")) {
            c = Color.cyan;
        }
        if (value.equals("circle")) {
            c = Color.red;
        }
        if (value.equals("octagon")) {
            c = Color.green;
        }
        if (value.equals("trapezoid")) {
            c = Color.yellow;
        }
        if (value.equals("rhombus")) {
            c = Color.magenta;
        }
        if (value.equals("happyface")) {
            c = Color.orange;
        }
        
        if (value.equals("sadface")) {
            c = Color.pink;
        }
        return c;
    }
    
    //used for checkflip()
    int x;
    int y;
    
    //method: check to see if card is fliped over
    void checkflip(){
       
        if (buttons.size()==2 && jbuttons.size()==2){
            for (int a=0; a<2; ++a){
                
                String button = buttons.get(a);
                
                //get card position ([x][y])
                x = Character.getNumericValue(button.charAt(button.length()-2));
                y = Character.getNumericValue(button.charAt(button.length()-1));
                
                //if not matched, flip over card back to grey
                if (set.myCards[x][y].toString().equals("x")){
                    jbuttons.get(a).setBackground(Color.lightGray);
                    
                }
                //if matched set card to dark Gray
                else if (set.myCards[x][y].toString().equals("o")){
                    jbuttons.get(a).setBackground(Color.darkGray);
                    jbuttons.get(a).setEnabled(false);
                    counter= counter + 1;
                
                }
            }
            
            //clear the array lists
            buttons.clear();
            jbuttons.clear();
            jLabel1.setText("You found " + counter/2 + "/8 pairs.");
         }
    }
    

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button00;
    private javax.swing.JButton button01;
    private javax.swing.JButton button02;
    private javax.swing.JButton button03;
    private javax.swing.JButton button10;
    private javax.swing.JButton button11;
    private javax.swing.JButton button12;
    private javax.swing.JButton button13;
    private javax.swing.JButton button20;
    private javax.swing.JButton button21;
    private javax.swing.JButton button22;
    private javax.swing.JButton button23;
    private javax.swing.JButton button30;
    private javax.swing.JButton button31;
    private javax.swing.JButton button32;
    private javax.swing.JButton button33;
    private javax.swing.JButton instructions;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JButton quit;
    private javax.swing.JButton quit1;
    private javax.swing.JLabel trophy;
    // End of variables declaration//GEN-END:variables
}
