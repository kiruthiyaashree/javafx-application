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
       /// Connection connect=null;
        //String totable="INSERT INTO onlinequiz.topic_storage"+"(topic,topic2) VALUES"+"(?,?)";
//        try {
//
//            String databaseName = "onlinequiz";
//            String databaseUser = "root";
//            String databasePassword = "Kiruthiyaa2004##";
//            String url = "jdbc:mysql://localhost/" + databaseName;
//            String str = "Programminglanguages";
//            String to="Java";
//            // Class.forName("com.mysql.cj.jdbc.Driver");
//            connect = DriverManager.getConnection(url, databaseUser, databasePassword);
////            // databaseLink = DriverManager.getConnection(url,databaseUser,databasePassword);
//            Statement statement = connect.createStatement();
////            System.out.print(PLACTION.getText());
////            String verifyLogin1 ="INSERT INTO onlinequiz.topic_storage (topic) VALUES ('"+str+"');";
////
////            //ResultSet queryResult1 = statement.executeQuery(verifyLogin1);
////              statement.executeUpdate(verifyLogin1);
//            PreparedStatement preparedStatement = (PreparedStatement) connect.prepareStatement(totable);
//            preparedStatement.setString(1, str);
//            preparedStatement.setString(2, to);
//            preparedStatement.executeUpdate();
//            connect.close();
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

//        Connection connect=null;
//        String totable="INSERT INTO onlinequiz.topic_storage"+"(topic,topic2) VALUES"+"(?,?)";
//        try {
//
//            String databaseName = "onlinequiz";
//            String databaseUser = "root";
//            String databasePassword = "Kiruthiyaa2004##";
//            String url = "jdbc:mysql://localhost/" + databaseName;
//            String str = "Programminglanguages";
//            String to="C++";
//            // Class.forName("com.mysql.cj.jdbc.Driver");
//            connect = DriverManager.getConnection(url, databaseUser, databasePassword);
////            // databaseLink = DriverManager.getConnection(url,databaseUser,databasePassword);
//            Statement statement = connect.createStatement();
////            System.out.print(PLACTION.getText());
////            String verifyLogin1 ="INSERT INTO onlinequiz.topic_storage (topic) VALUES ('"+str+"');";
////
////            //ResultSet queryResult1 = statement.executeQuery(verifyLogin1);
////              statement.executeUpdate(verifyLogin1);
//            PreparedStatement preparedStatement = (PreparedStatement) connect.prepareStatement(totable);
//            preparedStatement.setString(1, str);
//            preparedStatement.setString(2, to);
//            preparedStatement.executeUpdate();
//            connect.close();
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
//        Connection connect=null;
//        String totable="INSERT INTO onlinequiz.topic_storage"+"(topic,topic2) VALUES"+"(?,?)";
//        try {
//
//            String databaseName = "onlinequiz";
//            String databaseUser = "root";
//            String databasePassword = "Kiruthiyaa2004##";
//            String url = "jdbc:mysql://localhost/" + databaseName;
//            String str = "Programminglanguages";
//            String to="C";
//            connect = DriverManager.getConnection(url, databaseUser, databasePassword);
//            PreparedStatement preparedStatement =  connect.prepareStatement(totable);
//            preparedStatement.setString(1, str);
//            preparedStatement.setString(2, to);
//            preparedStatement.executeUpdate();
//            connect.close();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("CQuestions.fxml"));
            Parent root = loader.load();
            Scene scene2 = new Scene(root);
            //PaintRenderJob button;
            Stage stage = (Stage) cpage1button.getScene().getWindow();
            stage.setScene(scene2);

//        catch (Exception e)
//        {
//            System.err.println("Got an exception!");
//            System.err.println(e.getMessage());
//
//        }



    }
}
