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
import javafx.stage.Stage;

/**
 *
 * @author Jesus Lozano
 */
public class FormularioActualizarController implements Initializable {

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

    public static boolean editables[] = new boolean[9];

    @FXML
    private void disableForm() {
        if (editables[0] == false) {
            zonaF.setDisable(true);
        }

        if (editables[1] == false) {
            alturaF.setDisable(true);
        }

        if (editables[2] == false) {
            anchoF.setDisable(true);
        }

        if (editables[3] == false) {
            edadF.setDisable(true);
        }

        if (editables[4] == false) {
            saludF.setDisable(true);
        }

        if (editables[5] == false) {
            ncreF.setDisable(true);
        }

        if (editables[6] == false) {
            fechaFF.setDisable(true);
        }

        if (editables[7] == false) {
            fechaSF.setDisable(true);
        }

        if (editables[8] == false) {
            totalF.setDisable(true);
        }

    }

    @FXML
    private void actualizar(ActionEvent e) {
        //aqui va el codigo para actualizar la informacion del arbol
    }

    @FXML
    private void atras(ActionEvent e) throws IOException, Throwable {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("DatosUpdate.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        app_stage.getIcons().add(new Image("/Imagenes/forest.png"));
        app_stage.setTitle("Finca la Esperanza");
        app_stage.hide(); //optional
        app_stage.setScene(home_page_scene);
        app_stage.show();
        app_stage.centerOnScreen();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        for (int i = 0; i < 9; i++) {
            System.out.println(editables[i]);
        }
        disableForm();
    }
}
