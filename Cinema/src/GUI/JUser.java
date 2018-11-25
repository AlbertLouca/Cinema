/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import java.awt.*;
import java.util.Set;
import javax.swing.*;

public class JUser extends JFrame{
   
  
   public  JUser (String Title){
       
         JPanel j1=new JPanel();
 
     j1.setLayout(new FlowLayout());
  // JLabel username = new JLabel("username");
   JTextArea ta=new JTextArea(1,1);
   this.add(j1);
 
  JLabel l1=new JLabel("Username:");
    JTextField username=new JTextField("type username here");
  final JButton create=new JButton("create user");
       
         
 
   
        j1.add(l1);
       setBounds(500,300,200,200);
        setTitle(Title); 
       j1.setBackground(Color.green);
        
   
       j1.add(username);     //typing username
       JLabel l2=new JLabel("Password:");
       j1.add(l2);
       JPasswordField p1=new JPasswordField("                ");
       
       j1.add(p1);
       
       
       
       
       
       j1.add(create);
       
       
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
}
    
