package ass.assignment;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

import static ass.assignment.mainGameController.yourName;


public class LossResult implements Initializable {


    @FXML
    private Label lossResult;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

     lossResult.setText(yourName + " YOU LOST!!!");
    }
}
