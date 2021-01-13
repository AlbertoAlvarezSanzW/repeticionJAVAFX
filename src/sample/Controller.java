package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    // importamos los botones
    @FXML
    public Button botonAmarillo;
    @FXML
    public Button botonAzul;
    @FXML
    public Button botonVerde;

    // importamos los label's
    @FXML
    public Label labelAmarillo;
    @FXML
    public Label labelAzul;
    @FXML
    public Label labelVerde;

    //asignación de los colores
    @FXML
    public void cambiarAmarillo(){
        labelAmarillo.setTextFill(Color.YELLOW);
        labelAmarillo.setStyle(" -fx-background-color:#f3ff00;");
    }
    @FXML
    public void cambiarAzul(){
        labelAzul.setTextFill(Color.BLUE);
        labelAzul.setStyle(" -fx-background-color:#0074ff;");
    }
    @FXML
    public void cambiarVerde(){
        labelVerde.setTextFill(Color.GREEN);
        labelVerde.setStyle(" -fx-background-color:#00ff17;");
    }


    // cuando el color ya no este pulsado volvera a su estado normal
    @FXML
    public void normalidad(){
        labelAmarillo.setTextFill(Color.BLACK);
        labelAmarillo.setStyle(" -fx-background-color:white;");
        labelAzul.setTextFill(Color.BLACK);
        labelAzul.setStyle(" -fx-background-color:white;");
        labelVerde.setTextFill(Color.BLACK);
        labelVerde.setStyle(" -fx-background-color:white;");
    }

    // cambio a otra pantalla para "celebrar que se sabe los colores"
    @FXML
    public void pantalla2(){
        try{
            Parent root = FXMLLoader.load(getClass().getResource("sample2.fxml"));
            Stage primaryStage = new Stage();
            Scene scene = new Scene(root, 300, 275);
            primaryStage.setTitle("Hello World");
            primaryStage.setScene(scene);
            primaryStage.show();
        }catch ( IOException e){
            e.printStackTrace();
        }
    }



}
