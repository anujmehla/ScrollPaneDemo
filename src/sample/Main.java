package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Main extends Application {

/*
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

*/
    ScrollPane scrollPane;
    public void start(Stage myStage)
    {
        myStage.setTitle("Scroll Pane Demo");
        FlowPane rootNode = new FlowPane(10,10);
        rootNode.setAlignment(Pos.CENTER);
        Scene scene= new Scene(rootNode,200,300);
        myStage.setScene(scene);
        Label scrlLabel= new Label("A scroll Pane streamlines the process\n"+
                "adding scroll bars to a window whose\n"+
                "contents exceed the windows's dimensions.\n"+
                "It also enables a control to fits in a\n"+
                "smaller place than it otherwise would\n"+
                "As such,it often provides a superior\n"+
                "approach over using individual scroll bars.");
        scrollPane = new ScrollPane(scrlLabel);
        scrollPane.setPrefViewportWidth(130);
        scrollPane.setPrefViewportHeight(80);
        scrollPane.setPannable(true);
        Button button=new Button("Reset scroll bar positions");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                scrollPane.setVvalue(0);
                scrollPane.setHvalue(0);
            }
        });
        rootNode.getChildren().addAll(scrollPane,button);
        myStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
