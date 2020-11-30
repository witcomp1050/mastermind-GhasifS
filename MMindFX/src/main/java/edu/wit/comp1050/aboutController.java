package edu.wit.comp1050;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.stage.Stage;

public class aboutController {

    @FXML
    void goBack(ActionEvent event) {
        Stage window = (Stage) ((Node) event.getTarget()).getScene().getWindow();
        window.setScene(mindFX.startScene);
        window.show();
    }

}
