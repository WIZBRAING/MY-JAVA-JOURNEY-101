/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myjavafx;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.control.*;
import javafx.scene.shape.*;
import javafx.scene.text.*;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.geometry.HPos;
import java.util.Random;

/**
 *
 * @author WIZBRAIN
 */
public class GridPane_ extends Application {
    
    Random rand =  new Random();
    @Override 
    public void start(Stage primaryStage){

        
    }
    
    
    public void grid(Stage primaryStage){
        
        //PANE
        //Creates a new layout grid object
        GridPane gPane = new GridPane();
        
        //Centers the pane 
        gPane.setAlignment(Pos.CENTER); 
        
        //Sets pane padding 
        gPane.setPadding(new Insets(11.5,12.5,13.5,14.5));
        
        //Sets Horizontal gap between pane elements
        gPane.setHgap(5.5);
        
        //Sets Vertical gap between pane elements 
        gPane.setVgap(30);
        
        
        //LABELS
        //Creats labels
        Label lblFirstName = new Label("First Name");
        Label lblMiddleName = new Label("Middle Name");
        Label lblLastName = new Label("Last Name");
        
        //Increase Font Size of Labels
        lblFirstName.setFont(Font.font(20));
        lblMiddleName.setFont(Font.font(20));
        lblLastName.setFont(Font.font(20));
        
        
        
        //TEXTFIELDS
        //Creates text boxes 
        TextField txtFirstName = new TextField();
        TextField txtMiddleName = new TextField();
        TextField txtLastName = new TextField();

        
        
        
        //BUTTON
        //Creates button 
        Button btnAddName = new Button("Add Name");
        btnAddName.setAlignment(Pos.CENTER_LEFT);
        //Increase Font Size of btnAddName
        btnAddName.setFont(Font.font(20));
        
        
        
        //PANE
        //Show grid lines 
        gPane.setGridLinesVisible(false);
        //Add nodes to pane
        gPane.add(lblFirstName, 0, 0);
        gPane.add(txtFirstName, 1, 0);
        gPane.add(lblMiddleName, 0, 1);
        gPane.add(txtMiddleName, 1, 1);
        gPane.add(lblLastName, 0, 2);
        gPane.add(txtLastName, 1, 2);
        gPane.add(btnAddName, 1, 4);
        //gPane.getChildren().remove(lblFirstName);
        //Aligning btnAddName to the right 
        GridPane.setHalignment(btnAddName,HPos.RIGHT);
        //Sets the background of pane
        gPane.setBackground(new Background(new BackgroundFill(Color.rgb(
                145,237,89),new CornerRadii(150),Insets.EMPTY)));    
       GridPane.setColumnIndex(lblFirstName, 0);
        
        
        
        //SCENE 
        //Creates a scene 
        Scene gridScene = new Scene(gPane,500,500);
        //Sets the background of a scene
        //------------------------------
        gridScene.setFill(Color.rgb(getRandon(), getRandon(), 
                getRandon()));
        
        
        //STAGE
        //Sets Title of Stage 
        primaryStage.setTitle("GRID PANE");
        primaryStage.setScene(gridScene);
        primaryStage.show();
        
    }
    
    public int getRandon(){
        return rand.nextInt(257);
    }
}
