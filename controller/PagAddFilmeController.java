package controller;

import java.io.IOException;

import controle.FilmeControle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class PagAddFilmeController {

    @FXML
    private AnchorPane telaAdicionaFilmes;

    @FXML
    private TextField TextFieldNomeFilme;

    @FXML
    private TextField TextFieldNomeDiretor;

    @FXML
    private TextField TextFieldGenero;

    @FXML
    private Button btnAddFilme;

    @FXML
    private TextArea TextFieldAreaComentario;
    

    @FXML
    private Button btnQuit;

    @FXML
    private Button btnVoltar;

    
    @FXML
    void addFilme(ActionEvent event) {
        FilmeControle objControleFilme = new FilmeControle();
        String nome = TextFieldNomeFilme.getText();
        String diretor = TextFieldNomeDiretor.getText();
        String genero = TextFieldGenero.getText();
        String comentario = TextFieldAreaComentario.getText();
        objControleFilme.adicionarFilme(nome, diretor, genero, comentario, TelaInicialController.nick);
        TextFieldNomeFilme.setText("");
        TextFieldNomeDiretor.setText("");
        TextFieldGenero.setText("");
        TextFieldAreaComentario.setText("");
    }

    @FXML
    void sair(ActionEvent event) throws IOException {
        FXMLLoader usuarioLoader = new FXMLLoader(getClass().getResource("/layout/TelaInicial.fxml"));
        Parent pagCadastro = usuarioLoader.load();
        telaAdicionaFilmes.getChildren().setAll(pagCadastro);
    
    }
    @FXML
    void back(ActionEvent event) throws IOException {
        FXMLLoader usuarioLoader = new FXMLLoader(getClass().getResource("/layout/PagUsuario.fxml"));
        Parent PagUsuario = usuarioLoader.load();
        telaAdicionaFilmes.getChildren().setAll(PagUsuario);
    }

}
