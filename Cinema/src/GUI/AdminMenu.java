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
public class AdminMenu extends JFrame{
   public AdminMenu(){
       setTitle("Admin Menu");
        JPanel j1=new JPanel();
        
      this.add(j1);
      j1.setLayout(new FlowLayout());
      //setSize(800,200);
         setBounds(500,300,300,200);
        final JButton add_movie=new JButton("Add movie");
         final JButton set_now_playing=new JButton("Set now playing movies");
        final JButton set_upcoming=new JButton("Set up coming movies");
         final JButton update_schedule=new JButton("Update schedule");
          final JButton set_schedule=new JButton("Set schedule");
           final JButton remove_movie=new JButton("Remove movie");
            final JButton change_username=new JButton("Change username");
             final JButton change_password=new JButton("Change password");
              final JButton give_power=new JButton("Give power");
              j1.add(add_movie);
              j1.add(set_now_playing);
              j1.add(set_upcoming);
              j1.add(update_schedule);
              j1.add(set_schedule);
              j1.add(remove_movie);
              j1.add(change_username);
              j1.add(change_password);
              j1.add(give_power);
                this.setDefaultCloseOperation(EXIT_ON_CLOSE);
   }
    
    
}
