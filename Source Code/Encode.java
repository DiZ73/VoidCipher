/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package voidcipher;


import java.awt.*;
import java.math.*;
import javax.swing.*;
public class Encode {
    
    public static void main(String[] args) {
        
        String s = JOptionPane.showInputDialog(null, "Enter a message to Encode: ");
  byte[] bytes = s.getBytes();
  StringBuilder binary = new StringBuilder();
  for (byte b : bytes)
  {
     int val = b;
     for (int i = 0; i < 8; i++)
     {
        binary.append((val & 128) == 0 ? 0 : 1);
        val <<= 1;
     }
     binary.append("");
  }
  
  
     String bin = new String(binary);
     BigInteger big = new BigInteger(bin, 2);
     String g = big.toString(16);
     
     JFrame frameenco = new JFrame ("Encoded message");
        frameenco.setVisible(true);
        frameenco.setSize(800, 400);
        
       
        
        JPanel panel = new JPanel (new GridBagLayout ());
        frameenco.getContentPane().add(panel, BorderLayout.NORTH);
        GridBagConstraints c = new GridBagConstraints ();
        c.insets = new Insets(15,15,15,15);
        JTextArea textArea = new JTextArea(g, 2, 30);
        JScrollPane scrollPane = new JScrollPane( textArea );
        
        c.gridx = 3;
        c.gridy = 2;
        panel.add(new JLabel ("Encoded Message: "), c);
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

}

