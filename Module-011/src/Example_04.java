/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Display Circle
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Example_04 extends Application {

  @Override
  public void start(Stage primaryStage) {    

    Pane pane = new Pane();
    
    Circle circle = new Circle();

//    Does not stay centered
//    circle.setCenterX(100);
//    circle.setCenterY(100);
    
//  Stay centered
    circle.centerXProperty().bind(pane.widthProperty().divide(2));
    circle.centerYProperty().bind(pane.heightProperty().divide(2));
    circle.setRadius(50);
    circle.setStroke(Color.BLACK); 
    circle.setFill(Color.WHITE);

    // Add circle to the Pane
    pane.getChildren().add(circle); // Add circle to the pane

    Scene scene = new Scene(pane, 200, 200);
    primaryStage.setTitle("Circle Centered");
    primaryStage.setScene(scene);
    primaryStage.show();
  }
  
  public static void main(String[] args) {
    launch(args);
  }
}
