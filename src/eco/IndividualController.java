/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eco;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXListView;
import java.io.File;
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
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Jesus Lozano
 */
public class IndividualController implements Initializable {

    @FXML
    JFXButton zoomIn, zoomOut;
    @FXML
    ImageView image; // esta es la variable en la que cargaras la imagen
    @FXML
    Pane ipane;
    @FXML
    AnchorPane zpane;
    
    @FXML
    JFXListView<Label> tSalud, tNutricion, tMantenimiento, tCosecha; //Esto son todos los ListView de la consulta individual

    @FXML
    private void zoomIn(ActionEvent e) {     //hace zoom positivo a la imagen
        double altura = image.getFitHeight();
        double ancho = image.getFitWidth();
        image.setPreserveRatio(true);
        image.setFitHeight(altura + 20);
        image.setFitWidth(ancho + 20);

    }

    @FXML
    private void zoomOut(ActionEvent e) {  //hace zoom negativo a la imagen
        double altura = image.getFitHeight();
        double ancho = image.getFitWidth();
        image.setPreserveRatio(true);
        image.setFitHeight(altura - 20);
        image.setFitWidth(ancho - 20);

    }

    @FXML
    private void editInfo(ActionEvent e) throws IOException { //Lleva a la ventana para actualizar la información del arbol
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("DatosUpdate.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        app_stage.setMaximized(false);
        app_stage.setResizable(false);
        app_stage.setMinWidth(726);
        app_stage.setMinHeight(544);
        app_stage.setMaxWidth(726);
        app_stage.setMaxHeight(544);
        app_stage.getIcons().add(new Image("/Imagenes/forest.png"));
        app_stage.setTitle("Finca la Esperanza");
        app_stage.close(); //optional
        app_stage.setScene(home_page_scene);
        app_stage.show();
    }

    @FXML
    private void atras(ActionEvent e) throws IOException {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("Consulta.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        app_stage.setMaximized(false);
        app_stage.setResizable(false);
        app_stage.setMinWidth(840);
        app_stage.setMinHeight(574);
        app_stage.setMaxWidth(840);
        app_stage.setMaxHeight(574);
        app_stage.getIcons().add(new Image("/Imagenes/forest.png"));
        app_stage.setTitle("Finca la Esperanza");
        app_stage.close(); //optional
        app_stage.setScene(home_page_scene);
        app_stage.show();
    }
    
    @FXML
    private void nuevaImagen(ActionEvent e) throws IOException { //Aqui pones el codigo para una nueva consulta de un arbol
        FileChooser fc = new FileChooser();
        File archivo = fc.showOpenDialog(null);
        
        if(archivo == null){
            System.out.println("No se selecciono Archivo");
        }
        
    }
    

    @FXML
    private void nuevaConsulta(ActionEvent e) throws IOException { //Aqui pones el codigo para una nueva consulta de un arbol

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }
}
