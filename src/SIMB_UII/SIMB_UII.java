/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIMB_UII;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author subarkah
 */
public class SIMB_UII extends Application {

    @Override
    public void start(Stage primaryStage)  {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/view/Login.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Selamat Datang di SIMB UII-Login");
            primaryStage.setMaximized(false);
            primaryStage.show();
        } catch (IOException ex) {
            Logger.getLogger(SIMB_UII.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
