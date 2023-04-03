package com.example.onlinequiz;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Resultofjava {
    int mark_java;
    @FXML
    private Button button_showresult;
    @FXML
    Label showresult_label;
    @FXML
    void handler_showresult(ActionEvent event) throws IOException {

        String databaseName="onlinequiz";
        String databaseUser="root";
        String databasePassword="";
        String url="jdbc:mysql://localhost/"+databaseName;
        ResultSet is=null;
        String m;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
//            throw new RuntimeException(e);
        }
        Connection connection=null;
        try{
            connection=(Connection) DriverManager.getConnection(url,databaseUser,databasePassword);
            Statement smt = (Statement)connection.createStatement();
            is=smt.executeQuery("select * FROM javaanswers where Mark");
            while(is.next())
            {
                m=is.getString(14);
                mark_java=Integer.parseInt(m);
                showresult_label.setText(String.valueOf("JAVA SCORE: "+mark_java+"/10"));
            }
            is.close();
//            smt.close();
           // Mark= "SELECT Mark FROM javaanswers";

        }
        catch (Exception e)
        {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());

        }

    }

    @FXML
    private Button backbutton;
    @FXML
    void handler_back(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Subsection.fxml"));
        Parent root = loader.load();
        Scene scene2 = new Scene(root);
        //PaintRenderJob button;
        Stage stage = (Stage) backbutton.getScene().getWindow();
        stage.setScene(scene2);
    }
}
