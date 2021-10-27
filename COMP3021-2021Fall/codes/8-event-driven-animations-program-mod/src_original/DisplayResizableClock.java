import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

public class DisplayResizableClock extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {           
    ClockPane clock = new ClockPane(); // Create a clock and a label
    String timeString = clock.getHour() + ":" + clock.getMinute() 
      + ":" + clock.getSecond();
    Label lblCurrentTime = new Label(timeString);
    
    BorderPane pane = new BorderPane(); // Place clock and label in border pane
    pane.setCenter(clock);
    pane.setBottom(lblCurrentTime);
    BorderPane.setAlignment(lblCurrentTime, Pos.TOP_CENTER);
        
    Scene scene = new Scene(pane, 250, 250); // Create a scene
    primaryStage.setTitle("DisplayClock"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
    
    pane.widthProperty().addListener(ov -> clock.setW(pane.getWidth()));
    pane.heightProperty().addListener(ov -> clock.setH(pane.getHeight()));
  }
  
  public static void main(String[] args) { launch(args); }
}