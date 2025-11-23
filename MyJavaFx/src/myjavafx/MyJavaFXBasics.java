/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myjavafx;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;
/**
 *
 * @author WIZBRAIN
 */
public class MyJavaFXBasics extends Application{
    
    @Override 
    public void start(Stage primaryStage){
       // circle(primaryStage);
        
    }
    
    public void circle(Stage primaryStage){
       Pane pn = new Pane();
       Circle cir = new Circle();
       cir.radiusProperty().bind(pn.heightProperty().divide(2));
       cir.setStroke(Color.DARKCYAN);
       cir.setFill(Color.rgb(120,45,189,0.4));
       cir.setStrokeWidth(4);
       pn.getChildren().add(cir);
       cir.centerXProperty().bind(pn.widthProperty().divide(2));
       cir.centerYProperty().bind(pn.heightProperty().divide(2));
       

       
       Scene sn = new Scene(pn,200,200);
       sn.setFill(Color.DARKGRAY);
       primaryStage.setTitle("Circle");
       primaryStage.setScene(sn);
       primaryStage.show();
    }

}
