/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eco;

import com.jfoenix.controls.JFXButton;
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
public class CalendarioController implements Initializable {
    @FXML
    JFXButton cerrar;
    
    @FXML
    private void atras(ActionEvent e) throws IOException {
        window(e, "Menu.fxml");
    }

    @FXML
    private void window(ActionEvent e, String ventana) throws IOException {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource(ventana));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        app_stage.setMaximized(false);
        app_stage.setResizable(true);
        app_stage.setMinWidth(1075);
        app_stage.setMinHeight(710);
        app_stage.getIcons().add(new Image("/Imagenes/forest.png"));
        app_stage.setTitle("Finca la Esperanza");
        app_stage.close(); //optional
        app_stage.setScene(home_page_scene);
        app_stage.show();
    }

    @FXML
    private void nuevoEvento(ActionEvent e) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("NuevoEvento.fxml"));
        AnchorPane rootLayout = (AnchorPane) loader.load();
        Stage stage = new Stage(StageStyle.UNDECORATED);
        stage.initModality(Modality.APPLICATION_MODAL);
        Scene scene = new Scene(rootLayout);
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    private void agregarEvento(ActionEvent e){  //Aqui va el codigo para agregar un nuevo evento
    
    }
    
    
    @FXML
    private void consultar(ActionEvent e){ //aqui pones el codigo para consultar un evento
        
    }
    
    @FXML
    private void cerrar(ActionEvent e) {  //cierra a ventana de nuevo evento
        Stage stage = (Stage) cerrar.getScene().getWindow();
        stage.close();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
