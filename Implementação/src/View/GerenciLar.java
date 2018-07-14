package View;


import Model.User;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class GerenciLar extends Application {
    
    private static Stage myStage;
    
    private static Scene loginScene;
    private static Scene mainScene;
    private static Scene aboutScene;
    private static Scene userScene;
    private static Scene billScene;
    private static Scene activityScene;
    private static Scene listScene;
    private static Scene addUserScene;
    private static Scene addBillScene;
    private static Scene addActivityScene;
    private static Scene addListScene;
    private static Scene payBillScene;
    private static Scene historyScene;

    @Override
    public void start(Stage stage) throws Exception {
        myStage = stage;
        
        Parent fxmlLogin = FXMLLoader.load(getClass().getResource("FormLogin.fxml"));
        loginScene = new Scene(fxmlLogin);
        
        stage.setScene(loginScene);
        stage.setTitle("GerenciLar");
        stage.getIcons().add(
    new Image(
        GerenciLar.class.getResourceAsStream( "Image/icon.png" ))); 
        stage.setResizable(false);
        stage.show();        
    }
    
    public void changeScreen(String scr) throws IOException{
        switch(scr){
            case "Login":
                myStage.setScene(loginScene);
                break;
            case "Main":
                Parent fxmlMain = FXMLLoader.load(getClass().getResource("FormMain.fxml"));
                mainScene = new Scene(fxmlMain);
                myStage.setScene(mainScene);
                break;
            case "About":
                myStage.setScene(aboutScene);
                break;
            case "User":
                myStage.setScene(userScene);
                break;
            case "Bill":
                myStage.setScene(billScene);
                break;    
            case "Activity":
                myStage.setScene(activityScene);
                break;  
            case "List":
                myStage.setScene(listScene);
                break;
            case "AddUser":
                myStage.setScene(addUserScene);
                break;
            case "AddBill":
                myStage.setScene(addBillScene);
                break;
            case "AddActivity":
                myStage.setScene(addActivityScene);
                break;
            case "AddList":
                myStage.setScene(addListScene);
                break;
            case "PayBill":
                myStage.setScene(payBillScene);
                break;
            case "History":
                myStage.setScene(historyScene);
        }
    }
    
    public static void exit(){
        myStage.close();
    }
    
    public void logoff() throws IOException{
        changeScreen("Login");
    }
    
    public void about() throws IOException{
        changeScreen("About");
    }
    
    public void user() throws IOException{
        changeScreen("User");
    }
    
    public void bill() throws IOException{
        changeScreen("Bill");
    }
    
    public void activity() throws IOException{
        changeScreen("Activity");
    }
    
    public void list() throws IOException{
        changeScreen("List");
    }
    
    public void addUser() throws IOException{
        changeScreen("AddUser");
    }
    
    public void addBill() throws IOException{
        changeScreen("AddBill");
    }
    
    public void addActivity() throws IOException{
        changeScreen("AddActivity");
    }
    
    public void addList() throws IOException{
        changeScreen("AddList");
    }
    
    public void payBill() throws IOException{
        changeScreen("PayBill");
    }
    
    public void historico() throws IOException{
        changeScreen("History");
    }
    
    public static void main(String[] args) {
        launch(args);       
        
    }
    
    
    
    
}


