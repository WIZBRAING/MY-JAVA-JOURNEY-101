/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package myjavafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.shape.Shape3D;
import javafx.scene.shape.Box;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.util.Random;
import javafx.scene.PerspectiveCamera;

//PRIMITIVE PROPERTIES
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.paint.Paint;
import javafx.scene.paint.RadialGradient;

/**
 *
 * @author WIZBRAIN
 */
public class MyJavaFx extends Application {
    
    @Override 
    public void start(Stage primaryStage){
        //MyJavaFXBasics pn = new MyJavaFXBasics();
        //pn.circle(primaryStage);
        
        //GridPane_ gp = new GridPane_();
        //gp.grid(primaryStage);
        
        //BorderPane_ bp = new BorderPane_();
        //bp.borderPane(primaryStage);
        
        //VBox_And_HBox vhb = new VBox_And_HBox();
        //vhb.borderPane(primaryStage);
        
        //Shapes shape = new Shapes();
        //shape.showShapes(primaryStage);
        
        //ShowClock clock = new ShowClock();
        //clock.showClock(primaryStage);

        Exercise ex = new Exercise();
        //ex.displayImages(primaryStage);
        //ex.tictactoe(primaryStage);
        //ex.displayText(primaryStage);
        //ex.displayCharacters(primaryStage);
        //ex.displayCylinder(primaryStage);
        //ex.displayFans(primaryStage);
        //ex.displayCards(primaryStage);
        //ex.smileyFace(primaryStage);
        //ex.displayBarChat(primaryStage);
        // ex.displayPieChart(primaryStage);
        //ex.rectanguloid_(primaryStage);
        //ex.displayStop(primaryStage);
        //ex.diplayGrid(primaryStage);
        //ex.displayHangman(primaryStage);
        //ex.displaySquareFunction(primaryStage);
        //ex.displaySinAndCosinPlot(primaryStage);
        //ex.displayArrow(primaryStage);
        //ex.displayCirclesAndDistance(primaryStage);
        ex.displayConnectedCircles(primaryStage);
        
        
        
        //Trial t = new Trial();
        //t.getTrial(primaryStage);
       // t.getClock(primaryStage);
        //t.display();
        
        AI ai = new AI();
        //ai.displayCylinder(primaryStage);
        //ai.displayPieChar(primaryStage);
        //ai.displayBarchart(primaryStage);
        //ai.progressBar(primaryStage);
        
    }//END OF START 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
       
    }
    
}
