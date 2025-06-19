module lifeisle.simulation.lifeislecore {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens lifeisle.simulation.lifeislecore to javafx.fxml;
    exports lifeisle.simulation.lifeislecore;
}