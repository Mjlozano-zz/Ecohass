/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eco;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXRadioButton;
import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Jesus Lozano
 */
public class ConsultaController implements Initializable {

    @FXML
    private JFXRadioButton solo_arbol, general;

    @FXML
    public static JFXButton atr;

    @FXML
    private void atras(ActionEvent e) throws IOException {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        //app_stage.setMaximized(false);
        app_stage.setResizable(false);
//        app_stage.setMinWidth(900);
//        app_stage.setMinHeight(660);
        app_stage.getIcons().add(new Image("/Imagenes/forest.png"));
        app_stage.setTitle("Finca la Esperanza");
        app_stage.close(); //optional
        app_stage.setScene(home_page_scene);
        app_stage.show();
        app_stage.centerOnScreen();
        
    }

    @FXML
    private void aguacate(ActionEvent e) throws IOException {  //Para consultas de aguacates
        if (solo_arbol.isSelected() == false && general.isSelected() == false) {
            Alert alert = new Alert(AlertType.WARNING, "Por favor seleccione un tipo de busqueda", ButtonType.OK);
            alert.showAndWait();
        } else {
            if (solo_arbol.isSelected()) {
                pideId(e);
                window(e, "Rindividual.fxml");
            } else {
                window(e, "ConsultaGeneral.fxml");
                ConsultaGeneralController.fruit = true;
            }
        }
    }

    @FXML
    private void tomates(ActionEvent e) throws IOException {  //Para consultas de tomates
        if (solo_arbol.isSelected() == false && general.isSelected() == false) {
            Alert alert = new Alert(AlertType.WARNING, "Por favor seleccione un tipo de busqueda", ButtonType.OK);
            alert.setTitle("Advertencia");
            alert.showAndWait();
        } else {
            if (solo_arbol.isSelected()) {
                pideId(e);
                window(e, "Rindividual.fxml");
            } else {
                window(e, "ConsultaGeneral.fxml");
                ConsultaGeneralController.fruit = false;
            }
        }
    }

    private void pideId(ActionEvent e) throws IOException {  // Muestra el diagolo para que el usuario ingrese el ID
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Consulta");
        dialog.setHeaderText("Ingrese ID del arbol");
        Image image = new Image("/Imagenes/data.png");
        ImageView imageView = new ImageView(image);
        dialog.setGraphic(imageView);
        Optional<String> result = dialog.showAndWait();
    }

    private boolean verifica() { // verifica si el arbol existe

        return true;
    }

    @FXML
    private void window(ActionEvent e, String ventana) throws IOException {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource(ventana));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        app_stage.getIcons().add(new Image("/Imagenes/forest.png"));
        app_stage.setTitle("Finca la Esperanza");
        app_stage.close(); //optional
        app_stage.setResizable(true);
        app_stage.setScene(home_page_scene);
        app_stage.show();
        app_stage.centerOnScreen();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ToggleGroup group = new ToggleGroup();
        solo_arbol.setToggleGroup(group);
        general.setToggleGroup(group);
    }

}
