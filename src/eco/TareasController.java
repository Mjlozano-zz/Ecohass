/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eco;

import com.jfoenix.controls.JFXListView;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Jesus Lozano
 */
public class TareasController implements Initializable {

    @FXML
    private JFXListView<Label> listaT; //esta es la lista de tareas, le puedes cambiar de Label al tipo de objeto que vayas a utilizar
    ContextMenu menu = new ContextMenu();
    MenuItem cambiar = new MenuItem("Cambiar estado");
    MenuItem detalles = new MenuItem("Detalles");

    //Aqui se cargan las imagenes que muestran el estado de la tarea
    Image pendiente = new Image(getClass().getResourceAsStream("/Imagenes/pendiente.png"));
    Image hecho = new Image(getClass().getResourceAsStream("/Imagenes/hecho.png"));

    @FXML
    private void atras(ActionEvent e) throws IOException {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("Menu.fxml"));
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
    private void addTarea() { // Aqui pones el codigo para agregar una nueva tarea
        
        //Automaticamente se agrega la tarea al ListView
        Label lbl = new Label("Nueva Tarea"); 
        lbl.setGraphic(new ImageView(pendiente));//Aqui Por defecto a la tarrea se le pone el icono de pendiente
        listaT.getItems().add(lbl); 
        lbl.setContextMenu(menu);
    }

    //Metodo para agregar los elementos a la lista, puedes reutilizar este codigo en las partes donde se utiliza otros ListView
    private void agregaElementos() {
        for (int i = 0; i < 4; i++) {
            try {
                Label lbl = new Label("Item de prueba " + i); // aqui cargas los elementos para agregar a la lista, 
                lbl.setGraphic(new ImageView(pendiente));
                listaT.getItems().add(lbl); //Aqui se agregan los elementos al ListView
                lbl.setContextMenu(menu);
            } catch (Exception ex) {

            }
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {  //Todo lo que se ponga aqui, se va a ejecutar apenas inicie la ventana
        menu.getItems().add(cambiar);
        menu.getItems().add(detalles);
        agregaElementos();
    }

}
