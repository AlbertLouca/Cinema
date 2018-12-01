/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;




import Users.User;
import static cinema.Cinema.UserLib;
import static cinema.Cinema.hash;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 *
 * @author Chadi N. Louca
 */
public class JLogin extends JFrame {
    JPanel j1;
    Graphics myg;
    JLabel l1;
    JTextField username;
    JLabel l2;
    JPasswordField p1;
  final  JButton log;
//  public void paint(Graphics g){
//        
//        
//        
//         myg=g;
//     
//       super.paint(g);
//         BufferedImage img;
//    try {
//        img = ImageIO.read(new File("C:\\Users\\Chadi N. Louca\\Desktop\\2c6643280ec89c10e0f473807dd3de93.jpg"));
//         g.drawImage(img,0,0,null);
//    } catch (IOException ex) {
//      
//    }
//      
//    }
    public JLogin(){
     j1=new JPanel();
      
      j1.setLayout(null);
      this.add(j1);
      l1=new JLabel("Username:");
        username=new JTextField(10);
       l2=new JLabel("Password:");
      // this.setBackground(new Color(1.0f,1.0f,1.0f,0.5f));
       p1=new JPasswordField(10);
         setBounds(300,275,500,400);
        setTitle("Logging in");
        j1.add(l1);
        l1.setBounds(100,50,150,50);
        j1.add(username);
        username.setBounds(190,50,100,50);
        
        j1.add(l2);
        l2.setBounds(100,130,150,50);
        j1.add(p1);
        p1.setBounds(190,160,100,50);
 log=new JButton("Login");
 j1.add(log);
 log.setBounds(230,230,100,50);
 log.addActionListener(new myt());
 this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
   class myt implements ActionListener{
 
            @Override
            public void actionPerformed(ActionEvent ae) {
      User i=new User();
  AdminMenu am=new AdminMenu();
  boolean d=false;
 for(String x:hash.keySet()){
     if(!(x.equals(username.getText())&&(hash.get(x).getPassword().equals(p1.getText()))))
     {
          JOptionPane.showMessageDialog(null,"Username or Password is incorrect");   
          d=true;
     }
 }
     if(d){}
     else{
              User x=hash.get(username.getText());
      if(x.getPower()||username.getText().equals("admin")){
     
      am.setVisible(true);
      setVisible(false);
     
 }
      else{
          //e3ml menu el user
          
          
      }

    }}}
 
  
 
 
    
    
    
    
    
   }
