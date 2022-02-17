package com.example.pokemon;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

import javax.swing.text.html.ImageView;
import java.awt.*;
import java.io.File;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class HelloControllerCombate  {

   public static Pokemon pokemonPagina1;
    PokemonMalo m1 = new PokemonMalo("Mewtwo", 80, 100, 100, new File("src\\main\\java\\com\\example\\pokemon\\fotos\\mewtwo.png"));
    PokemonMalo m2 = new PokemonMalo("Dragonite", 73, 100, 100, new File("src\\main\\java\\com\\example\\pokemon\\fotos\\draqonite.png"));
    PokemonMalo m3 = new PokemonMalo("Gyarados", 90, 100, 100, new File("src\\main\\java\\com\\example\\pokemon\\fotos\\gyarados.png"));
    PokemonMalo m4 = new PokemonMalo("Rayquaza", 80, 100, 100, new File("src\\main\\java\\com\\example\\pokemon\\fotos\\rayquaza.png"));




    @FXML
    javafx.scene.control.Label nombrePokemon;
    @FXML
    javafx.scene.control.Label nivelPokemon;
    @FXML
    ProgressBar vidaPokemon;
    @FXML
    javafx.scene.control.Label vidaNumPokemon;
    @FXML
    javafx.scene.image.ImageView pokemonBueno;

    @FXML
    javafx.scene.control.Label nombreEnemy;
    @FXML
    javafx.scene.control.Label nivelEnemy;
    @FXML
    javafx.scene.control.Label vidaNumEnemy;
    @FXML
    ProgressBar vidaEnemy;
    @FXML
    javafx.scene.image.ImageView PokemonMalo;
    
    

/*
    public void inicializa(Interfaz interfaz) {
        interfaz.foto.setImage(new Image(interfaz.pokemonMalo.foto.toURI().toString()));
        interfaz.nombre.setText(interfaz.pokemonMalo.nombre);
        interfaz.nivel.setText(interfaz.pokemonMalo.nivel.toString());
        interfaz.vida.setProgress((double) interfaz.pokemonMalo.vidaRestante / interfaz.pokemonMalo.vida);
        interfaz.vidanum.setText(interfaz.pokemonMalo.vida.toString());
    }

 */
    @FXML
    public void inicializar(Pokemon pokemonSeleccionado) {
        Random r = new Random();
        int n = r. nextInt(5)+1;

        switch (n) {
            case 1 -> {
                Image fotomalo1 = new Image(m1.foto.toURI().toString());
                PokemonMalo.setImage(fotomalo1);
                nombreEnemy.setText(m1.nombre);
                nivelEnemy.setText(String.valueOf(m1.nivel));
                vidaEnemy.setProgress(m1.vidaRestante);
                vidaNumEnemy.setText(String.valueOf(m1.vida));
            }
            case 2 -> {
                Image fotomalo2 = new Image(m2.foto.toURI().toString());
                PokemonMalo.setImage(fotomalo2);
                nombreEnemy.setText(m2.nombre);
                nivelEnemy.setText(String.valueOf(m2.nivel));
                vidaEnemy.setProgress(m2.vidaRestante);
                vidaNumEnemy.setText(String.valueOf(m2.vida));
            }
            case 3 -> {
                Image fotomalo3 = new Image(m3.foto.toURI().toString());
                PokemonMalo.setImage(fotomalo3);
                nombreEnemy.setText(m3.nombre);
                nivelEnemy.setText(String.valueOf(m3.nivel));
                vidaEnemy.setProgress(m3.vidaRestante);
                vidaNumEnemy.setText(String.valueOf(m3.vida));
            }
            case 4 -> {
                Image fotomalo4 = new Image(m4.foto.toURI().toString());
                PokemonMalo.setImage(fotomalo4);
                nombreEnemy.setText(m4.nombre);
                nivelEnemy.setText(String.valueOf(m4.nivel));
                vidaEnemy.setProgress(m4.vidaRestante);
                vidaNumEnemy.setText(String.valueOf(m4.vida));
            }
        }


/*
        if (HelloController.elegir1) {

        }
        if (HelloController.elegir2) {

        }
        if (HelloController.elegir3) {

        if (HelloController.elegir4) {

        }
        if (HelloController.elegir5) {

        }
        if (HelloController.elegir6) {

        }
*/
    }

    public void ataque(MouseEvent mouseEvent) {

    }

    public void curar(MouseEvent mouseEvent) {
    }

    public void atacarSeguro(MouseEvent mouseEvent) {
    }

    public void atacarArriesgado(MouseEvent mouseEvent) {
    }

    public void atacarMuyArriesgado(MouseEvent mouseEvent) {
    }

    public void cancelar(MouseEvent mouseEvent) {
    }

    public void salirBoton(MouseEvent mouseEvent) {
    }

    public void continuarBoton(MouseEvent mouseEvent) {
    }

    public void pokemonPasado(Pokemon pokemon){
        pokemon=pokemonPagina1;
    }

}



