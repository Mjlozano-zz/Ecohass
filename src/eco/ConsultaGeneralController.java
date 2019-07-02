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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author Jesus Lozano
 */
public class ConsultaGeneralController implements Initializable {
    @FXML
    private ImageView arbol_icon;
    public static boolean fruit;
    
    @FXML
    Image aguacate = new Image(getClass().getResourceAsStream("/Imagenes/avocado.png"));
    Image tomate = new Image(getClass().getResourceAsStream("/Imagenes/tomato.png"));
    
    @FXML
    private void atras(ActionEvent e){
        
    }
      
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        if(fruit){
            arbol_icon.setImage(aguacate);
        }else{
            arbol_icon.setImage(tomate);
        }
        
    }    
    
}
