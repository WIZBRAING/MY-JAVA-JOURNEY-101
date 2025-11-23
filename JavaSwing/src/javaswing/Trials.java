/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaswing;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;



/**
 *
 * @author WIZBRAIN
 */
public class Trials extends JFrame implements ActionListener  {
    JButton button = getButton("CLICK ME",200,100,204,50);
    JLabel label = new JLabel("I'm invisible");
    public Trials(){
        this.setSize(750,750);
        this.setTitle("Trial");
        ImageIcon image = new ImageIcon(getClass().getResource("/images/flat3(64).png"));
        this.setIconImage(image.getImage());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = getBgImage("/images/swift.png");
        panel.setLayout(new BorderLayout());
        label.setBounds(100,100,124,60);
        label.setEnabled(false);
        panel.add(button);
        panel.add(label);
        label.setVerticalAlignment(JLabel.CENTER);
        button.addActionListener(this);
        button.setFocusable(false);
        button.setEnabled(true);
        this.setContentPane(panel);
        this.setVisible(true);

    }
    
    
    
    public JButton getButton(String text,int x, int y,int width, int height){
        JButton button = new JButton();
        button.setText("CLICK ME");
        button.setBounds(x,y,width,height);
        return button;
    }
    
    
    @Override 
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button){
            System.out.println("poopoo");
            label.setEnabled(true);
        }
        
    }
    
    public JPanel getBgImage(String str){
        return new JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                g.drawImage(getImage(getIcon(str)),0,0, getWidth(), getHeight(),this);
            }
        };
    }
    
    public Image getImage(ImageIcon icon){
        return icon.getImage();
    }
    
    public ImageIcon getIcon(String str){
        return new ImageIcon(getClass().getResource(str));
    }
    
} 
