/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscarjavafx;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javax.swing.JOptionPane;

/**
 *
 * @author Mi Pc
 */
public class FXMLDocumentController implements Initializable {
   
    @FXML
    private Button btnBuscar;
    @FXML
    private Button btnSalir;
    
    @FXML
    private void eventButton(ActionEvent event){
        
      
           
            JOptionPane.showMessageDialog(null,"Buscando Placa...");
           
                //imprime datos de placa
           
           
           //      JOptionPane.showMessageDialog(null,"Error no existe plaaca registrada");
        
         JOptionPane.showMessageDialog(null,"Busqueda realizada con exito:");
        
         
        
    }
    @FXML
        public void Salir(){
           
        int confirmaSalida=JOptionPane.showConfirmDialog(null,"¿Quieres salir?","Mensaje importante",JOptionPane.YES_NO_OPTION);
        if (confirmaSalida==0) {
            System.exit(0);//cierra ventana    
            }
       
}

   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
