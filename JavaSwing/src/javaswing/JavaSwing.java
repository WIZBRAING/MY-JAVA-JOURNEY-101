/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaswing;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;


/**
 *
 * @author WIZBRAIN
 */
public class JavaSwing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Tutorial tutorial = new Tutorial();
        //MyJFrame frame = new MyJFrame();
        //Tutorial tutorial  =new Tutorial();
        //Panel panel = new Panel();
         //Button button = new Button();
         //Trials trials = new Trials();
         //Panel panel = new Panel();
         //panel.borderLayoutPanel();
         //Panel.flowLayoutPanel();
         //_layeredPane();
         //LaunchPage launch = new LaunchPage();
         

         /*JOptionPane.showMessageDialog(null, "This is a plain message"
                 + "", "PLAIN MESSAGE TYPE", -1);
         JOptionPane.showMessageDialog(null,"This is an error\n "
                 + "message","ERROR MESSAGE TYPE", 0);
         JOptionPane.showMessageDialog(null,"this is an information"
                 + "","INFORMATION MESSAGE TYPE", 1);
         JOptionPane.showMessageDialog(null,"This is a warning message",""
                 + "WARNING MESSAGE TYPE", 2);
         JOptionPane.showMessageDialog(null,"this is a warning message"
                 + "","QUESTION MESSAGE TYPE", 3); 
         
         
         //
         JOptionPane.showConfirmDialog(null, "This is a plain"
                 + "\nmessage type with option type", "WITH YES/NO OPTION"
                         + "", 2);
         
         */
         
         

         
         
         
    }
    
    public static void _neWindow(){
        
    }
    
    public static void _layeredPane(){
        
        //LABEL
        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.red);
        label1.setBounds(50,50,300,300);
        
        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.green);
        label2.setBounds(100,100,300,300);
        
        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.blue);
        label3.setBounds(150,150,300,300);
        
        
        JLabel label4 = new JLabel();
        label4.setOpaque(true);
        label4.setBackground(new Color(123,246,211));
        label4.setBounds(200,200,350,350);
        
        JLabel label5 = new JLabel();
        label5.setOpaque(true);
        label5.setBackground(new Color(231,184,222));
        label5.setBounds(250,250,350,350);
        
        
        //LAYERED PANE
        //Use the Integer wrapper class (Integer.valueOf()) to specify a layer.
        JLayeredPane pane = new JLayeredPane();
        pane.add(label1,Integer.valueOf(0));
        pane.add(label2,Integer.valueOf(1));
        pane.add(label3,Integer.valueOf(2));
        pane.add(label4,Integer.valueOf(3));
        pane.add(label5,Integer.valueOf(4));
        pane.setBounds(0,0,900,900);
        
        //FRAME
        JFrame frame = new JFrame("Layered Grame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900,900);
        frame.setLayout(null);
        frame.add(pane);
        frame.setVisible(true);
        
    }
    
    public static void window(){
        JFrame frame = new JFrame();
        frame.setTitle("Grid Layout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900,900);
        frame.setLayout(new GridLayout(3,3,5,5));
        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));
        frame.setFont(new Font("Times New Roman",Font.BOLD,50));
        frame.setVisible(true);
        
    }
    
}
