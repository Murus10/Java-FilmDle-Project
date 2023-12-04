package com.example.VisualProject;

import javax.swing.JOptionPane;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import java.util.Random;


public class Arayuz {

  @FXML
  private TextField myTextField;
  @FXML
  private Rectangle rectangle, rectangle2, rectangle3, rectangle4, rectangle5, rectangle6, rectangle7, rectangle8, rectangle9, rectangle10, rectangle11, rectangle12, rectangle13, rectangle14, rectangle15, rectangle16, rectangle17, rectangle18, rectangle19, rectangle20, rectangle21, rectangle22, rectangle23, rectangle24, rectangle25, rectangle26, rectangle27, rectangle28, rectangle29, rectangle30;
  @FXML
  private Label myLabel, myLabel2, myLabel3, myLabel4, myLabel5, myLabel6, myLabel7, myLabel8, myLabel9, myLabel10, myLabel11, myLabel12, myLabel13, myLabel14, myLabel15, myLabel16, myLabel17, myLabel18, myLabel19, myLabel20, myLabel21, myLabel22, myLabel23, myLabel24, myLabel25, myLabel26, myLabel27, myLabel28, myLabel29, myLabel30;

  int change = 5;
  int i = 0;
  Random r = new Random();
  int estimation = r.nextInt(0, 251);
  String[] targetArray = new String[8];

  @FXML
  private void Motor()  {
    String target = myTextField.getText();
    boolean bulundu = false;
    for (int i = 0; i < 251; i++) {
      if (Dosya.myArray[i][1].equals(target)) {
        System.out.println("Bulundu: " + i + ", " + 1);
        bulundu = true;
        System.arraycopy(Dosya.myArray[i], 0, targetArray, 0, 8);
        break;
      }
    }

    if (bulundu) {
      System.out.println(targetArray[3]);
      System.out.println(Dosya.myArray[estimation][3]);

      // Altaki 2 satirdaki kod dogru cevabi gösteriyor derleyicide doğru cevabı yazarak kontrol edilebilir sistemin doğru çalıştığını isterseniz yorum hale getirebiirsiniz.
      String text = "Dogru Cevap: " + Dosya.myArray[estimation][1];
      System.out.println(text);

      myLabel.setFont(Font.font("Georgia", FontWeight.BOLD, 12));
      myLabel2.setFont(Font.font("Georgia", FontWeight.BOLD, 12));
      myLabel3.setFont(Font.font("Georgia", FontWeight.BOLD, 12));
      myLabel4.setFont(Font.font("Georgia", FontWeight.BOLD, 12));
      myLabel5.setFont(Font.font("Georgia", FontWeight.BOLD, 12));
      myLabel6.setFont(Font.font("Georgia", FontWeight.BOLD, 12));
      myLabel7.setFont(Font.font("Georgia", FontWeight.BOLD, 12));
      myLabel8.setFont(Font.font("Georgia", FontWeight.BOLD, 12));
      myLabel9.setFont(Font.font("Georgia", FontWeight.BOLD, 12));
      myLabel10.setFont(Font.font("Georgia", FontWeight.BOLD, 12));
      myLabel11.setFont(Font.font("Georgia", FontWeight.BOLD, 12));
      myLabel12.setFont(Font.font("Georgia", FontWeight.BOLD, 12));
      myLabel13.setFont(Font.font("Georgia", FontWeight.BOLD, 12));
      myLabel14.setFont(Font.font("Georgia", FontWeight.BOLD, 12));
      myLabel15.setFont(Font.font("Georgia", FontWeight.BOLD, 12));
      myLabel16.setFont(Font.font("Georgia", FontWeight.BOLD, 12));
      myLabel17.setFont(Font.font("Georgia", FontWeight.BOLD, 12));
      myLabel18.setFont(Font.font("Georgia", FontWeight.BOLD, 12));
      myLabel19.setFont(Font.font("Georgia", FontWeight.BOLD, 12));
      myLabel20.setFont(Font.font("Georgia", FontWeight.BOLD, 12));
      myLabel21.setFont(Font.font("Georgia", FontWeight.BOLD, 12));
      myLabel21.setFont(Font.font("Georgia", FontWeight.BOLD, 12));
      myLabel23.setFont(Font.font("Georgia", FontWeight.BOLD, 12));
      myLabel24.setFont(Font.font("Georgia", FontWeight.BOLD, 12));
      myLabel25.setFont(Font.font("Georgia", FontWeight.BOLD, 12));
      myLabel26.setFont(Font.font("Georgia", FontWeight.BOLD, 12));
      myLabel27.setFont(Font.font("Georgia", FontWeight.BOLD, 12));
      myLabel28.setFont(Font.font("Georgia", FontWeight.BOLD, 12));
      myLabel29.setFont(Font.font("Georgia", FontWeight.BOLD, 12));
      myLabel30.setFont(Font.font("Georgia", FontWeight.BOLD, 12));

      myLabel.setWrapText(true);
      myLabel2.setWrapText(true);
      myLabel3.setWrapText(true);
      myLabel4.setWrapText(true);
      myLabel5.setWrapText(true);
      myLabel6.setWrapText(true);
      myLabel7.setWrapText(true);
      myLabel8.setWrapText(true);
      myLabel9.setWrapText(true);
      myLabel10.setWrapText(true);
      myLabel11.setWrapText(true);
      myLabel12.setWrapText(true);
      myLabel13.setWrapText(true);
      myLabel14.setWrapText(true);
      myLabel15.setWrapText(true);
      myLabel16.setWrapText(true);
      myLabel17.setWrapText(true);
      myLabel18.setWrapText(true);
      myLabel19.setWrapText(true);
      myLabel20.setWrapText(true);
      myLabel21.setWrapText(true);
      myLabel22.setWrapText(true);
      myLabel23.setWrapText(true);
      myLabel24.setWrapText(true);
      myLabel25.setWrapText(true);
      myLabel26.setWrapText(true);
      myLabel27.setWrapText(true);
      myLabel28.setWrapText(true);
      myLabel29.setWrapText(true);
      myLabel30.setWrapText(true);

      if (i == 0) {
        int o = 0;
        if (Dosya.myArray[estimation][1].equals(targetArray[1])) {
          rectangle.setFill(Color.GREEN); o++;

        }
        if (Dosya.myArray[estimation][2].equals(targetArray[2])) {
          rectangle2.setFill(Color.GREEN); o++;

        }
        if (Dosya.myArray[estimation][3].equals(targetArray[3])) {
          rectangle3.setFill(Color.GREEN); o++;

        }
        if (Dosya.myArray[estimation][4].equals(targetArray[4])) {
          rectangle4.setFill(Color.GREEN); o++;

        }
        if (Dosya.myArray[estimation][5].equals(targetArray[5])) {
          rectangle5.setFill(Color.GREEN); o++;

        }
        if (Dosya.myArray[estimation][6].equals(targetArray[6])) {
          rectangle6.setFill(Color.GREEN); o++;

        }
        rectangle.setVisible(true);
        rectangle2.setVisible(true);
        rectangle3.setVisible(true);
        rectangle4.setVisible(true);
        rectangle5.setVisible(true);
        rectangle6.setVisible(true);
        myLabel.setVisible(true);
        myLabel2.setVisible(true);
        myLabel3.setVisible(true);
        myLabel4.setVisible(true);
        myLabel5.setVisible(true);
        myLabel6.setVisible(true);
        myLabel.setText(targetArray[1]);
        myLabel2.setText(targetArray[2]);
        myLabel3.setText(targetArray[3]);
        myLabel4.setText(targetArray[4]);
        myLabel5.setText(targetArray[5]);
        myLabel6.setText(targetArray[6]);
        if( o==6){
          String metin = "Dogru Cevap: " + Dosya.myArray[estimation][1];
          Alert alert2 = new Alert(Alert.AlertType.INFORMATION);
          alert2.setTitle("Basari");
          alert2.setHeaderText("Basarii");
          alert2.setContentText(metin);
          alert2.showAndWait().ifPresent(rs -> {
            if (rs == ButtonType.OK) {
              System.out.println("Tamam'a basti.");
              System.exit(0);
            }
          });
        }

        change--;

      } //if (i == 0) kapatma parentezi
      if (i == 1) {
         int n = 0;
        if (Dosya.myArray[estimation][1].equals(targetArray[1])) {
          rectangle7.setFill(Color.GREEN); n++;

        }
        if (Dosya.myArray[estimation][2].equals(targetArray[2])) {
          rectangle8.setFill(Color.GREEN); n++;

        }
        if (Dosya.myArray[estimation][3].equals(targetArray[3])) {
          rectangle9.setFill(Color.GREEN); n++;

        }
        if (Dosya.myArray[estimation][4].equals(targetArray[4])) {
          rectangle10.setFill(Color.GREEN); n++;

        }
        if (Dosya.myArray[estimation][5].equals(targetArray[5])) {
          rectangle11.setFill(Color.GREEN); n++;

        }
        if (Dosya.myArray[estimation][6].equals(targetArray[6])) {
          rectangle12.setFill(Color.GREEN); n++;

        }

        rectangle7.setVisible(true);
        rectangle8.setVisible(true);
        rectangle9.setVisible(true);
        rectangle10.setVisible(true);
        rectangle11.setVisible(true);
        rectangle12.setVisible(true);
        myLabel7.setVisible(true);
        myLabel8.setVisible(true);
        myLabel9.setVisible(true);
        myLabel10.setVisible(true);
        myLabel11.setVisible(true);
        myLabel12.setVisible(true);
        myLabel7.setText(targetArray[1]);
        myLabel8.setText(targetArray[2]);
        myLabel9.setText(targetArray[3]);
        myLabel10.setText(targetArray[4]);
        myLabel11.setText(targetArray[5]);
        myLabel12.setText(targetArray[6]);
        if( n==6){
          String metin = "Dogru Cevap: " + Dosya.myArray[estimation][1];
          Alert alert2 = new Alert(Alert.AlertType.INFORMATION);
          alert2.setTitle("Basari");
          alert2.setHeaderText("Basarii");
          alert2.setContentText(metin);
          alert2.showAndWait().ifPresent(rs -> {
            if (rs == ButtonType.OK) {
              System.out.println("Tamam'a basti.");
              System.exit(0);
            }
          });
        }
        change--;


        } //if (i == 1) kapatma parantezi
        if (i == 2) {
        int m =0;
          if (Dosya.myArray[estimation][1].equals(targetArray[1])) {
            rectangle13.setFill(Color.GREEN); m++;
          }
          if (Dosya.myArray[estimation][2].equals(targetArray[2])) {
            rectangle14.setFill(Color.GREEN); m++;
          }
          if (Dosya.myArray[estimation][3].equals(targetArray[3])) {
            rectangle15.setFill(Color.GREEN); m++;
          }
          if (Dosya.myArray[estimation][4].equals(targetArray[4])) {
            rectangle16.setFill(Color.GREEN); m++;
          }
          if (Dosya.myArray[estimation][5].equals(targetArray[5])) {
            rectangle17.setFill(Color.GREEN); m++;
          }
          if (Dosya.myArray[estimation][6].equals(targetArray[6])) {
            rectangle18.setFill(Color.GREEN); m++;
          }

          rectangle13.setVisible(true);
          rectangle14.setVisible(true);
          rectangle15.setVisible(true);
          rectangle16.setVisible(true);
          rectangle17.setVisible(true);
          rectangle18.setVisible(true);
          myLabel13.setVisible(true);
          myLabel14.setVisible(true);
          myLabel15.setVisible(true);
          myLabel16.setVisible(true);
          myLabel17.setVisible(true);
          myLabel18.setVisible(true);
          myLabel13.setText(targetArray[1]);
          myLabel14.setText(targetArray[2]);
          myLabel15.setText(targetArray[3]);
          myLabel16.setText(targetArray[4]);
          myLabel17.setText(targetArray[5]);
          myLabel18.setText(targetArray[6]);
          if( m==6){
            String metin = "Dogru Cevap: " + Dosya.myArray[estimation][1];
            Alert alert2 = new Alert(Alert.AlertType.INFORMATION);
            alert2.setTitle("Basari");
            alert2.setHeaderText("Basarii");
            alert2.setContentText(metin);
            alert2.showAndWait().ifPresent(rs -> {
              if (rs == ButtonType.OK) {
                System.out.println("Tamam'a basti.");
                System.exit(0);
              }
            });
          }
          change--;

        } //if (i == 2) kapatma parantezi
        if (i == 3) {
          int l =0;
          if (Dosya.myArray[estimation][1].equals(targetArray[1])) {
            rectangle19.setFill(Color.GREEN); l++;
          }
          if (Dosya.myArray[estimation][2].equals(targetArray[2])) {
            rectangle20.setFill(Color.GREEN); l++;
          }
          if (Dosya.myArray[estimation][3].equals(targetArray[3])) {
            rectangle21.setFill(Color.GREEN); l++;
          }
          if (Dosya.myArray[estimation][4].equals(targetArray[4])) {
            rectangle22.setFill(Color.GREEN); l++;
          }
          if (Dosya.myArray[estimation][5].equals(targetArray[5])) {
            rectangle23.setFill(Color.GREEN); l++;
          }
          if (Dosya.myArray[estimation][6].equals(targetArray[6])) {
            rectangle24.setFill(Color.GREEN); l++;
          }

          rectangle19.setVisible(true);
          rectangle20.setVisible(true);
          rectangle21.setVisible(true);
          rectangle22.setVisible(true);
          rectangle23.setVisible(true);
          rectangle24.setVisible(true);
          myLabel19.setVisible(true);
          myLabel20.setVisible(true);
          myLabel21.setVisible(true);
          myLabel22.setVisible(true);
          myLabel23.setVisible(true);
          myLabel24.setVisible(true);
          myLabel19.setText(targetArray[1]);
          myLabel20.setText(targetArray[2]);
          myLabel21.setText(targetArray[3]);
          myLabel22.setText(targetArray[4]);
          myLabel23.setText(targetArray[5]);
          myLabel24.setText(targetArray[6]);
          if( l==6){
            String metin = "Dogru Cevap: " + Dosya.myArray[estimation][1];
            Alert alert2 = new Alert(Alert.AlertType.INFORMATION);
            alert2.setTitle("Basari");
            alert2.setHeaderText("Basarii");
            alert2.setContentText(metin);
            alert2.showAndWait().ifPresent(rs -> {
              if (rs == ButtonType.OK) {
                System.out.println("Tamam'a basti.");
                System.exit(0);
              }
            }); }

            change--;

        } //if (i == 3) kapatma parantezi
        if (i == 4) {
          int k=0;
          if (Dosya.myArray[estimation][1].equals(targetArray[1])) {
            rectangle25.setFill(Color.GREEN); k++;
          }
          if (Dosya.myArray[estimation][2].equals(targetArray[2])) {
            rectangle26.setFill(Color.GREEN); k++;
          }
          if (Dosya.myArray[estimation][3].equals(targetArray[3])) {
            rectangle27.setFill(Color.GREEN); k++;
          }
          if (Dosya.myArray[estimation][4].equals(targetArray[4])) {
            rectangle28.setFill(Color.GREEN); k++;
          }
          if (Dosya.myArray[estimation][5].equals(targetArray[5])) {
            rectangle29.setFill(Color.GREEN); k++;
          }
          if (Dosya.myArray[estimation][6].equals(targetArray[6])) {
            rectangle30.setFill(Color.GREEN); k++;
          }

          rectangle25.setVisible(true);
          rectangle26.setVisible(true);
          rectangle27.setVisible(true);
          rectangle28.setVisible(true);
          rectangle29.setVisible(true);
          rectangle30.setVisible(true);
          myLabel25.setVisible(true);
          myLabel26.setVisible(true);
          myLabel27.setVisible(true);
          myLabel28.setVisible(true);
          myLabel29.setVisible(true);
          myLabel30.setVisible(true);
          myLabel25.setText(targetArray[1]);
          myLabel26.setText(targetArray[2]);
          myLabel27.setText(targetArray[3]);
          myLabel28.setText(targetArray[4]);
          myLabel29.setText(targetArray[5]);
          myLabel30.setText(targetArray[6]);

          if( k==6){
            String metin = "Dogru Cevap: " + Dosya.myArray[estimation][1];
            Alert alert2 = new Alert(Alert.AlertType.INFORMATION);
            alert2.setTitle("Basari");
            alert2.setHeaderText("Basarii");
            alert2.setContentText(metin);
            alert2.showAndWait().ifPresent(rs -> {
              if (rs == ButtonType.OK) {
                System.out.println("Tamam'a basti.");
                System.exit(0);
              }
            });
          }
           change--;

        } //if (i == 4) kapatma parantezi

      i++;

      }  // if(bulundu) NUN PARANTEZI

      else {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("SİSTEM KAPATİLİYOR");
        alert.setHeaderText("Bilinmeyen Veri!");
        alert.setContentText("Lütfen listede bulunan filmleri yaziniz .");
        alert.showAndWait().ifPresent(rs -> {
          if (rs == ButtonType.OK) {
            System.out.println("Tamam'a basti.");
            Platform.exit();   }
        });

      } //else

      if (change == 0) {
        String text = "5 Hakkinizi kullandiniz isterseniz tekrar deneyebilirsiniz.";
        Alert alert2 = new Alert(Alert.AlertType.INFORMATION);
        alert2.setTitle("Bulamadiniz!");
        alert2.setHeaderText("Maalesef Sansiniz Kalmadi...");
        alert2.setContentText(text);
        alert2.showAndWait().ifPresent(rs -> {
          if (rs == ButtonType.OK) {
            System.out.println("Tamam'a basti.");
          }
        });
        int reply = JOptionPane.showConfirmDialog(null, " Tekrar denemek ister misiniz?", "Basarisiz oldun !", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.NO_OPTION) {
          System.exit(0);  }
        if (reply == JOptionPane.YES_OPTION) {
          change = 5;
          i = 0;
          Motor();  }
      } // if (change == 0)
    } // private void onHelloButtonClick() kapama parantezi
  } //public class Arayuz kapama parantezi