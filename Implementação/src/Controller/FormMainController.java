
package Controller;

import Model.User;
import DAO.DbAcessUser;
import View.GerenciLar;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;


public class FormMainController implements Initializable {

    @FXML
    private Button btnUser;

    @FXML
    private Button btnBill;

    @FXML
    private Button btnActivity;

    @FXML
    private Button btnList;
    
    @FXML
    private Label lblSair;

    @FXML
    private Label lblLogoff;
    
    @FXML
    private Label txtUser;
    
    private final DbAcessUser service = new DbAcessUser ();
    
    User userAtual = new User();
    
    GerenciLar gr = new GerenciLar();
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
//        try {
//            setUserName();
//        } catch (SQLException ex) {
//            Logger.getLogger(FormMainController.class.getName()).log(Level.SEVERE, null, ex);
//            System.err.println("ERROR PREENCHENDO USER NAME MAIN");
//            System.exit(0);
//        }
    } 
    
    public void setUserName(String nm) throws SQLException{
        userAtual = service.userLogado(nm);
        String str = userAtual.getName();
        txtUser.setText(str);
    }
    
    public void Exit(){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Sair do Sistema");
        alert.setHeaderText("Você deseja realmente sair?");

        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK)
            GerenciLar.exit();
    }
    
    public void Logoff() throws IOException{
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logoff do Sistema");
        alert.setHeaderText("Você deseja realmente sair?");

        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK)
            gr.logoff();
    }
    
    public void UserPage() throws IOException{
        gr.user();
    }
    
    public void BillPage() throws IOException{
        gr.bill();
    }
    
    public void ActivityPage() throws IOException{
        gr.activity();
    }
    
    public void ListPage() throws IOException{
        gr.list();
    }
}
