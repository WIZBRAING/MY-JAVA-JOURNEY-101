/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaswing;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 *
 * @author WIZBRAIN
 */
public class LaunchPage implements ActionListener{
    JFrame frame = new JFrame();
    JButton button = new JButton("New Window");
    
    LaunchPage(){
        button.setBounds(100,160,200,40);
        button.setFocusable(false);
        button.addActionListener(this);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.add(button);
        frame.setVisible(true);
    }
    
    
    @Override 
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button){
            frame.dispose();
            NewWindow window = new NewWindow();
        }
    }
    
}
