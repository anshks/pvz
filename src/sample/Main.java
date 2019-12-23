package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


class Homepage {
    void display(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("plantsVSzombies");

        Scene scenee = new Scene(root);
        primaryStage.setScene(scenee);

        primaryStage.sizeToScene();
        primaryStage.show();

    }
}

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Homepage homepage = new Homepage();
        homepage.display(primaryStage);


    }


    public static void main(String[] args) {
        String currentDirectory = System.getProperty("user.dir");
        launch(args);
    }
}
