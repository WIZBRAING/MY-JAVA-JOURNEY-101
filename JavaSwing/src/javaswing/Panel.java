/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaswing;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Rectangle;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Graphics;
import java.util.ArrayList;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 *
 * @author WIZBRAIN
 */
public class Panel extends JFrame implements ActionListener {
            
        //BUTTON
         JButton button1 = new JButton();
         
         
    
    public Panel(){


    }
    
    public static void method(){
        //JPanel = GUI component that functions as a container to hold other components 
        
        //LABEL
        JLabel label1 = new JLabel();
        //label1.setText("                   ");
        //Label Icon
        ImageIcon icon1 = new ImageIcon(Panel.class.getResource("/images/swift1.png")); 
         label1.setIcon(icon1);
            label1.setHorizontalTextPosition(JLabel.CENTER);
               label1.setVerticalTextPosition(JLabel.CENTER);
                  label1.setHorizontalAlignment(JLabel.CENTER);
                    label1.setVerticalAlignment(JLabel.CENTER);
                       label1.setForeground(Color.BLACK);
                         label1.setFont(new Font("Times New Roman",Font.PLAIN,30));
                           label1.setBackground(Color.WHITE);
                             label1.setOpaque(true);
                               label1.setBounds(0,0,15,10);
                                 label1.setBorder(BorderFactory.createLineBorder(new Color(6, 2, 112),2));
                                   

        
        JLabel label2 = new JLabel();
          label2.setBackground(Color.red);
            ImageIcon icon2 = new ImageIcon(Panel.class.getResource("/images/flat3(64).png"));
              label2.setHorizontalAlignment(JLabel.RIGHT);
                label2.setVerticalAlignment(JLabel.TOP);
                  label2.setIcon(icon2);
                     label2.setBounds(100,100,64,64);
              
              
            
            JLabel label3 = new JLabel();
              ImageIcon icon3 = new ImageIcon(Panel.class.getResource("/images/flat3(64).png"));
                label3.setIcon(icon3);
                  label3.setHorizontalAlignment(JLabel.RIGHT);
                    label3.setVerticalAlignment(JLabel.BOTTOM);
                      label3.setBounds(700,500,64,64);
                      
              
              
              
         //PANEL
        JPanel panel1 = new JPanel();
          panel1.setBackground(new Color(246, 228, 175));
            panel1.setBounds(0,0,250,250);
               panel1.setLayout(new BorderLayout());
                 panel1.add(label1);
          
        
        JPanel panel2 = new JPanel();
          panel2.setBackground(new Color(123,124,156));
           panel2.setBounds(0,0, 500,500);
             panel2.add(label2);
               panel2.setLayout(new BorderLayout());
             
            
        
        JPanel panel3 = new JPanel();
          panel3.setBackground(new Color(166,178,144));
            panel3.setBounds(0,0,750,750);
                panel3.add(label3);
                   panel3.setLayout(null);
            
        JPanel panel4 = new JPanel();
          panel4.setBackground(new Color(100,124,188));
            panel4.setBounds(0,0,1000,1000);
              //panel4.setLayout(new BorderLayout());
               panel4.add(label3);
                  panel4.setLayout(null);
        
       //Creating a background image using a Panel
       ImageIcon bgIcon = new ImageIcon(Panel.class.getResource("/images/flat3(512).png"));
       Image bgImage = bgIcon.getImage();
       JPanel bgPanel = new JPanel(){
           @Override
           protected void paintComponent(Graphics g){
               super.paintComponent(g);
               g.drawImage(bgImage,0, 0, getWidth(),getHeight(), this);
           }
       };
       
       
         
        
        //FRAME
        javax.swing.JFrame frame = new javax.swing.JFrame("Panel");
           frame.setTitle("PANEL");
        //ImageIcon
        ImageIcon bg = new ImageIcon(Panel.class.getResource("/images/flat3(512).png"));
        javax.swing.ImageIcon image = new javax.swing.ImageIcon(Panel.class.getResource("/images/logo.png"));
            frame.setIconImage(image.getImage());
                frame.setDefaultCloseOperation(
                        javax.swing.JFrame.EXIT_ON_CLOSE);
                   frame.setVisible(true);
                      frame.setSize(750,750);
                        frame.setLayout(new BorderLayout());
                         frame.add(panel1);
                          //frame.pack()
                            //frame.setContentPane(bgPanel);
                              frame.getContentPane().setBackground(Color.WHITE);
                                frame.add(panel2);
                                  frame.add(panel3);
                                   frame.add(panel4);
                                     frame.setFont(new Font(
                                             "Times New Roman",
                                             Font.PLAIN,50));
                                  
        
    }
    
    
    public  void borderLayoutPanel(){
        
        //BUTTON
        button1.setText("NEW WINDOW");
        button1.addActionListener(this);
        button1.setFocusable(false);
        
        //PANELS
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel(new BorderLayout());
        
        //FRAME
        this.setLayout(new BorderLayout(10,10));
        
        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
        JPanel panel9 = new JPanel();
        JPanel panel10 = new JPanel(new GridLayout());
        panel10.add(button1);

        
        
        //Setting background
        panel1.setBackground(Color.red);
        panel2.setBackground(Color.green);
        panel3.setBackground(Color.yellow);
        panel4.setBackground(Color.magenta);
        panel5.setBackground(Color.blue);
        
        
        
        panel6.setBackground(Color.red);
        panel7.setBackground(Color.green);
        panel8.setBackground(Color.yellow);
        panel9.setBackground(Color.magenta);
        panel10.setBackground(Color.pink);
        
        //Setting preferred size
        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(100,100));
        panel3.setPreferredSize(new Dimension(100,100));
        panel4.setPreferredSize(new Dimension(100,100));
        panel5.setPreferredSize(new Dimension(100,100));
        
        
                
        panel7.setPreferredSize(new Dimension(100,100));
        panel8.setPreferredSize(new Dimension(100,100));
        panel9.setPreferredSize(new Dimension(100,100));
        panel10.setPreferredSize(new Dimension(100,100));
        panel6.setPreferredSize(new Dimension(100,100));
        
        
        //Adding Elements to panel 5
        panel5.add(panel6,BorderLayout.NORTH);
        panel5.add(panel7,BorderLayout.WEST);
        panel5.add(panel8,BorderLayout.EAST);
        panel5.add(panel9,BorderLayout.SOUTH);
        panel5.add(panel10,BorderLayout.CENTER);
        
        //FRAME
        this.setSize(500,500);
        this.add(panel1,BorderLayout.NORTH);
        this.add(panel2,BorderLayout.WEST);
        this.add(panel3,BorderLayout.EAST);
        this.add(panel4,BorderLayout.SOUTH);
        this.add(panel5,BorderLayout.CENTER);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);  
       
    }
  
    
    public static void flowLayoutPanel(){
        JFrame flFrame = new JFrame();
        flFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        flFrame.setSize(800,800);
        flFrame.setLayout(new FlowLayout(FlowLayout.CENTER,20,350));
        
        
        
        flFrame.add(new JButton("1"));
         flFrame.add(new JButton("2"));
           flFrame.add(new JButton("3"));
             flFrame.add(new JButton("4"));
              flFrame.add(new JButton("5"));
               flFrame.add(new JButton("6"));
                flFrame.add(new JButton("7"));
                 flFrame.add(new JButton("8"));
                  flFrame.add(new JButton("9"));
                   flFrame.add(new JButton("10"));
                    flFrame.add(new JButton("11"));
        
        flFrame.setVisible(true);  
    }
    
    
    
    //ACTION LISTENER
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button1){
            this.dispose();
            NewWindow window = new NewWindow();
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
