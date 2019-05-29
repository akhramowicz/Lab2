package main;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import logic.Logic;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        Logic logic = new Logic();
        GridPane gridPane = new GridPane();
        gridPane.setMinSize(400, 200);
        gridPane.setPadding(new Insets(5));
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setAlignment(Pos.CENTER_LEFT);
        Text act = new Text ("Choose your action!");
        gridPane.add(act, 1, 0);
        Button sniff  = new Button ("Sniff");
        gridPane.add(sniff, 0, 1);
        Button scratch  = new Button ("Scratch");
        gridPane.add(scratch, 0, 3);
        Button listen = new Button("Listen something");
        gridPane.add(listen, 1, 2);
        Button eat  = new Button ("Eat");
        gridPane.add(eat, 2, 1);
        Button talk  = new Button("Talk");
        gridPane.add(talk, 2, 3);
        Text result = new Text ();
        result.setWrappingWidth(115);
        gridPane.add(result, 1, 4);
        sniff.setOnAction(event-> {
            logic.brain.manageOrganNoseSniff(logic.nose);
            result.setText("Now it smells: "+ logic.brain.getDataList());
        });
        scratch.setOnAction(event -> {
            logic.brain.manageOrganNoseScratch(logic.nose);
            result.setText("Now you feel: "+ logic.brain.getDataList());
        });
        eat.setOnAction(event -> {
            logic.brain.manageOrganMouthEat(logic.mouth, logic.stomach);
            result.setText("Now you eat: "+ logic.brain.getDataList());
        });
        talk.setOnAction(event -> {
            logic.brain.manageOrganMouseTalk(logic.mouth);
            result.setText("Now you are talking: "+ logic.brain.getDataList());
        });
        listen.setOnAction(event -> {
            logic.brain.manageOrganEarListen(logic.ear);
            result.setText("Now you are listen: "+ logic.brain.getDataList());
        });
        primaryStage.setScene(new Scene(gridPane, 250, 200));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
