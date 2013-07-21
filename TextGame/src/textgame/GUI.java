/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package textgame;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.KeyStroke;
import textgame.chat.ChatLogger;
import textgame.command.CommandHandler;

/**
 *
 * @author Patrick
 */
public class GUI extends javax.swing.JFrame {

    private CommandHandler ch;
    private ChatLogger cl;

    public GUI(CommandHandler ch, ChatLogger cl) {
        this.ch = ch;
        this.cl = cl;
        initComponents();
        updateSizeLabel();
        setLocationRelativeTo(null);
        setVisible(true);
        enterKeyListener();
    }

    public void updateSizeLabel() {
        size_Label.setText(String.valueOf(chat_TextArea.getFont().getSize()));
    }

    public void scrollDown() {
        int x;
        chat_TextArea.selectAll();
        x = chat_TextArea.getSelectionEnd();
        chat_TextArea.select(x, x);
    }

    private void enterKeyListener() {
        send_Button.getInputMap(send_Button.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "sendButton");
        send_Button.getActionMap().put("sendButton", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                send();
            }
        });
    }

    public void send() {
        String command = field_TextField.getText();

        cl.addString(command);
        ch.executeCommand(command);
        field_TextField.setText("");
        chat_TextArea.setText(cl.getLog());

        scrollDown();
        send_Button.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        field_TextField = new javax.swing.JTextField();
        send_Button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        chat_TextArea = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        IncreaseFontSize_Button = new javax.swing.JButton();
        decreaseFontSize_Button = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        size_Label = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        testPane1 = new textgame.MapPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        field_TextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                field_TextFieldKeyReleased(evt);
            }
        });

        send_Button.setText("Send");
        send_Button.setEnabled(false);
        send_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                send_ButtonActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(102, 102, 102));
        jScrollPane1.setForeground(new java.awt.Color(153, 255, 0));

        chat_TextArea.setEditable(false);
        chat_TextArea.setBackground(new java.awt.Color(102, 102, 102));
        chat_TextArea.setColumns(20);
        chat_TextArea.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        chat_TextArea.setForeground(new java.awt.Color(153, 255, 0));
        chat_TextArea.setRows(5);
        jScrollPane1.setViewportView(chat_TextArea);

        jPanel6.setLayout(new java.awt.GridLayout(1, 0));

        IncreaseFontSize_Button.setText("A+");
        IncreaseFontSize_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IncreaseFontSize_ButtonActionPerformed(evt);
            }
        });
        jPanel6.add(IncreaseFontSize_Button);

        decreaseFontSize_Button.setText("A-");
        decreaseFontSize_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decreaseFontSize_ButtonActionPerformed(evt);
            }
        });
        jPanel6.add(decreaseFontSize_Button);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Size: ");

        size_Label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        size_Label.setForeground(new java.awt.Color(255, 255, 255));
        size_Label.setText("jLabel3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(field_TextField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(send_Button))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(size_Label)
                        .addGap(0, 307, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(size_Label)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(field_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(send_Button, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setLayout(new java.awt.GridLayout(1, 0));

        jButton4.setText("Quest");
        jPanel5.add(jButton4);

        jButton5.setText("World map");
        jPanel5.add(jButton5);

        jButton6.setText("Inventory");
        jPanel5.add(jButton6);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(testPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(testPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void send_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_send_ButtonActionPerformed
        send();
    }//GEN-LAST:event_send_ButtonActionPerformed

    private void IncreaseFontSize_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IncreaseFontSize_ButtonActionPerformed
        int size = chat_TextArea.getFont().getSize();
        String fontTitle = chat_TextArea.getFont().getFontName();

        chat_TextArea.setFont(new Font(fontTitle, Font.PLAIN, size + 1));
        updateSizeLabel();
    }//GEN-LAST:event_IncreaseFontSize_ButtonActionPerformed

    private void decreaseFontSize_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decreaseFontSize_ButtonActionPerformed
        int size = chat_TextArea.getFont().getSize();
        String fontTitle = chat_TextArea.getFont().getFontName();

        chat_TextArea.setFont(new Font(fontTitle, Font.PLAIN, size - 1));
        updateSizeLabel();
    }//GEN-LAST:event_decreaseFontSize_ButtonActionPerformed

    private void field_TextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_field_TextFieldKeyReleased
        if (field_TextField.getText().isEmpty()) {
            send_Button.setEnabled(false);
        } else {
            send_Button.setEnabled(true);
        }
    }//GEN-LAST:event_field_TextFieldKeyReleased
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Windows".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new GUI().setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton IncreaseFontSize_Button;
    private javax.swing.JTextArea chat_TextArea;
    private javax.swing.JButton decreaseFontSize_Button;
    private javax.swing.JTextField field_TextField;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton send_Button;
    private javax.swing.JLabel size_Label;
    private textgame.MapPane testPane1;
    // End of variables declaration//GEN-END:variables
}
