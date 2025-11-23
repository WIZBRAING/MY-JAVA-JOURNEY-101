/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myjavafx;

import java.util.Random;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.shape.Circle;
import javafx.scene.layout.Pane;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
/**
 *
 * @author WIZBRAIN
 */
public class NodeStyleDemo extends Application {
    
    @Override 
    public void start(Stage primaryStage){
        //Creating objects 
        Random rd = new Random();
        Color rdColor = Color.rgb(
                rd.nextInt(256), 
                    rd.nextInt(256), 
                    rd.nextInt(256));
        Label lb = new Label("label it");
        Button btn = new Button("OK");
        Circle cir = new Circle();
        Group gp = new Group(cir,btn);
        Pane pn = new Pane();
        Scene scn = new Scene(pn,500,500);

        
        //Setting label properties 
        //
        //sets label size;
        lb.setMinSize(100, 50);
        //sets label position 
        
        
        
        //Setting button properties 
        //
        //Setting Button width
        btn.setMinWidth(100);
        

        //Setting Circle propertties 
        //
        //sets fill color
        cir.setFill(rdColor);
        //sets stroke color
        cir.setStroke(Color.rgb(120,144,22).darker());
        //Sets Radius
        cir.setRadius(100);
        //centers circle on x-axis
        cir.setCenterX(250);
        //centers circle on y-axis
        cir.setCenterY(250);
        
        
        //Setting Properties of Pane
        //
        //adds btn to pane
        pn.getChildren().add(btn);
        //adds circ to pane 
        pn.getChildren().add(cir);
        //Adds label to pane 
        pn.getChildren().add(lb);
        
        //Setting Stage properties 
        //
        //Sets Stage title
        primaryStage.setTitle("Node Style Demo");
        //Adds Scene to stage
        primaryStage.setScene(scn);
        //Shows the stage
        primaryStage.show();
    }//END OF START
    
    
}//END OF CLASS
