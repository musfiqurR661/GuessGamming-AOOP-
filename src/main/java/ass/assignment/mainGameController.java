package ass.assignment;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Random;


public class mainGameController  {

    @FXML
    private Label afterNumGenerate;

    @FXML
    private Label attempMSG;

    @FXML
    private Circle c1;

    @FXML
    private Circle c2;

    @FXML
    private Circle c3;

    @FXML
    private Button submutB;
    @FXML
    private Label attempShow;
    @FXML
    private Button ganarate;

    static int attempsCount = 2;
    //
////int
//    @FXML
//    void genarateNumber(ActionEvent event) {
//        Random random = new Random();
//        int randomNumber = random.nextInt(100);
//        BreakIterator randomNumberLabel = null;
//        randomNumberLabel.setText(Integer.toString(randomNumber));
//
//    }
    int genarateNumber;


    @FXML
    void genarateNumber() {
        Random random = new Random();
        genarateNumber = random.nextInt(1, 4);
        afterNumGenerate.setText("Your Number is Generated, Guess the number from the circle");
        System.out.println(genarateNumber);
    }

    @FXML
    private Label lvlPress;

    @FXML
    private TextField textField;

//    @FXML
//    void c1CircleClick(InputMethodEvent event) {
//        if (genarateNumber == 1) {
//            System.out.println("YOU WIN");
//        } else {
//           countChange();
//        }
//    }
//
//    @FXML
//    void c2CircleClick(InputMethodEvent event) {
//        if (genarateNumber == 2) {
//            System.out.println("Ou win");
//        } else {
//          countChange();
//        }
//
//    }
//
//    @FXML
//    void c3Circleclick(InputMethodEvent event) {
//        if (genarateNumber == 3) {
//            System.out.println("You win");
//        } else {
//          countChange();
//        }
//
//    }

    @FXML
    void c1Circleclick(MouseEvent event) throws IOException {
        if (genarateNumber == 1) {
            System.out.println("YOU WIN");
        } else {
            countChange(event);
        }

    }

    @FXML
    void c2CircleClick(MouseEvent event) throws IOException {
        if (genarateNumber == 2) {
            System.out.println("YOU WIN");
        } else {
           countChange(event);
     }

    }

    @FXML
    void c3CircleClick(MouseEvent event) throws IOException {
        if (genarateNumber == 3) {
            System.out.println("YOU WIN");
        } else {
            countChange(event);
        }

    }

    @FXML
    void takeNameSB(ActionEvent event) {


    }

//    @Override
//    public void initialize(URL location, ResourceBundle resources) {
//        attempShow.setText(""+attempsCount);
//
//
//    }
    public void countChange(Event event) throws IOException {
       attempsCount--;
       if(attempsCount>0)
       {
           attempShow.setText(""+attempsCount);
       }
       else
       {

           Parent root= FXMLLoader.load(getClass().getResource("firstScene.fxml"));
           stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
           scene=new Scene(root);
           stage.setScene(scene);
           stage.show();
       }
    }
    private Stage stage;
    private Scene scene;
    private Parent root;

}
