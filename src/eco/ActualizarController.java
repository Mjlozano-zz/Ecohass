/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eco;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
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
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author Jesus Lozano
 */
public class ActualizarController implements Initializable {

    @FXML
    JFXRadioButton zonaB, alturaB, anchoB, edadB, saludB, ncreB, fechaSB, fechaFB, totalB;

    @FXML
    JFXTextField alturaF, anchoF, edadF, saludF, ncreF, totalF;

    @FXML
    JFXDatePicker fechaSF, fechaFF;

    @FXML
    JFXComboBox zonaF;

    @FXML
    Label n_arbol; //en este label es donde se va a poner el numero del arbol al que se le va actulizar la informacion ej: arbol #5
    int cont = 0;

    @FXML
    private void atras(ActionEvent e) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("Rindividual.fxml"));
        Scene scene = new Scene(parent);
        Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        stage.getIcons().add(new Image("/Imagenes/forest.png"));
        stage.setTitle("Finca la Esperanza");
        stage.setResizable(true);
        stage.close();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void goForm(ActionEvent e) throws IOException, Throwable {
        disableForm();
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("FormularioActualizar.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        app_stage.setResizable(true);
        app_stage.getIcons().add(new Image("/Imagenes/forest.png"));
        app_stage.setTitle("Finca la Esperanza");
        app_stage.close();
        app_stage.setScene(home_page_scene);
//        System.gc();
//        this.finalize();
        app_stage.show();
    }

    @FXML
    private void disableForm() {
        if (zonaB.isSelected()) {
            FormularioActualizarController.editables[0] = true;
        } else {
            FormularioActualizarController.editables[0] = false;
        }

        if (alturaB.isSelected()) {
            FormularioActualizarController.editables[1] = true;
        } else {
            FormularioActualizarController.editables[1] = false;
        }

        if (anchoB.isSelected()) {
            FormularioActualizarController.editables[2] = true;
        } else {
            FormularioActualizarController.editables[2] = false;
        }

        if (edadB.isSelected()) {
            FormularioActualizarController.editables[3] = true;
        } else {
            FormularioActualizarController.editables[3] = false;
        }

        if (saludB.isSelected()) {
            FormularioActualizarController.editables[4] = true;
        } else {
            FormularioActualizarController.editables[4] = false;
        }

        if (ncreB.isSelected()) {
            FormularioActualizarController.editables[5] = true;
        } else {
            FormularioActualizarController.editables[5] = false;
        }

        if (fechaSB.isSelected()) {
            FormularioActualizarController.editables[6] = true;
        } else {
            FormularioActualizarController.editables[6] = false;
        }

        if (fechaFB.isSelected()) {
            FormularioActualizarController.editables[7] = true;
        } else {
            FormularioActualizarController.editables[7] = false;
        }

        if (totalB.isSelected()) {
            FormularioActualizarController.editables[8] = true;
        } else {
            FormularioActualizarController.editables[8] = false;
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

}
