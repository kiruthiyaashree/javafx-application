package com.example.onlinequiz;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Login {
    @FXML
    private Button signupaction;
    /* @FXML
     private AnchorPane page1Anchor;*/
    @FXML
    void signuphandler(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Registration.fxml"));
        Parent root = loader.load();
        Scene scene2 = new Scene(root);
        //PaintRenderJob button;
        Stage stage = (Stage) signupaction.getScene().getWindow();
        stage.setScene(scene2);
    }
    @FXML
    private Button sectionAction;
    @FXML
    private TextField tf_username;
    @FXML
    private PasswordField pf_password;
    @FXML
    void sectionhandler(ActionEvent event) throws IOException {
        if (tf_username.getText().isBlank() == false && pf_password.getText().isBlank() == false) {
            DatabaseConnection connectNow = new DatabaseConnection();
            Connection connectDB = connectNow.getConnection();

            String verifyLogin = "SELECT count(1) FROM onlinequiz.details WHERE username = '" + tf_username.getText() + "' AND password = '" + pf_password.getText() + "'";
            try {
                Statement statement = connectDB.createStatement();
                ResultSet queryResult = statement.executeQuery(verifyLogin);

                while (queryResult.next()) {
                    if (queryResult.getInt(1) == 1) {
                        //loginMessageLabel.setText("Welcome");
                        FXMLLoader loader = new FXMLLoader();
                        loader.setLocation(getClass().getResource("Section.fxml"));
                        Parent root = loader.load();
                        Scene scene2 = new Scene(root);
                        //PaintRenderJob button;
                        Stage stage = (Stage) sectionAction.getScene().getWindow();
                        stage.setScene(scene2);
                    } else {
                        // loginMessageLabel.setText("Invalid login");

                        // System.out.println("Please fill all Info");
                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setContentText("Please enter the correct username and password!");
                        alert.show();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else{
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please fill username and password to Login!");
            alert.show();
        }
    }
}
