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
import javafx.scene.control.*;
import javafx.scene.shape.*;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;
import javafx.scene.text.TextFlow;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.text.TextBoundsType;
import javafx.collections.ObservableList;
/**
 *
 * @author WIZBRAIN
 */
//WORK ON POLYGONS 
public class Shapes extends Application{
    
    @Override 
    public void start(Stage primaryStage){

         
    }
    
    
    public void showShapes(Stage primaryStage){
        //PANE
        //Creates pane
        BorderPane bp = new BorderPane();
        bp.setLeft(getText());
        bp.setCenter(getLine());
        bp.setRight(getRectangle());
        bp.setBottom(getEllipse());
        bp.setTop(getPolygons_lines());
        
        //SCENE
        //Creates scene
        Scene scene = new Scene(bp,400,400);
        
        //STAGE
        //Creates pane
        primaryStage.setTitle("Shapes");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    
    
    
    public Pane getText(){
        //PANE
        //Creates pane 
        VBox pane = new VBox();
        //Sets alignment of pane
        pane.setAlignment(Pos.CENTER);
        //Sets padding of pane
        pane.setPadding(new Insets(5,5,5,5));
        //Creates text at a specific coordinates
        Text txt = new Text("Welcome To Programming.");
        //Sets font of text txt
        txt.setFont(Font.font("Times New Toman",FontWeight.BOLD,
                FontPosture.ITALIC,30));
        //Adds txt to pane
        pane.getChildren().add(txt);
        
        
        //Creates Text txt1
        Text txt1 = new Text("Programming is fun\n Display Text");
        pane.getChildren().add(txt1);
        
        
        //Creates Text txt2
        Text txt2 = new Text("Programming is fun\n Display Text");
        txt2.setFill(Color.RED);
        txt2.setUnderline(true);
        txt2.setStrikethrough(true);
        pane.getChildren().add(txt2);
        
        
        //returns the pane 
        return pane;    
    }
    
    
    
    public Pane getLine(){
        //PANE
        //Creates a pane
        GridPane gp = new GridPane();
        //Aligns pane to center
        gp.setAlignment(Pos.CENTER);
        
        
        //LINE
        //Creates line line1 
        Line line1 = new Line(10,10,10,10);
        line1.endXProperty().bind(gp.widthProperty().subtract(10));
        line1.endYProperty().bind(gp.heightProperty().subtract(10));
        line1.setStroke(Color.GREEN);
        line1.setStrokeWidth(5);
        gp.getChildren().add(line1);
        
        //Creats line line2
        Line line2 = new Line(10,10,10,10);
        line2.startXProperty().bind(gp.widthProperty().subtract(10));
        line2.endYProperty().bind(gp.heightProperty().subtract(10));
        line2.setStroke(Color.GREEN);
        line2.setStrokeWidth(5);
        gp.getChildren().add(line2);
        
        //returns pane 
        return gp;
    }
    
    public Pane getRectangle(){
        //PANE 
        //Creates a vertical pane 
        VBox vb =  new VBox();
        //Sets alignment of pane to center
        vb.setAlignment(Pos.CENTER);
        //Sets padding 
        vb.setPadding(new Insets(15,15,15,15));
        //Creates space between nodes 
        vb.setSpacing(15);
        
        //RECTANGLE
        //Creates rectangle 
        Rectangle rect = new Rectangle(25,10,160,130);
        rect.setStroke(Color.CHARTREUSE);
        rect.setFill(Color.CORAL);
        vb.getChildren().add(new Text(10,27,"R1"));
        vb.getChildren().add(rect);
        
        Rectangle rect1 = new Rectangle(25,50,160,130);
        rect1.setStroke(Color.BLACK);
        rect1.setFill(Color.WHITE);
        vb.getChildren().add(new Text(10,67,"R2"));
        vb.getChildren().add(rect1);
        
        Rectangle rect2 = new Rectangle(5,90,160,130);
        rect2.setArcWidth(150);
        rect2.setArcHeight(10);
        vb.getChildren().add(new Text(10,107,"R3"));
        vb.getChildren().add(rect2);
       
        StackPane sp = new StackPane();
        
        for(int i=0; i<4; i++){
            Rectangle rect3 = new Rectangle( 100,50,160,30);
            rect3.setRotate(i*360/8);
            rect3.setStroke(Color.color(Math.random(),
                    Math.random(),Math.random()));
            rect3.setFill(Color.WHITE);
            sp.getChildren().add(rect3);         
        }
        VBox.setMargin(rect2, new Insets(0,0,50,0));
        sp.setAlignment(Pos.CENTER);
        vb.getChildren().add(sp);  
        
        return vb;
    }
    
    
    
    public Pane getEllipse(){
        //Creates HBox 
        HBox hb = new HBox();
        //Sets spacing between elements 
        hb.setSpacing(30);
        
        //Creating random 
        java.util.Random rand = new java.util.Random();
        
        //Creates Ellipses and Circles
        for(int i=0; i<5; i++){
            //Creates Circle
            Circle cir = new Circle();
            
            //Sets Radius
            cir.setRadius(100);
            
            //Creates Ellipse 
            Ellipse elps = new Ellipse();
            
            //Sets horizontl radius of ellipse 
            elps.setRadiusX(50);
            
            //Sets vertical radius of ellipse 
            elps.setRadiusY(100);
            
            //Sets the outline color of ellipse 
            elps.setStroke(Color.rgb(rand.nextInt(256),
                    rand.nextInt(256),rand.nextInt(256)));
            
            //Sets the outline color of circle
            cir.setStroke(Color.rgb(rand.nextInt(256),
                    rand.nextInt(256),rand.nextInt(256)));
            
            //Sets the inner area color of ellipse 
            elps.setFill(Color.rgb(rand.nextInt(256),
                    rand.nextInt(256),rand.nextInt(256)));
            
            //Sets the inner area color of circle
            cir.setFill(Color.rgb(rand.nextInt(256),
                    rand.nextInt(256),rand.nextInt(256)));
            
            
            //Rotates ellipse 
            elps.setRotate(i*75);
            
            hb.getChildren().add(cir);
            hb.getChildren().add(elps);
        }
        return hb;
    }
    
    
    
    public Pane getArc(){
        
        //Creating random 
        java.util.Random rand = new java.util.Random();
        
        //Creates an HBox 
        HBox hb = new HBox();
        //Sets the spacing of the HBox 
        hb.setSpacing(30);
        
        //Creates arc
        Arc arc1 = new Arc(150,100,80,80,30,90);
        //Sets the type of arc
        arc1.setType(ArcType.ROUND);
        //Sets the inner area color of arc
        arc1.setFill(Color.rgb(rand.nextInt(256),
                    rand.nextInt(256),rand.nextInt(256)));
        //Sets the outline color of arc
        arc1.setStroke(Color.rgb(rand.nextInt(256),
                    rand.nextInt(256),rand.nextInt(256)));
        //Adds arc to HBox 
        hb.getChildren().add(arc1);
        
        
        
        //Creates arc 
        Arc arc2 = new Arc(150,100,80,80,30+90,90);
        arc2.setType(ArcType.OPEN);
        //Sets the inner area color of arc
        arc2.setFill(Color.rgb(rand.nextInt(256),
                    rand.nextInt(256),rand.nextInt(256)));
        //Sets the outline color of arc
        arc2.setStroke(Color.rgb(rand.nextInt(256),
                    rand.nextInt(256),rand.nextInt(256)));
        //Adds arc to HBox 
        hb.getChildren().add(arc2);
        
        
        //Creates a new arc
        Arc arc3 = new Arc(150,100,80,80,30+180,90);
        //Sets the arc type 
        arc3.setType(ArcType.CHORD);
        arc3.setFill(Color.rgb(rand.nextInt(256),
                    rand.nextInt(256),rand.nextInt(256)));
        //Sets the outline color of arc
        arc3.setStroke(Color.rgb(rand.nextInt(256),
                    rand.nextInt(256),rand.nextInt(256)));
        //Adds arc to HBox 
        hb.getChildren().add(arc3);
        
        
        //Creates a new arc 
        Arc arc4 = new Arc();
        //Sets the center x 
        arc4.setCenterX(150);
        //Sets center y 
        arc4.setCenterY(100);
        //Sets radius X
        arc4.setRadiusX(80);
        //Sets radius Y
        arc4.setRadiusY(80);
        //Sets start angle
        arc4.setStartAngle(30+270);
        //Sets length
        arc4.setLength(-35);
        //Sets the arc type 
        arc4.setType(ArcType.CHORD);
        arc4.setFill(Color.rgb(rand.nextInt(256),
                    rand.nextInt(256),rand.nextInt(256)));
        //Sets the outline color of arc
        arc4.setStroke(Color.rgb(rand.nextInt(256),
                    rand.nextInt(256),rand.nextInt(256)));
        //Adds arc to HBox 
        hb.getChildren().add(arc4);
        
        
        return hb;
    }
    
    
    public Pane getPolygons_lines(){
        //Creates HBox 
        HBox hb = new HBox();
        //Sets the spacing fo the child elements 
        hb.setSpacing(30);
        
        for(int i=0; i<4; i++){
            hb.getChildren().add(getPolygon());
            hb.getChildren().add(getPolyline());
        }
        return hb;
    }
    
    
    public Pane getPolygon(){
        //Creates random object 
        java.util.Random rand = new java.util.Random();
        //Creates HBox 
        Pane hb = new Pane();
        //Creates polygon
        Polygon pgn = new Polygon();
        //Sets the outline color of the polygon
        pgn.setStroke(Color.rgb(rand.nextInt(256), rand.nextInt(256), 
                rand.nextInt(256)));
        //Sets the fill color of the polygon
        pgn.setFill(Color.rgb(rand.nextInt(256), rand.nextInt(256), 
                rand.nextInt(256)));
        //Getting the poings of the polygon
        ObservableList<Double> list = pgn.getPoints();
        
        
        final double WIDTH =200, HEIGTH = 200;
        double centerX = WIDTH/2, centerY = HEIGTH/2;
        double radius = Math.min(WIDTH, HEIGTH)*0.4;
        
        
        for(int i=0; i<6; i++){
            list.add(centerX+radius*Math.cos((2*i*Math.PI/6)));
            list.add(centerY-radius*Math.sin((2*i*Math.PI/6)));
        }
        //Add the polygon to the pane 
        hb.getChildren().add(pgn);
        
        //Returns the panel containing the polygon
        return hb;
    }
    
    
    
    
    public Pane getPolyline(){
        //Creates random object 
        java.util.Random rand = new java.util.Random();
        //Creates a Pane
        Pane pn = new Pane();
        //Creates a polyline 
        Polyline pl = new Polyline();
        //Rotates the polyline
        pl.setRotate(rand.nextInt(361)/2);
        //Adds polyline to pane pn 
        pn.getChildren().add(pl);
        //Sets the outline color
        pl.setStroke(Color.rgb(rand.nextInt(256), 
                rand.nextInt(256), rand.nextInt(256)));

        //Gets polyline points 
        ObservableList list = pl.getPoints();
        
        double centerX = 200/2, centerY=200/2;
        double radius = Math.min(200, 200*0.4);
        
        for(int i=0; i<4; i++){
            list.add(centerX+radius*Math.cos(2*i*Math.PI/6));
            list.add(centerY-radius*Math.sin(2*i*Math.PI/6));
        }
        return pn;
    }
    
}
