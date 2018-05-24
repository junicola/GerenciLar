/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author amauri
 */
public class GerenciLar extends Application {
    
    private static Stage myStage;
    
    private static Scene loginScene;
    private static Scene mainScene;
    
    @Override
    public void start(Stage stage) throws Exception {
        myStage = stage;
        
        Parent fxmlLogin = FXMLLoader.load(getClass().getResource("FormLogin.fxml"));
        loginScene = new Scene(fxmlLogin);
        
        Parent fxmlMain = FXMLLoader.load(getClass().getResource("FormMain.fxml"));
        mainScene = new Scene(fxmlMain);
        
        stage.setScene(loginScene);
        stage.setTitle("GerenciLar");
        stage.getIcons().add(
   new Image(
      GerenciLar.class.getResourceAsStream( "icon.png" ))); 
        stage.setResizable(false);
        stage.show();
        
    }
    
    public static void changeScreen(String scr){
        switch(scr){
            case "Login":
                myStage.setScene(loginScene);
                break;
            case "Main":
                myStage.setScene(mainScene);
                break;
        }
    }
    
    public static void exit(){
        myStage.close();
    }
    
    public static void logoff(){
        changeScreen("Login");
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
    
    
    
}


