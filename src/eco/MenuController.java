/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eco;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Jesus Lozano
 */
public class MenuController implements Initializable {

    @FXML
    public static AnchorPane menu_container, cont;

    @FXML
    private void consulta(ActionEvent e) throws IOException {
        window(e, "Consulta.fxml");
    }

    @FXML
    private void cerrarSesion(ActionEvent e) throws IOException {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "¿Esta seguro de cerrar Sesión?", ButtonType.YES, ButtonType.CANCEL);
        alert.setTitle("Confirmar");
        alert.showAndWait();

        if (alert.getResult() == ButtonType.YES) {
            Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
            Scene scene = new Scene(root);
            Stage app_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
//            app_stage.setMinWidth(353);
//            app_stage.setMinHeight(480);
//            app_stage.setMaxWidth(353);
//            app_stage.setMaxHeight(480);
            app_stage.setResizable(false);
            app_stage.getIcons().add(new Image("/Imagenes/forest.png"));
            app_stage.setTitle("Finca la Esperanza");
            app_stage.close(); //optional
            app_stage.setScene(scene);
            app_stage.show();
            app_stage.centerOnScreen();
        }

    }

    @FXML
    private void crear(ActionEvent e) throws IOException {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("Tareas.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        app_stage.setMaximized(false);
        app_stage.setResizable(false);
//        app_stage.setMinWidth(840);
//        app_stage.setMinHeight(610);
//        app_stage.setMaxWidth(840);
//        app_stage.setMaxHeight(610);
        app_stage.getIcons().add(new Image("/Imagenes/forest.png"));
        app_stage.setTitle("Finca la Esperanza");
        app_stage.close(); //optional
        app_stage.setScene(home_page_scene);
        app_stage.show();
        app_stage.centerOnScreen();
    }

    @FXML
    private void calendario(ActionEvent e) throws IOException {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("Calendario.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        app_stage.setMaximized(false);
        app_stage.setResizable(false);
//        app_stage.setMinWidth(780);
//        app_stage.setMinHeight(580);
//        app_stage.setMaxWidth(780);
//        app_stage.setMaxHeight(580);
        app_stage.getIcons().add(new Image("/Imagenes/forest.png"));
        app_stage.setTitle("Finca la Esperanza");
        app_stage.close(); //optional
        app_stage.setScene(home_page_scene);
        app_stage.show();
        app_stage.centerOnScreen();

    }

    @FXML
    private void nuevoArbol(ActionEvent e) throws IOException {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("NuevoArbol.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        app_stage.setMaximized(false);
        app_stage.setResizable(false);
//        app_stage.setMinWidth(840);
//        app_stage.setMinHeight(610);
//        app_stage.setMaxWidth(840);
//        app_stage.setMaxHeight(610);
        app_stage.getIcons().add(new Image("/Imagenes/forest.png"));
        app_stage.setTitle("Finca la Esperanza");
        app_stage.close(); //optional
        app_stage.setScene(home_page_scene);
        app_stage.show();
        app_stage.centerOnScreen();
    }

    @FXML
    private void window(ActionEvent e, String ventana) throws IOException {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource(ventana));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        app_stage.setMaximized(false);
        app_stage.setResizable(false);
        app_stage.getIcons().add(new Image("/Imagenes/forest.png"));
        app_stage.setTitle("Finca la Esperanza");
        app_stage.close(); //optional
        app_stage.setScene(home_page_scene);
        app_stage.show();
        app_stage.centerOnScreen();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

}
