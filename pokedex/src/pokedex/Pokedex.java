/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokedex;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;

/**
 *
 * @author OMISTAJA
 */
public class Pokedex extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        
        StackPane root = new StackPane();
        
        Label label = new Label("a label");
        
        root.setId("pane");
        
        Scene scene = new Scene(root, 600, 450);
        
       
        
        scene.getStylesheets().addAll(this.getClass().getResource("styles.css").toExternalForm());
        
        primaryStage.setTitle("Pokédex");
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
