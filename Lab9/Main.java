package sample;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Main extends Application {

    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Microwave Oven");

        HBox textBox = new HBox();
        VBox foodBox = new VBox();
        VBox pad = new VBox();
        GridPane numPad = new GridPane();
        BorderPane root = new BorderPane();

        // This is some of the worst code I've ever written, but it works I guess.
        Button start = new Button(" Start ");
        Button stop = new Button(" Stop ");
        Button button_0 = new Button("    0    ");
        Button button_1 = new Button("    1    ");
        Button button_2 = new Button("    2    ");
        Button button_3 = new Button("    3    ");
        Button button_4 = new Button("    4    ");
        Button button_5 = new Button("    5    ");
        Button button_6 = new Button("    6    ");
        Button button_7 = new Button("    7    ");
        Button button_8 = new Button("    8    ");
        Button button_9 = new Button("    9    ");
        TextField time = new TextField("Time to be displayed here                     ");
        Label food = new Label("Place Food Here");

        button_0.setOnAction(e -> {
            time.clear();
            time.appendText(button_0.getText());
        });

        button_1.setOnAction(e -> {
            time.clear();
            time.appendText(button_1.getText());
        });

        button_2.setOnAction(e -> {
            time.clear();
            time.appendText(button_2.getText());
        });

        button_3.setOnAction(e -> {
            time.clear();
            time.appendText(button_3.getText());
        });

        button_4.setOnAction(e -> {
            time.clear();
            time.appendText(button_4.getText());
        });

        button_5.setOnAction(e -> {
            time.clear();
            time.appendText(button_5.getText());
        });

        button_6.setOnAction(e -> {
            time.clear();
            time.appendText(button_6.getText());
        });

        button_7.setOnAction(e -> {
            time.clear();
            time.appendText(button_7.getText());
        });

        button_8.setOnAction(e -> {
            time.clear();
            time.appendText(button_8.getText());
        });

        button_9.setOnAction(e -> {
            time.clear();
            time.appendText(button_9.getText());
        });

        numPad.setPadding(new Insets(10, 10, 10, 10));
        numPad.setVgap(8);
        numPad.setHgap(10);
        numPad.add(button_1, 0, 0);
        numPad.add(button_2, 1, 0);
        numPad.add(button_3, 2, 0);
        numPad.add(button_4, 0, 1);
        numPad.add(button_5, 1, 1);
        numPad.add(button_6, 2, 1);
        numPad.add(button_7, 0, 2);
        numPad.add(button_8, 1, 2);
        numPad.add(button_9, 2, 2);
        numPad.add(button_0, 0, 3);
        numPad.add(start, 1, 3);
        numPad.add(stop, 2, 3);

        time.setPrefWidth(180);
        time.setMinWidth(180);
        textBox.getChildren().add(time);
        textBox.setAlignment(Pos.TOP_RIGHT);
        foodBox.getChildren().add(food);
        foodBox.setAlignment(Pos.CENTER_RIGHT);
        pad.getChildren().add(numPad);
        root.setTop(textBox);
        root.setLeft(foodBox);
        root.setRight(pad);


        Scene scene = new Scene(root, 300, 170);
        stage.setScene(scene);
        stage.show();

    }

}
