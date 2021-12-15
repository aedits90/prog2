module com.example.mukodj {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mukodj to javafx.fxml;
    exports com.example.mukodj;
}