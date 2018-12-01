/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import Users.User;
import Users.User_Data;
import static cinema.Cinema.UserLib;
import static cinema.Cinema.hash;
import static cinema.Cinema.savehash;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class JUser extends JFrame{
   
  JPanel j1;
  JTextArea ta;
  JLabel l1;
  JTextField username;
  final JButton create;
   JLabel l2;
    JPasswordField p1;
   public  JUser (){
       
        j1=new JPanel();
 
     j1.setLayout(new FlowLayout());
  // JLabel username = new JLabel("username");
   ta=new JTextArea(1,1);
   this.add(j1);
   l1=new JLabel("Username:");
    username=new JTextField(10);
   create=new JButton("create user");
        j1.add(l1);
       setBounds(500,300,200,200);
        setTitle("Creating User"); 
       j1.setBackground(Color.green);       
       j1.add(username);     //typing username
      l2=new JLabel("Password:");
       j1.add(l2);
      p1=new JPasswordField(10);
       j1.add(p1);     
       j1.add(create);
       create.addActionListener(new myHolder());
       // this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
   class myHolder implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
User u=new User();
boolean istaken =false;


  
             for(User i:UserLib){
                // System.out.println("testing");
                 if (i.getUsername().equals(username.getText())){
                   JOptionPane.showMessageDialog(null, "Username already taken");
                   istaken=true;
                   break;
                    }}
             if(istaken){}
             else{
                     u.setUsername(username.getText());
                 u.setPassword(new String(p1.getPassword()));
                if(username.getText().equals("admin"))
                    u.givePower();
                 UserLib.add(u);
                 hash.put(u.getUsername(),u);
    try {
        savehash();
        User_Data x=new User_Data();
        x.save();
        JOptionPane.showMessageDialog(null,"User Created Successfully");
    } catch (IOException ex) {
        Logger.getLogger(JUser.class.getName()).log(Level.SEVERE, null, ex);
    }
            
        
             }
       
       setVisible(false);}
       
        }

}
   
   

    
