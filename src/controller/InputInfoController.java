/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author subarkah
 */
public class InputInfoController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private Hyperlink tambah, umumkan, seleksi;
    
    
   
    @FXML 
    private void handleTambah(ActionEvent event) throws Exception {
        FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/view/InputInfo.fxml"));
            loader.load();
            Parent parent = loader.getRoot();
            Scene adminPanelScene = new Scene(parent);
            Stage adminPanelStage = new Stage();
            adminPanelStage.setScene(adminPanelScene);
            adminPanelStage.show();
            Stage stage = (Stage) tambah.getScene().getWindow();
            stage.close();
    }
    
    @FXML 
    private void handleSeleksi(ActionEvent event) throws Exception {
        FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/view/Seleksi.fxml"));
            loader.load();
            Parent parent = loader.getRoot();
            Scene adminPanelScene = new Scene(parent);
            Stage adminPanelStage = new Stage();
            adminPanelStage.setScene(adminPanelScene);
            adminPanelStage.show();
            Stage stage = (Stage) seleksi.getScene().getWindow();
            stage.close();
    }
    
     @FXML 
    private void handleUmumkan(ActionEvent event) throws Exception {
        FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/view/Umumkan.fxml"));
            loader.load();
            Parent parent = loader.getRoot();
            Scene adminPanelScene = new Scene(parent);
            Stage adminPanelStage = new Stage();
            adminPanelStage.setScene(adminPanelScene);
            adminPanelStage.show();
            Stage stage = (Stage) umumkan.getScene().getWindow();
            stage.close();
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
