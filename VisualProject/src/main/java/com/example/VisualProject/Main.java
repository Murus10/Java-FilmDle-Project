package com.example.VisualProject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
// Eger calismazsa buradaki jdk sag tik extend edildiğinde sorunsuz calismakta
import java.io.IOException;


public class Main extends Application {
    @Override

    public void start(Stage stage) throws IOException {
        Dosya Dosya = new Dosya();
        Dosya.start(stage);
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1220, 740);
        stage.setTitle("Moviedle");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}