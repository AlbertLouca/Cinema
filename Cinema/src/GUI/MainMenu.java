/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;


import java.awt.Color;
import java.awt.Graphics;


import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Chadi N. Louca
 */
public class MainMenu extends JFrame {
private Graphics myg;
    JPanel j1;
    final JButton reg;
    final JButton log;
    
    public MainMenu(String title) throws IOException{
       
         setTitle(title);
           j1=new JPanel();
        
           this.add(j1);
           // this.add
            setBounds(300,275,500,400);
  
            log=new JButton("Login");
        reg=new JButton("Register");
        j1.setLayout(null);
        j1.add(log);
       j1.add(reg);
       reg.setBounds(150,200,200,100);
        log.setBounds(150,50,200,100);
        
      
        log.addActionListener(new myHolder());
        reg.addActionListener(new myHolder());
        
          this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
         public class myHolder implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            Object ButtonPressed =ae.getSource();
            if(ButtonPressed.equals(reg)){
                JUser n=new JUser();
                n.setVisible(true);
              //  setVisible(false);
                
            }
         if(ButtonPressed.equals(log)){
             JLogin n=new JLogin();
             n.setVisible(true);
             setVisible(false);
         }
      
        }       
    }
    public void paint(Graphics g){
        
        
        
         myg=g;
     
       super.paint(g);
         BufferedImage img;
    try {
        img = ImageIO.read(new File("C:\\Users\\Chadi N. Louca\\Desktop\\2c6643280ec89c10e0f473807dd3de93.jpg"));
         g.drawImage(img,0,0,null);
    } catch (IOException ex) {
        Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
    }
      
    }
}
