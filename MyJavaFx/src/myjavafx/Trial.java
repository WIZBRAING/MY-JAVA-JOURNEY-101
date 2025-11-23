/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myjavafx;
import java.io.*;
import java.io.IOException;
import java.util.Random;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;
import javafx.scene.paint.Color;
import javafx.scene.shape.StrokeType;
import java.util.ArrayList;


/**
 *
 * @author WIZBRAIN
 */
public class Trial extends Application{
        @Override
    public void start(Stage primaryStage) {
        
    }
    
    public void getText(Stage primStage){
        Pane pn = new Pane();
        
        Text txt = new Text(200,200,"Hellow Programming.");
        
        //txt.setUnderline(true);
        
        txt.setStrikethrough(true);
        
        txt.xProperty().bind(pn.widthProperty().subtract(
                pn.widthProperty().divide(1.7)));
        txt.yProperty().bind(pn.heightProperty().subtract(
                pn.heightProperty().divide(1.7)));
        
        txt.setFont(Font.font("Times New Roman",FontWeight.BOLD,
                FontPosture.ITALIC,60));
        
        txt.setFill(Color.BLUE);
        pn.getChildren().add(txt);
        Label lbl = new Label("We Labelled black");
        lbl.setUnderline(true);
        lbl.setAlignment(Pos.CENTER);
        
        pn.getChildren().add(lbl);
        
        //SCENE
        Scene scene = new Scene(pn,400,400);
        
        primStage.setTitle("TEXTS");
        primStage.setScene(scene);
        primStage.show();
    }
    
    public void getLine(Stage primStage){
        Pane pn = new Pane();
        
        javafx.scene.shape.Line ln = new javafx.scene.shape.Line(10,10,10,10);
        
        ln.endXProperty().bind(pn.widthProperty().subtract(10));
        ln.endYProperty().bind(pn.heightProperty().subtract(10));
        ln.setStroke(Color.CHARTREUSE);
        ln.setFill(Color.CHOCOLATE);
        ln.setStrokeWidth(8);
        pn.getChildren().add(ln);
        
        for(int i=0; i<10; i++){
        javafx.scene.shape.Line ln1 = new javafx.scene.shape.Line(10,10,10,10);
        ln1.setRotate(i*360*8);
        ln1.endXProperty().bind(pn.widthProperty().subtract(10));
        ln1.endYProperty().bind(pn.heightProperty().subtract(10));
        pn.getChildren().add(ln1);
        }
        
        //SCENE
        Scene scene = new Scene(pn,500,500);
        
        //STAGE 
        primStage.setTitle("LINE");
        primStage.setScene(scene);
        primStage.show();
        
    }
    
    
    public void getRectangle(Stage primStage){
        Pane pn = new Pane();
        
        
        javafx.scene.shape.Rectangle rect = new javafx.scene.shape.Rectangle(
                0,0,200,100);
        rect.xProperty().bind(pn.widthProperty().divide(2));
        
        rect.yProperty().bind(pn.heightProperty().divide(2));
        
        rect.setFill(Color.ALICEBLUE);
        
        rect.setStroke(Color.ROSYBROWN);
        
        rect.setStrokeType(StrokeType.OUTSIDE); 
        
        rect.setStrokeWidth(15);
        
        pn.getChildren().add(rect);
        
        //SCENE
        Scene scene = new Scene(pn,500,500);
        
        primStage.setTitle("RECTANGLE");
        primStage.setScene(scene);
        primStage.show();
    }
    
    
    public static Color getColor(){
        Random rand = new Random();
        
        return Color.rgb(rand.nextInt(),rand.nextInt() , 
                rand.nextInt());
    }
    
    
    public static void getTrial(Stage primStage){
        javafx.scene.layout.VBox pn = new javafx.scene.layout.VBox();
        pn.setAlignment(Pos.CENTER);
        pn.setSpacing(20);
        
        //Creates Text
        Text txt = new Text(100,50,"Welcome To Java Progamming");
        txt.setRotate(45);
        txt.setFont(Font.font("Times New Roman",FontWeight.NORMAL,FontPosture.REGULAR,50));
        txt.setUnderline(true);
        pn.getChildren().add(txt);
        
        //Creates lines 
        javafx.scene.shape.Line ln1 = new javafx.scene.shape.Line(10,10,
                70,30);
        ln1.setStroke(Color.rgb(129, 242, 115));
        ln1.setStrokeWidth(10);
        pn.getChildren().add(ln1);
        
        
        //Create Rectangles
        javafx.scene.shape.Rectangle rect = new javafx.scene.shape.Rectangle(
                10,10,100,50);
        rect.setFill(Color.RED);
        pn.getChildren().add(rect);
        
        javafx.scene.shape.Rectangle rect1 = new javafx.scene.shape.Rectangle();
        rect1.setWidth(100);
        rect1.setHeight(200);
        rect1.setArcWidth(40);
        rect1.setArcHeight(20);
        pn.getChildren().add(rect1);
        
        
        //Creates semi circle
        javafx.scene.shape.Arc semi = new javafx.scene.shape.Arc();
        semi.setFill(Color.RED);
        semi.setCenterX(50);
        semi.setCenterY(50);
        semi.setRadiusX(50);
        semi.setRadiusY(50);
        semi.setStartAngle(0);
        semi.setLength(180);
        pn.getChildren().add(semi);
        
           
        //Creating polygon
        javafx.scene.shape.Polygon pgn = new javafx.scene.shape.Polygon(
                20, 40,30, 50, 40, 
                90, 90, 10, 10, 30);        
        pn.getChildren().add(pgn);
        
        
        //Creating polyline
        javafx.scene.shape.Polyline pl = new javafx.scene.shape.Polyline(
                20, 40,30, 50, 40, 
                90, 90, 10, 10, 30);
        pn.getChildren().add(pl);
        
        
        
        //SCENE
        Scene scene = new Scene(pn,200,200);
       
        
        primStage.setTitle("RECTANGLE");
        primStage.setScene(scene);
        primStage.show();
    }
    
    public void getClock(Stage primary){
        
        javafx.scene.image.Image image = new javafx.scene.image.Image("imgs/OIP.jpeg");
        javafx.scene.image.ImageView imageV = new javafx.scene.image.ImageView(image);
        //
        java.util.Calendar calendar = new java.util.GregorianCalendar();
        double hour = calendar.get(java.util.Calendar.HOUR);
        double minute = calendar.get(java.util.Calendar.MINUTE);
        double second = calendar.get(java.util.Calendar.SECOND);
        
        //Creating random objects 
        java.util.Random rand = new java.util.Random();
        double w=900;
        double h=900;
        double centerX = w/2;
        double centerY = h/2;
        double radius = Math.min(w, h)*0.8*0.5;
        
        //Creates pane 
        javafx.scene.layout.Pane pn = new javafx.scene.layout.Pane();
        javafx.scene.shape.Circle clock  = new javafx.scene.shape.Circle(centerX,centerY,radius);
        javafx.scene.shape.Circle clock_  = new javafx.scene.shape.Circle(centerX,centerY,radius+10);
        clock_.setFill(Color.TRANSPARENT);
        clock_.setStroke(Color.BLACK);
        clock_.setStrokeWidth(5);
        clock.setFill(Color.WHITE);
        clock.setStroke(Color.BLACK);
        
        //Creates clock
        pn.getChildren().add(clock);
        pn.getChildren().add(clock_);
        javafx.scene.text.Text txt12 = new javafx.scene.text.Text(centerX-6,centerY-radius+15,"12");
        pn.getChildren().add(txt12);
        javafx.scene.text.Text txt6 = new javafx.scene.text.Text(centerX-5,centerY+radius-2,"6");
        pn.getChildren().add(txt6);
        javafx.scene.text.Text txt9 = new javafx.scene.text.Text(centerX-radius+2,centerY,"9");
        pn.getChildren().add(txt9);
        javafx.scene.text.Text txt3 = new javafx.scene.text.Text(centerX+radius-12,centerY,"3");
        pn.getChildren().add(txt3);

        //Create seconds hand
        double sHand = radius * 0.8;
        double secondX = centerX + sHand*Math.sin(second*(2*Math.PI/60));
        double secondY = centerY - sHand*Math.cos(second*(2*Math.PI/60));
        javafx.scene.shape.Line sLine = new javafx.scene.shape.Line(centerX,
                centerY,secondX,secondY);
        sLine.setFill(Color.RED);
        pn.getChildren().add(sLine);
        
        
        //Create minute hand 
        double mHand = radius * 0.65;
        double minuteX = centerX + mHand * Math.sin(minute*(2*Math.PI/60));
        double minuteY = centerY - mHand * Math.cos(minute * (2*Math.PI/60));
        javafx.scene.shape.Line mLine = new javafx.scene.shape.Line(centerX,
                centerY,minuteX,minuteY);
        mLine.setFill(Color.GREEN);
        mLine.setStrokeWidth(3);
        pn.getChildren().add(mLine);
        
        //Create an hour hand 
        double hHand = radius * 0.5;
        double hourX = centerX + hHand * Math.sin((hour + minute/60)*(2*Math.PI/12));
        double hourY = centerY - hHand * Math.cos((hour + minute/60)*(2*Math.PI/12));
        javafx.scene.shape.Line hLine = new javafx.scene.shape.Line(centerX,
                centerY,hourX,hourY);
        hLine.setStroke(Color.BLUE);
        hLine.setStrokeWidth(5);
        pn.getChildren().add(hLine);
        
        //Creates line 
        javafx.scene.shape.Line line = new javafx.scene.shape.Line();
        line.setStroke(Color.BLACK);
        pn.getChildren().add(line);

        
        
        //SCENE AND STAGE 
        javafx.scene.Scene scene = new javafx.scene.Scene(pn,w,h);
        scene.setFill((Color.rgb(rand.nextInt(256), rand.nextInt(
                256), rand.nextInt(256))));
        
        primary.setTitle("CLOCK");
        primary.setScene(scene);
        primary.show();    

    }
    
    
    
}
