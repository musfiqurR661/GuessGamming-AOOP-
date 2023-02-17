module ass.assignment {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;


    opens ass.assignment to javafx.fxml;
    exports ass.assignment;
}