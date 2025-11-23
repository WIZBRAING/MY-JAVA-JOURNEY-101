/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package storemanagement;
import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.Group;
import javafx.geometry.Insets;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Background;
/**
 *
 * @author WIZBRAIN
 */
public class SignInPage extends Application {
    
    @Override 
    public void start(Stage pStage){
        
    }
    
    public void login(Stage loginStage){
        //creates object variables
        FlowPane loginPane = new FlowPane();
        Label lbTitle = new Label("SIGN IN");
        Label lbUsername = new Label("Username");
        TextField txtUsername = new TextField();
        Label lbPassword = new Label("Password");
        PasswordField txtPassword = new PasswordField();
        Button btnShowPass = new Button("Show");
        Button btnLogin = new Button("Login");
        Button btnSignUp = new Button("Sing Up");
        
        
        
        
        //GROUP
        //Creates Group
        FlowPane passPane = new FlowPane(txtPassword,btnShowPass);
        FlowPane signIn_UpPane = new FlowPane(btnLogin,btnSignUp);
        //Set the horizontal gap bettwen the signIn and signUp buttons
        signIn_UpPane.setHgap(50);
        //Centers pane horizontally
        signIn_UpPane.setAlignment(Pos.CENTER);
        signIn_UpPane.setPadding(new Insets(11,-12,-13,-125));
        //passPane.setAlignment(Pos.CENTER);
        
        
        
        
        //LABEL
        //================================
        //Centers labels horizontally
        //-------------------------------
        lbUsername.setFont(Font.font(20));
        lbPassword.setFont(Font.font( 20));
        //Sets font for the title
        lbTitle.setFont(Font.font("Script",30));
        //Sets the left padding for the Title
        lbTitle.setPadding(new Insets(0,0,0,70));
        
        
        
        
        //TEXTFIELD
        //===============================
        //sets maximum width of TextField "txtUsername"
        //-------------------------------
        txtUsername.maxWidthProperty().bind(txtPassword.widthProperty()
                .add(btnShowPass.widthProperty()));
        //Sets the bottom padding of lbUsername 
        lbUsername.setPadding(new Insets(0,0,-35,0));
        //Sets the bottom padding of lbPassword
        lbPassword.setPadding(new Insets(0,0,-35,0));
        
        
        
        
        //BUTTON
        //==============================
        //
        //------------------------------
        btnLogin.setFont(Font.font(20));
        btnSignUp.setFont(Font.font(20));
      

        
        
        //FLOWPANE
        //=============================
        //adds all objects to pane
        //-----------------------------
        loginPane.setPadding(new Insets(11,12,13,120));
        loginPane.getChildren().addAll(lbTitle,lbUsername,txtUsername,
                lbPassword,passPane,signIn_UpPane);
        
        //Aligns flowPane elemements at Center
        //------------------------------------
        loginPane.setAlignment(Pos.CENTER);
        
        //Orients FlowPane elements vertically
        //------------------------------------
        loginPane.setOrientation(Orientation.VERTICAL);
        
        //Sets vertical spacing between flowpane elements 
        //-----------------------------------------------
        loginPane.setVgap(50);
        loginPane.setHgap(50);
        
        //Creates bakcground color for the logingPane
        //-------------------------------------------
        loginPane.setBackground(new Background(new BackgroundFill(
                Color.CADETBLUE,null,Insets.EMPTY)));

        
        
                
        //SCENE
        //=======================
        //Creates scene
        //-----------------------
        Scene loginScene = new Scene(loginPane,400,450);
        loginScene.setFill(Color.rgb(123,144,67));
        
        
        
        
        //STAGE
        //========================
        //Sets login stage title
        //----------------------
        loginStage.setTitle("WIZZY ENTERPRISE");
        loginStage.setScene(loginScene);
        loginStage.setResizable(false);
        loginStage.show();
        
        
    }
}
