/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myjavafx;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.BorderPane;
/**
 *
 * @author WIZBRAIN
 */
public class VBox_And_HBox extends Application {
    
    @Override 
    public void start(Stage PrimaryStage){
        
    }
    
    
    
    
    public void borderPane(Stage primaryStage){
        //LABEL
        //TEXTFIELD
        
        
        
        
        //BUTTON
        //===============================
        
        
        
            
        //PANE
        //===========================
        //Creates a border pane
        BorderPane bPane = new BorderPane();
        
        //Adds button to BorderPane
        //--------------------------
        //bPane.setTop(btnTop);
        //bPane.setBottom(btnBottom);
        //bPane.setCenter(btnCenter);
        //bPane.setRight(btnRight);
        //bPane.setLeft(btnLeft);
        
        //Adds custom pane nodes to border pane
        //----------------------------------------
        bPane.setTop(getHBox());
          bPane.setBottom(new CustomPane("BOTTOM"));
            bPane.setCenter(new CustomPane("CENTER"));
              bPane.setRight(new CustomPane("RIGHT"));
                bPane.setLeft(getVBox());
                 //bPane.setRotate(180);
        
        //removes the top node 
        //--------------------
        //bPane.setTop(null);
        
        
        
        
        //SCENE
        //=================================
        //Creates a scene
        //---------------------------------
        Scene bScene = new Scene(bPane,400,400);
        
        
        
        
        //STAGE
        //===================================
        //Sets the title of the stage 
        //-----------------------------------
        primaryStage.setTitle("BORDER PANE");
        
        //Adds scene to stage
        //-----------------------------------
        primaryStage.setScene(bScene);
        
        //Shows stage 
        //---------------------------------
        primaryStage.show();
        
    }
    
    
    
    
    public static HBox getHBox(){
        //Creates horizontal box 
        HBox hBox = new HBox(15);
        //Sets padding of horizontal box
          hBox.setPadding(new Insets(15,15,15,15));
          //Sets background of HBox
            hBox.setBackground(new Background(new BackgroundFill(Color.GOLD,
                null,Insets.EMPTY)));
        //Adds Button to the HBox with 
        hBox.getChildren().add(new Button("Computer Science"));
          hBox.getChildren().add(new Button("Chemistry"));
          //Creates image
          Image img = new Image("imgs/OIP.jpeg");
          //Creats image viewer
        ImageView imgV = new ImageView(img);
        imgV.setFitHeight(64);
        imgV.setFitWidth(64);
         //Adds image to the HBox 
          hBox.getChildren().add(imgV);
          //
        return hBox;
    }
    
    
    
    
    public static VBox getVBox(){
        //Creates a VBox
        VBox vBox = new VBox(15);
        //Sets padding of VBox
        vBox.setPadding(new Insets(15,15,15,15));
        vBox.getChildren().add(new Label("Courses"));
        Label[] courses = {new Label("CSCI 1301"), new Label(
                "CSCI 1302"),new Label("CSCI 2410"), new Label(
                        "CSCI 3720")};
        for(Label course:courses){
            VBox.setMargin(course, new Insets(0,0,0,15));
            vBox.getChildren().add(course);
        }
        return vBox;
    }
}
