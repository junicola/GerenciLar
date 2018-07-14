/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DbAcessUser;
import Model.User;
import View.GerenciLar;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class FormLoginController implements Initializable {
    
    @FXML
    private TextField txtEmail;
    @FXML
    private ImageView imgHeader;
    @FXML
    private TextField txtSenha;
    @FXML
    private Button btnLogin;
    
    private final DbAcessUser service = new DbAcessUser ();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
      
    public void Login() throws IOException, SQLException{
        String senha = txtSenha.getText();
        String login = txtEmail.getText();
        boolean resposta = service.autenticaLogin(login, senha);
        System.out.println();
        
        if(resposta == true){
            txtEmail.setText("");
            txtSenha.setText("");
            service.setLogado(login);
//            GerenciLar gr = new GerenciLar();
//            gr.changeScreen("Main"); 
            change(login);
        }
        
        else {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error Message");
            alert.setHeaderText(null);
            alert.setContentText("Usuário ou Senha Incorreta");

            alert.showAndWait();
            txtEmail.requestFocus();
        }
    }
   
    public void AboutPage() throws IOException{
        GerenciLar gr = new GerenciLar();
        gr.about();
    }
            
    public void LoginEnter(KeyEvent e) throws IOException, SQLException {
            if(e.getCode() == KeyCode.ENTER) {
                Login();
            }
    }
    
    public void change(String login) throws SQLException{
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(getClass().getResource("/View/FormMain.fxml"));
        
        try {
            Loader.load();
        }
        catch (IOException ex){
            System.out.println("erro ao trocar ctrl" + ex);
        }
        FormMainController frm = Loader.getController();
        frm.setUserName(login);
        
        Parent p = Loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(p));
        stage.showAndWait();
    }
}

