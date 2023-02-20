package ass.assignment;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class mainGame extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        //root
        Parent root = FXMLLoader.load(getClass().getResource("mainGame.fxml"));

        //stage mane name
        primaryStage.setTitle("Guess The Number !!");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
