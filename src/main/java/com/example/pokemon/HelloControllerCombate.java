package com.example.pokemon;

import javafx.fxml.FXML;

import javafx.scene.control.ProgressBar;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.File;
import java.util.Random;


public class HelloControllerCombate  {

   public static Pokemon pokemonPagina1;
    public Label curar;
    public Label atacar;


    PokemonMalo aleatorio;
    PokemonMalo m1 = new PokemonMalo("Mewtwo", 80, 100, 100, new File("src\\main\\java\\com\\example\\pokemon\\fotos\\mewtwo.png"));
    PokemonMalo m2 = new PokemonMalo("Dragonite", 73, 100, 100, new File("src\\main\\java\\com\\example\\pokemon\\fotos\\draqonite.png"));
    PokemonMalo m3 = new PokemonMalo("Gyarados", 90, 100, 100, new File("src\\main\\java\\com\\example\\pokemon\\fotos\\gyarados.png"));
    PokemonMalo m4 = new PokemonMalo("Rayquaza", 80, 100, 100, new File("src\\main\\java\\com\\example\\pokemon\\fotos\\rayquaza.jpg"));

    float lifeMalo;
    float vidaBarraMalo;
    float life;
    float vidaBarra;




    @FXML
    Label nombrePokemon;
    @FXML
    Label nivelPokemon;
    @FXML
    ProgressBar vidaPokemon;
    @FXML
    Label vidaNumPokemon;
    @FXML
    ImageView pokemonBueno;

    @FXML
    Label nombreEnemy;
    @FXML
    Label nivelEnemy;
    @FXML
    Label vidaNumEnemy;
    @FXML
    ProgressBar vidaEnemy;
    @FXML
    ImageView PokemonMalo;
    @FXML
    ImageView fondo;
    @FXML
    BorderPane ataques;
    @FXML
    AnchorPane menuSalir;
    
    

/*
    public void inicializa(HelloController interfaz) {
        interfaz.foto.setImage(new Image(interfaz.pokemonMalo.foto.toURI().toString()));
        interfaz.nombre.setText(interfaz.pokemonMalo.nombre);
        interfaz.nivel.setText(interfaz.pokemonMalo.nivel.toString());
        interfaz.vida.setProgress((double) interfaz.pokemonMalo.vidaRestante / interfaz.pokemonMalo.vida);
        interfaz.vidanum.setText(interfaz.pokemonMalo.vida.toString());
    }

 */


Pokemon pokemonSeleccionado;

    @FXML
    public void initialize(Pokemon pokemonSeleccionado) {


        this.pokemonSeleccionado=pokemonSeleccionado;
        Random r = new Random();
        int n = r. nextInt(5)+1;
        System.out.println("holaaa");

        switch (n) {
            case 1 -> {
                aleatorio = m1;
                /*
                Image fotomalo1 = new Image(m1.foto.toURI().toString());
                PokemonMalo.setImage(fotomalo1);
                nombreEnemy.setText(m1.nombre);
                nivelEnemy.setText(String.valueOf(m1.nivel));
                vidaEnemy.setProgress(m1.vidaRestante);
                vidaNumEnemy.setText(String.valueOf(m1.vida));
                */
            }
            case 2 -> {
                aleatorio = m2;
                /*
                Image fotomalo2 = new Image(m2.foto.toURI().toString());
                PokemonMalo.setImage(fotomalo2);
                nombreEnemy.setText(m2.nombre);
                nivelEnemy.setText(String.valueOf(m2.nivel));
                vidaEnemy.setProgress(m2.vidaRestante);
                vidaNumEnemy.setText(String.valueOf(m2.vida));
                 */
            }
            case 3 -> {
                aleatorio = m3;
                /*
                Image fotomalo3 = new Image(m3.foto.toURI().toString());
                PokemonMalo.setImage(fotomalo3);
                nombreEnemy.setText(m3.nombre);
                nivelEnemy.setText(String.valueOf(m3.nivel));
                vidaEnemy.setProgress(m3.vidaRestante);
                vidaNumEnemy.setText(String.valueOf(m3.vida));
                 */
            }
            case 4 -> {
                aleatorio = m4;
                /*
                Image fotomalo4 = new Image(m4.foto.toURI().toString());
                PokemonMalo.setImage(fotomalo4);
                nombreEnemy.setText(m4.nombre);
                nivelEnemy.setText(String.valueOf(m4.nivel));
                vidaEnemy.setProgress(m4.vidaRestante);
                vidaNumEnemy.setText(String.valueOf(m4.vida));
                 */
            }
        }

        lifeMalo = aleatorio.vidaRestante;
        vidaBarraMalo = (lifeMalo/aleatorio.vida);
        Image fotomalo = new Image(aleatorio.foto.toURI().toString());
        PokemonMalo.setImage(fotomalo);
        nombreEnemy.setText(aleatorio.nombre);
        nivelEnemy.setText(String.valueOf(aleatorio.nivel));
        vidaEnemy.setProgress(vidaBarraMalo);
        vidaNumEnemy.setText(String.valueOf(aleatorio.vida));

        life = pokemonSeleccionado.vidaRestante;
        vidaBarra= (life/pokemonSeleccionado.vida);
        Image fotobueno = new Image(pokemonSeleccionado.fotodetras.toURI().toString());
        pokemonBueno.setImage(fotobueno);
        nombrePokemon.setText(pokemonSeleccionado.nombre);
        nivelPokemon.setText(String.valueOf(pokemonSeleccionado.nivel));
        vidaPokemon.setProgress(vidaBarra);
        vidaNumPokemon.setText(String.valueOf(pokemonSeleccionado.vidaRestante));
        ataques.setVisible(false);


    }

    public void ataque(MouseEvent mouseEvent) {
        ataques.setVisible(true);

    }

    public void curar(MouseEvent mouseEvent) {

    }

    public void atacarSeguro(MouseEvent mouseEvent) {
        if (!(lifeMalo == 0 || life == 0)){
            lifeMalo = lifeMalo-20;
            vidaBarraMalo= (lifeMalo/aleatorio.vida);
            vidaEnemy.setProgress(vidaBarraMalo);
            life = life-20;
            vidaBarra= (life/pokemonSeleccionado.vida);
            vidaPokemon.setProgress(vidaBarra);
        }
        else {
            menuSalir.setVisible(true);
        }


    }

    public void atacarArriesgado(MouseEvent mouseEvent) {
    }

    public void atacarMuyArriesgado(MouseEvent mouseEvent) {
    }

    public void cancelar(MouseEvent mouseEvent) {
        ataques.setVisible(false);
    }

    public void salirBoton(MouseEvent mouseEvent) {
    }

    public void continuarBoton(MouseEvent mouseEvent) {
    }

    public void pokemonPasado(HelloController helloController){
        Pokemon pokemon = pokemonPagina1;
    }

}



