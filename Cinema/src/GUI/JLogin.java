/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.FlowLayout;
import javax.swing.*;

/**
 *
 * @author Chadi N. Louca
 */
public class JLogin extends JFrame {
    
    public JLogin(String title){
      JPanel j1=new JPanel();
      this.add(j1);
      j1.setLayout(new FlowLayout());
      JLabel l1=new JLabel("Username:");
       JTextField username=new JTextField("type username here");
       JLabel l2=new JLabel("Password:");
      JPasswordField p1=new JPasswordField("                ");
          setBounds(500,300,250,200);
        setTitle(title); 
        j1.add(l1);
        j1.add(username);
        j1.add(l2);
        j1.add(p1);
 final JButton log=new JButton("Login");
 j1.add(log);
   this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
