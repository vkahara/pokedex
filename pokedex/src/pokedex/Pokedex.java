package pokedex;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

public class Pokedex extends Application {

    @Override
    public void start(Stage primaryStage) {

        StackPane root = new StackPane();

        TextField hakuKentta = new TextField();
        hakuKentta.setMaxWidth(200);
        hakuKentta.setTranslateX(-160);
        hakuKentta.setTranslateY(-100);

        //String haettuPoke = hakuKentta.getText();
        Button hakuNappi = new Button();
        hakuNappi.setText("Hae");
        hakuNappi.setTranslateY(-100);
        hakuNappi.setTranslateX(-30);
        
        Yhdista yhdista = new Yhdista();

        hakuNappi.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                //System.out.println("testi" + hakuKentta.getText());
                Yhdista yhdistaNappi = new Yhdista();

                String haettuPokemon = yhdistaNappi.haePokemoneja(hakuKentta.getText());
                System.out.println(haettuPokemon);
                

            }
        });

        String haettuPokemon = yhdista.haePokemoneja(hakuKentta.getText());
        System.out.println(haettuPokemon);
     
    
        Label otsikko = new Label("Valtsun MAHTAVA Pokédex applikaatio!");
        otsikko.setStyle("-fx-font-size: 30px");
        otsikko.setTranslateY(-180);

        Label selite = new Label("Syötä Pokémonin nimi tai PokéID ja paina 'Hae'.");
        selite.setStyle("-fx-font-size: 14px");
        selite.setTranslateY(-140);
        selite.setTranslateX(-115);

        root.getChildren().addAll((otsikko), (selite), (hakuKentta), (hakuNappi));

        root.setId("pane");

        Scene scene = new Scene(root, 600, 450);

        scene.getStylesheets().addAll(this.getClass().getResource("styles.css").toExternalForm());

        primaryStage.setResizable(false);
        primaryStage.setTitle("Pokédex");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);

    }

}
