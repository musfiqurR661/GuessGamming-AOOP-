package ass.assignment;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
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
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;


public class mainGameController implements Initializable {
    private Stage stage;
    private Scene scene;
    private Parent root;
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
    private Button submitNameButton;

    @FXML
    private Label attempShow;
    @FXML
    private Button ganarate;

    static int attempsCount = 2;

    int genarateNumber;

     //Genarate number Randomlly
    @FXML
    void genarateNumber() {
        Random random = new Random();
        genarateNumber = random.nextInt(1, 4);
        afterNumGenerate.setText("Your Number is Generated, Guess the Number and select the proper Circle");
        //System.out.println(genarateNumber);
    }

    @FXML
    private Label lvlPress;

    @FXML
    private TextField textInput;


    @FXML
    void c1Circleclick(MouseEvent event) throws IOException {
        if (genarateNumber == 1) {
            //System.out.println("YOU WIN");
            Winn(event);
        } else {
            changeCount(event);
        }

    }

    @FXML
    void c2CircleClick(MouseEvent event) throws IOException {
        if (genarateNumber == 2) {
           // System.out.println("YOU WIN");
            Winn(event);
        } else {
           changeCount(event);
     }

    }

    @FXML
    void c3CircleClick(MouseEvent event) throws IOException {
        if (genarateNumber == 3) {
           // System.out.println("YOU WIN");
            Winn(event);
        } else {

            //System.out.println("You Lose");
            changeCount(event);
        }

    }
    //class
    // public class info{
    // public static String exectName="";
    //}
    public static String yourName=" ";
    @FXML
    void takeNameSBclick(ActionEvent event) throws IOException {
     yourName=textInput.getText();
    }


    public void changeCount(Event event) throws IOException {
       attempsCount--;
       if(attempsCount>0)
       {
           attempShow.setText(""+attempsCount);
       }
       else
       {

           Parent root= FXMLLoader.load(getClass().getResource("loss.fxml"));
           stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
           scene=new Scene(root);
           stage.setScene(scene);
           stage.show();

       }
    }
    //win scene handel
    public void Winn(Event event) throws IOException {
       WinResult resultWin =new WinResult();
        Parent root = FXMLLoader.load(getClass().getResource("win.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //for set initial text in textfield
        textInput.setText("Enter Your Name");

    }
}
