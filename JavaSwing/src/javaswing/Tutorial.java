/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaswing;
import java.awt.Color;
import java.awt.Font;
import java.awt.Paint;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.border.BevelBorder;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;


/**
 *
 * @author WIZBRAIN
 */
public class Tutorial extends JFrame{
    
    //ICONS
    ImageIcon lbIcon = new ImageIcon (getClass().getResource("/images/flat3(64).png"));
    ImageIcon lbIcon1 = new ImageIcon (getClass().getResource("/images/flat3(64).png"));
    ImageIcon lbIcon2 = new ImageIcon (getClass().getResource("/images/flat3(64).png"));
    ImageIcon lbIcon13 = new ImageIcon (getClass().getResource("/images/flat3(64).png"));
    ImageIcon lbIcon4 = new ImageIcon (getClass().getResource("/images/flat3(64).png"));
    ImageIcon lbIcon15 = new ImageIcon (getClass().getResource("/images/flat3(64).png"));
    ImageIcon lbIcon6 = new ImageIcon (getClass().getResource("/images/flat3(64).png"));
    ImageIcon lbIcon17 = new ImageIcon (getClass().getResource("/images/flat3(64).png"));
    ImageIcon lbIcon8 = new ImageIcon (getClass().getResource("/images/flat3(64).png"));
    ImageIcon lbIcon19 = new ImageIcon (getClass().getResource("/images/flat3(64).png"));
    ImageIcon lbIcon10 = new ImageIcon (getClass().getResource("/images/flat3(64).png"));
    ImageIcon lbIcon111 = new ImageIcon (getClass().getResource("/images/flat3(64).png"));

    
    //LABEL
    JLabel label = new JLabel();
    JLabel label1 = new JLabel();
    JLabel label2 = new JLabel();
    JLabel label3 = new JLabel();
    JLabel label4 = new JLabel();
    JLabel label5 = new JLabel();
    JLabel label6 = new JLabel();
    JLabel label7 = new JLabel();
    JLabel label8 = new JLabel();
    JLabel label9 = new JLabel();
    JLabel label10 = new JLabel();
    JLabel label11 = new JLabel();
    
    
    //PANELS
    JPanel panel1 = new JPanel();
    JPanel panel2 =new JPanel();
    JPanel panel3 =new JPanel();
    JPanel panel4 = new JPanel();
    JPanel panel5 = new JPanel(){
        @Override 
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(bgImage, 0, 0,getWidth(),getHeight(),this);
        }
    };
    
    
    JPanel bgPanel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                g.drawImage(bgImage, 0, 0,getWidth(),getHeight(),this);
            }
        };
    
    ImageIcon bgIcon = new ImageIcon(getClass().getResource("/images/swift.png"));
    Image bgImage = bgIcon.getImage();
    
    public Tutorial(){ 
        window();
        }
    

    
    
    //FRAME
    public void window(){
        //LABEL
        
        //label
        label.setText("You too Code Bro");
        label.setIcon(lbIcon);
        
        //label1
        label1.setIcon(lbIcon);
        label1.setText("You too Code Bro");
        //lable2
        label2.setIcon(lbIcon);
        label2.setText("You too Code Bro");
        //label3
        label3.setIcon(lbIcon);
        label3.setText("You too Code Bro");
        //label4
        label4.setIcon(lbIcon);
        label4.setText("You too Code Bro");
        //label5
        label5.setIcon(lbIcon);
        label5.setText("You too Code Bro");
        //lable6
        label6.setIcon(lbIcon);
        label6.setText("You too Code Bro");
        //label7
        label7.setIcon(lbIcon);
        label7.setText("You too Code Bro");
        //label8
        label8.setIcon(lbIcon);
        label8.setText("You too Code Bro");
        //label9
        label9.setIcon(lbIcon);
        label9.setText("You too Code Bro");
        //lable10
        label10.setIcon(lbIcon);
        label10.setText("You too Code Bro");
        //label11
        label11.setIcon(lbIcon);
        label11.setText("You too Code Bro");
        
        
        
        //PANEL
        //setting Layout
        panel1.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        panel2.setLayout(new FlowLayout(FlowLayout.LEADING,10,10));
        panel3.setLayout(new FlowLayout(FlowLayout.TRAILING,10,10));
        panel4.setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
        panel5.setLayout(new GridLayout(5,5));
        
        //setting the size 
        panel1.setPreferredSize(new Dimension(0,200));
        panel2.setPreferredSize(new Dimension(250,0));
        panel3.setPreferredSize(new Dimension(250,0));
        panel4.setPreferredSize(new Dimension(0,200));
        
        //setting background color/image
        panel1.setBackground(new Color(231, 221, 255));
        panel2.setBackground(new Color(226, 234, 244));
        panel3.setBackground(new Color(226, 234, 244));
        panel4.setBackground(new Color(232, 232, 232));

        //ADDING COMPONENTS TO PANEL
        
        /*panel1.add(label);
        panel1.add(label1);
        panel1.add(label2);
        panel1.add(label3);
        panel1.add(label4);
        panel1.add(label5);
        panel1.add(label6);
        panel1.add(label7);
        panel1.add(label8);
        panel1.add(label9);
        panel1.add(label10);
        panel1.add(label11);  */
        
        
        /*panel2.add(label);
        panel2.add(label1);
        panel2.add(label2);
        panel2.add(label3);
        panel2.add(label4);
        panel2.add(label5);
        panel2.add(label6);
        panel2.add(label7);
        panel2.add(label8);
        panel2.add(label9);
        panel2.add(label10);
        panel2.add(label11); */
        
        
        
        /*panel3.add(label);
        panel3.add(label1);
        panel3.add(label2);
        panel3.add(label3);
        panel3.add(label4);
        panel3.add(label5);
        panel3.add(label6);
        panel3.add(label7);
        panel3.add(label8);
        panel3.add(label9);
        panel3.add(label10);
        panel3.add(label11); */
        
        
        /*panel4.add(label);
        panel4.add(label1);
        panel4.add(label2);
        panel4.add(label3);
        panel4.add(label4);
        panel4.add(label5);
        panel4.add(label6);
        panel4.add(label7);
        panel4.add(label8);
        panel4.add(label9);
        panel4.add(label10);
        panel4.add(label11); */
        
        
        /*panel5.add(label);
        panel5.add(label1);
        panel5.add(label2);
        panel5.add(label3);
        panel5.add(label4);
        panel5.add(label5);
        panel5.add(label6);
        panel5.add(label7);
        panel5.add(label8);
        panel5.add(label9);
        panel5.add(label10);
        panel5.add(label11); */
        

        
        //FRAME
        this.setTitle("Yolo Store"); //sets title of a this
        //this.setBackground(Color.yellow); 
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE); //exit out of application
        this.setSize(2000,2000); //sets this size 
        this.setResizable(false);  //prevents this from being resized 
        ImageIcon icon = new ImageIcon("logo.png"); //creates an ImageIcon
        this.setIconImage(icon.getImage());  //change Icon of this
        this.getContentPane().setBackground(new Color(154,182,50)); //sets color of background
        //this.getContentPane().setBackground(new Color(0, 255, 255, 128));
        this.setResizable(rootPaneCheckingEnabled);
        this.setContentPane(bgPanel);
        this.setLayout(new BorderLayout());
        
        
        //ADDING COMPONENTS TO FRAME
        this.add(panel1,BorderLayout.NORTH);
        this.add(panel2,BorderLayout.WEST);
        this.add(panel3,BorderLayout.EAST);
        this.add(panel4,BorderLayout.SOUTH);
        this.add(panel5,BorderLayout.CENTER);
        this.setVisible(true);  //makes this visible 
    }
    
        

}
