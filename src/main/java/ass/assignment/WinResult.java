package ass.assignment;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

import static ass.assignment.mainGameController.exectName;


public class WinResult implements Initializable {
    @FXML
    private Label winResult;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        winResult.setText(exectName+ "You Win !");

    }
}
