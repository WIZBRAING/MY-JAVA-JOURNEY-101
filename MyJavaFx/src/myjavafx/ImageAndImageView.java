/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myjavafx;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.HBox;
import javafx.geometry.Insets;
/**
 *
 * @author WIZBRAIN
 */
public class ImageAndImageView extends Application {
    /*--------------------------------------
    /---------------------------------------
    /-fitHeight: DoubleProperty
    /-fitWidth: DoubleProperty
    /-x: DoubleProperty
    /-y: DoubleProperty
    /-image: ObjectProperty<Image>
    /--------------------------------------
    /+ImageView()
    /+ImageView(image:Image)
    /+ImageView(fileName0rURL: String)
    */
    
    
    @Override 
    public void start(Stage primaryStage){
        Pane pn = new HBox(10);
        pn.setPadding(new Insets(15,15,5,15));
        Image img = new Image("imgs/OIP.jpeg");
        ImageView imgv = new ImageView(img);
        pn.getChildren().add(imgv);
        Scene scn = new Scene(pn,400,400);
        primaryStage.setScene(scn);
        
        //sets ImageView 
        ImageView imgv1 = new ImageView(img);
        imgv1.setFitWidth(1200);
        imgv1.setFitHeight(200);
        pn.getChildren().add(imgv1);
        
        
        //Stage
        primaryStage.setTitle("View Image");
        primaryStage.setScene(scn);
        primaryStage.show(); 
        
    }//END OF START 
    
}
