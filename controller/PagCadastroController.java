package controller;

import java.io.IOException;

import controle.UsuarioControle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;

public class PagCadastroController {

	@FXML
	private AnchorPane telaCadastro;

	@FXML
	private TextField TextFieldNickName;

	@FXML
	private TextField TextFieldEmail;

	@FXML
	private TextField TextFieldSenha;

	@FXML
	private Button btnCadastrarUser;

	@FXML
	private Button btnQuit;

	@FXML
	void cadastroUser(ActionEvent event) throws IOException {
	   try{
		UsuarioControle objC = new UsuarioControle();
		String nickName = TextFieldNickName.getText();
		String email = TextFieldEmail.getText();
		String verificaSenha = TextFieldSenha.getText();
	   
		if(verificaSenha.length()==0){//verifica se o espaço na caixa da senha foi preenchido
			Alert alerta = new Alert(AlertType.INFORMATION);
			alerta.setTitle("Error");
			alerta.setHeaderText(null);
			alerta.setContentText("Campo de senha vazio!");
			alerta.showAndWait();
			
		}else{//mensagem de alerta e chamando metedo para abrir TelaInicial
			long senha = Long.parseLong(verificaSenha);
			objC.cadastrarUsuario(nickName, email, senha);
			Alert alerta = new Alert(AlertType.INFORMATION);
			alerta.setTitle("Error");
			alerta.setHeaderText(null);
			alerta.setContentText("Usuario cadastrado com sucesso!!");
			alerta.showAndWait();
			openInicial(event);
		}
	   }catch(NumberFormatException e){//caso o usuario digite um dados do tipo nao aceito
		Alert alerta = new Alert(AlertType.INFORMATION);
		alerta.setTitle("Error");
		alerta.setHeaderText(null);
		alerta.setContentText("A senha deve conter apenas numeros");
		alerta.showAndWait();
		TextFieldSenha.setText("");
	 }
	}

	@FXML
	void sair(ActionEvent event) throws IOException {// Esse evento retorna para a pagina inicial
		FXMLLoader usuarioLoader = new FXMLLoader(getClass().getResource("/layout/TelaInicial.fxml"));
		Parent PagInicial = usuarioLoader.load();
		telaCadastro.getChildren().setAll(PagInicial);
	}
	@FXML
	void openInicial(ActionEvent event)throws IOException{// Esse evento retorna para a pagina inicial
		FXMLLoader usuarioLoader = new FXMLLoader(getClass().getResource("/layout/TelaInicial.fxml"));
		Parent PagInicial = usuarioLoader.load();
		telaCadastro.getChildren().setAll(PagInicial);
	}

}

