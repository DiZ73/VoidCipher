
package voidcipher;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import chatserver.*;
import pong.*;

public class AccessApproved {
    
    public static void main(final String args[]) {
        
        JOptionPane.showMessageDialog(null, "Access Approved! Press OK to proceed.");
        
        JFrame frame = new JFrame ("The Void Decipherer");
        frame.setVisible(true);
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        JPanel panel = new JPanel (new GridBagLayout ());
        frame.getContentPane().add(panel, BorderLayout.NORTH);
        GridBagConstraints c = new GridBagConstraints ();
        c.insets = new Insets(20,20,20,20);
        JLabel welcome = new JLabel ("Would you like to encode or decode any text or cipher? ");
        c.gridx = 0;
        c.gridy = 0;
        panel.add(welcome, c);
        
        JButton encobutton = new JButton ("Encode");
        c.gridx = 0;
        c.gridy = 2;
        panel.add(encobutton, c);
        
        JButton decobutton = new JButton ("Decode");
        c.gridx = 0;
        c.gridy = 4;
        panel.add(decobutton, c);
        
        JLabel cht = new JLabel ("Try our new Chatbox feature: ");
        c.gridx = 0;
        c.gridy = 7;
        panel.add(cht, c);
        
        JButton opnChat = new JButton ("Open Chatbox");
        c.gridx = 0;
        c.gridy = 9;
        panel.add(opnChat, c);
        
        JButton opnPong = new JButton ("Play Pong");
        c.gridx = 0;
        c.gridy = 11;
        panel.add(opnPong, c);
        
        encobutton.addActionListener(new ActionListener() {
 
            // Head First Java Book - Page 356. 
            //(But nothing happens when I click it.)
            
            @Override
            public void actionPerformed(ActionEvent e)
            {
                Encode.main(args);
            }
        
        });
        
        decobutton.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e)
            {
                Decode.main(args);
            }
        
        });
        
        opnChat.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e)
            {
                ClientGUI.main(args);
            }
        
        });
        
        opnPong.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e)
            {
                Pong.main(args);
            }
        
        });
        
    }
    
}
