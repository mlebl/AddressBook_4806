package AddressBook; /**
 * Created by mattleblanc on 1/26/2017.
 */

import java.awt.Dimension;
import javax.swing.JFrame;

public class MyJFrame extends JFrame {
    public void init() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setSize(new Dimension(300, 300));
                setVisible(true);
            }
        });
    }

}
