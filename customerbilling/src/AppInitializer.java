import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {

       Parent parent= FXMLLoader.load(this.getClass().getResource("view/billingSystem.fxml"));
        Scene scene=new Scene(parent);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Custoemr Details");
        primaryStage.centerOnScreen();
        primaryStage.show();
    }
}
