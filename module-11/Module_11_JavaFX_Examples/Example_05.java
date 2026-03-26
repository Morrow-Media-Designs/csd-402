/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Rotate Pane
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;

public class Example_05 extends Application {

  @Override
  public void start(Stage primaryStage) {

    StackPane pane = new StackPane();
    Button button = new Button("OK");
    // button.setStyle("-fx-border-color: blue;");
    // button.setStyle("-fx-border-color: orange;");
    // button.setStyle("-fx-border-color: red;");
    button.setStyle("-fx-border-color: green; -fx-background-color: red;");
    pane.getChildren().add(button);    
    
    pane.setRotate(45);
    // pane.setStyle("-fx-border-color: red; -fx-background-color: lightgray;");
    // pane.setStyle("-fx-border-color: red; -fx-background-color: orange;");
    // pane.setStyle("-fx-border-color: red; -fx-background-color: red;");
    pane.setStyle("-fx-border-color: red; -fx-background-color: green;");
    
    Scene scene = new Scene(pane, 300, 300);
    primaryStage.setTitle("Rotate Pane");
    primaryStage.setScene(scene);
    primaryStage.show();
  }
  
  public static void main(String[] args) {
    launch(args);
  }
}
