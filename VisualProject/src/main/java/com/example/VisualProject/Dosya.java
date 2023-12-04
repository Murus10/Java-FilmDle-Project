package com.example.VisualProject;

import javafx.application.Application;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.*;
import java.nio.charset.StandardCharsets;


public class Dosya extends Application {
    public static String[][] data;
    public static String[][] myArray = new String[251][8];

    @Override
    public void start(Stage primaryStage) //Dosya secme sinifi
    {
        int row = 0;
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Excel Dosyasini Seç");
        File excelFile = fileChooser.showOpenDialog(primaryStage);
        if (excelFile != null) {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(excelFile), StandardCharsets.ISO_8859_1))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] values = line.split(";");
                    if (data == null) {
                        data = new String[251][8];
                    }
                    System.arraycopy(values, 0, data[row], 0, values.length);
                    row++;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
          myArray= data;
          System.out.println("Veri basariyla 2 boyutlu diziye aktarildi.");
          System.out.println(myArray[148][4]);
    } // if (excelFile != null)
  } // public void start(Stage primaryStage)
} //public class Dosya extends Application