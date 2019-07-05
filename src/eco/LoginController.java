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
import javafx.scene.image.Image;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Jesus Lozano
 */
public class LoginController implements Initializable {

    @FXML
    private Label label;
    
    @FXML
    private JFXButton cerrar;

    @FXML
    private void logIn(ActionEvent event) throws IOException {
        window(event, "Menu.fxml");
    }

    @FXML
    private void window(ActionEvent e, String ventana) throws IOException {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource(ventana));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        app_stage.setMaximized(false);
        app_stage.setResizable(false);
        app_stage.setMinWidth(900);
        app_stage.setMinHeight(660);
        app_stage.getIcons().add(new Image("/Imagenes/forest.png"));
        app_stage.setTitle("Finca la Esperanza");
        app_stage.hide(); //optional
        app_stage.setScene(home_page_scene);
        app_stage.show();
    }

    @FXML
    private void observador(ActionEvent e) throws IOException {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("Consulta.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        app_stage.setMaximized(false);
        app_stage.setResizable(false);
        app_stage.setMinWidth(839);
        app_stage.setMinHeight(573);
        app_stage.setMaxWidth(1000);
        app_stage.setMaxHeight(650);
        app_stage.getIcons().add(new Image("/Imagenes/forest.png"));
        app_stage.setTitle("Finca la Esperanza");
        app_stage.close(); //optional
        app_stage.setScene(home_page_scene);
        app_stage.show();
    }

    @FXML
    private void cerrar(ActionEvent e) {
        Stage stage = (Stage) cerrar.getScene().getWindow();
        stage.close();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
