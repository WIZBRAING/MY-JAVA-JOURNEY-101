/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myjavafx;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.geometry.Insets;

/**
 *
 * @author WIZBRAIN
 */
public class BorderPane_  extends Application{
    
    @Override 
    public void start(Stage primaryStage){
        
    }
    
    public void borderPane(Stage primaryStage){
        //LABEL
        //TEXTFIELD
        
        
        
        
        //BUTTON
        //===============================
        //Creates buttons 
        //-------------------------------
        Button btnTop = new Button("TOP");
         Button btnRight = new Button("RIGTH");
          Button btnCenter = new Button("CENTER");
           Button btnBottom = new Button("BOTTOM");
            Button btnLeft = new Button("LEFT");
        
        //Aligns button to center 
        //-----------------------
        BorderPane.setAlignment(btnTop, Pos.CENTER);
         BorderPane.setAlignment(btnRight, Pos.CENTER);
          BorderPane.setAlignment(btnCenter, Pos.CENTER);
           BorderPane.setAlignment(btnBottom, Pos.CENTER);
            BorderPane.setAlignment(btnLeft, Pos.CENTER);
        
        
        
            
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
        bPane.setTop(new CustomPane("TOP"));
          bPane.setBottom(new CustomPane("BOTTOM"));
            bPane.setCenter(new CustomPane("CENTER"));
              bPane.setRight(new CustomPane("RIGHT"));
                bPane.setLeft(new CustomPane("LEFT"));
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
    
    
}




//CREATES A CUSTOM STACKPANE CLASS
class CustomPane extends StackPane{
    public CustomPane(String title){
        this.getChildren().add(new Label(title));
          this.setStyle("-fx-border-color:red;");
            this.setPadding(new Insets(11.5,12.5,13.5,14.5));
    }
}
