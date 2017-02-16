package AddressBook; /**
 * Created by mattleblanc on 1/26/2017.
 */

import java.awt.event.ActionListener;
import javax.swing.JButton;

public class MyJButton extends JButton {

    private ActionListener actionListener;

    public void setActionListener(ActionListener actionListener) {
        this.actionListener = actionListener;
    }

    public void init() {
        this.addActionListener(actionListener);
    }

}
