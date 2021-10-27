import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;

public class ControlCircleWithMouseAndKey extends Application {
  private CirclePane circlePane = new CirclePane();

  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {    
    HBox hBox = new HBox(); // Hold two buttons in an HBox
    hBox.setSpacing(10);
    hBox.setAlignment(Pos.CENTER);
    Button btEnlarge = new Button("Enlarge");
    Button btShrink = new Button("Shrink");
    hBox.getChildren().add(btEnlarge);
    hBox.getChildren().add(btShrink);
    
    // Create and register the handler
    btEnlarge.setOnAction(e -> circlePane.enlarge());
    btShrink.setOnAction(e -> circlePane.shrink());

    circlePane.setOnMouseClicked(e -> {
      if (e.getButton() == MouseButton.PRIMARY)    
        circlePane.enlarge();
      else if (e.getButton() == MouseButton.SECONDARY)
        circlePane.shrink();
    });


    BorderPane borderPane = new BorderPane();
    borderPane.setCenter(circlePane);
    borderPane.setBottom(hBox);
    BorderPane.setAlignment(hBox, Pos.CENTER);

    borderPane.setOnKeyPressed(e -> {
      if (e.getCode() == KeyCode.UP || e.getCode() == KeyCode.PAGE_UP)
        circlePane.enlarge();
      else if (e.getCode() == KeyCode.DOWN || e.getCode() == KeyCode.PAGE_DOWN)
        circlePane.shrink();
    });

    // Create and place the scene in the stage
    Scene scene = new Scene(borderPane, 200, 150);
    borderPane.requestFocus(); // set focus
    primaryStage.setTitle("ControlCircle"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }

  public static void main(String[] args) {
    launch(args);
  }
}