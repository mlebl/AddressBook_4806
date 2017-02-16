package AddressBook; /**
 * Created by mattleblanc on 1/26/2017.
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyActionListener implements ActionListener {

    private JTextField nameField, phoneField, addrField;
    private AddressBook ab1;

    public MyActionListener(MyJTextField myJTextField, MyJTextField myJTextField1, MyJTextField myJTextField12) {
        nameField = myJTextField;
        phoneField = myJTextField1;
        addrField = myJTextField12;
        ab1 = new AddressBook();
        //ab1 = addressBook;
    }

    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Added AddressBook.BuddyInfo!");
        BuddyInfo bi1 = new BuddyInfo(nameField.getText(),phoneField.getText());

        /*
        ab1.save(bi1);
        String output = "";
        for(AddressBook.BuddyInfo bi : ab1.findAll()){
            output=output+bi.toString()+"\n";
        }
        addrField.setText(output);
        */

        ab1.addBuddy(bi1);
        addrField.setText(ab1.toString());
    }



}
