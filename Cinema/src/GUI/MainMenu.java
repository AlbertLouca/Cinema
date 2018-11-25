/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Chadi N. Louca
 */
public class MainMenu extends JFrame {
    
    public MainMenu(String title){
         setTitle(title);
            JPanel j1=new JPanel();
            this.add(j1);
            setBounds(500,300,100,200);

             final JButton log=new JButton("Login");
         final JButton reg=new JButton("Register");
         final JButton exit=new JButton("Exit");
        j1.add(log);
        j1.add(reg);
        j1.add(exit);
          this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
}
