package com.example.pokemon;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;



import java.io.File;

public class HelloControllerPokedex {
    Pokemon pokemonSeleccionado;
    private HelloController HelloController;

    @FXML
    ImageView pre;
    @FXML
    ImageView evolucion;
    @FXML
    ImageView fondo;
    @FXML
    ImageView fotoPok;
    @FXML
    Button favorito;
    @FXML
    Label titulo;
    @FXML
    Label desc;

    Foto foto = new Foto(new File("src\\main\\java\\com\\example\\pokemon\\fotos\\fondo.png"), new File("src\\main\\java\\com\\example\\pokemon\\fotos\\pokedex.png"));



    public void initialize(Pokemon pokemonSeleccionado) {
        this.pokemonSeleccionado=pokemonSeleccionado;
        Image image = new Image(pokemonSeleccionado.foto.toURI().toString());
        fotoPok.setImage(image);
        Image prev = new Image(pokemonSeleccionado.preEv.toURI().toString());
        Image image1 = new Image(foto.foto1.toURI().toString());
        pre.setImage(prev);
        evolucion.setImage(image);
        fondo.setImage(image1);
        titulo.setText(pokemonSeleccionado.titulo);
        desc.setText(pokemonSeleccionado.desc);
    }

    public void elegirFav() {
        HelloController.fav();
        pokemonSeleccionado.seleccionado = true;
        HelloController.selecionFav();
    }
    public void pokemonPasado(HelloController Hellocontroller) {
        this.HelloController= Hellocontroller;
    }
}
