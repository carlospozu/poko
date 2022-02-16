package com.example.pokemon;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javax.swing.text.html.ImageView;
import java.awt.*;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloControllerCombate implements Initializable {


    PokemonMalo m1 = new PokemonMalo("Mewtwo", 80, 100, 100, new File("src\\main\\java\\com\\example\\pokemon\\fotos\\mewtwo.png"));
    PokemonMalo m2 = new PokemonMalo("Dragonite", 73, 100, 100, new File("src\\main\\java\\com\\example\\pokemon\\fotos\\draqonite.png"));
    PokemonMalo m3 = new PokemonMalo("Gyarados", 90, 100, 100, new File("src\\main\\java\\com\\example\\pokemon\\fotos\\gyarados.png"));
    PokemonMalo m4 = new PokemonMalo("Rayquaza", 80, 100, 100, new File("src\\main\\java\\com\\example\\pokemon\\fotos\\rayquaza.png"));


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
    javafx.scene.image.ImageView PokemonMalo;


    public void inicializa(Interfaz interfaz){
        interfaz.foto.setImage(new Image(interfaz.pokemon.fotodetras.toURI().toString()));
        interfaz.sexo.setImage(new Image(interfaz.pokemon.sexo.toURI().toString()));
        interfaz.nombre.setText(interfaz.pokemon.nombre);
        interfaz.nivel.setText(interfaz.pokemon.nivel.toString());
        interfaz.vida.setProgress((double)interfaz.pokemon.vidaRestante/interfaz.pokemon.vida);
        interfaz.vidanum.setText(interfaz.pokemon.vida.toString());
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Image fotomalo = new Image(m1.foto.toURI().toString());
        PokemonMalo.setImage(fotomalo);
        nombreEnemy.setText(m1.nombre);
        nivelEnemy.setText(String.valueOf(m1.nivel));
        vidaEnemy.setProgress(m1.vidaRestante);
        vidaNumEnemy.setText(String.valueOf(m1.vida));
    }
}



class PokemonMalo{
    String nombre;
    Integer nivel;
    Integer vida;
    Integer vidaRestante;
    File foto;


    public PokemonMalo(String Nombre, Integer Nivel, Integer Vida, Integer VidaRestante, File foto){
        this.nombre= Nombre;
        this.nivel = Nivel;
        this.vida = Vida;
        this.vidaRestante = VidaRestante;
        this.foto = foto;
    }
}
