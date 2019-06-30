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
    private void consulta(ActionEvent e) throws IOException{
        window(e, "Consulta.fxml");
    }
    
    @FXML
    private void crear(ActionEvent e) throws IOException{
        window(e, "Tareas.fxml");
    }

    @FXML
    private void calendario(ActionEvent e) throws IOException{
        window(e, "Calendario.fxml");
    }
    
    @FXML
    private void nuevoArbol(ActionEvent e) throws IOException{
        window(e, "NuevoArbol.fxml");
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
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
     
    }

}
