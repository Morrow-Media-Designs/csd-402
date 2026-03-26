import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class VBoxHBoxExampleFromSO extends Application {

    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox(10);

        HBox hbox1 = new HBox(10);
        Rectangle r1 = new Rectangle();
        r1.setFill(Color.RED);
        r1.widthProperty().bind(root.widthProperty().divide(4));
        r1.heightProperty().bind(r1.widthProperty());
        hbox1.getChildren().add(r1);

        HBox hbox2 = new HBox(10);
        Rectangle r2 = new Rectangle();
        r2.setFill(Color.GREEN);
        r2.widthProperty().bind(root.widthProperty().divide(4));
        r2.heightProperty().bind(r2.widthProperty());
        hbox2.getChildren().add(r2);

        // Let hbox2 grow horizontally
        HBox.setHgrow(hbox2, Priority.ALWAYS);

        root.getChildren().addAll(hbox1, hbox2);

        Scene scene = new Scene(root, 800, 600, Color.WHITE);
        primaryStage.setScene(scene);
        primaryStage.setTitle("VBox + HBox Layout Example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
