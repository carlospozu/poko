package com.example.pokemon;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.io.File;
import java.io.IOException;



public class HelloController {


    Pokemon pokemonSeleccionado;

    Pokemon p1 = new Pokemon("Gengar", 70, 140, 140, new File("src\\main\\java\\com\\example\\pokemon\\fotos\\gengar.png"), new File("src\\main\\java\\com\\example\\pokemon\\fotos\\masc.png"), new File("src\\main\\java\\com\\example\\pokemon\\fotos\\gengarespalda.png "));
    Pokemon p2 = new Pokemon("Machoke", 47, 100, 40, new File("src\\main\\java\\com\\example\\pokemon\\fotos\\machoke.png"), new File("src\\main\\java\\com\\example\\pokemon\\fotos\\masc.png"), new File("src\\main\\java\\com\\example\\pokemon\\fotos\\machokeespalda.png"));
    Pokemon p3 = new Pokemon("Togepi", 50, 100, 20, new File("src\\main\\java\\com\\example\\pokemon\\fotos\\togepi.png"), new File("src\\main\\java\\com\\example\\pokemon\\fotos\\fem.png"), new File("src\\main\\java\\com\\example\\pokemon\\fotos\\tegepiespalda.png"));
    Pokemon p4 = new Pokemon("Mr.Mine", 68, 100, 30, new File("src\\main\\java\\com\\example\\pokemon\\fotos\\mrmine.png"), new File("src\\main\\java\\com\\example\\pokemon\\fotos\\masc.png"), new File("src\\main\\java\\com\\example\\pokemon\\fotos\\mrmimeespalda.png"));
    Pokemon p5 = new Pokemon("Caterpie", 5, 100, 34, new File("src\\main\\java\\com\\example\\pokemon\\fotos\\caterpie.png"), new File("src\\main\\java\\com\\example\\pokemon\\fotos\\fem.png"), new File("src\\main\\java\\com\\example\\pokemon\\fotos\\caterpieespalda.png"));
    Pokemon p6 = new Pokemon("Jynx", 85, 100, 95, new File("src\\main\\java\\com\\example\\pokemon\\fotos\\jynx.png"), new File("src\\main\\java\\com\\example\\pokemon\\fotos\\fem.png"), new File("src\\main\\java\\com\\example\\pokemon\\fotos\\jynxespalda.png"));

    //Pokemon1
    @FXML
    Label nombre1;
    @FXML
    Label nivel1;
    @FXML
    ImageView foto1;
    @FXML
    ImageView sexo1;
    @FXML
    ProgressBar vida1;
    @FXML
    Label vidanum1;
    @FXML
    ImageView ps1;
    @FXML
    VBox pokemon1;
    //Pokemon2
    @FXML
    Label nombre2;
    @FXML
    Label nivel2;
    @FXML
    ImageView foto2;
    @FXML
    ImageView sexo2;
    @FXML
    ProgressBar vida2;
    @FXML
    Label vidanum2;
    @FXML
    ImageView ps2;
    @FXML
    VBox pokemon2;
    //Pokemon3
    @FXML
    Label nombre3;
    @FXML
    Label nivel3;
    @FXML
    ImageView foto3;
    @FXML
    ImageView sexo3;
    @FXML
    ProgressBar vida3;
    @FXML
    Label vidanum3;
    @FXML
    ImageView ps3;
    @FXML
    VBox pokemon3;
    //Pokemon4
    @FXML
    Label nombre4;
    @FXML
    Label nivel4;
    @FXML
    ImageView foto4;
    @FXML
    ImageView sexo4;
    @FXML
    ProgressBar vida4;
    @FXML
    Label vidanum4;
    @FXML
    ImageView ps4;
    @FXML
    VBox pokemon4;
    //Pokemon5
    @FXML
    Label nombre5;
    @FXML
    Label nivel5;
    @FXML
    ImageView foto5;
    @FXML
    ImageView sexo5;
    @FXML
    ProgressBar vida5;
    @FXML
    Label vidanum5;
    @FXML
    ImageView ps5;
    @FXML
    VBox pokemon5;
    //Pokemon6
    @FXML
    Label nombre6;
    @FXML
    Label nivel6;
    @FXML
    ImageView foto6;
    @FXML
    ImageView sexo6;
    @FXML
    ProgressBar vida6;
    @FXML
    Label vidanum6;
    @FXML
    ImageView ps6;
    @FXML
    VBox pokemon6;

    @FXML
    Label continuar;

    @FXML
    public void initialize() {

        float vid1 = p1.vidaRestante;
        float vidaBarra1= (vid1/p1.vida);
        Image imagen1 = new Image(p1.foto.toURI().toString());
        Image imagen2 = new Image(p1.sexo.toURI().toString());
        foto1.setImage(imagen1);
        sexo1.setImage(imagen2);
        nombre1.setText(p1.nombre);
        nivel1.setText(String.valueOf(p1.nivel));
        vida1.setProgress(vidaBarra1);
        vidanum1.setText(String.valueOf(p1.vidaRestante));

        float vid2 = p2.vidaRestante;
        float vidaBarra2= (vid2/p2.vida);
        Image imagen3 = new Image(p2.foto.toURI().toString());
        Image imagen4 = new Image(p2.sexo.toURI().toString());
        foto2.setImage(imagen3);
        sexo2.setImage(imagen4);
        nombre2.setText(p2.nombre);
        nivel2.setText(String.valueOf(p2.nivel));
        vida2.setProgress(vidaBarra2);
        vidanum2.setText(String.valueOf(p2.vidaRestante));

        float vid3 = p3.vidaRestante;
        float vidaBarra3= (vid3/p3.vida);
        Image imagen5 = new Image(p3.foto.toURI().toString());
        Image imagen6 = new Image(p3.sexo.toURI().toString());
        foto3.setImage(imagen5);
        sexo3.setImage(imagen6);
        nombre3.setText(p3.nombre);
        nivel3.setText(String.valueOf(p3.nivel));
        vida3.setProgress(vidaBarra3);
        vidanum3.setText(String.valueOf(p3.vidaRestante));

        float vid4 = p4.vidaRestante;
        float vidaBarra4= (vid4/p4.vida);
        Image imagen7 = new Image(p4.foto.toURI().toString());
        Image imagen8 = new Image(p4.sexo.toURI().toString());
        foto4.setImage(imagen7);
        sexo4.setImage(imagen8);
        nombre4.setText(p4.nombre);
        nivel4.setText(String.valueOf(p4.nivel));
        vida4.setProgress(vidaBarra4);
        vidanum4.setText(String.valueOf(p4.vidaRestante));

        float vid5 = p5.vidaRestante;
        float vidaBarra5= (vid5/p5.vida);
        Image imagen9 = new Image(p5.foto.toURI().toString());
        Image imagen10 = new Image(p5.sexo.toURI().toString());
        foto5.setImage(imagen9);
        sexo5.setImage(imagen10);
        nombre5.setText(p5.nombre);
        nivel5.setText(String.valueOf(p5.nivel));
        vida5.setProgress(vidaBarra5);
        vidanum5.setText(String.valueOf(p5.vidaRestante));

        float vid6 = p6.vidaRestante;
        float vidaBarra6= (vid6/p6.vida);
        Image imagen11 = new Image(p6.foto.toURI().toString());
        Image imagen12 = new Image(p6.sexo.toURI().toString());
        foto6.setImage(imagen11);
        sexo6.setImage(imagen12);
        nombre6.setText(p6.nombre);
        nivel6.setText(String.valueOf(p6.nivel));
        vida6.setProgress(vidaBarra6);
        vidanum6.setText(String.valueOf(p6.vidaRestante));
    }

    @FXML
    public void pulsar1() {
        resetear();
        nombre1.setTextFill(Color.YELLOW);
        nivel1.setTextFill(Color.YELLOW);
        vidanum1.setTextFill(Color.YELLOW);
        pokemon1.setStyle("-fx-border-color: #47175e; -fx-background-color:#61355e; -fx-border-width:3");
        pokemonSeleccionado = p1;
    }

    @FXML
    public void pulsar2() {
        resetear();
        nombre2.setTextFill(Color.YELLOW);
        nivel2.setTextFill(Color.YELLOW);
        vidanum2.setTextFill(Color.YELLOW);
        pokemon2.setStyle("-fx-border-color: #47175e; -fx-background-color:#61355e; -fx-border-width:3");
        pokemonSeleccionado = p2;
    }

    @FXML
    public void pulsar3() {
        resetear();
        nombre3.setTextFill(Color.YELLOW);
        nivel3.setTextFill(Color.YELLOW);
        vidanum3.setTextFill(Color.YELLOW);
        pokemon3.setStyle("-fx-border-color: #47175e; -fx-background-color:#61355e; -fx-border-width:3");
        pokemonSeleccionado = p3;
    }

    @FXML
    public void pulsar4() {
        resetear();
        nombre4.setTextFill(Color.YELLOW);
        nivel4.setTextFill(Color.YELLOW);
        vidanum4.setTextFill(Color.YELLOW);
        pokemon4.setStyle("-fx-border-color: #47175e; -fx-background-color:#61355e; -fx-border-width:3");
        pokemonSeleccionado = p4;
    }

    @FXML
    public void pulsar5() {
        resetear();
        nombre5.setTextFill(Color.YELLOW);
        nivel5.setTextFill(Color.YELLOW);
        vidanum5.setTextFill(Color.YELLOW);
        pokemon5.setStyle("-fx-border-color: #47175e; -fx-background-color:#61355e; -fx-border-width:3");
        pokemonSeleccionado = p5;
    }

    @FXML
    public void pulsar6() {
        resetear();
        nombre6.setTextFill(Color.YELLOW);
        nivel6.setTextFill(Color.YELLOW);
        vidanum6.setTextFill(Color.YELLOW);
        pokemon6.setStyle("-fx-border-color: #47175e; -fx-background-color:#61355e; -fx-border-width:3");
        pokemonSeleccionado = p6;
    }

    public void resetear(){
        continuar.setDisable(false);
        nombre2.setTextFill(Color.WHITE);
        nivel2.setTextFill(Color.WHITE);
        vidanum2.setTextFill(Color.WHITE);
        pokemon2.setStyle("-fx-border-color:  #339FFF; -fx-background-color: #339FFF;");

        nombre3.setTextFill(Color.WHITE);
        nivel3.setTextFill(Color.WHITE);
        vidanum3.setTextFill(Color.WHITE);
        pokemon3.setStyle("-fx-border-color:  #339FFF; -fx-background-color: #339FFF;");

        nombre4.setTextFill(Color.WHITE);
        nivel4.setTextFill(Color.WHITE);
        vidanum4.setTextFill(Color.WHITE);
        pokemon4.setStyle("-fx-border-color:  #339FFF; -fx-background-color: #339FFF;");

        nombre5.setTextFill(Color.WHITE);
        nivel5.setTextFill(Color.WHITE);
        vidanum5.setTextFill(Color.WHITE);
        pokemon5.setStyle("-fx-border-color:  #339FFF; -fx-background-color: #339FFF;");

        nombre1.setTextFill(Color.WHITE);
        nivel1.setTextFill(Color.WHITE);
        vidanum1.setTextFill(Color.WHITE);
        pokemon1.setStyle("-fx-border-color:  #339FFF; -fx-background-color: #339FFF;");

        nombre6.setTextFill(Color.WHITE);
        nivel6.setTextFill(Color.WHITE);
        vidanum6.setTextFill(Color.WHITE);
        pokemon6.setStyle("-fx-border-color:  #339FFF; -fx-background-color: #339FFF;");
    }

    @FXML
    public void avanzar() throws IOException {

        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Ventana2.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 663, 400);
        stage.setTitle("ESCOGE POKEMON");
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);
        HelloControllerCombate v=fxmlLoader.getController();
        v.initialize(pokemonSeleccionado);
        v.pokemonPasado();

    }
}










