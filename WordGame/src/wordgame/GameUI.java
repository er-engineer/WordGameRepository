
package wordgame;

public class GameUI extends javax.swing.JFrame {

    public GameUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        startScreen = new javax.swing.JPanel();
        wordGameLabel = new javax.swing.JLabel();
        gameDescriptionLabel = new javax.swing.JLabel();
        startButton = new javax.swing.JButton();
        rulesButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        wordGameLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        wordGameLabel.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        wordGameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wordGameLabel.setText("Kelime Oyunu");

        gameDescriptionLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        gameDescriptionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gameDescriptionLabel.setText("<html>Kelime Oyunu TEVE2 televizyon kanalındaki <br/>\naynı isimli programdan esinlenerek tasarlanmıştır.<html/>"); // NOI18N

        startButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        startButton.setText("Oynamaya başla!");
        startButton.setToolTipText("Tıklanıldığı andan itibaren süre başlar.");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        rulesButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rulesButton.setText("Kuralları gör!");
        rulesButton.setMaximumSize(new java.awt.Dimension(215, 37));
        rulesButton.setMinimumSize(new java.awt.Dimension(215, 37));
        rulesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rulesButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout startScreenLayout = new javax.swing.GroupLayout(startScreen);
        startScreen.setLayout(startScreenLayout);
        startScreenLayout.setHorizontalGroup(
            startScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, startScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(startScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(wordGameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, startScreenLayout.createSequentialGroup()
                        .addGroup(startScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(gameDescriptionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, startScreenLayout.createSequentialGroup()
                                .addComponent(rulesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(617, 617, 617))
        );
        startScreenLayout.setVerticalGroup(
            startScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(startScreenLayout.createSequentialGroup()
                .addComponent(wordGameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gameDescriptionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                .addGroup(startScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rulesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(611, 387));

        wordGameLabel1.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        wordGameLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wordGameLabel1.setText("Kelime Oyunu");
        wordGameLabel1.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(wordGameLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(wordGameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 296, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(startScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startScreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
      startScreen.setVisible(false);
    }//GEN-LAST:event_startButtonActionPerformed

    private void rulesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rulesButtonActionPerformed
        Rules rules = new Rules();
        rules.setVisible(true);
        rulesButton.setEnabled(false);
    }//GEN-LAST:event_rulesButtonActionPerformed

    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel gameDescriptionLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton rulesButton;
    private javax.swing.JButton startButton;
    private javax.swing.JPanel startScreen;
    private javax.swing.JLabel wordGameLabel;
    private javax.swing.JLabel wordGameLabel1;
    // End of variables declaration//GEN-END:variables
}
