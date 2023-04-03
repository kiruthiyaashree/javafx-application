package com.example.onlinequiz;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Cpluspluspage2 {
    @FXML
    private Button cplusQbackbutton;

    @FXML
    void cplusQbackaction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Cpluspluspage1.fxml"));
        Parent root = loader.load();
        Scene scene2 = new Scene(root);
        //PaintRenderJob button;
        Stage stage = (Stage) cplusQbackbutton.getScene().getWindow();
        stage.setScene(scene2);
    }

    @FXML
    ToggleGroup tg6, tg7, tg8, tg9, tg10;
    private String str6,str7,str8,str9,str10;
    @FXML
    private RadioButton q6r1, q6r2, q6r3, q6r4, q7r1, q7r2, q7r3, q7r4, q8r1, q8r2, q8r3, q8r4, q9r1, q9r2, q9r3, q9r4, q10r1, q10r2, q10r3, q10r4;
    @FXML
    private Button Submit_button;
    private int mark2 = 0, temp = 0;

    @FXML
    void handler_submit(ActionEvent event) throws IOException {
        Window owner = Submit_button.getScene().getWindow();
        if (q6r1.isSelected()) {
            str6=q6r1.getText();
            temp = 1;

        } else if (q6r2.isSelected()) {
            str6=q6r2.getText();
            temp = 1;
        } else if (q6r3.isSelected()) {
            str6=q6r3.getText();
            temp = 1;
            mark2++;
        } else if (q6r4.isSelected()) {

            str6=q6r4.getText();
            temp = 1;
        }
        if (temp == 0) {
            showAlert(Alert.AlertType.ERROR, owner, "Selection Error!",
                    "Please press any radiobutton in Question-6");
            return;
        }
        temp = 0;
        if (q7r1.isSelected()) {
            str7=q7r1.getText();
            temp = 1;
        } else if (q7r2.isSelected()) {
            str7=q7r2.getText();
            temp = 1;
        } else if (q7r3.isSelected()) {
            str7=q7r3.getText();
            temp = 1;
            mark2++;
        } else if (q7r4.isSelected()) {
            str7=q7r4.getText();
            temp = 1;
        }
        if (temp == 0) {
            showAlert(Alert.AlertType.ERROR, owner, "Selection Error!",
                    "Please press any radiobutton in Question-7");
            return;
        }
        temp = 0;
        if (q8r1.isSelected()) {
            str8=q8r1.getText();
            temp = 1;
            mark2++;
        } else if (q8r2.isSelected()) {
            str8=q8r2.getText();
            temp = 1;
        } else if (q8r3.isSelected()) {
            str8=q8r3.getText();
            temp = 1;
        } else if (q8r4.isSelected()) {
            str8=q8r4.getText();
            temp = 1;
        }
        if (temp == 0) {
            showAlert(Alert.AlertType.ERROR, owner, "Selection Error!",
                    "Please press any radiobutton in Question-8");
            return;
        }
        temp = 0;
        if (q9r1.isSelected()) {
            str9=q9r1.getText();
            temp = 1;
        } else if (q9r2.isSelected()) {
            str9=q9r2.getText();
            temp = 1;
            mark2++;
        } else if (q9r3.isSelected()) {
            str9=q9r3.getText();
            temp = 1;
        } else if (q9r4.isSelected()) {
            str9=q9r4.getText();
            temp = 1;
        }
        if (temp == 0) {
            showAlert(Alert.AlertType.ERROR, owner, "Selection Error!",
                    "Please press any radiobutton in Question-9");
            return;
        }
        temp = 0;
        if (q10r1.isSelected()) {
            str10=q10r1.getText();
            temp = 1;
        } else if (q10r2.isSelected()) {
            str10=q10r2.getText();
            temp = 1;
        } else if (q10r3.isSelected()) {
            str10=q10r3.getText();
            temp = 1;
        } else if (q10r4.isSelected()) {
            str10=q10r4.getText();
            temp = 1;
            mark2++;
        }
        if (temp == 0) {
            showAlert(Alert.AlertType.ERROR, owner, "Selection Error!",
                    "Please press any radiobutton in Question-10");
            return;
        }
//        Resultofjava resultofjava = new Resultofjava();
//        resultofjava.Mark = 9;
//                FXMLLoader loader = new FXMLLoader();
//                loader.setLocation(getClass().getResource("resultofjava.fxml"));
//                Parent root = loader.load();
//                Scene scene2 = new Scene(root);
//                //PaintRenderJob button;
//                Stage stage = (Stage) Submit_button.getScene().getWindow();
//                stage.setScene(scene2);
        if (temp == 1) {
            Connection connecti=null;
            String x1="INSERT INTO onlinequiz.cppanswer2"+"(answer6,answer7,answer8,answer9,answer10,score) VALUES"+"(?,?,?,?,?,?)";
            // labl_just.setText(mark+"out of 10");
            try {
                String databaseName="onlinequiz";
                String databaseUser="root";
                String databasePassword="Kiruthiyaa2004##";
                String url="jdbc:mysql://localhost/"+databaseName;
                Class.forName("com.mysql.cj.jdbc.Driver");

                //Connection con= DriverManager.getConnection(url,databaseUser,databasePassword);
                connecti=DriverManager.getConnection(url,databaseUser,databasePassword);
                Statement statement = (Statement)connecti.createStatement();
                PreparedStatement preparedStmt = (PreparedStatement) connecti.prepareStatement(x1);
                preparedStmt.setString(1,str6);
                preparedStmt.setString(2,(str7));
                preparedStmt.setString(3,(str8));
                preparedStmt.setString(4,(str9));
                preparedStmt.setString(5,(str10));
                preparedStmt.setInt(6,Integer.parseInt(String.valueOf((mark2))));
                preparedStmt.executeUpdate();
                connecti.close();
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("resultofc++.fxml"));
                Parent root = loader.load();
                Scene scene2 = new Scene(root);
//                //PaintRenderJob button;
                Stage stage = (Stage) Submit_button.getScene().getWindow();
                stage.setScene(scene2);
            } catch (Exception e) {
                System.err.println("Got an exception!");
                System.err.println(e.getMessage());
            }

        }

    }

    private void showAlert(Alert.AlertType error, Window owner, String s, String s1) {
        Alert alert = new Alert(error);
        alert.setTitle(s);
        alert.setHeaderText(null);
        alert.setContentText(s1);
        alert.initOwner(owner);
        alert.show();
    }

}
