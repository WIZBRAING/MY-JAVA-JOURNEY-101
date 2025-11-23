/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myjavafx;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.text.*;
import javafx.scene.shape.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import java.io.*;
import javafx.scene.image.*;
import java.util.ArrayList;
import java.net.URL;
import java.util.Collections;
import javafx.scene.layout.HBox;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.scene.shape.*;
import javafx.collections.ObservableList;
import java.text.DecimalFormat;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Group;
import javafx.geometry.Point2D;

/**
 *
 * @author WIZBRAIN
 */
//EXERCISE 14.10 CYLINDER
//
//
public class Exercise extends Application {

    @Override
    public void start(Stage primary) {

    }

    /*public void displayImages(Stage primary){
        
        
        
        //CREATES A SCENE
        
        
        //WORKS ON STAGE 
    } */
    
     //EXERCISE 14.21//////////////////////////////////////////////
    //////////////////////////////////////////////////////////////   
    
    public void displayConnectedCircles(Stage primary){
        Pane pane = new Pane();
        
        getConnectedCircles( pane);
       
        Scene scene = new Scene(pane,600,600);
        primary.setScene(scene);
        primary.setTitle("DISPLAY TWO CIRCLES AND DISTANCE");
        primary.show();
    }
    
    public void getConnectedCircles(Pane pane){
        //Creates two circles
        Circle c1 = getCircle();
        c1.setFill(Color.WHITE);
        c1.setStroke(Color.BLACK);
        Circle c2 = getCircle();
        c2.setFill(Color.WHITE);
        c2.setStroke(Color.BLACK);
        
        //Gets the center coordinates of circle c1
        double c1CenterX = c1.getCenterX();
        double c1CenterY = c1.getCenterY();
        
        //Gets the center coordinates of circle c2
        double c2CenterX = c2.getCenterX();
        double c2CenterY = c2.getCenterY();
        
        double angle = getAngle(c1CenterX,c1CenterY,c2CenterX,
                    c2CenterY);
        double angle1 = getAngle(c2CenterX,c2CenterY,c1CenterX,
                    c1CenterY);
        //Gets line coordinates 
        double lineStartX = c1CenterX - 15*Math.cos(angle1);
        double lineStartY = c1CenterY - 15*Math.sin(angle1);
        double lineEndX   = c2CenterX - 15*Math.cos(angle);
        double lineEndY   = c2CenterY - 15*Math.sin(angle);
        
        Line lineBetweenCircles = getLine(lineStartX,lineStartY,
                              lineEndX,lineEndY);
        
        //Gets the actual label of circles 
        Text text1 = getText(c1CenterX,c1CenterY,"1");
        Text text2 = getText(c2CenterX,c2CenterY,"2");
        text1.setFont(Font.font("Times New Roman",20));
        text2.setFont(Font.font("Times New Roman",20));
        
        //Adds all elements to pane 
        pane.getChildren().addAll(c1,c2,
                lineBetweenCircles,text1,text2);
        
    }
    
    
    public double getAngle(double x1, double y1, double x2, double y2){ 
        
        return Math.atan2((y2-y1)-30, (x2-x1)-30);
    }
    
    
    
    
     //EXERCISE 14.21/////////////////////////////////////////////
    ///////////////////////////////////////////////////////////// 
    
    
    public void displayCirclesAndDistance(Stage primary){
        Pane pane = new Pane();
        
       getDistance(pane);
       
        Scene scene = new Scene(pane,600,600);
        primary.setScene(scene);
        primary.setTitle("DISPLAY TWO CIRCLES AND DISTANCE");
        primary.show();
    }
    
    public void getDistance(Pane pane){
        //Creates two circles
        Circle c1 = getCircle();
        Circle c2 = getCircle();
        
        //Gets the center coordinates of circle c1
        double c1CenterX = c1.getCenterX();
        double c1CenterY = c1.getCenterY();
        
        //Gets the center coordinates of circle c2
        double c2CenterX = c2.getCenterX();
        double c2CenterY = c2.getCenterY();
        
         //Gets line between circles 
        Line lineBetweenCircles = getLine(c1CenterX,c1CenterY,
                c2CenterX,c2CenterY);
        
        //Gets center of coordinates between circles 
        double textPosX = getTextPosition(c1CenterX,c2CenterX);
        double textPosY = getTextPosition(c1CenterY , c2CenterY);
        
        //Gets actual distance between circles 
        String distance = getDistance(c1CenterX,c1CenterY,c2CenterX,
                c2CenterY)+ "";
        
        //Gets the actual label of line between circles 
        Text text = getText(textPosX,textPosY,distance);
        text.setFont(Font.font("Times New Roman",50));
        
        //Adds all elements to pane 
        pane.getChildren().addAll(c1,c2,
                lineBetweenCircles,text);
        
    }
    
    
    public double getTextPosition(double c1X, double c2X){
        
        return (c1X +c2X)/2;
    }
    
    public double getDistance(double c1X, double c1Y, double c2X, double c2Y){
        
        Point2D p1 = new Point2D(c1X,c1Y);
        Point2D p2 = new Point2D(c2X,c2Y);
        return p1.distance(p2);
    }
    
    public Circle getCircle(){
        double centerX = new java.util.Random().nextInt(1800);
        double centerY = new java.util.Random().nextInt(1000);
        return getCircle(centerX,centerY,15);
    }
    
    
    public Circle getCircle( double radius){
        return new  Circle(radius);
    }
    
    
     //EXERCISE 14.20/////////////////////////////////////////////
    ///////////////////////////////////////////////////////////// 
    public static void displayArrow(Stage primary){
        Pane pane = new Pane();
       drawArrowLine(50,200,900,500,pane);
       
        Scene scene = new Scene(pane,600,600);
        primary.setScene(scene);
        primary.setTitle("DISPLAY GRID");
        primary.show();
    }
    public static void drawArrowLine(double startX, double startY,
            double endX, double endY, Pane pane){
        
        pane.getChildren().add(getArrow(startX,startY,endX,endY));
        
    }
    
    public static Polyline getArrow(double startX,double startY,double endX,
            double endY){
        
        Polyline arrow = new Polyline();
        ObservableList<Double> points = arrow.getPoints();
        
        double headLength = 15;
        double angle = Math.atan2(endY-startY, endX-startX);
        System.out.println(Math.toDegrees(Math.cos(angle)));
        
        double leftHeadX = endX - headLength*Math.cos(angle-Math.PI/6);
        double leftHeadY = endY - headLength*Math.sin(angle-Math.PI/6);
        
        double rightHeadX = endX - headLength*Math.cos(angle+Math.PI/6);
        double rightHeadY = endY - headLength*Math.sin(angle+Math.PI/6);
        
        points.addAll(startX,startY,endX,endY,
                leftHeadX,leftHeadY,endX,endY,
                rightHeadX,rightHeadY);
        
        return arrow;
        
    }
     //EXERCISE 14.19/////////////////////////////////////////////
    ///////////////////////////////////////////////////////////// 
    public void displaySinAndCosinPlot(Stage primary){
        Pane pn = new Pane();
        
        sinFunction(pn);
        cosinFunction(pn);
        
        drawXAxis(pn,1800,500,20);
        drawYAxis(pn,800,1000,20);
       
        
        Scene scene = new Scene(pn,600,600);
        primary.setScene(scene);
        primary.setTitle("DISPLAY GRID");
        primary.show();
    }
    
    public void cosinFunction(Pane pn){
        Polyline polyline = new Polyline();
        ObservableList<Double> list = polyline.getPoints();
        double scaleFactor = 50;
        for (int x = -170; x <= 170; x++) {
            list.add(x + 800.0);
            list.add(500 - 50 * Math.cos((x / 100.0) * 2 * Math.PI));
        }
        pn.getChildren().add(polyline);
    }
    
    public void sinFunction(Pane pn) {
        Polyline polyline = new Polyline();
        ObservableList<Double> list = polyline.getPoints();
        double scaleFactor = 50;
        for (int x = -170; x <= 170; x++) {
            list.add(x + 800.0);
            list.add(500 - 50 * Math.sin((x / 100.0) * 2 * Math.PI));
        }
        pn.getChildren().add(polyline);
    }
    
     //EXERCISE 14.18/////////////////////////////////////////////
    ///////////////////////////////////////////////////////////// 
    public void displaySquareFunction(Stage primary){
        Pane pn = new Pane();
        
        getSquareFunction(pn);
        
        drawXAxis(pn,1800,800,20);
        drawYAxis(pn,800,1000,20);
       
        
        Scene scene = new Scene(pn,600,600);
        primary.setScene(scene);
        primary.setTitle("DISPLAY GRID");
        primary.show();
    }
    
    
    
    public void getSquareFunction(Pane pn){
        Polyline line = new Polyline();
        
        ObservableList<Double> list = line.getPoints();
        double scaleFactor = 0.0125;
        for (int x = -200; x <= 200; x++) {
            list.add(x + 800.0);
            list.add(scaleFactor * x * x+300);
        }
        line.setRotate(180);
        
        pn.getChildren().add(line);
    }
    
    
    
    public void drawYAxis(Pane pn,double headX, double headY, double length){
        Polyline yLine = new Polyline();
        
        ObservableList<Double> list = yLine.getPoints();
        double startX = headX;
        double startY = 20;
        list.addAll(headX,headY,startX,startY);
        
        double rigthHeadX = startX+length*Math.cos(Math.toRadians(135));
        double rightHeadY = startY+length*Math.sin(Math.toRadians(135));
        double leftHeadX = startX+length*Math.cos(Math.toRadians(45)); 
        double leftHeadY = startY+length*Math.sin(Math.toRadians(45));
        list.addAll(rigthHeadX,rightHeadY,startX,
                startY,leftHeadX,leftHeadY);
        
        Text y = new Text(headX-5,startY-10,"Y");
        
        pn.getChildren().add(y);
        
        pn.getChildren().add(yLine);
    }
    
    
    public void drawXAxis(Pane pn, double headX, double headY, double length){
        Polyline xLine = new Polyline();
        
        ObservableList<Double> list = xLine.getPoints();
        double startX = 0;
        double startY = headY;
        list.addAll(startX,startY,headX,headY);
        
        double rigthHeadX = headX+length*Math.cos(Math.toRadians(225));
        double rightHeadY = headY+length*Math.sin(Math.toRadians(225));
        double leftHeadX = headX+length*Math.cos(Math.toRadians(135)); 
        double leftHeadY = headY+length*Math.sin(Math.toRadians(135));
        list.addAll(rigthHeadX,rightHeadY,headX,
                headY,leftHeadX,leftHeadY);
        
        Text x = new Text(headX+10,headY,"X");
        pn.getChildren().add(x);
        
        pn.getChildren().add(xLine);
    }
    
    
     //EXERCISE 14.17/////////////////////////////////////////////
    ///////////////////////////////////////////////////////////// 
    public void displayHangman(Stage primary){
        Pane hangman = getHangMan(500,500);
        
        Scene scene = new Scene(hangman,600,600);
        primary.setScene(scene);
        primary.setTitle("DISPLAY HANGMAN");
        primary.show();
    }
    
    public Pane getHangMan(double startX,double startY){
        Pane pane = new Pane();
        
        double rightLegX =(startX+(startX*0.5)) 
                + ((startY-startY*0.7)*0.4) *
                Math.cos(Math.toRadians(45));
        
        double rightLegY = (startY-startY*0.3)
                + ((startY-startY*0.7)*0.4) *
                Math.sin(Math.toRadians(45)); 
        
        Line hangManRightLeg = getLine((startX+(startX*0.5)),(startY-startY*0.3),
                rightLegX,rightLegY);
        pane.getChildren().add(hangManRightLeg);
        
        double leftLegX = (startX+(startX*0.5)) 
                + ((startY-startY*0.7)*0.4) *
                Math.cos(Math.toRadians(135));
                
        double leftLegY = (startY-startY*0.3)
                + ((startY-startY*0.7)*0.4) *
                Math.sin(Math.toRadians(135));
        
        Line hangManLeftLeg = getLine((startX+(startX*0.5)),(startY-startY*0.3),
                leftLegX,leftLegY);
        pane.getChildren().add(hangManLeftLeg);
        
        Line hangManBody = getLine((startX+(startX*0.5)),(startY-startY*0.7)
                +((startY-startY*0.7)*0.3)+((startY-startY*0.7)*0.2)*2,
                (startX+(startX*0.5)),(startY-startY*0.3)); 
        pane.getChildren().add(hangManBody);
        
        double leftX = (startX+(startX*0.5)) 
                + ((startY-startY*0.7)*0.2) *
                Math.cos(Math.toRadians(135));
                
        double leftY = ((startY-startY*0.7)+((startY-startY*0.7)*0.3)+
                ((startY-startY*0.7)*0.2)) 
                + ((startY-startY*0.7)*0.2) *
                Math.sin(Math.toRadians(135));
        
        Line hangManLeftHand = getLine(leftX,leftY,
                (leftX-((startX-startX*0.7)*0.2)),
                (leftY+((startY-startY*0.7)*0.2)));
        pane.getChildren().add(hangManLeftHand);
        
        double rigthX = (startX+(startX*0.5)) 
                + ((startY-startY*0.7)*0.2) *
                Math.cos(Math.toRadians(45));
        
        double rightY = ((startY-startY*0.7)+((startY-startY*0.7)*0.3)+
                ((startY-startY*0.7)*0.2)) 
                + ((startY-startY*0.7)*0.2) *
                Math.sin(Math.toRadians(45));
        
        Line hangManRightHand = getLine(rigthX,rightY,
                (rigthX+((startX-startX*0.7)*0.2)),
                (rightY+((startY-startY*0.7)*0.2)));
        pane.getChildren().add(hangManRightHand);
        
        Circle hangManHead = getCircle((startX+(startX*0.5)),(startY-startY*0.7)
                +((startY-startY*0.7)*0.3)+((startY-startY*0.7)*0.2),
                ((startY-startY*0.7)*0.2));
        hangManHead.setFill(Color.TRANSPARENT);
        hangManHead.setStroke(Color.BLACK);
        pane.getChildren().add(hangManHead);
        
        Line hangFinger = getLine((startX+(startX*0.5)),(startY-startY*0.7),
                (startX+(startX*0.5)),(startY-startY*0.7)+((startY-startY*0.7)*0.3));
        pane.getChildren().add(hangFinger);
        
        Line hangArm = getLine(startX,(startY-startY*0.7),(startX+(startX*0.5)),
                (startY-startY*0.7));
        pane.getChildren().add(hangArm);
        
        Line hangBody = getLine(startX,(startY),startX,(startY-startY*0.7));
        pane.getChildren().add(hangBody);
        
        Arc hangStand = getArc(startX,startY+50,50,50,
                30,120);
        hangStand.setFill(Color.TRANSPARENT);
        hangStand.setStroke(Color.BLACK);
        pane.getChildren().add(hangStand);
        
        return pane;
    }
    
    public void getHangManRightLeg(Group pane, double startX,double startY){
        
        double rightLegX =(startX+(startX*0.5)) 
                + ((startY-startY*0.7)*0.4) *
                Math.cos(Math.toRadians(45));
        
        double rightLegY = (startY-startY*0.3)
                + ((startY-startY*0.7)*0.4) *
                Math.sin(Math.toRadians(45)); 
        
        Line hangManRightLeg = getLine((startX+(startX*0.5)),(startY-startY*0.3),
                rightLegX,rightLegY);
        pane.getChildren().add(hangManRightLeg);
    }
    
    
    public void getHangManLeftLeg(Group pane, double startX,double startY){
        
        double leftLegX = (startX+(startX*0.5)) 
                + ((startY-startY*0.7)*0.4) *
                Math.cos(Math.toRadians(135));
                
        double leftLegY = (startY-startY*0.3)
                + ((startY-startY*0.7)*0.4) *
                Math.sin(Math.toRadians(135));
        
        Line hangManLeftLeg = getLine((startX+(startX*0.5)),(startY-startY*0.3),
                leftLegX,leftLegY);
        pane.getChildren().add(hangManLeftLeg);
    }
    
    
    public void getHangManBody(Group pane, double startX,double startY){
        
        Line hangManBody = getLine((startX+(startX*0.5)),(startY-startY*0.7)
                +((startY-startY*0.7)*0.3)+((startY-startY*0.7)*0.2)*2,
                (startX+(startX*0.5)),(startY-startY*0.3)); 
        pane.getChildren().add(hangManBody);
    }
    
    
    public void getHangManLeftHand(Group pane, double startX,double startY){
        double leftX = (startX+(startX*0.5)) 
                + ((startY-startY*0.7)*0.2) *
                Math.cos(Math.toRadians(135));
                
        double leftY = ((startY-startY*0.7)+((startY-startY*0.7)*0.3)+
                ((startY-startY*0.7)*0.2)) 
                + ((startY-startY*0.7)*0.2) *
                Math.sin(Math.toRadians(135));
        
        Line hangManLeftHand = getLine(leftX,leftY,
                (leftX-((startX-startX*0.7)*0.2)),
                (leftY+((startY-startY*0.7)*0.2)));
        pane.getChildren().add(hangManLeftHand);

    }
    
    
    public void getHangManRightHand(Group pane, double startX,double startY){
        
        double rigthX = (startX+(startX*0.5)) 
                + ((startY-startY*0.7)*0.2) *
                Math.cos(Math.toRadians(45));
        
        double rightY = ((startY-startY*0.7)+((startY-startY*0.7)*0.3)+
                ((startY-startY*0.7)*0.2)) 
                + ((startY-startY*0.7)*0.2) *
                Math.sin(Math.toRadians(45));
        
        Line hangManRightHand = getLine(rigthX,rightY,
                (rigthX+((startX-startX*0.7)*0.2)),
                (rightY+((startY-startY*0.7)*0.2)));
        pane.getChildren().add(hangManRightHand);
    }
    
    
    public void getHangManHead(Group pane, double startX,double startY){
        
        Circle hangManHead = getCircle((startX+(startX*0.5)),(startY-startY*0.7)
                +((startY-startY*0.7)*0.3)+((startY-startY*0.7)*0.2),
                ((startY-startY*0.7)*0.2));
        hangManHead.setFill(Color.TRANSPARENT);
        hangManHead.setStroke(Color.BLACK);
        pane.getChildren().add(hangManHead);
    }
    
    
    public void getHangFinger(Group pane, double startX,double startY){
        
        Line hangFinger = getLine((startX+(startX*0.5)),(startY-startY*0.7),
                (startX+(startX*0.5)),(startY-startY*0.7)+((startY-startY*0.7)*
                        0.3));
        pane.getChildren().add(hangFinger);
        
    }
    
    
    public void getHangArm(Group pane, double startX,double startY){
        
        Line hangArm = getLine(startX,(startY-startY*0.7),(startX+(startX*0.5)),
                (startY-startY*0.7));
        pane.getChildren().add(hangArm);
    }
    
    
    public void getHangBody(Group pane, double startX, double startY){
        Line hangBody = getLine(startX,(startY),startX,(startY-startY*0.7));
        pane.getChildren().add(hangBody);
    }
    
    
    public void getHangStand(Group pane, double startX,double startY){
        
        Arc hangStand = getArc(startX,startY+50,50,50,
                30,120);
        hangStand.setFill(Color.TRANSPARENT);
        hangStand.setStroke(Color.BLACK);
        pane.getChildren().add(hangStand);
    }
    
    
    public Circle getCircle(double centerX, double centerY,double radius){
        return new Circle(centerX,centerY,radius);
    }
    
    
    public Arc getArc(double centerX, double centerY,double radiusX, double 
            radiusY, double startAngle,double length){
        
        Arc arc = new Arc(centerX, centerY,radiusX, radiusY,
                startAngle,length);
        
        return arc;
    }
    
     //EXERCISE 14.16/////////////////////////////////////////////
    /////////////////////////////////////////////////////////////  
    public void diplayGrid(Stage primary){
        Pane pn = getGrid(200,200,3,3);
        
        Scene scene = new Scene(pn,600,600);
        primary.setScene(scene);
        primary.setTitle("DISPLAY GRID");
        primary.show();
    }
    
    public Pane getGrid(double startX, double startY,double col, double row,
            double colSize,double rowSize){
        
        Pane pane = new Pane();
        
        double diffX = colSize;
        double diffY = rowSize;
        
        double endX = startX ;
        double endY = startY ;
        
        for(int i=0; i<=col; i++){
            pane.getChildren().add(getLine(startX,startY,(endX+(diffX*i)),(endY+diffY*(col))));
        }
        
        for(int i=0; i<=row; i++){
            pane.getChildren().add(getLine(startX,startY,(endX+diffX*row),(endY+diffY*i)));
        }
        
        return pane;
    }
    
    
    public Pane getGrid(double startX, double startY,double col, double row){
        Pane pane = new Pane();
        Group gp = new Group();
        
        double diffX = 100;
        double diffY = 100;
        
        double endX = startX ;
        double endY = startY ;
        
        for(int i=0; i<=col; i++){
            
            Line vLine = getLine(startX+diffX*i,startY,(endX+(diffX*i)),
                    (endY+diffY*(col)));
            
            vLine.setStroke(Color.RED);
            
            gp.getChildren().add(vLine);
        }
        
        for(int i=0; i<=row; i++){
            Line hLine = getLine(startX,startY+diffY*i,(endX+diffX*row),
                    (endY+diffY*i));
            
            hLine.setStroke(Color.BLUE);
            
            gp.getChildren().add(hLine);
        }
        pane.getChildren().add(gp);
        
        
        return pane;
    }
    
    
    
    
    public GridPane getGrid(int col, int row){
        GridPane gp = new GridPane();
        gp.setGridLinesVisible(true);
        gp.setPrefSize(500,500);
        
        //gp.setHgap(20);
        //gp.setVgap(20);
        gp.setPadding(new Insets(10));
        gp.setAlignment(Pos.CENTER);
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
            gp.add( getRect(i,j,100,80), 
                    i,j);
            }
        }
        return gp; 
    }
    
    

     //EXERCISE 14.15/////////////////////////////////////////////
    /////////////////////////////////////////////////////////////  
    public void displayStop(Stage primary){
        
        
        Scene scene = new Scene(getStop(),600,600,
                Color.ALICEBLUE);
        
        Image icon = new Image("myjavafx/images/OIP.jpeg");
        primary.getIcons().add(icon);
        primary.setScene(scene);
        primary.setTitle("STOP");
        primary.show();
    }
    
    
    public Pane getStop(){
        StackPane pane = new StackPane();
        pane.setAlignment(Pos.CENTER);
        
        double centerX = 200;
        double centerY = 200;
        
        //Pane octagonStop = new Shapes().getPolygon();
        Polygon octagonStop = getPolygon(centerX,centerY,8);
        Text octagTexStopt = getText(centerX,centerY,"STOP");
        
        pane.getChildren().addAll(octagonStop,octagTexStopt);
     
        
        return pane;
    }
    
    
    public Polygon getPolygon(double centerX,double centerY, int sides){
        Polygon poly = new Polygon(centerX, centerY);
        poly.setRotate(22);
        //Gets random color values
        int r = new java.util.Random().nextInt(256);
        int g = new java.util.Random().nextInt(256);
        int b = new java.util.Random().nextInt(256);
        //Sets poly to random color
        poly.setFill(Color.rgb(r, g, b));
        
        //Poly points 
        double pointX = 0;
        double pointY =0;
        
        //Sets sides polypint 
        for(int i=0; i<=sides; i++){
            pointX = centerX +(centerX*0.6)*Math.cos(i*2*Math.PI/sides);
            pointY = centerX - (centerX*0.6)*Math.sin(i*2*Math.PI/sides);
            poly.getPoints().add(pointX);
            poly.getPoints().add(pointY);
        }

        return poly;
    }
    
    
    public Text getText(double startX, double startY, String info){
        
        Text txt = new Text(startX,startY,info);
        txt.setFill(Color.BLACK);
        txt.setFont(Font.font("Times New Roman",
                FontWeight.LIGHT,FontPosture.REGULAR,(startX*0.3)));
        
        return txt;
    }
    
     //EXERCISE 14.14/////////////////////////////////////////////
    /////////////////////////////////////////////////////////////
    public void rectanguloid_(Stage primary){
        Pane pn = new Pane();
        
        //Rectangle width and heigth 
        double width = 200;
        double heigth = 200;
        double diffY = width/2;
        double diffX = heigth/2; 
        
        //Rectangle centers 
        double rect1centerX = 200; 
        double rect1centerY =200;
        
        double rect2centerX = rect1centerX-diffX;
        double rect2centerY = rect1centerY+diffY;

        //Creating rectangles
        Rectangle r1 = getRect(rect1centerX,rect1centerY,width,heigth);
        Rectangle r2 = getRect(rect2centerX, rect2centerY,width,heigth);
        //r2.setFill(Color.BLUE);
        
        //Creating Polygon coordinates 
        Polygon plgn = new Polygon();
        
        double ln1StartX = rect1centerX ;
        double ln1StartY = rect1centerY ;
        double ln1End1X = rect2centerX ;
        double ln1EndY = rect2centerY ;

        double ln2StartX = rect1centerX*2;
        double ln2StartY = rect1centerY ;
        double ln2End1X = rect2centerX + 2*diffX;
        double ln2EndY = rect2centerY;

        plgn.getPoints().addAll(ln1StartX ,ln1StartY,
                ln1End1X,ln1EndY,ln2StartX,
                ln2StartY,ln2End1X,ln2EndY);
        
        
        //Creates second polygon coordinates 
        Polygon plgn1 = new Polygon(rect1centerX,rect1centerX);
        
        double ln3StartX = rect1centerX ;
        double ln3StartY = rect1centerY + 2*diffY;
        double ln3End1X = rect2centerX ;
        double ln3EndY = rect2centerY + 2*diffY;

        
        double ln4StartX = rect1centerX + 2*diffX;
        double ln4StartY = rect1centerY + 2*diffY;
        double ln4End1X = rect2centerX + 2*diffX;
        double ln4EndY = rect2centerY + 2*diffY;
        plgn1.getPoints().addAll(ln3StartX,ln3StartY,
                ln3End1X,ln3EndY,ln4StartX,
                ln4StartY,ln4End1X,ln4EndY); 
        
        pn.getChildren().addAll(r1,plgn,plgn1,r2);
        
        Scene scene = new Scene(pn);
        primary.setScene(scene);
        primary.setTitle("RECTANGULOID");
        primary.show();
    }
    
    
    public void rectanguloid(Stage primary){
        Pane pn = new Pane();
        
        //Rectangle width and heigth 
        double width = 200;
        double heigth = 200;
        double diffY = width/2;
        double diffX = heigth/2; 
        
        //Rectangle centers 
        double rect1centerX = 200; 
        double rect1centerY =200;
        
        double rect2centerX = rect1centerX-diffX;
        double rect2centerY = rect1centerY+diffY;

        //Creating rectangles
        Rectangle r1 = getRect(rect1centerX,rect1centerY,width,heigth);
        Rectangle r2 = getRect(rect2centerX, rect2centerY,width,heigth);
        //r2.setFill(Color.BLUE);
        
        //Creating line coordinates 
        double ln1StartX = rect1centerX ;
        double ln1StartY = rect1centerY ;
        double ln1End1X = rect2centerX ;
        double ln1EndY = rect2centerY ;
        Line ln1 = getLine(ln1StartX,ln1StartY,ln1End1X,ln1EndY);
        
        double ln2StartX = rect1centerX*2;
        double ln2StartY = rect1centerY ;
        double ln2End1X = rect2centerX + 2*diffX;
        double ln2EndY = rect2centerY;
        Line ln2 = getLine(ln2StartX,ln2StartY,ln2End1X,ln2EndY);
        
        
        double ln3StartX = rect1centerX ;
        double ln3StartY = rect1centerY + 2*diffY;
        double ln3End1X = rect2centerX ;
        double ln3EndY = rect2centerY + 2*diffY;
        Line ln3 = getLine(ln3StartX,ln3StartY,ln3End1X,ln3EndY);
        
        double ln4StartX = rect1centerX + 2*diffX;
        double ln4StartY = rect1centerY + 2*diffY;
        double ln4End1X = rect2centerX + 2*diffX;
        double ln4EndY = rect2centerY + 2*diffY;
        Line ln4 = getLine(ln4StartX,ln4StartY,ln4End1X,ln4EndY); 
        
        pn.getChildren().addAll(r1,ln1,ln2,ln3,
                ln4,r2);
        
        Scene scene = new Scene(pn);
        primary.setScene(scene);
        primary.setTitle("RECTANGULOID");
        primary.show();
        
    }
    
    public  Rectangle getRect(double centerX,double centerY, double width, 
            double heigth){
        
        int r = new java.util.Random().nextInt(256);
        int g = new java.util.Random().nextInt(256);
        int b = new java.util.Random().nextInt(256);
        
        Rectangle rect = new Rectangle(centerX,centerY, width,heigth);
        rect.setStroke(Color.BLACK);
        //rect.setFill(Color.rgb(r, g, b));
        rect.setFill(Color.TRANSPARENT);
        
        return rect;
    }
    
    public Line getLine(double startX,double startY,double endX,double endY){
        
        return new Line(startX, startY, endX, endY);
    }
    
    
    
     //EXERCISE 14.13/////////////////////////////////////////////
    /////////////////////////////////////////////////////////////
    
    public void displayPieChart(Stage primary){
        
        //GridPane 
        GridPane gp = new GridPane();
        gp.setAlignment(Pos.CENTER);
        
        //Draws a pie chart 
        Pane pieChart = pieChart(500,400,300,100,150,50,10);
        gp.getChildren().add(pieChart);
        //Scene and Stage 
        Scene scene = new Scene(gp);
        primary.setScene(scene);
        primary.setTitle("PIE CHART");
        primary.show();
    }
    
    public Pane pieChart(double centerX,double centerY,double radius,double... val){
        //Creates random object 
        java.util.Random rand = new java.util.Random();
        Pane pn = new Pane();
        
        double[] values = val;
        
        int total = sum(val);
        
        double offsetAngle =0; 
        
        double arcAngle = 0;
        
        
        //Arc text values;
        double txtCenterX = 0;
         String[] text = {"Project","Quiz","Mid Term","Final"};
        double txtCenterY =0;
        
        
        
        Arc arc;
        
        for(int i=0; i<values.length; i++){
            
            //Calculates ar angle 
            arcAngle =(360) * values[i]/1.0/total; 
            //Draws arc 
            arc = pieArc(centerX,centerY,radius,offsetAngle,arcAngle);
            //Sets the inner color of arc
            arc.setFill(Color.rgb(rand.nextInt(256), 
                    rand.nextInt(256), rand.nextInt(256)));
            //Adds arc to pane 
            pn.getChildren().add(arc);
            
             
            //Adding text to arc
            txtCenterX = centerX + radius * Math.cos(Math.toRadians
        (offsetAngle +arcAngle/2));
            txtCenterY = centerY - radius * Math.sin(Math.toRadians
        (offsetAngle +arcAngle/2));
            
            Text txt = pieText(txtCenterX,txtCenterY,
                    text[i],values[i]);
            txt.setX(txtCenterX - txt.getLayoutBounds().getWidth()*0.3);
            txt.setY(txtCenterY+txt.getLayoutBounds().getHeight()/2);
            //txt.setRotate(90*i);
            pn.getChildren().add(txt);
            
            
            //sets offset angle of arc 
            offsetAngle += arcAngle;
        }
        
        return pn;

    }
    
    
    private int sum(double[] value){
        int sum =0;
        for(double i: value){
            sum += i;
        }
        return sum;
    }
    
    
    public Arc pieArc(double centerX,double centerY,double radius, 
           double offsetAngle, double angle){
        
        Arc arc = new Arc(centerX,centerY,radius,radius,
                offsetAngle,angle);
        
        arc.setType(ArcType.ROUND);
        arc.setStroke(Color.BLACK);
        
        return arc;
    }
    
     
    public Text pieText(double centerX, double centerY,String text, double val){
        
        String info = text+"--"+val;

        return  new Text(centerX,centerY,info);
    }
    
    
    
    //EXERCISE 14.12/////////////////////////////////////////////
    ////////////////////////////////////////////////////////////
    
    public void displayBarChat(Stage primary){
        Pane pn = new Pane();
        
        PerspectiveCamera camera = new PerspectiveCamera();
        camera.setTranslateZ(-300);
        camera.setTranslateX(-500);
        camera.setTranslateY(500);
        setBarChart(pn);
        
        GridPane gp = new GridPane();
        gp.getChildren().add(pn);
        gp.setAlignment(Pos.CENTER);
        
        //Scene and Stage 
        Scene scene = new Scene(gp);
        scene.setCamera(camera);
        primary.setScene(scene);
        primary.setTitle("BAR CHARTS");
        primary.show();
        
    }
    
    public void setBarChart(Pane pn){
        
        DecimalFormat dformat = new DecimalFormat("#.00");
        
         //creates a random object for heigth
        java.util.Random rand = new java.util.Random();

        //Creates variables bar chart variables
        double width = 200;
        double heigth =Double.valueOf((dformat.format((rand.nextDouble()*100))));
        double centerX = 150;
        double centerY = 150-heigth;
        
        //Labels for text 
        String[] text = {"Project","Quiz","Mid Term","Final"};
        
        double remaining = 100;
        for(int i=0; i<4; i++){
            
            addTextChart(pn, centerX, centerY, 
            width, heigth,text[i]);
                                
            drawRectangle(pn,centerX,centerY,width,heigth);
            remaining -= heigth;
            heigth = Double.valueOf((dformat.format((rand.nextDouble()*(remaining)))));
            centerY = 150- heigth; 
            centerX +=width +20;
            
        }
    }
    
    
    public Pane drawBarchart(double centerX, double centerY, 
            double width, double heigth,Color color, String text){
        
        Pane pn = new Pane();
        Rectangle rectangle = new Rectangle(centerX,centerY,width,
                heigth);
        rectangle.setFill(color);
        
        pn.getChildren().add(rectangle);
        
            addTextChart(pn, centerX, centerY, 
            width, heigth,text);
            
        return pn;
    }
    
    public void drawRectangle(Pane pn,double centerX, double centerY, 
            double width, double heigth){

        Rectangle rectangle = new Rectangle(centerX,centerY,width,
                heigth);
        rectangle.setFill(Color.DARKGRAY);
        pn.getChildren().add(rectangle);
        

    }
    
    
    public void addTextChart(Pane pn,double centerX,double centerY, double
            width,double heigth,String text){
        
        double startX = centerX;
        double startY = centerY-10;
        String label = text+"--"+heigth+"%";
        Text txt = new Text(startX,startY,label);
        pn.getChildren().add(txt);
        
        
    }
    //EXERCISE 14.11/////////////////////////////////////////////
    ////////////////////////////////////////////////////////////
    public void smileyFace(Stage primary){
        GridPane bp = new GridPane();
        bp.setAlignment(Pos.CENTER);
        bp.setHgap(50);
        bp.setVgap(150);
        
         for(int i=0; i<3; i++){
            for(int j=0; j<5;j++){
                bp.add(getFace(), j, i);
            }
         }
        
        //Scene and Stage 
        Scene scene = new Scene(bp,500,500);
        primary.setScene(scene);
        primary.setTitle("SMILEY FACE");
        primary.show();
        
    }
    
    
    
    public Pane getFace(){
        Pane pn = new Pane();
        double centerX = 200; 
        double centerY = 200;
        double radius = 150;
        
        Circle face = new Circle(centerX,centerY,150);
        face.setFill(Color.WHITE);
        face.setStroke(Color.BLACK);
        pn.getChildren().add(face); 
        
        //left eye geometry
        double leftEyeCenterX = centerX -(radius*0.4);
        double leftEyeCenterY = centerY - (radius*0.4);
        double leftEyeRadiusX = radius * 0.2;
        double leftEyeRadiusY = leftEyeRadiusX * 0.8;
        //draw left eye
        drawEye(pn,leftEyeCenterX,leftEyeCenterY,
                leftEyeRadiusX,leftEyeRadiusY);
        
        //Right eye geometry
        double rightEyeCenterX = centerX +(radius*0.4);
        double rightEyeCenterY = centerY - (radius*0.4);
        double rightEyeRadiusX = radius * 0.2;
        double rightEyeRadiusY = rightEyeRadiusX * 0.8;
        //draw right eye
       drawEye(pn,rightEyeCenterX,rightEyeCenterY,
                rightEyeRadiusX,rightEyeRadiusY);
        
        //Nose geometry 
        ArrayList<Double> points = new ArrayList<>();
        for(int i=0; i<3; i++){
            points.add(centerX+(radius*0.3)*Math.sin(i*2*Math.PI/3));
            points.add(centerY-(radius*0.3)*Math.cos(i*2*Math.PI/3));
        }
            points.add(centerX+(radius*0.3)*Math.sin(0*2*Math.PI/3));
            points.add(centerY-(radius*0.3)*Math.cos(0*2*Math.PI/3));
            
        //draw nose 
        drawNose(pn,centerX,centerY,points);
        
        //Mouth geometries 
        double mouthRadiusX = radius * 0.6;
        double mouthRadiusY = radius * 0.6;
        double mouthStartAngle = -45;
        double mouthAngle = -90;
        //draw mouth 
        drawMouth(pn,centerX,centerY,mouthRadiusX,mouthRadiusY,
                mouthStartAngle,mouthAngle);
        
// centerX+(radius*0.3)*Math.sin(i*2*Math.PI/2);
        
        return pn;
    }   
    
    
    public void drawEye(Pane pn,double centerX, double centerY, double  radiusX ,double radiusY){
        Ellipse iris = new Ellipse(centerX,centerY,radiusX,radiusY);
        iris.setStroke(Color.BLACK);
        iris.setFill(Color.WHITE);
        pn.getChildren().add(iris);
        
        Circle pupil = new Circle(centerX,centerY,radiusY*0.5);
        pn.getChildren().add(pupil);
        
    }
    
    
    public void drawNose(Pane pn,double centerX,double centerY, ArrayList<Double> points ){
        Polygon pgn = new Polygon(centerX,centerY);
        javafx.collections.ObservableList list = pgn.getPoints();
        for( double a: points){
            list.add(a);
        }
        
        pn.getChildren().add(pgn);
    }
    
    
    public void drawMouth(Pane pn,double centerX,double centerY,double radiusX,
            double radiusY,double offsetAngle, double angle){
        
        Arc arc = new Arc(centerX,centerY,radiusX,radiusY,
                offsetAngle,angle);
        arc.setType(ArcType.CHORD);

        
        
        pn.getChildren().add(arc);
    }
    
    //EXERCISE 14.10/////////////////////////////////////////////
    ////////////////////////////////////////////////////////////
    public void displayCylinder(Stage primary){
        GridPane gp = new GridPane();
        gp.setAlignment(Pos.CENTER);

                gp.getChildren().add(getCylinder());

        
        
        //Scene and Stage 
        Scene scene = new Scene(gp,500,500);
        //Stage 
        primary.setTitle("FAN");
        primary.setScene(scene);
        primary.show();
    }
    
    
    
    public Pane getCylinder(){
        Cylinder cdr = new Cylinder(50,100);
        
        Pane pane = new Pane();
        pane.getChildren().add(cdr);
        
        return pane;
    }
    //EXERCISE 14.9/////////////////////////////////////////////
    ////////////////////////////////////////////////////////////
    public void displayFans(Stage primary){
        GridPane gp = new GridPane();
        gp.setAlignment(Pos.CENTER);
        gp.setHgap(150);
        gp.setVgap(150);
        
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                gp.add(getArc(), j, i);
            }
        }
        
        
        //Scene and Stage 
        Scene scene = new Scene(gp,500,500);
        //Stage 
        primary.setTitle("FAN");
        primary.setScene(scene);
        primary.show();
    }
    
    
    
    
    public Pane getArc(){
        Pane pane = new Pane();
        double radius = 100;
        double centerY = 200;
        double centerX =200;
        
        //Creates a circle
        Circle cir = new Circle(centerX,centerY,radius);
        cir.setFill(Color.CADETBLUE);
        cir.setStroke(Color.BLACK);
       pane.getChildren().add(cir);
        Color[] color = {Color.WHITE,Color.BLACK};
        //Creates an ar
        for(int i=0; i<8; i++){
            
            //Creates an arc 
            Arc ark = new Arc(200,200,80,80,45*i,45);
            ark.setFill(color[i%2]);
            ark.setType(ArcType.ROUND);
            pane.getChildren().add(ark);
            
            //Creates a mini circle 
            Circle miniCir = new Circle(centerX,centerY,15);
            miniCir.setFill(Color.CADETBLUE);
            pane.getChildren().add(miniCir);
        }
        
        return pane;
    }
     //EXERCISE 14.8/////////////////////////////////////////////
    ////////////////////////////////////////////////////////////
    
    public void displayCards(Stage primary) {
        //Creates random object
        java.util.Random rand = new java.util.Random();

        //Creates a grid layout pane to hold elements 
        GridPane gp = new GridPane();
        gp.setAlignment(Pos.CENTER);
        
        addCardsToPane(gp,9);
        
        //Scene and Stage 
        Scene scene = new Scene(gp);
        primary.setScene(scene);
        primary.setTitle("LIST OF CARDS");
        primary.show();
    }
    

    public void addCardsToPane(GridPane pane,int rowLength) {
        ArrayList<ImageView> cards = getCards();
        
        Collections.shuffle(cards);
        
        final int row = rowLength;
        
        if(cards == null || cards.size() ==0){
            System.out.println("ImageView is null");
        }
        
        for(int i=0; i<cards.size(); i++){ 
            pane.addColumn((i%row), cards.get(i));
        }
    }

    
    
    public ArrayList<ImageView> getCards() {
        ArrayList<ImageView> cardList = new ArrayList<>();
        ArrayList<URL> cardUrlList = getCardUrls();

        for (int i = 0; i < cardUrlList.size(); i++) {
            try {
                cardList.add(getCard(getCardImage(cardUrlList.get(
                        i))));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        return cardList;
    }

    
    
    public ArrayList<URL> getCardUrls() {
        ArrayList<URL> cardUrlList = new ArrayList<>();
        //ArrayList<String> cardPath = getCardFiles("myjavafx/images/cards");
        ArrayList<String> cardPath = getCardPaths();
        
        if(cardPath == null){
            System.out.println("Card path is null");
            return null;
        } else 
        for(int i=0; i<cardPath.size(); i++){
            cardUrlList.add(getCardUrl(cardPath.get(i).toString()));
        }
        return cardUrlList;

    }
    
    public ArrayList<String> getCardPaths(){
        ArrayList<String> cardPaths = new ArrayList<>() ;
        
        for(int i=1; i<=25; i++){
            String cardName = "/myjavafx/images/cards/"+i+".jpg";
            URL url = getClass().getResource(cardName);
            
            if(url ==  null){
                cardName = cardName.replace(".jpg", ".png");
                url = getClass().getResource(cardName);
            }
            
            
            if(url != null){
                cardPaths.add(cardName);
            } else { 
                cardPaths.add("myjavafx/images/Gif/X.gif");
                System.out.println("Card path is null");
            }
            
        }
        
        return cardPaths;
    }
    
    
    
    public ArrayList<String> getCardFiles(String cardPath){
        java.io.File path = new java.io.File(cardPath);
        ArrayList<String> list = new ArrayList<>();
        
        try{
            path.createNewFile();
        }
        
        catch(IOException e){
            System.out.println("Error: "+path.getAbsolutePath());
            e.printStackTrace();
        }
        
        if ((path.mkdir() || path != null) && path.isDirectory()) {
            String[] pathList = path.list();
            if( path != null)
                for( String a:pathList){
                    URL url = getClass().getResource(a);
                    if(url != null){
                        list.add(a);
                    } 
                }
            
            } else {
                 list.add("myjavafx/images/Gif/X.gif");
                System.out.println("Path List is null.");
            }
        
            return null;
        }



    public URL getCardUrl(String path) {

        URL url = getClass().getResource(path);
        return url;
    }

    
    public Image getCardImage(URL url) {
        Image card = new Image("myjavafx/images/Gif/X.gif");
        if (url != null) {
            try {
                card = new Image(url.toExternalForm());

            } catch (IllegalArgumentException ex) {
                System.out.println("Error: Image not found\n" + ex.getMessage());
                return card;
            }
        }
        return card;
    }

    public ImageView getCard(Image image) throws Exception {

        if (image.isError() || (image.getHeight() == 0 && image.getWidth() == 0)) {
            throw new Exception("Invalid Image");
        }
        
        ImageView imgV = new ImageView(image);
        imgV.setFitWidth(200);
        imgV.setFitHeight(300);

        return imgV;
        
    }
    
    //EXERCISE 14.7/////////////////////////////////////////////
    ////////////////////////////////////////////////////////////
    
    public void displayMatrix(Stage primary){
        //Creates GridPane 
        GridPane gp = new GridPane();
        
        for(int i=0; i<10; i++){
            
            for(int j=0; j<10; j++){
                gp.add(getTextField(), j, i);
            }
        }
        
        //Scene and Stage
        Scene scene = new Scene(gp,850,850);
        primary.setScene(scene);
        primary.setTitle("MATRIX");
        primary.show();
        
    }
    
    
    public TextField getTextField(){
        //Creates random oject
        java.util.Random rand = new java.util.Random();
        
        //Creates a text field 
        TextField txt = new TextField();
        txt.setMinSize(50, 80);
        txt.setAlignment(Pos.CENTER);
        txt.setText((rand.nextBoolean())? "1":"0");
        txt.setFont(Font.font("Times New Roman",FontWeight.BOLD,30));
        return txt;
    }
    //EXERCISE 14.6/////////////////////////////////////////////
    ////////////////////////////////////////////////////////////
    public void checkboard(Stage primary){
        //Creates random object 
        java.util.Random rand = new java.util.Random();
        
        Color[] color = {Color.WHITE,Color.BLACK};
        
        GridPane gp = new GridPane();
        gp.setOpacity(5);
        //gp.setHgap(20);
        //gp.setVgap(20);
        gp.setAlignment(Pos.CENTER);
        int colorChoice =0;
        
        for(int i=0; i<8; i++){
            
            for(int j=0; j<8; j++){
                if(j>0){
                    if(colorChoice == 0){
                        colorChoice = 1;
                    } else if(colorChoice == 1) {
                        colorChoice =0;
                    }
                }
                Label lbl = new Label("Label Me");
                gp.add(getRectangle(colorChoice),j,i);
            }
        }
 
        //Scene and Stage 
        Scene scene = new Scene(gp,850,850);
        scene.setFill(Color.rgb(rand.nextInt(256),
                rand.nextInt(256), rand.nextInt(256)));
        
        //Sets stage title 
        primary.setTitle("CHECKBOARD");
        primary.setScene(scene);
        primary.show();   

    }
    
    
    public Rectangle getRectangle(int color){
        Color[] col = {Color.WHITE,Color.BLACK};
        Rectangle rect = new Rectangle(100,100);
        rect.setStroke(Color.BLACK);
        rect.setFill(col[color]);
        return rect;
    }
    
    //EXERCISE 14.5/////////////////////////////////////////////
    ////////////////////////////////////////////////////////////
    public void displayCharacters(Stage primary){
        
        double width = 500;
        double height = 500;
        //Creates Pane 
        GridPane bp = new GridPane();
        Pane pn =  new Pane();
        bp.getChildren().add(pn);
        bp.setAlignment(Pos.CENTER);
        String[] letters = {"W","E","L","C","O","M","E"," ","T","O"," ","J","A","V","A"," "};
        pn.setCenterShape(true);
        double centerX = width/2;
        double centerY = height/2;
        double radius = width/2;
        double x = 0;
        double y=0;
        
        for(int i=0; i<letters.length;i++){
            x = centerX - radius *Math.cos(i*2*Math.PI/letters.length);
            //System.out.println(x);
            y = centerY -  radius * Math.sin(i*2*Math.PI/letters.length);
            //System.out.println(y);
            
            Circle cir = new Circle(x+17,y-15,25);
            cir.setFill(Color.ROYALBLUE);
            addTextToPane(cir,pn);
            
            
            Text txt = new Text(x,y,letters[i]+"");
            txt.setFill(Color.BEIGE);
            txt.setFont(Font.font("Times New Roman",
                    FontWeight.BOLD,FontPosture.REGULAR,50));
            addTextToPane(txt,pn);
        }
        
        //SCENE AND STAGE 
        Scene scene = new Scene(bp,width,height);
        //Sets title of Stage
        primary.setTitle("DISPLAY TEXT");
        primary.setScene(scene);
        primary.show();
    }
    
    public void addTextToPane(Node text,Pane pane){
        pane.getChildren().add(text);
    }
    
    //EXERCISE 14.4/////////////////////////////////////////////
    ////////////////////////////////////////////////////////////
    
    public void displayText(Stage primary){
        
        //Creates horizontal box to hold elments in a single row only 
        HBox hb = new HBox();
        hb.setSpacing(20);
        hb.setAlignment(Pos.CENTER);
        
        //Creates a random object 
        java.util.Random rand = new java.util.Random();
        

        for(int i=0; i<5; i++){
            //Creates text 
            Text txt = new Text("Java");
            txt.setOpacity(rand.nextDouble());
            txt.setFont(Font.font("Times New Roman",
                    FontWeight.BOLD,FontPosture.ITALIC,24));
            txt.setFill(Color.rgb(rand.nextInt(26), rand.nextInt(26),
                    rand.nextInt(26)));
            txt.setRotate(90);
            hb.getChildren().add(txt);
        }
        
        //Creates scene 
        Scene scene = new Scene(hb,500,500);
        primary.setTitle("VERTICAL");
        primary.setScene(scene);
        primary.show();
 
    }
    
    //EXERCISE 14.3////////////////////////////////////////////
    ////////////////////////////////////////////////////////////
    
    public void getRandomCards(Stage primary){
        //Creating horizontal box 
        HBox hp = new HBox();
        
        for(int i=1; i<=3; i++){
            ImageView imgV = new ImageView(getCard_());
            imgV.setFitHeight(940);
            imgV.setFitWidth(540);
            hp.getChildren().add(imgV); 
            hp.setSpacing(100);
        }
        
        //Scene and Stage 
        Scene scene = new Scene(hp,900,900);
        //Sets stage title 
        primary.setTitle("RANDOM CARDS");
        primary.setScene(scene);
        primary.show();
    }
    
    
    
    public Image getCard_() {
        int rand = new java.util.Random().nextInt(26);
        String cardName = "/myjavafx/images/cards/" + rand + ".png";
        URL url = getClass().getResource(cardName);

        if (url == null) {
            cardName = cardName.replace(".png", ".jpg");
            //cardName = "/myjavafx/images/cards/" + rand + ".jpg";
            url = getClass().getResource(cardName);
        }

        if (url != null) {
            return new Image(url.toExternalForm());
        } else {
            System.out.println("Image not found: " + rand);
            return null; // or a default image
        }
    }

    
    

    public Image get_Card() {
        ArrayList<String> cardlist = get_Cards();
        if (!cardlist.isEmpty()) {
            System.out.println("Card list is not empty, size = " + cardlist.size());
            int rand = new java.util.Random().nextInt(cardlist.size());
            String chosen = cardlist.get(rand);
            System.out.println("Chosen card path: " + chosen);
            String cardPath = new File(chosen).toURI().toString();
            Image cardImage = new Image(cardPath);
            if (cardImage.isError()) {
                System.out.println("Error loading image: " + cardImage.getException());
            }
            return cardImage;
        } else {
            System.out.println("Card list EMPTY — using fallback image");
            return new Image("myjavafx/images/cards/spadeA.png");
        }
    }
    
    
    
    public ArrayList<String> get_Cards() {
        String path = "myjavafx/images/cards";
        File directory = new File(path);

        if (!directory.exists()) {
            System.out.println("Directory not found. Creating...");
            directory.mkdirs();
        }

        File[] files = directory.listFiles();
        ArrayList<String> fNames = new ArrayList<>();

        if (files != null) {
            System.out.println("Files found: " + files.length);
            for (File f : files) {
                if (f.isFile() && f.getName().matches(".*\\.(png|jpg|jpeg|gif)$")) {
                    System.out.println("Adding: " + f.getName());
                    fNames.add(f.getAbsolutePath());
                }
            }
        } else {
            System.out.println("Directory is empty or inaccessible.");
        }

        return fNames;
    }
    
    

    //EXERCISE 14.2////////////////////////////////////////////
    ////////////////////////////////////////////////////////////
    public void tictactoe(Stage primary){
        String[] images = {"myjavafx/images/Gif/O.gif",
                            "myjavafx/images/Gif/X.gif"};
        
        //Creating random objects 
        java.util.Random rand = new java.util.Random();
        
        //Creating a gridpane 
        GridPane gp = new GridPane();
        gp.setHgap(20);
        gp.setVgap(20);
        gp.setAlignment(Pos.CENTER);
        
        //Gets random positions 
        ArrayList<int[]> positions = getPositions();
        
        for(int i=0; i<positions.size(); i++){
            //gets random row and column
            int row = positions.get(i)[0];
            int col = positions.get(i)[1];
            
            if(i%2==0){
                Image O = new Image(images[0]);
                ImageView oV = new ImageView(O);
                oV.setFitWidth(100);
                oV.setFitHeight(100);
                gp.add(oV, col, row);
                
            } else {
                
                Image X = new Image(images[1]);
                ImageView xV = new ImageView(X);
                xV.setFitWidth(100);
                xV.setFitHeight(100);
                gp.add(xV, col, row);
            }
        }
        
        //Scene and Stage
        Scene scene = new Scene(gp,800,800);
        primary.setTitle("TIC TAC TOE");
        primary.setScene(scene);
        primary.show();        
    }
    
    
    public ArrayList<int[]> getPositions(){
        //Creating list
        ArrayList<int[]> list  = new ArrayList<>();
        
        //Creating random object 
        java.util.Random rand = new java.util.Random();
        
        while(list.size()<6){
            //Getting random rows and columns 
            int row = rand.nextInt(3);
            int col = rand.nextInt(3);
            int[] values = {row,col};
            
            if(!isInList(list,values)){
                list.add(values);
            } else {
                continue;
            } 
        }
        return list;
    }
    
    
    
    public boolean isInList(ArrayList<int[]> list,int[] value){

        //Checks if list size is 0
        if(list.size() ==0)
        return false;  //returns true because size is 0
        
        //check list if value exists 
        for(int i=0; i<list.size();i++){
            if((list.get(i)[0] == value[0]) && 
                    (list.get(i)[1] == value[1])){
                
                return true;
            }
        }
        
        return false;
    }
    
    //EXERCISE 14.1////////////////////////////////////////////
    ////////////////////////////////////////////////////////////
    public void displayImages(Stage primary) {
        //Creating images 
        Image img1 = new Image("myjavafx/images/Nature/nature.jpeg");
        Image img2 = new Image("myjavafx/images/Nature/nature2.jpg");
        Image img3 = new Image("myjavafx/images/Nature/nature3.jpg");
        Image img4 = new Image("myjavafx/images/Nature/nature4.jpeg");

        //Creating image view for the images 
        ImageView imgV1 = new ImageView(img1);
        imgV1.setFitWidth(940);
        imgV1.setFitHeight(540);

        ImageView imgV2 = new ImageView(img2);
        imgV2.setFitWidth(940);
        imgV2.setFitHeight(540);

        ImageView imgV3 = new ImageView(img3);
        imgV3.setFitWidth(940);
        imgV3.setFitHeight(540);
        imgV3.setRotate(180);

        ImageView imgV4 = new ImageView(img4);
        imgV4.setFitWidth(940);
        imgV4.setFitHeight(540);
        imgV4.setRotate(180);
        

        GridPane gp = new GridPane();
        gp.add(imgV1, 0, 0);
        gp.add(imgV2, 1, 0);
        gp.add(imgV3, 0, 1);
        gp.add(imgV4, 1, 1);
        gp.setAlignment(Pos.CENTER);
        gp.setHgap(0);
        gp.setVgap(0);

        //SCENE AND STAGE
        Scene scene = new Scene(gp, 500, 500);

        primary.setTitle("DISPLAY IMAGES");
        primary.setScene(scene);
        primary.show();

    }
}
