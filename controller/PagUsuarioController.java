package controller;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import controle.FilmeControle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class PagUsuarioController {

    @FXML
    private AnchorPane pagUsuario;

    @FXML
    private Label labeListFilmes;

    @FXML
    private Button btnAddFilme;

    @FXML
    private Button btnQuit;

	

  
    @FXML
    // metodo que imprmi no label logo quando a tela for iniciado 
    void initialize() throws FileNotFoundException, ClassNotFoundException, IOException {
  
    try{
        FilmeControle objC = new FilmeControle();
        
        labeListFilmes.setText(objC.listarFilme(TelaInicialController.nick));//lista so filmes do usuario logado
        }catch(EOFException e){
            labeListFilmes.setText("Nenhum filme adicionado");
        }
    }

    @FXML
    //chama a tela para adicionar um filme
    void pagAddFilme(ActionEvent event) throws IOException {
        PagAddFilmeController objAddFilme = new PagAddFilmeController();
        FXMLLoader usuarioLoader = new FXMLLoader(getClass().getResource("/layout/PagAddFilme.fxml"));
        Parent pagAddFilme = usuarioLoader.load();
        pagUsuario.getChildren().setAll(pagAddFilme);
    }
    @FXML
    //volta para a tela inicial
    void sair(ActionEvent event) throws IOException {
        FXMLLoader usuarioLoader = new FXMLLoader(getClass().getResource("/layout/TelaInicial.fxml"));
        Parent pagCadastro = usuarioLoader.load();
        pagUsuario.getChildren().setAll(pagCadastro);
    }

    
}

