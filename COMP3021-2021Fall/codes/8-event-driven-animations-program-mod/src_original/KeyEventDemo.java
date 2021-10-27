import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class KeyEventDemo extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {    
    Pane pane = new Pane(); // Create a pane and set its properties
    Text text = new Text(20, 20, "Haha");    
    pane.getChildren().add(text);
    text.setOnKeyPressed(e -> {          
      switch (e.getCode()) {
        case DOWN: text.setY(text.getY() + 10); break;
        case UP:  text.setY(text.getY() - 10); break;
        case LEFT: text.setX(text.getX() - 10); break;
        case RIGHT: text.setX(text.getX() + 10); break;
        default: if (e.getText().length() > 0) text.setText(e.getText());
      }
    });
        
    Scene scene = new Scene(pane); // Create a scene
    text.requestFocus(); // keystrokes owned by text
    primaryStage.setTitle("KeyEventDemo"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage    
// text is focused to receive key input
  }
  public static void main(String[] args) { launch(args); }
}