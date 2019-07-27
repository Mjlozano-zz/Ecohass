/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eco;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import com.jfoenix.controls.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.image.Image;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import static javafx.scene.input.KeyCode.ENTER;
import javafx.stage.Stage;

/**
 *
 * @author Jesus Lozano
 */
public class LoginController implements Initializable {

    @FXML
    private Label label;

    @FXML
    private JFXTextField user;
    @FXML
    private JFXPasswordField passw;

    @FXML
    public static JFXButton logB, cerrar;
    
    public static boolean obs;

    @FXML
    public void logIn(ActionEvent event) throws IOException { // aqui pones el codigo para iniciar sesión

        window(event, "Menu.fxml"); //esto lo vas a poner en la parte donde se valide que si es correcto el usuario y contraseña
    }
    
    //metodo para iniciar sesion con la tecla enter
    @FXML
    public void logInK(KeyEvent event) throws IOException { // aqui pones el codigo el mismo codigo para iniciar sesion 
        
        if(event.getCode().equals(ENTER)){
            //aqui validas si el usuario y contraseña son correctos
            inicia(event);
        }else{
            
        }
        
       
        //----------------------------------------------------------------------------------
    }
    
    private void inicia(KeyEvent event) throws IOException{
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setMinWidth(900);
        app_stage.setMinHeight(660);
        ConsultaController.observador[0] = false;
        app_stage.getIcons().add(new Image("/Imagenes/forest.png"));
        app_stage.setTitle("Finca la Esperanza");
        app_stage.close(); //optional
        app_stage.setScene(home_page_scene);
        app_stage.show();
        app_stage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue)
                app_stage.setMaximized(false);
        });
        app_stage.centerOnScreen();
    }

    @FXML
    public void window(ActionEvent e, String ventana) throws IOException {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource(ventana));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        app_stage.setMaximized(false);
        app_stage.setResizable(true);
        ConsultaController.observador[0] = false;
        app_stage.getIcons().add(new Image("/Imagenes/forest.png"));
        app_stage.setTitle("Finca la Esperanza");
        app_stage.close(); //optional
        app_stage.setScene(home_page_scene);
        app_stage.show();
        app_stage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue)
                app_stage.setMaximized(false);
        });
        app_stage.centerOnScreen();
    }

    @FXML
    private void observador(ActionEvent e) throws IOException {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("Consulta.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        app_stage.setResizable(true);
        app_stage.getIcons().add(new Image("/Imagenes/forest.png"));
        app_stage.setTitle("Finca la Esperanza");
        app_stage.close();
        ConsultaController.observador[0] = true;
        app_stage.setScene(home_page_scene);
        app_stage.show();
        app_stage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue)
                app_stage.setMaximized(false);
        });
        app_stage.centerOnScreen();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
    }
}
