import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.scene.text.Text;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class LambdaHandlerDemo extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    Text text = new Text(40, 40, "COMP3021 is the best COMP course");
    Pane pane = new Pane(text);
    
    // Hold four buttons in an HBox
    Button btUp = new Button("Up");
    Button btDown = new Button("Down");
    Button btLeft = new Button("Left");
    Button btRight = new Button("Right");
    HBox hBox = new HBox(btUp, btDown, btLeft, btRight);
    hBox.setSpacing(10);
    hBox.setAlignment(Pos.CENTER);
    
    BorderPane borderPane = new BorderPane(pane);
    borderPane.setBottom(hBox);

//    System.out.println(this.toString());  // 1.1

    // Create and register the handler
    btUp.setOnAction((ActionEvent e) -> {
        text.setY(text.getY() > 10 ? text.getY() - 5 : 10);

        System.out.println(this.toString());  // 1: What does this refer to?
        System.out.println(this instanceof EventHandler);
//        System.out.println(this instanceof LambdaHandlerDemo);  // 1.1 subtle differences in super.f with anonymous inner class
       /*  1.1 We should be careful in referencing this in a lambda expression.
             The semantic of this has been changed to reference the instance of the surrounding class
             There is no need to refer to the lambda expression object itself
             because it does not have constructors or instance variables. Why? It must implement a single function interface.
             Indeed, there may be some needs to refer to the outer object's instance variables and methods. */
    });

    btDown.setOnAction((var e) -> {
      text.setY(text.getY() < pane.getHeight() ? 
        text.getY() + 5 : pane.getHeight());
    });
    
    btLeft.setOnAction(e -> {
      text.setX(text.getX() > 0 ? text.getX() - 5 : 0);
    });
    
    btRight.setOnAction(e ->
      text.setX(text.getX() < pane.getWidth() - 100?
        text.getX() + 5 : pane.getWidth() - 100)
    );
    
    Scene scene = new Scene(borderPane, 400, 350); // Create a scene
    primaryStage.setTitle("AnonymousHandlerDemo"); // Set title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }
  
  public static void main(String[] args) {
    launch(args);
  }
}