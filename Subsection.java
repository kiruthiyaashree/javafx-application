package com.example.onlinequiz;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Subsection {
    @FXML
    Button javahandler;
    @FXML
    void javaaction(ActionEvent event) throws IOException {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("JavaQuestions.fxml"));
            Parent root = loader.load();
            Scene scene2 = new Scene(root);
            //PaintRenderJob button;
            Stage stage = (Stage) javahandler.getScene().getWindow();
            stage.setScene(scene2);
    }
    @FXML
    Button ssbbutton;
    @FXML
    void ssbaction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Section.fxml"));
        Parent root = loader.load();
        Scene scene2 = new Scene(root);
        //PaintRenderJob button;
        Stage stage = (Stage) ssbbutton.getScene().getWindow();
        stage.setScene(scene2);
    }
    @FXML
    Button cpluspluspage1button;
    @FXML
    void cpluspluspage1(ActionEvent event) throws IOException {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("Cpluspluspage1.fxml"));
            Parent root = loader.load();
            Scene scene2 = new Scene(root);
            //PaintRenderJob button;
            Stage stage = (Stage) cpluspluspage1button.getScene().getWindow();
            stage.setScene(scene2);
    }
    @FXML
    Button cpage1button;
    @FXML
    void cpage1(ActionEvent event) throws IOException {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("CQuestions.fxml"));
            Parent root = loader.load();
            Scene scene2 = new Scene(root);
            Stage stage = (Stage) cpage1button.getScene().getWindow();
            stage.setScene(scene2);
    }
}
