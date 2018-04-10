/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication4;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Student
 */
public class JavaFXApplication4 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        GridPane root = new GridPane();
        root.setPadding(new Insets(10,10,10));
        root.setStyle("--fx-background-color: lightblue;");
        root.add(new Label("Login"),0,0);
        root.add(new Label("Passwords"),0,1);  
        root.add(new TextField(), 1, 0);
        root.add(new TextField(), 1, 1);
        Button button = new Button("OK");
        root.add(button,1,2);
        
                
        
        
        
        
        
        
        
        
        
//        root.setPadding(new Insets(10,10,10,10));
//        root.setSpacing(15);
//        root.setStyle("-fx-background-color: #336699");
//        root.getChildren().add(new Button("2"));
//        root.getChildren().add(new Button("3"));
//        root.getChildren().add(new Button("4"));
//        root.getChildren().add(new Button("5"));
        
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
