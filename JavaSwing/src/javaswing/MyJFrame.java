/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaswing;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.border.BevelBorder;

///

/**
 *
 * @author WIZBRAIN
 */
public class MyJFrame extends JFrame{
    
   public MyJFrame(){
       //sets size of this/window
       //this.setSize(1950,1024);
       this.setSize(950,950);
        this.setTitle("Bro you too Code?"); //Sets window title
            //Creates image icon
                ImageIcon image = new ImageIcon(JavaSwing.class.getResource("/images/logo.png"));
       //sets title image
            this.setIconImage(image.getImage());
       //sets background color
                this.getContentPane().setBackground(new Color(246, 228, 75));
                     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
                         this.setVisible(true);
                          
       
       //CREATING BORDER
       Border border = BorderFactory.createLineBorder(Color.BLACK,10);
       
       //CREATING A LABEL
       JLabel label = new JLabel("You code too");                         //creates a label
       label.setText("YOU TOO CODE?");                                     //sets label text
        label.setHorizontalTextPosition(JLabel.CENTER);            //Align label text horizontally
            label.setVerticalTextPosition(JLabel.TOP);            //Align label text vertically
                label.setHorizontalAlignment(JLabel.CENTER);        //Align label to this horizontally
                    label.setVerticalAlignment(JLabel.CENTER);     //Align lable to this vertically
                    
       //creating label icon
       ImageIcon icon = new ImageIcon(JavaSwing.class.getResource("/images/logo.png"));
        label.setIcon(icon); //sets icon to label
            label.setIconTextGap(150); //sets spcae between label text and icon
                //Adding label to this 
                    this.add(label);
                    
        //setting label foreground, background, border and font
        label.setForeground(Color.BLACK);                                    //Sets text color
          label.setFont(new Font("sanserif",Font.PLAIN,30));        //Sets font of text
           label.setBorder(border);                                           //Sets border of text
             label.setBackground(Color.WHITE);                            //Sets background of text
               label.setOpaque(true);
                
       
    }
    
}
