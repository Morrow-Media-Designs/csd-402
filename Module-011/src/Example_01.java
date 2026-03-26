/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Application
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Example_01 extends Application {

  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {

    // Create a Button
    Button button = new Button("Button Lable");

    // Place in scene               width   height
    Scene scene = new Scene(button, 300,    300);

    // Set stage title
    primaryStage.setTitle("Stage Title");

    // Place scene in stage
    primaryStage.setScene(scene);

    // Display stage
    primaryStage.show();
  }
  
  /*
   * Main method only needed for IDE with limited
   *   JavaFX support. 
   * Not needed for running from command line.
   */
  public static void main(String[] args) { 
    launch(args);
  }
}
