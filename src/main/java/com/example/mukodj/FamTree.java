package com.example.mukodj;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.HLineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.VLineTo;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FamTree extends Application {
    @Override
    public void start(Stage stage) throws IOException {
      //  FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        String line = "";
        String splitBy = ";";
        Text text1 = null;
        Text text2 = null;
        VLineTo vlineto=null;
        VLineTo vlineto_1=null;

        try {
//parsing a CSV file into BufferedReader class constructor
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\User\\Documents\\DEIK-PTI\\Prog2\\Mukodj\\src\\main\\java\\com\\example\\mukodj\\csf.csv"));
            while ((line = br.readLine()) != null)   //returns a Boolean value
            {
                String[] oszl = line.split(splitBy);    // use comma as separator
                text1 = new Text(oszl[1]);
                vlineto = new VLineTo(50);
                text2 = new Text(oszl[2]);
                vlineto_1 = new VLineTo(50);
                // System.out.println("ID=" + oszl[0] + " " + oszl[1] + " " + oszl[2]);
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        }

        TextFlow textFlow = new TextFlow();
        Font font = new Font("Arial", 24);

        //Text text1 = new Text("Gahooooga");
        text1.setFill(Color.RED);
        text1.setFont(font);
        //Text text2 = new Text(" \u0639\u0644\u064a\u0643\u0645 to me.");
        // set stroke width


        HLineTo hlineto = new HLineTo(10);
        // create moveto
        MoveTo moveto = new MoveTo(10, 100);
        MoveTo moveto_1 = new MoveTo(100, 100);
        MoveTo moveto_2 = new MoveTo(100, 100);
        Path path = new Path(moveto, vlineto, moveto_1,
                vlineto_1, moveto_2, hlineto);
        path.setStrokeWidth(2);




        // set fill for path
        path.setFill(Color.BLACK);





        text2.setFill(Color.BLUE);
        text2.setFont(font);
        textFlow.getChildren().addAll(text1, text2);
        // create a Group
        Group group = new Group(path);
        group.getChildren().add(textFlow);
       // Group group1 = new Group(textFlow);
       // Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        Scene scene = new Scene(group, 650, 500, Color.WHITE);
        stage.setTitle("MUKODJ PROGI");

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}