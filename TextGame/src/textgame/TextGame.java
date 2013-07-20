package textgame;

import textgame.chat.ChatLogger;
import textgame.command.CommandHandler;
import textgame.command.CommandKatalog;

/**
 *
 * @author Patrick
 */
public class TextGame {
    
    private ChatLogger cl;
    
    private CommandKatalog ck;
    
    private CommandHandler ch;
    
    private GUI gui;

    public TextGame() {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        cl = new ChatLogger();
        
        ck = new CommandKatalog();
        
        ch = new CommandHandler(ck, cl);
        
        gui = new GUI(ch, cl);
    }

    public static void main(String[] args) {
        TextGame tg = new TextGame();
    }
}
