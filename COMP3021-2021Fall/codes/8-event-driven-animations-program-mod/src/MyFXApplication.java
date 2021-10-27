import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class MyFXApplication extends Application {
    private int data = 3021;
    @Override
    public void start(Stage primaryStage) {
//        int j = new MyListener().i;  // Can outer class access private members of its inner class
        var pane = new HBox(10); // Create a pane and set its properties
        pane.setAlignment(Pos.CENTER);
        var btOK = new Button("OK");
        var handler1 = new MyListener();
        btOK.setOnAction(handler1);
        pane.getChildren().add(btOK);
        var scene = new Scene(pane); // Create a scene and place it in the stage
        primaryStage.setTitle("MyFXApplication"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage

        System.out.println("i = " + new MyListener().i);    // can access var in inner class
    }
    // Inner class, exclusively owned by MyFXApplication
    private class MyListener implements EventHandler<ActionEvent> {
        private int i = 0;
        @Override
        public void handle(ActionEvent event) {
//            i = new MyFXApplication().data;
            i = data;
            System.out.println(i);
        }
    }
}
