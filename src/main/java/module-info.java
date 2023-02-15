module ass.assignment {
    requires javafx.controls;
    requires javafx.fxml;


    opens ass.assignment to javafx.fxml;
    exports ass.assignment;
}