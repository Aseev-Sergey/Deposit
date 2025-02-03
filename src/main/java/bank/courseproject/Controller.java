package bank.courseproject;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    private Button buttonAddDeposit;

    @FXML
    protected void onActionAddDeposit() {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("AddWindow.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1000, 400);
        stage.setScene(scene);
        stage.show();
    }
}