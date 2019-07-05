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

import javafx.fxml.FXML;

import javafx.fxml.Initializable;

import javafx.scene.control.Label;

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

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        for (int i = 0; i < 9; i++) {
            System.out.println(editables[i]);
        }
        disableForm();
    }
}
