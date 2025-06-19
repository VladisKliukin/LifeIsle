package lifeisle.simulation.lifeislecore;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class LifeIsleAppController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}