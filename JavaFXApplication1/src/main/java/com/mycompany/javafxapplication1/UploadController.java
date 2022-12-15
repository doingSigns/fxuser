/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.javafxapplication1;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ntu-user
 */
public class UploadController {
    @FXML
    private Text fileA;
    @FXML
    private Button downloadABtn;
    @FXML
    private Button deleteABtn;
    
     @FXML
    private Button downloadBBtn;
      @FXML
    private Button deleteBBtn;
      @FXML
    private Button downloadCBtn;
       @FXML
    private Button deleteCBtn;
     @FXML
    private Button downloadDBtn; 
      @FXML
    private Button deleteDBtn;
    
    @FXML
    private Text fileB;
    @FXML
    private Text fileC;
    @FXML
    private Text fileD;

    @FXML
    private Button uploadBtn;

    @FXML
    private Text uploadfile;

 
    
    @FXML
    private void uploadBtnHandler (ActionEvent event) throws IOException {
        Stage primaryStage = (Stage) uploadBtn.getScene().getWindow();
        primaryStage.setTitle("Select a File");

        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");
        File selectedFile = fileChooser.showOpenDialog(primaryStage);
        
        if(selectedFile!=null){
            uploadfile.setText((String)selectedFile.getCanonicalPath());
        }
        
    }

  /*  private void dialogue(String headerMsg, String contentMsg) {
        Stage secondaryStage = new Stage();
        Group root = new Group();
        Scene scene = new Scene(root, 300, 300, Color.DARKGRAY);
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Upload Successful");
        alert.setHeaderText(headerMsg);
        alert.setContentText(contentMsg);
        Optional<ButtonType> result = alert.showAndWait();*/
    
          @FXML
    private void downloadABtnHandler(ActionEvent event) throws IOException {
        Stage primaryStage = (Stage) downloadABtn.getScene().getWindow();
        primaryStage.setTitle("Select a File");

        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");
        File selectedFile = fileChooser.showOpenDialog(primaryStage);
        
        if(selectedFile!=null){
            fileA.setText((String)selectedFile.getCanonicalPath());
        }
        
    }
          @FXML
    private void downloadBBtnHandler(ActionEvent event) throws IOException {
        Stage primaryStage = (Stage) downloadBBtn.getScene().getWindow();
        primaryStage.setTitle("Select a File");

        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");
        File selectedFile = fileChooser.showOpenDialog(primaryStage);
        
        if(selectedFile!=null){
            fileB.setText((String)selectedFile.getCanonicalPath());
    }   
    }
          @FXML
    private void downloadCBtnHandler(ActionEvent event) throws IOException {
        Stage primaryStage = (Stage) downloadCBtn.getScene().getWindow();
        primaryStage.setTitle("Select a File");

        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");
        File selectedFile = fileChooser.showOpenDialog(primaryStage);
        
        if(selectedFile!=null){
            fileC.setText((String)selectedFile.getCanonicalPath());
}
    }
          @FXML
    private void downloadDBtnHandler(ActionEvent event) throws IOException {
        Stage primaryStage = (Stage) downloadDBtn.getScene().getWindow();
        primaryStage.setTitle("Select a File");

        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");
        File selectedFile = fileChooser.showOpenDialog(primaryStage);
        
        if(selectedFile!=null){
            fileD.setText((String)selectedFile.getCanonicalPath());
    
        }
    }
          @FXML
    private void deleteABtnHandler(ActionEvent event) throws IOException {
        Stage primaryStage = (Stage) deleteABtn.getScene().getWindow();
        primaryStage.setTitle("Select a File");

        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");
        File selectedFile = fileChooser.showOpenDialog(primaryStage);
        
        if(selectedFile!=null){
            fileA.setText((String)selectedFile.getCanonicalPath());
}
    }
       @FXML
    private void deleteBBtnHandler(ActionEvent event) throws IOException {
        Stage primaryStage = (Stage) deleteBBtn.getScene().getWindow();
        primaryStage.setTitle("Select a File");

        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");
        File selectedFile = fileChooser.showOpenDialog(primaryStage);
        
        if(selectedFile!=null){
            fileB.setText((String)selectedFile.getCanonicalPath());
}
    }
       @FXML
    private void deleteCBtnHandler(ActionEvent event) throws IOException {
        Stage primaryStage = (Stage) deleteCBtn.getScene().getWindow();
        primaryStage.setTitle("Select a File");

        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");
        File selectedFile = fileChooser.showOpenDialog(primaryStage);
        
        if(selectedFile!=null){
            fileC.setText((String)selectedFile.getCanonicalPath());
}
    }
       @FXML
    private void deleteDBtnHandler(ActionEvent event) throws IOException {
        Stage primaryStage = (Stage) deleteDBtn.getScene().getWindow();
        primaryStage.setTitle("Select a File");

        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");
        File selectedFile = fileChooser.showOpenDialog(primaryStage);
        
        if(selectedFile!=null){
            fileD.setText((String)selectedFile.getCanonicalPath());
}
    }
}



