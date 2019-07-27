
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eco;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


/**
 *
 * @author Jesus Lozano
 */
public class Eco extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));  //Se carga la primera ventana     
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(true);
        stage.getIcons().add(new Image("/Imagenes/forest.png"));
        stage.centerOnScreen();
        stage.setTitle("Iniciar Sesión");
        stage.show();
        stage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue)
                stage.setMaximized(false);
        });
        stage.centerOnScreen();
        
    }


    public static void main(String[] args) {
        launch(args);
    }

}
