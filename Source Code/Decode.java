/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package voidcipher;

import java.awt.*;
import java.math.*;
import javax.swing.*;

public class Decode {
    
    public static void main(String[] args) {
         
         String Hex = JOptionPane.showInputDialog(null, "Enter a message to Decode: ");
         
         String bindecode = hexToBin(Hex);
         String b = "0" + bindecode;
         String output = "";
         for(int i = 0; i <= b.length() - 8; i+=8)
                {
                    int k = Integer.parseInt(b.substring(i, i+8), 2);
                    output += (char) k;
                }  
         
         
         JFrame frameenco = new JFrame ("Decoded message");
        frameenco.setVisible(true);
        frameenco.setSize(800, 400);
        
       // Access for gridbag constraints, GUI viewer.
        
        JPanel panel = new JPanel (new GridBagLayout ());
        frameenco.getContentPane().add(panel, BorderLayout.NORTH);
        GridBagConstraints c = new GridBagConstraints ();
        c.insets = new Insets(15,15,15,15);
        JTextArea textArea = new JTextArea(output, 2, 30);
        JScrollPane scrollPane = new JScrollPane( textArea );
        
        c.gridx = 3;
        c.gridy = 2;
        panel.add(new JLabel ("Decoded Message: "), c);
        c.gridx = 3;
        c.gridy = 3;
        panel.add(scrollPane , c);
        c.gridx = 3;
        c.gridy = 4;
        panel.add(new JLabel ("If you are using a mac to copy press: 'command' + c. "), c);
        c.gridx = 3;
        c.gridy = 5;
        panel.add(new JLabel ("If you are using Windows to copy press: 'control' + c. "), c);
         
        
    }
    
    static String hexToBin(String s) {
        return new BigInteger(s, 16).toString(2);
}
    
}
