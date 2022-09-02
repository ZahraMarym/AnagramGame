/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package anangram;

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
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Zahra Maryam
 */
public class StartController implements Initializable {

    @FXML
    private Button Exit;
    @FXML
    private Button Start;
    @FXML
    private Stage stage1;
    @FXML
    private Scene scene1;
    

    /**
     * Initializes the controller class.
     */
    @FXML
    private void handleStartButtonAction(ActionEvent event) throws IOException{
        Parent root2 = FXMLLoader.load(getClass().getResource("Anagram.fxml"));
        stage1 = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene1 = new Scene(root2);
        stage1.setScene(scene1);
        stage1.show();
        
    }
    @FXML
    private void handleExitButtonAction(ActionEvent event){
        System.exit(0);
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
