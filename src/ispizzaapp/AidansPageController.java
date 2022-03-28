package ispizzaapp;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

/**
 * FXML Controller class
 *
 * @author HP201802
 */
public class AidansPageController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void onNextClicked() {


        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setContentText("You clicked");
        alert.showAndWait();

    }
}
