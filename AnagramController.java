/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package anangram;


import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Zahra Maryam
 */
public class AnagramController implements Initializable {

    @FXML
    private Button GuessB;
    @FXML
    private Button NextB;
    @FXML
    private Button BackB;
    private Stage stage3;
    private Scene scene3;
    private int wordInd = 0;
    @FXML
    private TextField ScrambleTF;
    @FXML
    private TextField GuessTF;
    @FXML
    private Label Label;
    String[] scrambleWords = {
        "ajva","ggramprogni","ythopn","gmranaa","bdorakye","esoum","patlop"};
    String[] GuessWords = { 
        "java","proggraming","python","anagram","keyboard","mouse","laptop" };
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       ScrambleTF.setText(scrambleWords[wordInd]);
       GuessTF.setText("");
    }    
    
    @FXML
    private void HandleActionGuessB(ActionEvent event) {
        String s = GuessTF.getText();
        if(s.equals(GuessWords[wordInd])){
            Label.setText("Correct!");
        }
        else
            Label.setText("Try Again!");
    }

    @FXML
    private void HandleActionNextB(ActionEvent event) {
        if(wordInd<scrambleWords.length){
        wordInd = wordInd + 1;
        ScrambleTF.setText(scrambleWords[wordInd]);
        GuessTF.setText("");}
    else
         wordInd = 0;
         ScrambleTF.setText(scrambleWords[wordInd]);
         GuessTF.setText("");
    }

    @FXML
    private void HandleActionBackB(ActionEvent event) throws IOException {
        Parent root2 = FXMLLoader.load(getClass().getResource("Start.fxml"));
        stage3 = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene3 = new Scene(root2);
        stage3.setScene(scene3);
        stage3.show();
    }
   
    
}
