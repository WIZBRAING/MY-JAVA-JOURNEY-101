/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaswing;
import javax.swing.JFrame;
import java.awt.Color;
/**
 *
 * @author WIZBRAIN
 */
public class NewWindow extends JFrame {
    NewWindow(){
        this.setSize(700,700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(123,145,102));
        this.setVisible(true);
        
    }
    
}
