// Java Program to create a HBox, add
// spaces between its elements and add
// it to the stage
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.canvas.*;
import javafx.scene.web.*;
import javafx.scene.Group;

public class HBOX_2 extends Application {

    // launch the application
    public void start(Stage stage)
    {

        try {

            // set title for the stage
            stage.setTitle("HBox");

            // create a HBox
            HBox hbox = new HBox(10);

            // create a label
            Label label = new Label("this is HBox example");

            // add label to hbox
            hbox.getChildren().add(label);

            // add buttons to HBox
            for (int i = 0; i < 5; i++)
            {
                hbox.getChildren().add(new Button("Button "
                        + (int)(i + 1)));
            }

            // create a scene
            Scene scene = new Scene(hbox, 800, 300);

            // set the scene
            stage.setScene(scene);

            stage.show();
        }

        catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }

    // Main Method
    public static void main(String args[])
    {

        // launch the application
        launch(args);
    }
}