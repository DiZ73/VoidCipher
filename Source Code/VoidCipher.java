package voidcipher;

import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class VoidCipher {

    /**
     *
     * @author David Kroell
     * @version 2.3
     */
    public static void main(String[] args) {

        String user1 = "Filmerd77";
        String user2 = "Popcap287";
        String user3 = "Tropicalblue";
        String user4 = "Boatmurderdorf";

        String pass1 = "mattdavshare";
        String pass2 = "ATP788";
        String pass3 = "GEA453";
        String pass4 = "FFS129";


        JPanel userPanel = new JPanel();
        userPanel.setLayout(new GridLayout(2, 2));


        JLabel usernameLbl = new JLabel("Username:");
        JLabel passwordLbl = new JLabel("Password:");

        JTextField username = new JTextField();
        JPasswordField passwordFld = new JPasswordField();


        userPanel.add(usernameLbl);
        userPanel.add(username);
        userPanel.add(passwordLbl);
        userPanel.add(passwordFld);


        int input = JOptionPane.showConfirmDialog(null, userPanel, "Enter your password:", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        char[] pass = passwordFld.getPassword();
        String passentered = new String(pass);

        String userna = username.getText();



        if (userna.equals(user1) && passentered.equals(pass1)) {
            AccessApproved.main(args);
        } else if (userna.equals(user2) && passentered.equals(pass2)) {
            AccessApproved.main(args);
        } else if (userna.equals(user3) && passentered.equals(pass3)) {
            AccessApproved.main(args);
        } else if (userna.equals(user4) && passentered.equals(pass4)) {
            AccessApproved.main(args);
        } else {
            JOptionPane.showMessageDialog(null, "User name or password don't match", "Acces Denied", JOptionPane.ERROR_MESSAGE);

            System.exit(0);
        }


    }
}
