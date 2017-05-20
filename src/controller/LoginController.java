/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author subarkah
 */
public class LoginController {
    
    @FXML
    private TextField tfUser;
    
    @FXML
    private PasswordField tfPas;
    
    @FXML
    private Button btnLogin;
    
    
    @FXML 
    private void handleLogin(ActionEvent event) throws Exception {
        FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/view/BerandaAdm.fxml"));
            loader.load();
            Parent parent = loader.getRoot();
            Scene adminPanelScene = new Scene(parent);
            Stage adminPanelStage = new Stage();
            adminPanelStage.setScene(adminPanelScene);
            adminPanelStage.show();
            Stage stage = (Stage) btnLogin.getScene().getWindow();
            stage.close();
    }
    
}