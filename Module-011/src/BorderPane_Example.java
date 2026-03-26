import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class BorderPane_Example extends Application {

    @Override
    public void start(Stage stage) {

        try {
            // Set title for the stage
            stage.setTitle("BorderPane Example");

            // Create Labels for each region
            Label topLabel = new Label("Top Region");
            Label bottomLabel = new Label("Bottom Region");
            Label leftLabel = new Label("Left Region");
            Label rightLabel = new Label("Right Region");
            Label centerLabel = new Label("Center Region");

            // Create Buttons for more visual cues (optional)
            Button topBtn = new Button("Menu");
            Button bottomBtn = new Button("Status");
            Button leftBtn = new Button("Navigation");
            Button rightBtn = new Button("Tools");
            Button centerBtn = new Button("Main Content");

            // Top HBox
            HBox topBox = new HBox(10, topLabel, topBtn);
            topBox.setStyle("-fx-background-color: lightblue; -fx-padding: 10px;");

            // Bottom HBox
            HBox bottomBox = new HBox(10, bottomLabel, bottomBtn);
            bottomBox.setStyle("-fx-background-color: lightgreen; -fx-padding: 10px;");

            // Left VBox
            VBox leftBox = new VBox(10, leftLabel, leftBtn);
            leftBox.setStyle("-fx-background-color: lightcoral; -fx-padding: 10px;");

            // Right VBox
            VBox rightBox = new VBox(10, rightLabel, rightBtn);
            rightBox.setStyle("-fx-background-color: lightgoldenrodyellow; -fx-padding: 10px;");

            // Center StackPane (to center the content)
            StackPane centerPane = new StackPane(centerLabel, centerBtn);
            centerPane.setStyle("-fx-background-color: lightgray;");

            // Create BorderPane and add all regions
            BorderPane borderPane = new BorderPane();
            borderPane.setTop(topBox);
            borderPane.setBottom(bottomBox);
            borderPane.setLeft(leftBox);
            borderPane.setRight(rightBox);
            borderPane.setCenter(centerPane);

            // Create scene
            Scene scene = new Scene(borderPane, 600, 400);

            // Set the scene
            stage.setScene(scene);
            stage.show();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
