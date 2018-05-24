/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author amauri
 */
public class FormLoginController implements Initializable {
    
    @FXML
    private TextField txtEmail;
    @FXML
    private ImageView imgHeader;
    @FXML
    private TextField txtSenha;
    @FXML
    private Button btnLogin;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    
    public void LoginEnter(KeyEvent e) {
            if(e.getCode() == KeyCode.ENTER) {
                FazerLogin();
            }
    }
   
    public void FazerLogin(){
        if(txtEmail.getText().equals("amauri@forlogic.net") && Integer.parseInt(txtSenha.getText()) == 123){
            txtEmail.setText("");
            txtSenha.setText("");
            GerenciLar.changeScreen("Main");
        }
        else {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error Message");
            alert.setHeaderText(null);
            alert.setContentText("Usuário ou Senha Incorreta");

            alert.showAndWait();
        }
    }
    
}
