/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpkg;

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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class ShowAllEmployeesController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ShowAllEmployeesBack(ActionEvent event) throws IOException {
          Parent myparent = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
        Scene myscene = new Scene(myparent);
        Stage mywindow = (Stage)((Node)event.getSource()).getScene().getWindow(); //not for new window
//        Stage mywindow = new Stage(); // for new window
        
        mywindow.setTitle("Dashboard"); //SET TITLE FOR NEXT PAGE HERE!!!!!!!
        mywindow.setScene(myscene);
        mywindow.show();
    }
    
}