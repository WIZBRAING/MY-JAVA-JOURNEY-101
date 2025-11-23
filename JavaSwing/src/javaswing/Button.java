/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaswing;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.Border;
/**
 *
 * @author WIZBRAIN
 */
public class Button extends JFrame implements ActionListener{
    
    //Button
    JButton button1 = new JButton();
    
    public Button(){
        //JButton = is a Button that performs an  when clicked 
        
        //ICON
        ImageIcon icon = new ImageIcon(getClass().getResource("/images/flat.png"));
        
        //BUTTON
        button1.setText("CLICK ME SEVERAL TIMES");
          button1.setBounds(200,100,164,32);
            button1.addActionListener(this);
              button1.setFocusable(false);
                button1.setIcon(icon);
                  button1.setHorizontalTextPosition(JButton.CENTER);
                   button1.setVerticalTextPosition(JButton.CENTER);
                     button1.setFont(new Font("Times New Roman",Font.BOLD,20));
                       button1.setForeground(Color.yellow);
        
        //FRAME
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          this.setSize(500,500);
            this.setLayout(null);
              this.setVisible(true);
                this.add(button1);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() ==button1){
            System.out.println("poo");
        }
    }
    
    
}
