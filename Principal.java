


import modelo.Filme;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import modelo.Filme;
import controller.TelaInicialController;
public class Principal extends Application {


    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/layout/TelaInicial.fxml"));
        Scene scene  = new Scene(root);
        primaryStage.setTitle("Copia do letterbox");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
