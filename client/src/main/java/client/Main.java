package client;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Timer;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/sample.fxml"));
        primaryStage.setTitle("Chat");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);

        try {
            readContent("1.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readContent(String path) throws IOException {
        ByteArrayOutputStream out = null;
        BufferedInputStream in = null;
        System.out.println("Task1");
        out = new ByteArrayOutputStream();
        in = new BufferedInputStream(new FileInputStream(path));
        int x;
        while ((x = in.read()) != -1) {
            out.write(x);
            System.out.print((char) x);
        }
        byte[] arr = out.toByteArray();
        System.out.println("\n" + Arrays.toString(arr));
        in.close();
        out.close();
    }

}
