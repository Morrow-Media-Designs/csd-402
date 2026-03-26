/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Button in Pane
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Example_03 extends Application {

  @Override
  public void start(Stage primaryStage) {

    // Create StackPane
    StackPane pane = new StackPane();
    // Place utton in StackPane
    pane.getChildren().add(new Button("OK"));    

    // Create Scene to hold Pane
    Scene scene = new Scene(pane, 300, 300);

    primaryStage.setTitle("Button in a pane");
    primaryStage.setScene(scene);
    primaryStage.show();

  }
  
  public static void main(String[] args) {
    launch(args);
  }
}
