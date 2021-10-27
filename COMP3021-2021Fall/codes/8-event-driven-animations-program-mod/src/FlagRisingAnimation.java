import javafx.application.Application;	
import javafx.stage.Stage;	
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Line;
import javafx.animation.PathTransition;
import javafx.util.Duration;

public class FlagRisingAnimation extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {    
    Pane pane = new Pane(); // Create a pane 
    
    // Add an image view and add it to pane
    ImageView imageView = new ImageView("hkust-flag.jpg");
    pane.getChildren().add(imageView);
    
    // Create a path transition 
    PathTransition pt = new PathTransition(Duration.millis(10000),
      new Line(100, 200, 100, 0), imageView);
    pt.setCycleCount(5);
    pt.play(); // Start animation 
        
    Scene scene = new Scene(pane, 250, 200); // Create a scene
    primaryStage.setTitle("FlagRisingAnimation"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }
  public static void main(String[] args) { launch(args); }
}