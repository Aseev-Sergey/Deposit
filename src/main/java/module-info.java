module bank.courseproject {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens bank.courseproject to javafx.fxml;
    exports bank.courseproject;
}