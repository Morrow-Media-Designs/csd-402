/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Multiple Stages
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Example_02 extends Application {

  @Override
  public void start(Stage primaryStage) {

    Stage newStage = new Stage();

    Scene scene_01 = new Scene(new Button("Button 1"), 300, 300);
    Scene scene_02 = new Scene(new Button("Button 2"), 300, 300);

    primaryStage.setTitle("First Stage");
    newStage.setTitle("Second Stage");


    primaryStage.setScene(scene_01);
    newStage.setScene(scene_02);        


    primaryStage.show();
    newStage.show();
  }
  
  public static void main(String[] args) {
    launch(args);
  }
}
