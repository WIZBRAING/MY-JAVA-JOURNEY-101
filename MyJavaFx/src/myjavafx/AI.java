/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myjavafx;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.SubScene;
import javafx.scene.SceneAntialiasing;
import javafx.scene.Group;
import javafx.scene.layout.StackPane;
import javafx.scene.PerspectiveCamera;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Cylinder;
import javafx.scene.transform.Rotate;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.*;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.*;
/**
 *
 * @author WIZBRAIN
 */
public class AI extends Application {
    
    @Override 
    public void start(Stage primaryStage){
        
    }
    
    public void displayCylinder(Stage primary){
        Cylinder cylinder = new Cylinder(100,300);
        cylinder.setMaterial(new PhongMaterial());
        
        Group group = new Group();
        group.getChildren().add(cylinder);
        
        SubScene subScene = new SubScene(group,500,1000,true,SceneAntialiasing.BALANCED);
        PerspectiveCamera camera = new PerspectiveCamera();
        camera.setTranslateZ(-1000);
        camera.setTranslateY(-100);
        subScene.setCamera(camera);
        
        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(subScene);
        
        Scene scene = new Scene(stackPane);
        primary.setTitle("CYLINDER");
        primary.setScene(scene);
        primary.show();
    }
    
    public void displayPieChar(Stage primary){
        Pane pn = new Pane();
        
        PieChart pieChart = new PieChart();
        
        pieChart.getData().addAll(
                    new PieChart.Data("category_1 (47%)", 50),
                    new PieChart.Data("category_2 (55%)", 70),
                    new PieChart.Data("Category_3 (98%)", 100),
                    new PieChart.Data("Category_4"      , 10),
                    new PieChart.Data("Category_5 (98%)", 2));
        
        pieChart.setMinSize(400, 400);
        
        System.out.println(pieChart.getData().size());
        System.out.println(pieChart.getData().get(2).getChart().getStartAngle());
        System.out.println(pieChart.getData().get(1).getPieValue());
        
        pn.getChildren().add(pieChart);
        Scene scene = new Scene(pn);
        primary.setTitle("PIE CHART");
        primary.setScene(scene);
        primary.show();
    }
    
    
    public void displayBarchart(Stage primary){
        Pane pn = new Pane();
        
        CategoryAxis x = new CategoryAxis();
        x.setLabel(STYLESHEET_MODENA);
        
        NumberAxis y = new NumberAxis();
        y.setLabel(STYLESHEET_MODENA);
        
        BarChart<String,Number> barChart = new BarChart<>(x,y);
        barChart.setTitle("MARKET SENTIMENTS");
        
        XYChart.Series<String,Number> series = new XYChart.Series<>();
        series.setName("BAR SERIES");
        series.getData().addAll(
            new XYChart.Data<>("Category-1",30),
            new XYChart.Data<>("Category-2",20),
            new XYChart.Data<>("Category-3",50));
        
        
       // series.getNode().setStyle("-fx-bar-fill:blue");
        barChart.getData().add(series);

        pn.getChildren().add(barChart);
        Scene scene = new Scene(pn);
        primary.setTitle("PIE CHART");
        primary.setScene(scene);
        primary.show();
    }
    
    
    public void progressBar(Stage primary){
        
        StackPane sp0 = new StackPane();
        StackPane sp1 = new StackPane();
        VBox sp = new VBox();
        sp.getChildren().addAll(sp0,sp1);
        
        ProgressIndicator pi = new ProgressIndicator(0.3);
        pi.setPrefSize(100,100);
        sp1.getChildren().add(pi);
        
        ProgressBar pb = new ProgressBar();
        //pb.setProgress(0.2);
        pb.setPrefWidth(1000);
        
        sp.getChildren().add(pb);
        
        Scene scene = new Scene(sp);
        primary.setTitle("PIE CHART");
        primary.setScene(scene);
        primary.show();
        
        Thread thread = new Thread(()->{
            for (int i=1; i<1000; i++){
                final int progress = i; 
                Platform.runLater(()->pb.setProgress(progress/1000.0));
                //Platform.runLater(()->pi.setProgress(progress/100));
                try{
                    Thread.sleep(1000000000);
                }
                catch(InterruptedException e){
                    Thread.currentThread().interrupt();
                }
            }
        });
        
        thread.setDaemon(true);
        thread.start();
    }
    
}
