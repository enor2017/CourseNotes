import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class HandleEvent extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {    
    var pane = new HBox(10); // Create a pane and set its properties
    pane.setAlignment(Pos.CENTER);
    var btOK = new Button("OK");
    var okHandler = new OKHandlerClass();
    btOK.setOnAction(okHandler);
    pane.getChildren().add(btOK);

//    btOK.setOnAction(cnlHandler);  // 1. Could we have same listener for multiple sources?
//    btOK.addEventHandler(ActionEvent.ACTION, cnlHandler); // 2. Could we have multiple listeners for the same source?
        
    var scene = new Scene(pane); // Create a scene and place it in the stage
    primaryStage.setTitle("HandleEvent"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }
  
  public static void main(String[] args) { launch(args); }
}

class OKHandlerClass implements EventHandler<ActionEvent> {
  @Override
  public void handle(ActionEvent e) {
    System.out.println("OK button clicked");
  }
}