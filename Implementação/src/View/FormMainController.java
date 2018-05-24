
package View;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
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
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
    
    public void Exit(){
        GerenciLar.exit();
    }
    
    public void Logoff(){
        GerenciLar.logoff();
    }
    
    
    
}
