/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myjavafx;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.FlowPane;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Orientation;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

/**
 *
 * @author WIZBRAIN
 */
//Border color is on page 51
public class FlowPane_ extends Application{
    /*--------------------------------------
    /---------------------------------------
    /-alignment: ObjectProperty<Pos>
    /-orientation: ObjectProperty<Orientation>
    /-hgap: DoubleProperty
    /-vagp: DoubleProperty
    /--------------------------------------
    /+FlowPane_()
    /+FlowPane_(hGap:double, vGap: double)
    /+FlowPane_(orientation: ObjectProperty<Orientation>)
    /+FlowPane_(orientation: ObjectProperty<Orientation>,hGap:double,vGap:double)
    */
    
    @Override 
    public void start(Stage primaryStage){
        
        //normalStyle(primaryStage);
        //horizonatalStyle(primaryStage);
        
    }//END OF START 
    
    
    public void normalStyle(Stage primaryStage){
        //creates a pane and set its property
        FlowPane fp = new FlowPane();
        fp.setPadding(new Insets(11,12,13,14));
        fp.setHgap(5);
        fp.setVgap(5);
        fp.setAlignment(Pos.CENTER);
        fp.setOrientation(Orientation.VERTICAL);
        
        //creates a textfield and set its properties
        TextField txtFName = new TextField();
        TextField txtLName = new TextField();
        txtFName.setStyle("-fx-border-color:blue");
        TextField txtMidName = new TextField();
        
        //creates a label and sets its properties 
        Label lbLName = new Label("Last Name");
        Label lbFName = new Label("First Name");
        Label lbMidName = new Label("Middle Name");
        lbLName.setFont(Font.font("Times New Roman",25));
        lbFName.setFont(Font.font("Times New Roman",25));
        lbMidName.setFont(Font.font("Times New Roman",25));
        fp.getChildren().addAll(lbFName,txtFName,lbLName,
                txtLName,lbMidName,txtMidName);
        
        //creates scene and adds to stage 
        Scene scn = new Scene(fp,500,500);
        primaryStage.setTitle("Flow Pane");
        primaryStage.setScene(scn);
        primaryStage.show();  
    }
    
    
    public void horizonatalStyle(Stage primaryStage){

        //creates a pane and set its property
        javafx.scene.layout.FlowPane fp = new javafx.scene.layout.FlowPane();
        fp.setPadding(new Insets(11,12,13,14));
        fp.setHgap(15);
        fp.setVgap(50);
        fp.setAlignment(Pos.CENTER);
        fp.setOrientation(Orientation.VERTICAL);
        
        //creates a textfield and set its properties
        TextField txtFName = new TextField();
        txtFName.setRotate(-15);
        TextField txtLName = new TextField();
        txtLName.setRotate(-15);
        txtFName.setStyle("-fx-border-color:blue");
        Button btnMidName = new Button("Login");
        btnMidName.setRotate(-15);
        btnMidName.setFont(Font.font("Times New Roman",25));
        Button btnShowPass = new Button("show password");
        btnShowPass.setPadding(new Insets(0,0,0,0));
        btnShowPass.setFont(Font.font("Times New Roman",25));
        btnShowPass.setRotate(-15);
        HBox btnLb = new HBox(btnShowPass,btnMidName);
        
        
        //creates a label and sets its properties 
        Label signIn  = new Label("SIGN IN");
        signIn.setStyle("-fx-fill:blue;");
        signIn.setPadding(new Insets(0,0,0,50));
        Label lbLName = new Label("Username");
        lbLName.setRotate(-15);
        lbLName.setPadding(new Insets(0,0,-50,0));
        Label lbFName = new Label("Password");
        lbFName.setRotate(-15);
        lbFName.setPadding(new Insets(0,0,-50,0));
        //signIn.setFont(Font.font("Wide Latin",35));
        signIn.setFont(Font.font("Sylfaen",35));
        //signIn.setFont(Font.font("Ravie",35));
        lbLName.setFont(Font.font("Times New Roman",25));
        lbFName.setFont(Font.font("Times New Roman",25));
        fp.getChildren().addAll(signIn,lbFName,txtFName,lbLName,
                txtLName,btnLb);
        
        
        //creates scene and adds to stage 
        Scene scn = new Scene(fp,500,500);
        primaryStage.setTitle("Flow Pane");
        primaryStage.setScene(scn);
        primaryStage.show();
        
        
    }//END OF HORIZONTAL 
    
}
