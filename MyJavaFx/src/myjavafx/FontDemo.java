/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myjavafx;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.text.Font;
import javafx.scene.control.Label;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.Pane;


/**
 *
 * @author WIZBRAIN
 */
public class FontDemo extends Application {
    
    @Override 
    public void start(Stage primaryStage){
        
        //Creating objects 
        Font serif = new Font("SanSerif",16);
        
        Font rom = Font.font("Times New Roman",FontWeight.BOLD,
                FontPosture.ITALIC,12);
        
        Label lb = new Label("Fonts");
        
        Circle cir = new Circle();
        
        Pane pn = new StackPane();
        
        Scene scn = new Scene(pn,200,200);
        
        
        //Setting label properties 
        lb.setFont(rom);
        
        //Setting Circle properties 
        cir.setStyle("-fx-fill: white; -fx-stroke: black;");
        
        
        //Setting Pane properties 
        pn.getChildren().add(lb);
        pn.getChildren().add(cir);
        
        //Setting Stage properties 
        primaryStage.setTitle("FontsDemo");
        primaryStage.setScene(scn);
        primaryStage.show();
        
    }//END OF START 
    
}
